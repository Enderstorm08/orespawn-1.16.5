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
/*     */ import net.minecraft.entity.passive.EntityTameable;
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
/*     */ public class Bertha
/*     */   extends ItemSword
/*     */ {
/*     */   public Bertha(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/*  31 */     super(par2EnumToolMaterial);
/*     */     
/*  33 */     this.field_77777_bU = 1;
/*  34 */     func_77656_e(9000);
/*  35 */     func_77637_a(CreativeTabs.field_78037_j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  40 */     if (this == OreSpawnMain.MyRoyal) {
/*  41 */       par1ItemStack.func_77966_a(Enchantment.field_77347_r, 5);
/*     */     }
/*  43 */     else if (this != OreSpawnMain.MyHammy) {
/*  44 */       par1ItemStack.func_77966_a(Enchantment.field_77337_m, 5);
/*  45 */       par1ItemStack.func_77966_a(Enchantment.field_77336_l, 1);
/*  46 */       par1ItemStack.func_77966_a(Enchantment.field_77334_n, 1);
/*     */     } 
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
/*     */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
/*  60 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77337_m.field_77352_x, stack);
/*  61 */     if (lvl == 0) lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77347_r.field_77352_x, stack);
/*     */     
/*  63 */     if (lvl <= 0) {
/*  64 */       if (this == OreSpawnMain.MyRoyal) {
/*  65 */         stack.func_77966_a(Enchantment.field_77347_r, 5);
/*     */       }
/*  67 */       else if (this != OreSpawnMain.MyHammy) {
/*  68 */         stack.func_77966_a(Enchantment.field_77337_m, 5);
/*  69 */         stack.func_77966_a(Enchantment.field_77336_l, 1);
/*  70 */         stack.func_77966_a(Enchantment.field_77334_n, 1);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/*  77 */     onUsingTick(stack, (EntityPlayer)null, 0);
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
/* 123 */     if (entity != null && OreSpawnMain.big_bertha_pvp == 0) {
/* 124 */       if (entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend) {
/* 125 */         return true;
/*     */       }
/* 127 */       if (entity instanceof EntityTameable) {
/* 128 */         EntityTameable t = (EntityTameable)entity;
/* 129 */         if (t.func_70909_n()) {
/* 130 */           return true;
/*     */         }
/*     */       } 
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
/*     */   public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
/* 146 */     if (entityLiving != null && entityLiving instanceof EntityPlayer && !entityLiving.field_70170_p.field_72995_K) {
/*     */ 
/*     */       
/* 149 */       EntityPlayer p = (EntityPlayer)entityLiving;
/* 150 */       double xzoff = 2.0D;
/* 151 */       double yoff = 1.55D;
/* 152 */       BerthaHit lb = new BerthaHit(p.field_70170_p, (EntityLivingBase)p);
/* 153 */       lb.func_70012_b(p.field_70165_t - xzoff * Math.sin(Math.toRadians(p.field_70759_as)), p.field_70163_u + yoff, p.field_70161_v + xzoff * Math.cos(Math.toRadians(p.field_70759_as)), p.field_70759_as, p.field_70125_A);
/* 154 */       lb.field_70159_w *= 2.0D;
/* 155 */       lb.field_70181_x *= 2.0D;
/* 156 */       lb.field_70179_y *= 2.0D;
/* 157 */       if (this == OreSpawnMain.MyRoyal) {
/* 158 */         lb.setHitType(2);
/*     */       }
/* 160 */       if (this == OreSpawnMain.MyHammy) {
/* 161 */         lb.setHitType(3);
/*     */       }
/* 163 */       p.field_70170_p.func_72838_d((Entity)lb);
/* 164 */       stack.func_77972_a(1, (EntityLivingBase)p);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMaterialName() {
/* 181 */     return "Uranium/Titanium";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
/* 186 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityLiving);
/* 187 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/* 195 */     return 9000;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 201 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Bertha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */