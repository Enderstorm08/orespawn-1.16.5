/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.enchantment.EnchantmentHelper;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
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
/*     */ 
/*     */ public class Slice
/*     */   extends ItemSword
/*     */ {
/*     */   public Slice(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/*  30 */     super(par2EnumToolMaterial);
/*     */     
/*  32 */     this.field_77777_bU = 1;
/*  33 */     func_77656_e(2600);
/*  34 */     func_77637_a(CreativeTabs.field_78037_j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  39 */     par1ItemStack.func_77966_a(Enchantment.field_77338_j, 5);
/*  40 */     par1ItemStack.func_77966_a(Enchantment.field_77336_l, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
/*  51 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77338_j.field_77352_x, stack);
/*  52 */     if (lvl <= 0) {
/*  53 */       stack.func_77966_a(Enchantment.field_77338_j, 5);
/*  54 */       stack.func_77966_a(Enchantment.field_77336_l, 1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/*  59 */     onUsingTick(stack, (EntityPlayer)null, 0);
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
/*     */   public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
/* 105 */     if (entity != null && (
/* 106 */       entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend)) {
/* 107 */       return true;
/*     */     }
/*     */     
/* 110 */     return false;
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
/*     */   public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
/* 122 */     if (entityLiving != null && entityLiving instanceof EntityPlayer) {
/* 123 */       EntityPlayer p = (EntityPlayer)entityLiving;
/* 124 */       double xzoff = 2.0D;
/* 125 */       double yoff = 1.55D;
/* 126 */       BerthaHit lb = new BerthaHit(p.field_70170_p, (EntityLivingBase)p);
/* 127 */       lb.func_70012_b(p.field_70165_t - xzoff * Math.sin(Math.toRadians(p.field_70759_as)), p.field_70163_u + yoff, p.field_70161_v + xzoff * Math.cos(Math.toRadians(p.field_70759_as)), p.field_70759_as, p.field_70125_A);
/* 128 */       lb.field_70159_w *= 2.0D;
/* 129 */       lb.field_70181_x *= 2.0D;
/* 130 */       lb.field_70179_y *= 2.0D;
/* 131 */       p.field_70170_p.func_72838_d((Entity)lb);
/* 132 */       stack.func_77972_a(1, (EntityLivingBase)p);
/*     */     } 
/* 134 */     return false;
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
/*     */   
/*     */   public String getMaterialName() {
/* 160 */     return "Uranium/Titanium";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
/* 165 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityLiving);
/* 166 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/* 174 */     return 9000;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 180 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Slice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */