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
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ExperienceSword
/*     */   extends ItemSword
/*     */ {
/*     */   private int weaponDamage;
/*     */   private final Item.ToolMaterial toolMaterial;
/*  28 */   private World worldObj = null;
/*  29 */   private World worldObjr = null;
/*     */ 
/*     */   
/*     */   public ExperienceSword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/*  33 */     super(par2EnumToolMaterial);
/*  34 */     this.toolMaterial = par2EnumToolMaterial;
/*  35 */     this.weaponDamage = 15;
/*  36 */     this.field_77777_bU = 1;
/*  37 */     func_77656_e(1400);
/*  38 */     func_77637_a(CreativeTabs.field_78037_j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  43 */     par1ItemStack.func_77966_a(Enchantment.field_77338_j, 2);
/*  44 */     par1ItemStack.func_77966_a(Enchantment.field_77347_r, 3);
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
/*  55 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77338_j.field_77352_x, stack);
/*  56 */     if (lvl <= 0) {
/*  57 */       stack.func_77966_a(Enchantment.field_77338_j, 2);
/*  58 */       stack.func_77966_a(Enchantment.field_77347_r, 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/*  67 */     EntityLivingBase e = null;
/*  68 */     ItemOreSpawnArmor ia = null;
/*  69 */     EntityPlayer p = null;
/*     */     
/*  71 */     onUsingTick(stack, (EntityPlayer)null, 0);
/*  72 */     if (this.worldObj == null && !par2World.field_72995_K) this.worldObj = par2World; 
/*  73 */     if (this.worldObjr == null && par2World.field_72995_K) this.worldObjr = par2World;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     if (par2World.field_73012_v.nextInt(60) == 1)
/*     */     {
/*  80 */       if (par3Entity != null && 
/*  81 */         par3Entity instanceof EntityLivingBase) {
/*  82 */         e = (EntityLivingBase)par3Entity;
/*     */         
/*  84 */         if (e instanceof EntityPlayer) {
/*  85 */           p = (EntityPlayer)e;
/*     */         }
/*  87 */         for (int i = 1; i < 5; i++) {
/*  88 */           ItemStack is = p.func_71124_b(i);
/*  89 */           if (is != null) {
/*  90 */             Item it = is.func_77973_b();
/*  91 */             if (it != null)
/*     */             {
/*  93 */               if (it instanceof ItemOreSpawnArmor) {
/*  94 */                 ia = (ItemOreSpawnArmor)it;
/*  95 */                 if (ia.get_armor_material() == 4)
/*     */                 {
/*  97 */                   switch (ia.get_armor_type()) {
/*     */                     case 0:
/*  99 */                       if (!par2World.field_72995_K && p != null && par2World.field_73012_v.nextInt(10) == 1) {
/* 100 */                         p.func_71023_q(1);
/*     */                       }
/* 102 */                       par2World.func_72869_a("portal", e.field_70165_t, e.field_70163_u + 1.5D, e.field_70161_v, par2World.field_73012_v.nextGaussian(), par2World.field_73012_v.nextGaussian(), par2World.field_73012_v.nextGaussian());
/*     */                       break;
/*     */                     
/*     */                     case 1:
/* 106 */                       if (!par2World.field_72995_K && p != null && par2World.field_73012_v.nextInt(20) == 1) {
/* 107 */                         p.func_71023_q(1);
/*     */                       }
/* 109 */                       par2World.func_72869_a("portal", e.field_70165_t, e.field_70163_u + 1.25D, e.field_70161_v, par2World.field_73012_v.nextGaussian(), par2World.field_73012_v.nextGaussian(), par2World.field_73012_v.nextGaussian());
/*     */                       break;
/*     */                     
/*     */                     case 2:
/* 113 */                       if (!par2World.field_72995_K && p != null && par2World.field_73012_v.nextInt(30) == 1) {
/* 114 */                         p.func_71023_q(1);
/*     */                       }
/* 116 */                       par2World.func_72869_a("portal", e.field_70165_t, e.field_70163_u + 0.75D, e.field_70161_v, par2World.field_73012_v.nextGaussian(), par2World.field_73012_v.nextGaussian(), par2World.field_73012_v.nextGaussian());
/*     */                       break;
/*     */                     
/*     */                     case 3:
/* 120 */                       if (!par2World.field_72995_K && p != null && par2World.field_73012_v.nextInt(40) == 1) {
/* 121 */                         p.func_71023_q(1);
/*     */                       }
/* 123 */                       par2World.func_72869_a("portal", e.field_70165_t, e.field_70163_u + 0.25D, e.field_70161_v, par2World.field_73012_v.nextGaussian(), par2World.field_73012_v.nextGaussian(), par2World.field_73012_v.nextGaussian());
/*     */                       break;
/*     */                   } 
/*     */                 }
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
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
/*     */   public int getDamageVsEntity(Entity par1Entity) {
/* 144 */     return this.weaponDamage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMaterialName() {
/* 150 */     return "Emerald";
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
/*     */   public boolean func_77644_a(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
/* 176 */     float i = 0.0F;
/*     */     
/* 178 */     EntityPlayer p = null;
/* 179 */     EntityLiving l = null;
/* 180 */     if (par3EntityLiving instanceof EntityPlayer) {
/* 181 */       p = (EntityPlayer)par3EntityLiving;
/*     */     }
/* 183 */     if (par2EntityLiving != null && par2EntityLiving instanceof EntityLiving) {
/* 184 */       i = 10.0F;
/*     */     }
/* 186 */     if (i > 0.0F && 
/* 187 */       p != null) {
/* 188 */       p.func_71023_q((int)i);
/*     */     }
/*     */     
/* 191 */     if (p != null) {
/*     */       
/* 193 */       i = (p.field_71068_ca / 2);
/* 194 */       if (i > 0.0F && par2EntityLiving != null) {
/* 195 */         par2EntityLiving.func_70097_a(DamageSource.func_76365_a(p), i);
/*     */       }
/*     */     } 
/* 198 */     if (this.worldObjr != null && par2EntityLiving != null) {
/* 199 */       for (int j = 0; j <= i / 2.0F; j++) {
/* 200 */         this.worldObjr.func_72869_a("portal", par2EntityLiving.field_70165_t, par2EntityLiving.field_70163_u + 1.0D, par2EntityLiving.field_70161_v, this.worldObjr.field_73012_v.nextGaussian(), this.worldObjr.field_73012_v.nextGaussian(), this.worldObjr.field_73012_v.nextGaussian());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 205 */     par1ItemStack.func_77972_a(1, par3EntityLiving);
/* 206 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/* 214 */     return 3000;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 220 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ExperienceSword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */