/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.util.ResourceLocation;
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
/*     */ public class EntityAnt
/*     */   extends EntityAnimal
/*     */ {
/*  27 */   public double moveSpeed = 0.15000000596046448D;
/*  28 */   private static final ResourceLocation texture1 = new ResourceLocation("orespawn", "ant.png");
/*  29 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn", "red_ant.png");
/*  30 */   private static final ResourceLocation texture3 = new ResourceLocation("orespawn", "rainbow_ant.png");
/*  31 */   private static final ResourceLocation texture4 = new ResourceLocation("orespawn", "unstableant.png");
/*  32 */   private static final ResourceLocation texture5 = new ResourceLocation("orespawn", "termite.png");
/*     */ 
/*     */   
/*     */   public EntityAnt(World par1World) {
/*  36 */     super(par1World);
/*  37 */     func_70105_a(0.1F, 0.1F);
/*  38 */     this.field_70728_aV = 0;
/*  39 */     func_70661_as().func_75491_a(true);
/*  40 */     this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.4D));
/*  41 */     this.field_70714_bg.func_75776_a(1, new MyEntityAIWanderALot((EntityCreature)this, 9, 1.0D));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void func_110147_ax() {
/*  46 */     super.func_110147_ax();
/*  47 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*  48 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  49 */     func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e);
/*  50 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(0.0D);
/*     */   }
/*     */   
/*     */   public ResourceLocation getTexture(EntityAnt a) {
/*  54 */     if (a instanceof EntityRedAnt) return texture2; 
/*  55 */     if (a instanceof EntityRainbowAnt) return texture3; 
/*  56 */     if (a instanceof EntityUnstableAnt) return texture4; 
/*  57 */     if (a instanceof Termite) return texture5; 
/*  58 */     return texture1;
/*     */   }
/*     */   
/*     */   protected boolean func_70692_ba() {
/*  62 */     if (func_104002_bU()) return false; 
/*  63 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70071_h_() {
/*  71 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  72 */     super.func_70071_h_();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
/*  81 */     if (par1EntityPlayer == null) return false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     if (!(par1EntityPlayer instanceof EntityPlayerMP)) return false;
/*     */ 
/*     */     
/*  90 */     ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g();
/*  91 */     if (var2 != null && 
/*  92 */       var2.field_77994_a <= 0) {
/*  93 */       par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null);
/*  94 */       var2 = null;
/*     */     } 
/*     */     
/*  97 */     if (var2 != null) {
/*  98 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 102 */     if (par1EntityPlayer.field_71093_bK != OreSpawnMain.DimensionID) {
/* 103 */       MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(OreSpawnMain.DimensionID), OreSpawnMain.DimensionID, this.field_70170_p));
/*     */     } else {
/*     */       
/* 106 */       MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(0), 0, this.field_70170_p));
/*     */     } 
/*     */ 
/*     */     
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70650_aV() {
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 125 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70639_aQ() {
/* 133 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70621_aR() {
/* 141 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String func_70673_aS() {
/* 149 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float func_70599_aP() {
/* 158 */     return 0.0F;
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
/*     */   protected void playStepSound(int par1, int par2, int par3, int par4) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_70628_a(boolean par1, int par2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean func_70041_e_() {
/* 188 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable func_90011_a(EntityAgeable var1) {
/* 195 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70601_bi() {
/* 203 */     if (this.field_70163_u < 50.0D) return false; 
/* 204 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_70629_bd() {
/* 209 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 210 */     super.func_70629_bd();
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\EntityAnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */