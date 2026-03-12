/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.ItemSword;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FairySword
/*     */   extends ItemSword
/*     */ {
/*     */   private int weaponDamage;
/*     */   private final Item.ToolMaterial toolMaterial;
/*     */   
/*     */   public FairySword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/*  30 */     super(par2EnumToolMaterial);
/*  31 */     this.toolMaterial = par2EnumToolMaterial;
/*  32 */     this.weaponDamage = 15;
/*  33 */     this.field_77777_bU = 1;
/*  34 */     func_77656_e(1300);
/*  35 */     func_77637_a(CreativeTabs.field_78037_j);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMaterialName() {
/*  41 */     return "Fairy";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77644_a(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
/*  49 */     int var2 = 5;
/*     */     
/*  51 */     if (par2EntityLiving != null && 
/*  52 */       !par2EntityLiving.field_70170_p.field_72995_K) {
/*     */ 
/*     */       
/*  55 */       int num = 1 + par2EntityLiving.field_70170_p.field_73012_v.nextInt(3);
/*  56 */       for (int i = 0; i < num; i++) {
/*  57 */         Fairy r = null;
/*  58 */         r = (Fairy)spawnCreature(par2EntityLiving.field_70170_p, 0, "Fairy", par2EntityLiving.field_70165_t + (par2EntityLiving.field_70170_p.field_73012_v.nextFloat() - par2EntityLiving.field_70170_p.field_73012_v.nextFloat()) * 0.5D, par2EntityLiving.field_70163_u + par2EntityLiving.field_70170_p.field_73012_v.nextFloat() + 0.01D, par2EntityLiving.field_70161_v + (par2EntityLiving.field_70170_p.field_73012_v.nextFloat() - par2EntityLiving.field_70170_p.field_73012_v.nextFloat()) * 0.5D);
/*     */         
/*  60 */         if (r != null) {
/*  61 */           r.setOwner(par3EntityLiving);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  67 */     par1ItemStack.func_77972_a(1, par3EntityLiving);
/*  68 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, int par1, String name, double par2, double par4, double par6) {
/*  77 */     Entity var8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     if (name == null) {
/*  84 */       var8 = EntityList.func_75616_a(par1, par0World);
/*     */     } else {
/*  86 */       var8 = EntityList.func_75620_a(name, par0World);
/*     */     } 
/*     */     
/*  89 */     if (var8 != null) {
/*     */ 
/*     */       
/*  92 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*  93 */       par0World.func_72838_d(var8);
/*     */       
/*  95 */       ((EntityLiving)var8).func_70642_aH();
/*     */     } 
/*     */     
/*  98 */     return var8;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/* 106 */     return 3000;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 112 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\FairySword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */