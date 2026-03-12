/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAttackOnCollide;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.util.ChatComponentText;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.IChatComponent;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Termite
/*     */   extends EntityAnt
/*     */ {
/*  41 */   int attack_delay = 20;
/*     */   private int closest;
/*     */   private int tx; private int ty; private int tz; protected void func_110147_ax() { super.func_110147_ax(); func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(mygetMaxHealth());
/*     */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(this.moveSpeed);
/*  45 */     func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(2.0D); } public int mygetMaxHealth() { return 5; } public Termite(World par1World) { super(par1World);
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
/* 174 */     this.closest = 99999;
/* 175 */     this.tx = 0; this.ty = 0; this.tz = 0; func_70105_a(0.2F, 0.2F); this.moveSpeed = 0.20000000298023224D; this.field_70728_aV = 1; func_70661_as().func_75491_a(true); this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.399999976158142D)); this.field_70714_bg.func_75776_a(1, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 1.0D, false)); this.field_70714_bg.func_75776_a(2, new MyEntityAIWanderALot((EntityCreature)this, 8, 1.0D)); if (OreSpawnMain.PlayNicely == 0) this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 6, true));  }
/*     */   public boolean func_70652_k(Entity par1Entity) { if (OreSpawnMain.OreSpawnRand.nextInt(15) != 0)
/*     */       return false;  if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL)
/* 178 */       return false;  boolean var4 = par1Entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), 1.0F); return var4; } private boolean scan_it(int x, int y, int z, int dx, int dy, int dz) { int found = 0;
/*     */ 
/*     */     
/*     */     int i;
/*     */     
/* 183 */     for (i = -dy; i <= dy; i++) {
/* 184 */       for (int j = -dz; j <= dz; j++) {
/* 185 */         Block bid = this.field_70170_p.func_147439_a(x + dx, y + i, z + j);
/* 186 */         if (isWood(bid)) {
/* 187 */           int d = dx * dx + j * j + i * i;
/* 188 */           if (d < this.closest) {
/* 189 */             this.closest = d;
/* 190 */             this.tx = x + dx; this.ty = y + i; this.tz = z + j;
/* 191 */             found++;
/*     */           } 
/*     */         } 
/* 194 */         bid = this.field_70170_p.func_147439_a(x - dx, y + i, z + j);
/* 195 */         if (isWood(bid)) {
/* 196 */           int d = dx * dx + j * j + i * i;
/* 197 */           if (d < this.closest) {
/* 198 */             this.closest = d;
/* 199 */             this.tx = x - dx; this.ty = y + i; this.tz = z + j;
/* 200 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 206 */     for (i = -dx; i <= dx; i++) {
/* 207 */       for (int j = -dz; j <= dz; j++) {
/* 208 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + dy, z + j);
/* 209 */         if (isWood(bid)) {
/* 210 */           int d = dy * dy + j * j + i * i;
/* 211 */           if (d < this.closest) {
/* 212 */             this.closest = d;
/* 213 */             this.tx = x + i; this.ty = y + dy; this.tz = z + j;
/* 214 */             found++;
/*     */           } 
/*     */         } 
/* 217 */         bid = this.field_70170_p.func_147439_a(x + i, y - dy, z + j);
/* 218 */         if (isWood(bid)) {
/* 219 */           int d = dy * dy + j * j + i * i;
/* 220 */           if (d < this.closest) {
/* 221 */             this.closest = d;
/* 222 */             this.tx = x + i; this.ty = y - dy; this.tz = z + j;
/* 223 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 229 */     for (i = -dx; i <= dx; i++) {
/* 230 */       for (int j = -dy; j <= dy; j++) {
/* 231 */         Block bid = this.field_70170_p.func_147439_a(x + i, y + j, z + dz);
/* 232 */         if (isWood(bid)) {
/* 233 */           int d = dz * dz + j * j + i * i;
/* 234 */           if (d < this.closest) {
/* 235 */             this.closest = d;
/* 236 */             this.tx = x + i; this.ty = y + j; this.tz = z + dz;
/* 237 */             found++;
/*     */           } 
/*     */         } 
/* 240 */         bid = this.field_70170_p.func_147439_a(x + i, y + j, z - dz);
/* 241 */         if (isWood(bid)) {
/* 242 */           int d = dz * dz + j * j + i * i;
/* 243 */           if (d < this.closest) {
/* 244 */             this.closest = d;
/* 245 */             this.tx = x + i; this.ty = y + j; this.tz = z - dz;
/* 246 */             found++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 252 */     if (found != 0) return true; 
/* 253 */     return false; } public boolean func_70085_c(EntityPlayer par1EntityPlayer) { if (par1EntityPlayer == null)
/*     */       return false;  if (!(par1EntityPlayer instanceof EntityPlayerMP))
/*     */       return false;  ItemStack var2 = par1EntityPlayer.field_71071_by.func_70448_g(); if (var2 != null && var2.field_77994_a <= 0) { par1EntityPlayer.field_71071_by.func_70299_a(par1EntityPlayer.field_71071_by.field_70461_c, (ItemStack)null); var2 = null; }
/*     */      if (var2 != null) { par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText("Empty your hand!")); return false; }
/*     */      if (par1EntityPlayer.field_71093_bK != OreSpawnMain.DimensionID5) { int i; for (i = 0; i < par1EntityPlayer.field_71071_by.field_70462_a.length; i++) { if (par1EntityPlayer.field_71071_by.field_70462_a[i] != null) { par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText("Empty your inventory!")); return false; }
/*     */          }
/*     */        for (i = 0; i < par1EntityPlayer.field_71071_by.field_70460_b.length; i++) { if (par1EntityPlayer.field_71071_by.field_70460_b[i] != null) { par1EntityPlayer.func_146105_b((IChatComponent)new ChatComponentText("Take off your armor!")); return false; }
/*     */          }
/*     */        MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, OreSpawnMain.DimensionID5, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(OreSpawnMain.DimensionID5), OreSpawnMain.DimensionID5, this.field_70170_p)); }
/*     */     else { MinecraftServer.func_71276_C().func_71203_ab().transferPlayerToDimension((EntityPlayerMP)par1EntityPlayer, 0, new OreSpawnTeleporter(MinecraftServer.func_71276_C().func_71218_a(0), 0, this.field_70170_p)); }
/*     */      return true; }
/* 264 */   public void func_70629_bd() { if (this.field_70128_L)
/* 265 */       return;  if (this.field_70170_p.field_73012_v.nextInt(200) == 1) func_70604_c(null); 
/* 266 */     if (this.field_70170_p.field_73012_v.nextInt(200) == 1 && OreSpawnMain.PlayNicely == 0) {
/*     */ 
/*     */ 
/*     */       
/* 270 */       this.closest = 99999;
/* 271 */       this.tx = this.ty = this.tz = 0; int i;
/* 272 */       for (i = 1; i < 8; i++) {
/* 273 */         int j = i;
/* 274 */         if (j > 4) j = 4; 
/* 275 */         if (scan_it((int)this.field_70165_t, (int)this.field_70163_u + 1, (int)this.field_70161_v, i, j, i) == true)
/* 276 */           break;  if (i >= 5) i++; 
/*     */       } 
/* 278 */       i = 0;
/* 279 */       if (this.closest < 99999) {
/*     */         
/* 281 */         func_70661_as().func_75492_a(this.tx, this.ty, this.tz, 1.0D);
/* 282 */         if (this.closest < 6) {
/*     */           
/* 284 */           if (this.field_70170_p.field_73012_v.nextInt(3) != 0) {
/* 285 */             if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150346_d, 0, 2); 
/* 286 */             if (findBuddies() < 10)
/* 287 */               spawnCreature(this.field_70170_p, "Termite", this.field_70165_t + 0.10000000149011612D, this.field_70163_u + 0.10000000149011612D, this.field_70161_v + 0.10000000149011612D); 
/*     */           } else {
/* 289 */             if (this.field_70170_p.func_82736_K().func_82766_b("mobGriefing")) this.field_70170_p.func_147465_d(this.tx, this.ty, this.tz, Blocks.field_150350_a, 0, 2); 
/* 290 */             if (findBuddies() < 10)
/* 291 */               spawnCreature(this.field_70170_p, "Termite", (this.tx + 0.1F), (this.ty + 0.1F), (this.tz + 0.1F)); 
/*     */           } 
/* 293 */           func_70691_i(1.0F);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 300 */     super.func_70629_bd(); } public void func_70071_h_() { super.func_70071_h_(); if (this.field_70128_L) return;  if (this.attack_delay > 0) this.attack_delay--;  if (this.attack_delay > 0) return;  this.attack_delay = 20; if (this.field_70170_p.field_73013_u == EnumDifficulty.PEACEFUL) return;  EntityPlayer entityPlayer = this.field_70170_p.func_72856_b((Entity)this, 1.5D); if (entityPlayer != null) func_70652_k((Entity)entityPlayer);  }
/*     */   public boolean isWood(Block bid) { if (bid == Blocks.field_150422_aJ || bid == Blocks.field_150396_be || bid == Blocks.field_150344_f || bid == Blocks.field_150376_bx) return true;  if (bid == Blocks.field_150373_bw || bid == Blocks.field_150324_C || bid == Blocks.field_150462_ai)
/*     */       return true;  if (bid == Blocks.field_150472_an || bid == Blocks.field_150342_X || bid == Blocks.field_150466_ao || bid == Blocks.field_150452_aw)
/*     */       return true;  if (bid == Blocks.field_150487_bG || bid == Blocks.field_150476_ad || bid == Blocks.field_150481_bH || bid == Blocks.field_150485_bF)
/*     */       return true;  if (bid == OreSpawnMain.CrystalPlanksBlock)
/*     */       return true;  return false; }
/* 306 */   private int findBuddies() { List var5 = this.field_70170_p.func_72872_a(Termite.class, this.field_70121_D.func_72314_b(3.0D, 3.0D, 3.0D));
/* 307 */     return var5.size(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Entity spawnCreature(World par0World, String par1, double par2, double par4, double par6) {
/* 316 */     Entity var8 = null;
/* 317 */     var8 = EntityList.func_75620_a(par1, par0World);
/* 318 */     if (var8 != null) {
/*     */ 
/*     */       
/* 321 */       var8.func_70012_b(par2, par4, par6, par0World.field_73012_v.nextFloat() * 360.0F, 0.0F);
/*     */ 
/*     */       
/* 324 */       par0World.func_72838_d(var8);
/*     */     } 
/* 326 */     return var8;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\Termite.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */