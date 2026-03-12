/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.enchantment.EnchantmentHelper;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
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
/*     */ 
/*     */ public class UltimateSword
/*     */   extends ItemSword
/*     */ {
/*  34 */   private int swingtimer = 0;
/*     */   
/*     */   private boolean leaf = false;
/*     */   
/*     */   public UltimateSword(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/*  39 */     super(par2EnumToolMaterial);
/*     */     
/*  41 */     this.field_77777_bU = 1;
/*  42 */     func_77656_e(3000);
/*  43 */     func_77637_a(CreativeTabs.field_78037_j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77622_d(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  48 */     if (this == OreSpawnMain.MyChainsaw)
/*     */       return; 
/*  50 */     if (this != OreSpawnMain.MyBattleAxe) {
/*  51 */       par1ItemStack.func_77966_a(Enchantment.field_77338_j, OreSpawnMain.UltimateSwordMagic);
/*  52 */       par1ItemStack.func_77966_a(Enchantment.field_77339_k, OreSpawnMain.UltimateSwordMagic);
/*  53 */       par1ItemStack.func_77966_a(Enchantment.field_77336_l, OreSpawnMain.UltimateSwordMagic);
/*  54 */       par1ItemStack.func_77966_a(Enchantment.field_77337_m, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/*  55 */       par1ItemStack.func_77966_a(Enchantment.field_77335_o, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/*  56 */       par1ItemStack.func_77966_a(Enchantment.field_77347_r, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/*  57 */       par1ItemStack.func_77966_a(Enchantment.field_77334_n, 1 + OreSpawnMain.UltimateSwordMagic / 3);
/*     */     } else {
/*  59 */       par1ItemStack.func_77966_a(Enchantment.field_77335_o, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/*  60 */       par1ItemStack.func_77966_a(Enchantment.field_77347_r, 1 + OreSpawnMain.UltimateSwordMagic / 2);
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
/*     */ 
/*     */   
/*     */   public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
/*  76 */     if (this == OreSpawnMain.MyChainsaw && entityLiving != null && this.swingtimer == 0) {
/*  77 */       entityLiving.func_85030_a("orespawn:chainsawshort", 1.0F, entityLiving.field_70170_p.field_73012_v.nextFloat() * 0.2F + 0.9F);
/*  78 */       this.swingtimer = 50;
/*     */     } 
/*  80 */     return false;
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
/*     */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
/*  92 */     if (this == OreSpawnMain.MyChainsaw)
/*     */       return; 
/*  94 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77335_o.field_77352_x, stack);
/*  95 */     if (lvl <= 0) {
/*  96 */       if (this != OreSpawnMain.MyBattleAxe) {
/*  97 */         stack.func_77966_a(Enchantment.field_77338_j, OreSpawnMain.UltimateSwordMagic);
/*  98 */         stack.func_77966_a(Enchantment.field_77339_k, OreSpawnMain.UltimateSwordMagic);
/*  99 */         stack.func_77966_a(Enchantment.field_77336_l, OreSpawnMain.UltimateSwordMagic);
/* 100 */         stack.func_77966_a(Enchantment.field_77337_m, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/* 101 */         stack.func_77966_a(Enchantment.field_77335_o, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/* 102 */         stack.func_77966_a(Enchantment.field_77347_r, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/* 103 */         stack.func_77966_a(Enchantment.field_77334_n, 1 + OreSpawnMain.UltimateSwordMagic / 3);
/*     */       } else {
/* 105 */         stack.func_77966_a(Enchantment.field_77335_o, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/* 106 */         stack.func_77966_a(Enchantment.field_77347_r, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_77663_a(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/* 113 */     if (this == OreSpawnMain.MyChainsaw) {
/* 114 */       if (this.swingtimer > 0) this.swingtimer--;
/*     */       
/* 116 */       if (par2World.field_72995_K && this.swingtimer > 0) {
/* 117 */         float f = 1.0F;
/*     */         
/* 119 */         float dx = (float)(f * Math.cos(Math.toRadians((par3Entity.field_70177_z + 90.0F + 45.0F))));
/* 120 */         float dz = (float)(f * Math.sin(Math.toRadians((par3Entity.field_70177_z + 90.0F + 45.0F))));
/*     */         
/* 122 */         if (par2World.field_73012_v.nextInt(8) == 0) {
/* 123 */           par2World.func_72869_a("flame", par3Entity.field_70165_t + dx, par3Entity.field_70163_u, par3Entity.field_70161_v + dz, ((par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) / 20.0F), (par2World.field_73012_v.nextFloat() / 10.0F), ((par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) / 20.0F));
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 129 */         if (par2World.field_73012_v.nextInt(2) == 0) {
/* 130 */           par2World.func_72869_a("smoke", par3Entity.field_70165_t + dx, par3Entity.field_70163_u, par3Entity.field_70161_v + dz, ((par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) / 20.0F), (par2World.field_73012_v.nextFloat() / 10.0F), ((par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) / 20.0F));
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 136 */         if (par2World.field_73012_v.nextInt(10) == 0) {
/* 137 */           par2World.func_72869_a("fireworksSpark", par3Entity.field_70165_t + dx, par3Entity.field_70163_u, par3Entity.field_70161_v + dz, ((par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) / 20.0F), (par2World.field_73012_v.nextFloat() / 5.0F), ((par2World.field_73012_v.nextFloat() - par2World.field_73012_v.nextFloat()) / 20.0F));
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 148 */     int lvl = EnchantmentHelper.func_77506_a(Enchantment.field_77335_o.field_77352_x, stack);
/* 149 */     if (lvl <= 0) {
/* 150 */       if (this != OreSpawnMain.MyBattleAxe) {
/* 151 */         stack.func_77966_a(Enchantment.field_77338_j, OreSpawnMain.UltimateSwordMagic);
/* 152 */         stack.func_77966_a(Enchantment.field_77339_k, OreSpawnMain.UltimateSwordMagic);
/* 153 */         stack.func_77966_a(Enchantment.field_77336_l, OreSpawnMain.UltimateSwordMagic);
/* 154 */         stack.func_77966_a(Enchantment.field_77337_m, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/* 155 */         stack.func_77966_a(Enchantment.field_77335_o, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/* 156 */         stack.func_77966_a(Enchantment.field_77347_r, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/* 157 */         stack.func_77966_a(Enchantment.field_77334_n, 1 + OreSpawnMain.UltimateSwordMagic / 3);
/*     */       } else {
/* 159 */         stack.func_77966_a(Enchantment.field_77335_o, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/* 160 */         stack.func_77966_a(Enchantment.field_77347_r, 1 + OreSpawnMain.UltimateSwordMagic / 2);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMaterialName() {
/* 168 */     return "Uranium/Titanium";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
/* 173 */     par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityLiving);
/* 174 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
/* 179 */     if (entity != null && OreSpawnMain.ultimate_sword_pvp == 0) {
/* 180 */       if (entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend) {
/* 181 */         return true;
/*     */       }
/* 183 */       if (entity instanceof EntityTameable) {
/* 184 */         EntityTameable t = (EntityTameable)entity;
/* 185 */         if (t.func_70909_n()) {
/* 186 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 192 */     if (this == OreSpawnMain.MyChainsaw && 
/* 193 */       player != null) {
/* 194 */       findSomethingToHit(player);
/*     */     }
/*     */     
/* 197 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/* 205 */     return 9000;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 210 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ 
/*     */   
/*     */   private void findSomethingToHit(EntityPlayer player) {
/* 215 */     List var5 = player.field_70170_p.func_72872_a(EntityLivingBase.class, player.field_70121_D.func_72314_b(5.0D, 5.0D, 5.0D));
/* 216 */     Iterator<Entity> var2 = var5.iterator();
/* 217 */     Entity var3 = null;
/* 218 */     EntityLivingBase var4 = null;
/*     */     
/* 220 */     while (var2.hasNext()) {
/*     */       
/* 222 */       var3 = var2.next();
/* 223 */       var4 = (EntityLivingBase)var3;
/*     */       
/* 225 */       if (isSuitableTarget(var4, false, player))
/*     */       {
/* 227 */         var4.func_70097_a(DamageSource.func_76365_a(player), OreSpawnMain.chainsaw_stats.damage);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2, EntityPlayer player) {
/* 235 */     if (par1EntityLiving == null)
/*     */     {
/* 237 */       return false;
/*     */     }
/* 239 */     if (par1EntityLiving == player)
/*     */     {
/* 241 */       return false;
/*     */     }
/* 243 */     if (!par1EntityLiving.func_70089_S())
/*     */     {
/* 245 */       return false;
/*     */     }
/* 247 */     if (OreSpawnMain.ultimate_sword_pvp == 0) {
/* 248 */       if (par1EntityLiving instanceof EntityPlayer || par1EntityLiving instanceof Girlfriend || par1EntityLiving instanceof Boyfriend) {
/* 249 */         return false;
/*     */       }
/* 251 */       if (par1EntityLiving instanceof EntityTameable) {
/* 252 */         EntityTameable t = (EntityTameable)par1EntityLiving;
/* 253 */         if (t.func_70909_n()) {
/* 254 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 259 */     if (!MyCanSee(par1EntityLiving, player))
/*     */     {
/*     */       
/* 262 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 266 */     return true;
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
/*     */   public boolean MyCanSee(EntityLivingBase e, EntityPlayer player) {
/* 281 */     int nblks = 10;
/*     */     
/* 283 */     double cx = player.field_70165_t;
/* 284 */     double cz = player.field_70161_v;
/* 285 */     float startx = (float)cx;
/* 286 */     float starty = (float)(player.field_70163_u + 1.399999976158142D);
/* 287 */     float startz = (float)cz;
/* 288 */     float dx = (float)((e.field_70165_t - startx) / 10.0D);
/* 289 */     float dy = (float)((e.field_70163_u + (e.field_70131_O / 2.0F) - starty) / 10.0D);
/* 290 */     float dz = (float)((e.field_70161_v - startz) / 10.0D);
/*     */     
/* 292 */     if (Math.abs(dx) > 1.0D) {
/* 293 */       dy /= Math.abs(dx);
/* 294 */       dz /= Math.abs(dx);
/* 295 */       nblks = (int)(nblks * Math.abs(dx));
/* 296 */       if (dx > 1.0F) dx = 1.0F; 
/* 297 */       if (dx < -1.0F) dx = -1.0F; 
/*     */     } 
/* 299 */     if (Math.abs(dy) > 1.0D) {
/* 300 */       dx /= Math.abs(dy);
/* 301 */       dz /= Math.abs(dy);
/* 302 */       nblks = (int)(nblks * Math.abs(dy));
/* 303 */       if (dy > 1.0F) dy = 1.0F; 
/* 304 */       if (dy < -1.0F) dy = -1.0F; 
/*     */     } 
/* 306 */     if (Math.abs(dz) > 1.0D) {
/* 307 */       dy /= Math.abs(dz);
/* 308 */       dx /= Math.abs(dz);
/* 309 */       nblks = (int)(nblks * Math.abs(dz));
/* 310 */       if (dz > 1.0F) dz = 1.0F; 
/* 311 */       if (dz < -1.0F) dz = -1.0F;
/*     */     
/*     */     } 
/* 314 */     for (int i = 0; i < nblks; i++) {
/* 315 */       startx += dx;
/* 316 */       starty += dy;
/* 317 */       startz += dz;
/* 318 */       Block bid = player.field_70170_p.func_147439_a((int)startx, (int)starty, (int)startz);
/* 319 */       if (bid != Blocks.field_150350_a) return false;
/*     */     
/*     */     } 
/*     */     
/* 323 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(Block par1Block) {
/* 331 */     return canCrush(par1Block);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean canCrush(Block blockID) {
/* 336 */     if (this == OreSpawnMain.MyChainsaw) {
/* 337 */       if (blockID == Blocks.field_150321_G) return true; 
/* 338 */       if (blockID == Blocks.field_150364_r) return true; 
/* 339 */       if (blockID == Blocks.field_150362_t) return true; 
/* 340 */       if (blockID == Blocks.field_150344_f) return true; 
/* 341 */       if (blockID == Blocks.field_150345_g) return true; 
/* 342 */       if (blockID == Blocks.field_150329_H) return true; 
/* 343 */       if (blockID == Blocks.field_150434_aF) return true; 
/* 344 */       if (blockID == OreSpawnMain.CrystalPlanksBlock) return true; 
/* 345 */       if (blockID == OreSpawnMain.MyAppleLeaves) return true; 
/* 346 */       if (blockID == OreSpawnMain.MySkyTreeLog) return true; 
/* 347 */       if (blockID == OreSpawnMain.MyDT) return true; 
/* 348 */       if (blockID == OreSpawnMain.MyExperienceLeaves) return true; 
/* 349 */       if (blockID == OreSpawnMain.MyScaryLeaves) return true; 
/* 350 */       if (blockID == OreSpawnMain.MyCherryLeaves) return true; 
/* 351 */       if (blockID == OreSpawnMain.MyPeachLeaves) return true; 
/* 352 */       if (blockID == OreSpawnMain.MyCrystalLeaves) return true; 
/* 353 */       if (blockID == OreSpawnMain.MyCrystalLeaves2) return true; 
/* 354 */       if (blockID == OreSpawnMain.MyCrystalLeaves3) return true; 
/* 355 */       if (blockID == OreSpawnMain.MyCrystalTreeLog) return true;
/*     */       
/* 357 */       return false;
/*     */     } 
/* 359 */     return (blockID == Blocks.field_150321_G);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isLeaves(Block blockID) {
/* 364 */     if (blockID == Blocks.field_150321_G) return true; 
/* 365 */     if (blockID == Blocks.field_150362_t) return true; 
/* 366 */     if (blockID == Blocks.field_150345_g) return true; 
/* 367 */     if (blockID == Blocks.field_150329_H) return true; 
/* 368 */     if (blockID == OreSpawnMain.MyAppleLeaves) return true; 
/* 369 */     if (blockID == OreSpawnMain.MyExperienceLeaves) return true; 
/* 370 */     if (blockID == OreSpawnMain.MyScaryLeaves) return true; 
/* 371 */     if (blockID == OreSpawnMain.MyCherryLeaves) return true; 
/* 372 */     if (blockID == OreSpawnMain.MyPeachLeaves) return true; 
/* 373 */     if (blockID == OreSpawnMain.MyCrystalLeaves) return true; 
/* 374 */     if (blockID == OreSpawnMain.MyCrystalLeaves2) return true; 
/* 375 */     if (blockID == OreSpawnMain.MyCrystalLeaves3) return true;
/*     */     
/* 377 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_150894_a(ItemStack par1ItemStack, World par2World, Block par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase) {
/* 382 */     if (this == OreSpawnMain.MyChainsaw && !par2World.field_72995_K)
/*     */     {
/*     */ 
/*     */       
/* 386 */       for (int i = -5; i <= 5; i++) {
/* 387 */         for (int j = -5; j <= 10; j++) {
/* 388 */           for (int k = -5; k <= 5; k++) {
/* 389 */             Block bid = par2World.func_147439_a(par4 + i, par5 + j, par6 + k);
/* 390 */             if (this.leaf == true) {
/* 391 */               if (isLeaves(bid)) {
/* 392 */                 dropItemRand(par2World, Item.func_150898_a(bid), 1, par4 + i, par5 + j, par6 + k);
/* 393 */                 par2World.func_147449_b(par4 + i, par5 + j, par6 + k, Blocks.field_150350_a);
/*     */               }
/*     */             
/* 396 */             } else if (canCrush(bid)) {
/* 397 */               dropItemRand(par2World, Item.func_150898_a(bid), 1, par4 + i, par5 + j, par6 + k);
/* 398 */               par2World.func_147449_b(par4 + i, par5 + j, par6 + k, Blocks.field_150350_a);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 405 */     return super.func_150894_a(par1ItemStack, par2World, par3, par4, par5, par6, par7EntityLivingBase);
/*     */   }
/*     */ 
/*     */   
/*     */   private ItemStack dropItemRand(World world, Item index, int par1, int x, int y, int z) {
/* 410 */     EntityItem var3 = null;
/* 411 */     ItemStack is = new ItemStack(index, par1, 0);
/* 412 */     var3 = new EntityItem(world, (x + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5)), y + 1.0D + world.field_73012_v.nextInt(5), (z + OreSpawnMain.OreSpawnRand.nextInt(5) - OreSpawnMain.OreSpawnRand.nextInt(5)), is);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 417 */     if (var3 != null) world.func_72838_d((Entity)var3); 
/* 418 */     return is;
/*     */   }
/*     */ 
/*     */   
/*     */   public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
/* 423 */     if (par2Block != null && 
/* 424 */       this == OreSpawnMain.MyChainsaw) {
/* 425 */       this.leaf = isLeaves(par2Block);
/* 426 */       if (par2Block.func_149688_o() == Material.field_151575_d || par2Block.func_149688_o() == Material.field_151585_k || par2Block.func_149688_o() == Material.field_151582_l) return OreSpawnMain.chainsaw_stats.efficiency; 
/* 427 */       if (canCrush(par2Block)) return OreSpawnMain.chainsaw_stats.efficiency;
/*     */     
/*     */     } 
/* 430 */     return 2.0F;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\UltimateSword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */