/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAttackOnCollide;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.world.EnumDifficulty;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EntityRedAnt
/*     */   extends EntityAnt
/*     */ {
/*  32 */   int attack_delay = 20;
/*     */ 
/*     */   
/*     */   public EntityRedAnt(World par1World) {
/*  36 */     super(par1World);
/*     */     
/*  38 */     func_70105_a(0.2F, 0.2F);
/*  39 */     this.moveSpeed = 0.20000000298023224D;
/*  40 */     this.field_70728_aV = 1;
/*  41 */     func_70661_as().func_75491_a(true);
/*  42 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.399999976158142D));
/*  43 */     this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 1.0D, false));
/*  44 */     this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 10, 1.0D));
/*  45 */     if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 4, true));
/*     */   
/*     */   }
/*     */   
/*     */   protected void func_110147_ax() {
/*  50 */     super.func_110147_ax();
/*  51 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  52 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  53 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/*  59 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70652_k(Entity par1Entity) {
/*  66 */     if (OreSpawnMain.OreSpawnRand.nextInt(15) != 0) return false; 
/*  67 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return false; 
/*  68 */     boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 1.0F);
/*  69 */     return var4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  79 */     if (par1EntityPlayer == null) return false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  85 */     if (!(par1EntityPlayer instanceof EntityPlayerMP)) return false;
/*     */ 
/*     */     
/*  88 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*  89 */     if (var2 != null && 
/*  90 */       var2.field_77994_a <= 0) {
/*  91 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  92 */       var2 = null;
/*     */     } 
/*     */     
/*  95 */     if (var2 != null) {
/*  96 */       return false;
/*     */     }
/*     */     
/*  99 */     if (par1EntityPlayer.field_71093_bK != OreSpawnMain.DimensionID2) {
/* 100 */       MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID2, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(OreSpawnMain.DimensionID2), OreSpawnMain.DimensionID2, this.field_70170_p));
/*     */     } else {
/*     */       
/* 103 */       MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(0), 0, this.field_70170_p));
/*     */     } 
/*     */ 
/*     */     
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/* 121 */     super.func_70071_h_();
/* 122 */     if (this.field_70128_L)
/* 123 */       return;  if (this.attack_delay > 0) this.attack_delay--; 
/* 124 */     if (this.attack_delay > 0)
/* 125 */       return;  this.attack_delay = 20;
/* 126 */     if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL)
/* 127 */       return;  if (OreSpawnMain.PlayNicely != 0)
/* 128 */       return;  EntityPlayer entityPlayer = this.field_70170_p.func_72856_b((Entity)this, 1.5D);
/* 129 */     if (entityPlayer != null)
/* 130 */       func_70652_k((Entity)entityPlayer); 
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityRedAnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */