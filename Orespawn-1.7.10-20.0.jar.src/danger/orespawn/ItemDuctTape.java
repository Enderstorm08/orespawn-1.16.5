/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemDuctTape
/*     */   extends Item
/*     */ {
/*     */   private Block field_150935_a;
/*     */   
/*     */   public ItemDuctTape(int par1, Block par2Block) {
/*  23 */     this.field_150935_a = par2Block;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77648_a(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
/*  32 */     Block block = p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_, p_77648_6_);
/*     */     
/*  34 */     if (block == Blocks.field_150431_aC && (p_77648_3_.func_72805_g(p_77648_4_, p_77648_5_, p_77648_6_) & 0x7) < 1) {
/*     */       
/*  36 */       p_77648_7_ = 1;
/*     */     }
/*  38 */     else if (block != Blocks.field_150395_bd && block != Blocks.field_150329_H && block != Blocks.field_150330_I) {
/*     */       
/*  40 */       if (p_77648_7_ == 0)
/*     */       {
/*  42 */         p_77648_5_--;
/*     */       }
/*     */       
/*  45 */       if (p_77648_7_ == 1)
/*     */       {
/*  47 */         p_77648_5_++;
/*     */       }
/*     */       
/*  50 */       if (p_77648_7_ == 2)
/*     */       {
/*  52 */         p_77648_6_--;
/*     */       }
/*     */       
/*  55 */       if (p_77648_7_ == 3)
/*     */       {
/*  57 */         p_77648_6_++;
/*     */       }
/*     */       
/*  60 */       if (p_77648_7_ == 4)
/*     */       {
/*  62 */         p_77648_4_--;
/*     */       }
/*     */       
/*  65 */       if (p_77648_7_ == 5)
/*     */       {
/*  67 */         p_77648_4_++;
/*     */       }
/*     */     } 
/*     */     
/*  71 */     if (!p_77648_2_.func_82247_a(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_))
/*     */     {
/*  73 */       return false;
/*     */     }
/*  75 */     if (p_77648_1_.field_77994_a == 0)
/*     */     {
/*  77 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  81 */     if (p_77648_3_.func_147472_a(this.field_150935_a, p_77648_4_, p_77648_5_, p_77648_6_, false, p_77648_7_, (Entity)null, p_77648_1_)) {
/*     */       
/*  83 */       int i1 = this.field_150935_a.func_149660_a(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_, 0);
/*     */       
/*  85 */       if (p_77648_3_.func_147465_d(p_77648_4_, p_77648_5_, p_77648_6_, this.field_150935_a, i1, 3)) {
/*     */         
/*  87 */         if (p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_, p_77648_6_) == this.field_150935_a) {
/*     */           
/*  89 */           this.field_150935_a.func_149689_a(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, (EntityLivingBase)p_77648_2_, p_77648_1_);
/*  90 */           this.field_150935_a.func_149714_e(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, i1);
/*     */         } 
/*     */         
/*  93 */         p_77648_3_.func_72908_a((p_77648_4_ + 0.5F), (p_77648_5_ + 0.5F), (p_77648_6_ + 0.5F), this.field_150935_a.field_149762_H.func_150496_b(), (this.field_150935_a.field_149762_H.func_150497_c() + 1.0F) / 2.0F, this.field_150935_a.field_149762_H.func_150494_d() * 0.8F);
/*  94 */         p_77648_1_.field_77994_a--;
/*     */       } 
/*     */     } 
/*     */     
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/* 105 */     this.field_77791_bV = iconRegister.func_94245_a("OreSpawn:" + func_77658_a().substring(5));
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ItemDuctTape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */