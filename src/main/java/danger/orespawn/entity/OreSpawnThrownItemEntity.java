package danger.orespawn.entity;

import danger.orespawn.registry.OreSpawnEntityTypes;
import danger.orespawn.registry.OreSpawnItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;

public class OreSpawnThrownItemEntity extends ProjectileItemEntity {
    public OreSpawnThrownItemEntity(EntityType<? extends OreSpawnThrownItemEntity> type, World world) {
        super(type, world);
    }

    public OreSpawnThrownItemEntity(World world, LivingEntity thrower) {
        super(OreSpawnEntityTypes.THROWN_ITEM.get(), thrower, world);
    }

    public OreSpawnThrownItemEntity(World world, double x, double y, double z) {
        super(OreSpawnEntityTypes.THROWN_ITEM.get(), x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return OreSpawnItems.WATER_BALL.get();
    }

    @Override
    protected void onHitEntity(EntityRayTraceResult result) {
        super.onHitEntity(result);
        Item item = this.getItem().getItem();
        if (!(result.getEntity() instanceof LivingEntity)) {
            return;
        }

        LivingEntity target = (LivingEntity) result.getEntity();
        Entity shooter = this.getOwner();

        if (item == OreSpawnItems.WATER_BALL.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 4.0F);
            target.clearFire();
            target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 40, 0));
        } else if (item == OreSpawnItems.LASER_BALL.get()) {
            target.hurt(DamageSource.thrown(this, shooter).setMagic(), 8.0F);
            target.setSecondsOnFire(3);
            target.invulnerableTime = 0;
        } else if (item == OreSpawnItems.THUNDER_STAFF.get()) {
            target.hurt(DamageSource.thrown(this, shooter).setMagic(), 10.0F);
            summonLightning();
        } else if (item == OreSpawnItems.ACID.get()) {
            target.hurt(DamageSource.thrown(this, shooter).setMagic(), 5.0F);
            target.addEffect(new EffectInstance(Effects.POISON, 120, 1));
            target.addEffect(new EffectInstance(Effects.WEAKNESS, 80, 0));
        } else if (item == OreSpawnItems.DEAD_IRUKANDJI.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 4.0F);
            target.addEffect(new EffectInstance(Effects.POISON, 180, 0));
            target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 60, 0));
        } else if (item == OreSpawnItems.ICE_BALL.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 3.0F);
            target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 120, 2));
            target.addEffect(new EffectInstance(Effects.WEAKNESS, 80, 0));
        } else if (item == OreSpawnItems.SUNSPOT_URCHIN.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 6.0F);
            target.addEffect(new EffectInstance(Effects.POISON, 100, 0));
        } else if (item == OreSpawnItems.SMALL_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 2.0F);
        } else if (item == OreSpawnItems.ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 4.0F);
            target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 40, 0));
        } else if (item == OreSpawnItems.RED_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 5.0F);
            target.setSecondsOnFire(2);
        } else if (item == OreSpawnItems.GREEN_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 4.0F);
            target.addEffect(new EffectInstance(Effects.POISON, 80, 0));
        } else if (item == OreSpawnItems.BLUE_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 4.0F);
            target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 80, 1));
        } else if (item == OreSpawnItems.PURPLE_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 5.0F);
            target.addEffect(new EffectInstance(Effects.CONFUSION, 120, 0));
            target.addEffect(new EffectInstance(Effects.WEAKNESS, 80, 0));
        } else if (item == OreSpawnItems.SPIKEY_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 6.0F);
        } else if (item == OreSpawnItems.TNT_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 5.0F);
            explode(1.5F);
        } else if (item == OreSpawnItems.CRYSTAL_RED_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 7.0F);
            target.setSecondsOnFire(4);
        } else if (item == OreSpawnItems.CRYSTAL_GREEN_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 7.0F);
            target.addEffect(new EffectInstance(Effects.POISON, 120, 1));
        } else if (item == OreSpawnItems.CRYSTAL_BLUE_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 7.0F);
            target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 120, 2));
            target.addEffect(new EffectInstance(Effects.WEAKNESS, 100, 0));
        } else if (item == OreSpawnItems.CRYSTAL_TNT_ROCK.get()) {
            target.hurt(DamageSource.thrown(this, shooter), 6.0F);
            explode(2.5F);
        }
    }

    @Override
    protected void onHitBlock(BlockRayTraceResult result) {
        super.onHitBlock(result);
        Item item = this.getItem().getItem();
        if (item == OreSpawnItems.WATER_BALL.get()) {
            BlockPos pos = result.getBlockPos().relative(result.getDirection());
            if (this.level.isEmptyBlock(pos)) {
                this.level.setBlockAndUpdate(pos, net.minecraft.block.Blocks.WATER.defaultBlockState());
            }
        } else if (item == OreSpawnItems.THUNDER_STAFF.get()) {
            summonLightning();
        } else if (item == OreSpawnItems.ACID.get()) {
            BlockPos pos = result.getBlockPos().relative(result.getDirection());
            if (this.level.isEmptyBlock(pos)) {
                this.level.levelEvent(2001, pos, net.minecraft.block.Block.getId(net.minecraft.block.Blocks.SLIME_BLOCK.defaultBlockState()));
            }
        } else if (item == OreSpawnItems.ICE_BALL.get()) {
            BlockPos pos = result.getBlockPos().relative(result.getDirection());
            if (this.level.isEmptyBlock(pos)) {
                this.level.setBlockAndUpdate(pos, net.minecraft.block.Blocks.SNOW.defaultBlockState());
            }
        } else if (item == OreSpawnItems.RED_ROCK.get()) {
            BlockPos pos = result.getBlockPos().relative(result.getDirection());
            if (this.level.isEmptyBlock(pos)) {
                this.level.setBlockAndUpdate(pos, net.minecraft.block.Blocks.FIRE.defaultBlockState());
            }
        } else if (item == OreSpawnItems.TNT_ROCK.get()) {
            explode(1.5F);
        } else if (item == OreSpawnItems.CRYSTAL_TNT_ROCK.get()) {
            explode(2.5F);
        } else if (item == OreSpawnItems.CRYSTAL_RED_ROCK.get()) {
            BlockPos pos = result.getBlockPos().relative(result.getDirection());
            if (this.level.isEmptyBlock(pos)) {
                this.level.setBlockAndUpdate(pos, net.minecraft.block.Blocks.FIRE.defaultBlockState());
            }
        }
    }

    @Override
    protected void onHit(net.minecraft.util.math.RayTraceResult result) {
        super.onHit(result);
        if (!this.level.isClientSide) {
            ((net.minecraft.world.server.ServerWorld) this.level).sendParticles(
                    new ItemParticleData(ParticleTypes.ITEM, getAmmoStack()),
                    this.getX(),
                    this.getY(),
                    this.getZ(),
                    8,
                    0.1D,
                    0.1D,
                    0.1D,
                    0.05D
            );
            this.remove();
        }
    }

    private ItemStack getAmmoStack() {
        ItemStack stack = this.getItem();
        return stack.isEmpty() ? new ItemStack(getDefaultItem()) : stack;
    }

    private void explode(float power) {
        if (!this.level.isClientSide) {
            this.level.explode(this, this.getX(), this.getY(), this.getZ(), power, net.minecraft.world.Explosion.Mode.BREAK);
        }
    }

    private void summonLightning() {
        if (!this.level.isClientSide && this.level instanceof net.minecraft.world.server.ServerWorld) {
            net.minecraft.entity.effect.LightningBoltEntity lightning = net.minecraft.entity.EntityType.LIGHTNING_BOLT.create(this.level);
            if (lightning != null) {
                lightning.moveTo(this.getX(), this.getY(), this.getZ());
                ((net.minecraft.world.server.ServerWorld) this.level).addFreshEntity(lightning);
            }
        }
    }
}
