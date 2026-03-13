package danger.orespawn.item;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CritterCageItem extends Item {
    private static final Map<Class<? extends LivingEntity>, Supplier<Item>> CAPTURES = new HashMap<>();

    private final Supplier<EntityType<?>> releasedEntity;
    private final Supplier<Item> emptyCage;

    public CritterCageItem(Properties properties, Supplier<EntityType<?>> releasedEntity, Supplier<Item> emptyCage) {
        super(properties);
        this.releasedEntity = releasedEntity;
        this.emptyCage = emptyCage;
    }

    public static void registerCapture(Class<? extends LivingEntity> entityClass, Supplier<Item> filledCage) {
        CAPTURES.put(entityClass, filledCage);
    }

    @Override
    public ActionResultType interactLivingEntity(ItemStack stack, PlayerEntity player, LivingEntity target, Hand hand) {
        if (this.releasedEntity != null) {
            return ActionResultType.PASS;
        }

        Supplier<Item> filled = findCapture(target);
        if (filled == null) {
            return ActionResultType.PASS;
        }

        if (!target.level.isClientSide) {
            ItemStack replacement = new ItemStack(filled.get());
            if (target.hasCustomName()) {
                replacement.setHoverName(target.getCustomName());
            }
            target.remove();
            replaceHeldItem(player, hand, stack, replacement);
        }
        return ActionResultType.sidedSuccess(target.level.isClientSide);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        if (this.releasedEntity == null) {
            return ActionResultType.PASS;
        }

        World world = context.getLevel();
        BlockPos spawnPos = context.getClickedPos().relative(context.getClickedFace());
        if (!world.isClientSide) {
            EntityType<?> type = this.releasedEntity.get();
            Entity entity = type.spawn((net.minecraft.world.server.ServerWorld) world, context.getItemInHand(), context.getPlayer(), spawnPos, net.minecraft.entity.SpawnReason.SPAWN_EGG, true, false);
            if (entity != null) {
                replaceHeldItem(context.getPlayer(), context.getHand(), context.getItemInHand(), new ItemStack(this.emptyCage.get()));
            }
        }
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    private static Supplier<Item> findCapture(LivingEntity target) {
        for (Map.Entry<Class<? extends LivingEntity>, Supplier<Item>> entry : CAPTURES.entrySet()) {
            if (entry.getKey().isInstance(target)) {
                return entry.getValue();
            }
        }
        return null;
    }

    private static void replaceHeldItem(PlayerEntity player, Hand hand, ItemStack oldStack, ItemStack replacement) {
        if (player.abilities.instabuild) {
            if (!player.inventory.add(replacement)) {
                player.drop(replacement, false);
            }
            return;
        }

        oldStack.shrink(1);
        if (oldStack.isEmpty()) {
            player.setItemInHand(hand, replacement);
        } else if (!player.inventory.add(replacement)) {
            player.drop(replacement, false);
        }
    }

    public static void registerDefaultCaptures(
            Supplier<Item> cageCow,
            Supplier<Item> cagePig,
            Supplier<Item> cageChicken,
            Supplier<Item> cageSheep,
            Supplier<Item> cageWolf,
            Supplier<Item> cageOcelot,
            Supplier<Item> cageHorse,
            Supplier<Item> cageVillager,
            Supplier<Item> cageCreeper,
            Supplier<Item> cageZombie,
            Supplier<Item> cageSkeleton,
            Supplier<Item> cageSpider,
            Supplier<Item> cageBat,
            Supplier<Item> cageSquid,
            Supplier<Item> cageSlime,
            Supplier<Item> cageGhast,
            Supplier<Item> cageEnderman,
            Supplier<Item> cageCaveSpider,
            Supplier<Item> cageSilverfish,
            Supplier<Item> cageMagmaCube,
            Supplier<Item> cageWitch,
            Supplier<Item> cageBlaze,
            Supplier<Item> cageMooshroom,
            Supplier<Item> cageWitherSkeleton,
            Supplier<Item> cageSnowGolem,
            Supplier<Item> cageIronGolem
    ) {
        registerCapture(CowEntity.class, cageCow);
        registerCapture(PigEntity.class, cagePig);
        registerCapture(ChickenEntity.class, cageChicken);
        registerCapture(SheepEntity.class, cageSheep);
        registerCapture(WolfEntity.class, cageWolf);
        registerCapture(OcelotEntity.class, cageOcelot);
        registerCapture(HorseEntity.class, cageHorse);
        registerCapture(VillagerEntity.class, cageVillager);
        registerCapture(CreeperEntity.class, cageCreeper);
        registerCapture(ZombieEntity.class, cageZombie);
        registerCapture(SkeletonEntity.class, cageSkeleton);
        registerCapture(SpiderEntity.class, cageSpider);
        registerCapture(BatEntity.class, cageBat);
        registerCapture(SquidEntity.class, cageSquid);
        registerCapture(SlimeEntity.class, cageSlime);
        registerCapture(GhastEntity.class, cageGhast);
        registerCapture(EndermanEntity.class, cageEnderman);
        registerCapture(CaveSpiderEntity.class, cageCaveSpider);
        registerCapture(SilverfishEntity.class, cageSilverfish);
        registerCapture(MagmaCubeEntity.class, cageMagmaCube);
        registerCapture(WitchEntity.class, cageWitch);
        registerCapture(BlazeEntity.class, cageBlaze);
        registerCapture(MooshroomEntity.class, cageMooshroom);
        registerCapture(WitherSkeletonEntity.class, cageWitherSkeleton);
        registerCapture(SnowGolemEntity.class, cageSnowGolem);
        registerCapture(IronGolemEntity.class, cageIronGolem);
    }
}
