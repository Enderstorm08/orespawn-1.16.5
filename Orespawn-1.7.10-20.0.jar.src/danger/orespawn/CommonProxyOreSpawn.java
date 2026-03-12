/*    */ package danger.orespawn;
/*    */ 
/*    */ import cpw.mods.fml.common.network.NetworkRegistry;
/*    */ import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CommonProxyOreSpawn
/*    */ {
/*    */   private SimpleNetworkWrapper network;
/*    */   
/*    */   public SimpleNetworkWrapper getNetwork() {
/* 26 */     return this.network;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void registerRenderThings() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void registerSoundThings() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void registerKeyboardInput() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void registerNetworkStuff() {
/* 46 */     this.network = NetworkRegistry.INSTANCE.newSimpleChannel("RiderControls");
/* 47 */     this.network.registerMessage(RiderControlMessageHandler.class, RiderControlMessage.class, 0, Side.SERVER);
/*    */   }
/*    */ 
/*    */   
/*    */   public int setArmorPrefix(String string) {
/* 52 */     return 0;
/*    */   }
/*    */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\CommonProxyOreSpawn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */