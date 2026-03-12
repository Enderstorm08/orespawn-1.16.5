/*     */ package danger.orespawn;
/*     */ 
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.world.Teleporter;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.WorldServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OreSpawnTeleporter
/*     */   extends Teleporter
/*     */ {
/*     */   private final WorldServer world;
/*     */   private final World oldWorld;
/*     */   private final Random random;
/*     */   private final int newdim;
/*     */   
/*     */   public OreSpawnTeleporter(WorldServer par1WorldServer, int dim, World par2World) {
/*  35 */     super(par1WorldServer);
/*  36 */     this.world = par1WorldServer;
/*  37 */     this.oldWorld = par2World;
/*  38 */     this.random = new Random(par1WorldServer.func_72905_C());
/*  39 */     this.newdim = dim;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_77185_a(Entity par1Entity, double par2, double par4, double par6, float par8) {
/*  46 */     justPutMe(par1Entity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77184_b(Entity par1Entity, double par2, double par4, double par6, float par8) {
/*  53 */     justPutMe(par1Entity);
/*  54 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_85188_a(Entity par1Entity) {
/*  60 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isGroundBlock(Block bid) {
/*  65 */     if (bid == Blocks.field_150350_a) return false; 
/*  66 */     if (bid == Blocks.field_150346_d) return true; 
/*  67 */     if (bid == Blocks.field_150349_c) return true; 
/*  68 */     if (bid == Blocks.field_150348_b) return true; 
/*  69 */     if (bid == Blocks.field_150377_bs) return true; 
/*  70 */     if (bid == Blocks.field_150424_aL) return true; 
/*  71 */     if (bid == Blocks.field_150347_e) return true; 
/*  72 */     if (bid == Blocks.field_150354_m) return true; 
/*  73 */     if (bid == Blocks.field_150322_A) return true; 
/*  74 */     if (bid == Blocks.field_150458_ak) return true; 
/*  75 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean justPutMe(Entity par1Entity) {
/*  83 */     int posX = (int)par1Entity.field_70165_t;
/*  84 */     int posZ = (int)par1Entity.field_70161_v;
/*  85 */     int posY = 120;
/*  86 */     int found = 0;
/*     */     
/*  88 */     int inarow = 0;
/*  89 */     int airfound = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     for (int i = 0; i < 1000 && found == 0; i++) {
/*     */ 
/*     */       
/*  98 */       for (posY = 180; posY > 1; posY--) {
/*     */ 
/*     */         
/* 101 */         Block bid = this.world.func_147439_a(posX, posY + 1, posZ);
/*     */         
/* 103 */         if (bid == Blocks.field_150350_a) {
/*     */           
/* 105 */           inarow = 0;
/* 106 */           bid = this.world.func_147439_a(posX, posY, posZ);
/*     */           
/* 108 */           if (bid == Blocks.field_150350_a) {
/*     */             
/* 110 */             airfound = 1;
/* 111 */             bid = this.world.func_147439_a(posX, posY - 1, posZ);
/*     */             
/* 113 */             if (bid != Blocks.field_150350_a) {
/*     */               
/* 115 */               if (this.world.func_147439_a(posX, posY - 1, posZ).func_149688_o().func_76220_a()) {
/*     */ 
/*     */                 
/* 118 */                 found = 1;
/*     */                 
/*     */                 break;
/*     */               } 
/* 122 */               if (bid == Blocks.field_150329_H && this.world.func_147439_a(posX, posY - 2, posZ).func_149688_o().func_76220_a()) {
/*     */ 
/*     */                 
/* 125 */                 found = 1;
/* 126 */                 posY--;
/*     */               } 
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } else {
/* 133 */           if (isGroundBlock(bid)) inarow++; 
/* 134 */           if (airfound != 0 && inarow >= 3)
/*     */             break; 
/*     */         } 
/* 137 */       }  if (found == 0) {
/*     */         
/* 139 */         posX = (int)par1Entity.field_70165_t + this.world.field_73012_v.nextInt(3 + i / 5) - this.world.field_73012_v.nextInt(3 + i / 5);
/* 140 */         if (i > 100) posX = posX + OreSpawnMain.OreSpawnRand.nextInt(2 + i / 5) - OreSpawnMain.OreSpawnRand.nextInt(2 + i / 5); 
/* 141 */         if (i > 500) posX = posX + this.random.nextInt(2 + i / 5) - this.random.nextInt(2 + i / 5); 
/* 142 */         posZ = (int)par1Entity.field_70161_v + this.world.field_73012_v.nextInt(3 + i / 5) - this.world.field_73012_v.nextInt(3 + i / 5);
/* 143 */         if (i > 100) posZ = posZ + OreSpawnMain.OreSpawnRand.nextInt(2 + i / 5) - OreSpawnMain.OreSpawnRand.nextInt(2 + i / 5); 
/* 144 */         if (i > 500) posZ = posZ + this.random.nextInt(2 + i / 5) - this.random.nextInt(2 + i / 5);
/*     */         
/* 146 */         airfound = 0;
/* 147 */         inarow = 0;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 153 */     if (found == 0) {
/*     */       
/* 155 */       posX = (int)par1Entity.field_70165_t;
/* 156 */       posZ = (int)par1Entity.field_70161_v;
/* 157 */       for (posY = 180; posY > 1; posY--) {
/*     */ 
/*     */         
/* 160 */         if (Blocks.field_150350_a == this.world.func_147439_a(posX, posY + 1, posZ) && Blocks.field_150350_a == this.world.func_147439_a(posX, posY, posZ))
/*     */         {
/* 162 */           if (Blocks.field_150350_a != this.world.func_147439_a(posX, posY - 1, posZ)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 171 */     double oldX = par1Entity.field_70165_t;
/* 172 */     double oldY = par1Entity.field_70163_u;
/* 173 */     double oldZ = par1Entity.field_70161_v;
/* 174 */     double newX = posX;
/* 175 */     double newZ = posZ;
/* 176 */     double newY = posY;
/* 177 */     if (newX < 0.0D) {
/* 178 */       newX -= 0.5D;
/*     */     } else {
/* 180 */       newX += 0.5D;
/* 181 */     }  if (newZ < 0.0D) {
/* 182 */       newZ -= 0.5D;
/*     */     } else {
/* 184 */       newZ += 0.5D;
/*     */     } 
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
/* 199 */     par1Entity.func_70012_b(newX, newY, newZ, par1Entity.field_70177_z, 0.0F);
/* 200 */     par1Entity.field_70159_w = par1Entity.field_70181_x = par1Entity.field_70179_y = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 208 */     if (par1Entity instanceof EntityPlayer) {
/* 209 */       EntityPlayer ep = (EntityPlayer)par1Entity;
/* 210 */       AxisAlignedBB bb = AxisAlignedBB.func_72330_a(oldX - 24.0D, oldY - 12.0D, oldZ - 24.0D, oldX + 24.0D, oldY + 12.0D, oldZ + 24.0D);
/* 211 */       List var5 = this.oldWorld.func_72872_a(EntityTameable.class, bb);
/* 212 */       Iterator<Entity> var2 = var5.iterator();
/*     */       
/* 214 */       while (var2.hasNext()) {
/*     */         
/* 216 */         Entity var3 = var2.next();
/* 217 */         EntityTameable et = (EntityTameable)var3;
/*     */         
/* 219 */         if (!et.func_70906_o() && et.func_152114_e((EntityLivingBase)ep)) {
/*     */           
/* 221 */           et.func_70012_b(newX, newY, newZ, et.field_70177_z, 0.0F);
/* 222 */           et.field_70159_w = et.field_70181_x = et.field_70179_y = 0.0D;
/* 223 */           sendToThisDimension(var3);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 229 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void sendToThisDimension(Entity e) {
/* 234 */     e.field_70170_p.func_72900_e(e);
/* 235 */     e.field_70128_L = false;
/* 236 */     e.func_70029_a((World)this.world);
/* 237 */     Entity var6 = EntityList.func_75620_a(EntityList.func_75621_b(e), (World)this.world);
/* 238 */     if (var6 != null) {
/*     */       
/* 240 */       var6.func_82141_a(e, true);
/* 241 */       this.world.func_72838_d(var6);
/*     */     } 
/* 243 */     e.field_70128_L = true;
/*     */   }
/*     */   
/*     */   public void func_85189_a(long par1) {}
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\OreSpawnTeleporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */