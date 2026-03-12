/*      */ package danger.orespawn;
/*      */ 
/*      */ import net.minecraft.client.model.ModelBase;
/*      */ import net.minecraft.client.model.ModelRenderer;
/*      */ import net.minecraft.entity.Entity;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ModelTheKing
/*      */   extends ModelBase
/*      */ {
/*   15 */   private float wingspeed = 1.0F;
/*      */   
/*      */   ModelRenderer LCClaw1;
/*      */   
/*      */   ModelRenderer LThigh;
/*      */   
/*      */   ModelRenderer LUpperLeg;
/*      */   ModelRenderer TailTip;
/*      */   ModelRenderer Tail1;
/*      */   ModelRenderer Tail2;
/*      */   ModelRenderer Tail3;
/*      */   ModelRenderer Tail4;
/*      */   ModelRenderer Tail5;
/*      */   ModelRenderer Tail6;
/*      */   ModelRenderer Tail7;
/*      */   ModelRenderer Body1;
/*      */   ModelRenderer Chest;
/*      */   ModelRenderer NeckC1;
/*      */   ModelRenderer LLowerLeg;
/*      */   ModelRenderer LFoot;
/*      */   ModelRenderer LLClaw1;
/*      */   ModelRenderer LRClaw1;
/*      */   ModelRenderer LCClaw2;
/*      */   ModelRenderer LLClaw2;
/*      */   ModelRenderer TailSpike;
/*      */   ModelRenderer LRClaw2;
/*      */   ModelRenderer LClawRear;
/*      */   ModelRenderer NeckL1;
/*      */   ModelRenderer NeckR1;
/*      */   ModelRenderer RThigh;
/*      */   ModelRenderer RUpperLeg;
/*      */   ModelRenderer RLowerLeg;
/*      */   ModelRenderer RFoot;
/*      */   ModelRenderer RClawRear;
/*      */   ModelRenderer RLClaw1;
/*      */   ModelRenderer RCClaw1;
/*      */   ModelRenderer RRClaw1;
/*      */   ModelRenderer RLClaw2;
/*      */   ModelRenderer RCClaw2;
/*      */   ModelRenderer RRClaw2;
/*      */   ModelRenderer NeckL2;
/*      */   ModelRenderer NeckC2;
/*      */   ModelRenderer NeckR2;
/*      */   ModelRenderer NeckL3;
/*      */   ModelRenderer NeckC3;
/*      */   ModelRenderer NeckR3;
/*      */   ModelRenderer NeckL4;
/*      */   ModelRenderer LHead1;
/*      */   ModelRenderer LHead2;
/*      */   ModelRenderer LHead3;
/*      */   ModelRenderer LJaw1;
/*      */   ModelRenderer LJaw2;
/*      */   ModelRenderer LJaw3;
/*      */   ModelRenderer LTooth1;
/*      */   ModelRenderer LTooth2;
/*      */   ModelRenderer LTooth3;
/*      */   ModelRenderer LTooth4;
/*      */   ModelRenderer NeckC4;
/*      */   ModelRenderer NeckR4;
/*      */   ModelRenderer CHead1;
/*      */   ModelRenderer RHead1;
/*      */   ModelRenderer CHead2;
/*      */   ModelRenderer RHead2;
/*      */   ModelRenderer CHead3;
/*      */   ModelRenderer RHead3;
/*      */   ModelRenderer CJaw1;
/*      */   ModelRenderer CJaw2;
/*      */   ModelRenderer CJaw3;
/*      */   ModelRenderer RJaw1;
/*      */   ModelRenderer RJaw2;
/*      */   ModelRenderer RJaw3;
/*      */   ModelRenderer CTooth3;
/*      */   ModelRenderer CTooth4;
/*      */   ModelRenderer CTooth1;
/*      */   ModelRenderer CTooth2;
/*      */   ModelRenderer RTooth3;
/*      */   ModelRenderer RTooth4;
/*      */   ModelRenderer RTooth1;
/*      */   ModelRenderer RTooth2;
/*      */   ModelRenderer LLEye;
/*      */   ModelRenderer LREye;
/*      */   ModelRenderer CLEye;
/*      */   ModelRenderer CREye;
/*      */   ModelRenderer RLEye;
/*      */   ModelRenderer RREye;
/*      */   ModelRenderer LHeadMane;
/*      */   ModelRenderer CHeadMane;
/*      */   ModelRenderer RHeadMane;
/*      */   ModelRenderer LLNoseSpike;
/*      */   ModelRenderer LRNoseSpike;
/*      */   ModelRenderer CLNoseSpike;
/*      */   ModelRenderer CRNoseSpike;
/*      */   ModelRenderer RLNoseSpike;
/*      */   ModelRenderer RRNoseSpike;
/*      */   ModelRenderer Back1;
/*      */   ModelRenderer Back2;
/*      */   ModelRenderer Lwing1;
/*      */   ModelRenderer Lwing2;
/*      */   ModelRenderer Lwing3;
/*      */   ModelRenderer Lwing4;
/*      */   ModelRenderer Lwing5;
/*      */   ModelRenderer Lwing6;
/*      */   ModelRenderer Lwing7;
/*      */   ModelRenderer Lwing9;
/*      */   ModelRenderer Lwing8;
/*      */   ModelRenderer Lwing10;
/*      */   ModelRenderer Rwing1;
/*      */   ModelRenderer Rwing2;
/*      */   ModelRenderer Rwing3;
/*      */   ModelRenderer Rwing4;
/*      */   ModelRenderer Rwing5;
/*      */   ModelRenderer Rwing6;
/*      */   ModelRenderer Rwing7;
/*      */   ModelRenderer Rwing8;
/*      */   ModelRenderer Rwing9;
/*      */   ModelRenderer Rwing10;
/*      */   ModelRenderer TailTip2;
/*      */   ModelRenderer Ridge1;
/*      */   ModelRenderer Ridge2;
/*      */   ModelRenderer Ridge3;
/*      */   ModelRenderer Ridge4;
/*      */   ModelRenderer Ridge5;
/*      */   ModelRenderer Ridge6;
/*      */   
/*      */   public ModelTheKing(float f1) {
/*  140 */     this.wingspeed = f1;
/*      */     
/*  142 */     this.field_78090_t = 2048;
/*  143 */     this.field_78089_u = 2048;
/*      */     
/*  145 */     this.LCClaw1 = new ModelRenderer(this, 0, 1450);
/*  146 */     this.LCClaw1.func_78789_a(-5.0F, -5.0F, -20.0F, 10, 10, 20);
/*  147 */     this.LCClaw1.func_78793_a(52.0F, -2.0F, -7.0F);
/*  148 */     this.LCClaw1.func_78787_b(64, 32);
/*  149 */     this.LCClaw1.field_78809_i = true;
/*  150 */     setRotation(this.LCClaw1, 0.3839724F, 0.0F, 0.0F);
/*  151 */     this.LThigh = new ModelRenderer(this, 0, 1050);
/*  152 */     this.LThigh.func_78789_a(0.0F, -14.0F, -21.0F, 25, 34, 42);
/*  153 */     this.LThigh.func_78793_a(40.0F, -91.0F, 2.0F);
/*  154 */     this.LThigh.func_78787_b(64, 32);
/*  155 */     this.LThigh.field_78809_i = true;
/*  156 */     setRotation(this.LThigh, 0.7853982F, 0.0F, 0.0F);
/*  157 */     this.LUpperLeg = new ModelRenderer(this, 0, 1137);
/*  158 */     this.LUpperLeg.func_78789_a(0.0F, 12.0F, -16.0F, 24, 52, 24);
/*  159 */     this.LUpperLeg.func_78793_a(40.0F, -91.0F, 2.0F);
/*  160 */     this.LUpperLeg.func_78787_b(64, 32);
/*  161 */     this.LUpperLeg.field_78809_i = true;
/*  162 */     setRotation(this.LUpperLeg, 0.7853982F, 0.0F, 0.0F);
/*  163 */     this.TailTip = new ModelRenderer(this, 500, 102);
/*  164 */     this.TailTip.func_78789_a(-51.0F, -3.0F, 0.0F, 100, 6, 36);
/*  165 */     this.TailTip.func_78793_a(0.0F, -86.0F, 308.0F);
/*  166 */     this.TailTip.func_78787_b(64, 32);
/*  167 */     this.TailTip.field_78809_i = true;
/*  168 */     setRotation(this.TailTip, 0.0F, 0.0F, 0.0F);
/*  169 */     this.Tail1 = new ModelRenderer(this, 500, 614);
/*  170 */     this.Tail1.func_78789_a(-32.0F, 0.0F, 0.0F, 64, 52, 58);
/*  171 */     this.Tail1.func_78793_a(0.0F, -114.0F, 29.0F);
/*  172 */     this.Tail1.func_78787_b(64, 32);
/*  173 */     this.Tail1.field_78809_i = true;
/*  174 */     setRotation(this.Tail1, 0.0F, 0.0F, 0.0F);
/*  175 */     this.Tail2 = new ModelRenderer(this, 500, 520);
/*  176 */     this.Tail2.func_78789_a(-25.0F, -19.0F, -3.0F, 50, 42, 46);
/*  177 */     this.Tail2.func_78793_a(0.0F, -90.0F, 79.0F);
/*  178 */     this.Tail2.func_78787_b(64, 32);
/*  179 */     this.Tail2.field_78809_i = true;
/*  180 */     setRotation(this.Tail2, 0.0F, 0.0F, 0.0F);
/*  181 */     this.Tail3 = new ModelRenderer(this, 500, 432);
/*  182 */     this.Tail3.func_78789_a(-20.0F, -18.0F, 0.0F, 40, 36, 45);
/*  183 */     this.Tail3.func_78793_a(0.0F, -88.0F, 117.0F);
/*  184 */     this.Tail3.func_78787_b(64, 32);
/*  185 */     this.Tail3.field_78809_i = true;
/*  186 */     setRotation(this.Tail3, 0.0F, 0.0F, 0.0F);
/*  187 */     this.Tail4 = new ModelRenderer(this, 500, 355);
/*  188 */     this.Tail4.func_78789_a(-16.0F, -15.0F, 0.0F, 32, 30, 38);
/*  189 */     this.Tail4.func_78793_a(0.0F, -87.0F, 156.0F);
/*  190 */     this.Tail4.func_78787_b(64, 32);
/*  191 */     this.Tail4.field_78809_i = true;
/*  192 */     setRotation(this.Tail4, 0.0F, 0.0F, 0.0F);
/*  193 */     this.Tail5 = new ModelRenderer(this, 500, 286);
/*  194 */     this.Tail5.func_78789_a(-13.0F, -12.0F, 0.0F, 26, 24, 38);
/*  195 */     this.Tail5.func_78793_a(0.0F, -87.0F, 189.0F);
/*  196 */     this.Tail5.func_78787_b(64, 32);
/*  197 */     this.Tail5.field_78809_i = true;
/*  198 */     setRotation(this.Tail5, 0.0F, 0.0F, 0.0F);
/*  199 */     this.Tail6 = new ModelRenderer(this, 500, 218);
/*  200 */     this.Tail6.func_78789_a(-10.0F, -9.0F, 0.0F, 20, 18, 44);
/*  201 */     this.Tail6.func_78793_a(0.0F, -87.0F, 222.0F);
/*  202 */     this.Tail6.func_78787_b(64, 32);
/*  203 */     this.Tail6.field_78809_i = true;
/*  204 */     setRotation(this.Tail6, 0.0F, 0.0F, 0.0F);
/*  205 */     this.Tail7 = new ModelRenderer(this, 500, 150);
/*  206 */     this.Tail7.func_78789_a(-8.0F, -6.0F, -7.0F, 16, 12, 49);
/*  207 */     this.Tail7.func_78793_a(0.0F, -87.0F, 268.0F);
/*  208 */     this.Tail7.func_78787_b(64, 32);
/*  209 */     this.Tail7.field_78809_i = true;
/*  210 */     setRotation(this.Tail7, 0.0F, 0.0F, 0.0F);
/*  211 */     this.Body1 = new ModelRenderer(this, 500, 732);
/*  212 */     this.Body1.func_78789_a(-40.0F, -32.0F, -36.0F, 80, 64, 72);
/*  213 */     this.Body1.func_78793_a(0.0F, -89.0F, 1.0F);
/*  214 */     this.Body1.func_78787_b(64, 32);
/*  215 */     this.Body1.field_78809_i = true;
/*  216 */     setRotation(this.Body1, 0.0F, 0.0F, 0.0F);
/*  217 */     this.Chest = new ModelRenderer(this, 0, 73);
/*  218 */     this.Chest.func_78789_a(-41.0F, -32.0F, -60.0F, 82, 44, 60);
/*  219 */     this.Chest.func_78793_a(0.0F, -91.0F, -22.0F);
/*  220 */     this.Chest.func_78787_b(64, 32);
/*  221 */     this.Chest.field_78809_i = true;
/*  222 */     setRotation(this.Chest, 0.0F, 0.0F, 0.0F);
/*  223 */     this.NeckC1 = new ModelRenderer(this, 700, 1100);
/*  224 */     this.NeckC1.func_78789_a(-12.0F, -12.0F, -24.0F, 24, 24, 24);
/*  225 */     this.NeckC1.func_78793_a(0.0F, -113.0F, -76.0F);
/*  226 */     this.NeckC1.func_78787_b(64, 32);
/*  227 */     this.NeckC1.field_78809_i = true;
/*  228 */     setRotation(this.NeckC1, -0.1047198F, 0.0F, 0.0F);
/*  229 */     this.LLowerLeg = new ModelRenderer(this, 0, 1220);
/*  230 */     this.LLowerLeg.func_78789_a(-11.0F, 0.0F, -10.0F, 22, 59, 20);
/*  231 */     this.LLowerLeg.func_78793_a(52.0F, -52.0F, 36.0F);
/*  232 */     this.LLowerLeg.func_78787_b(64, 32);
/*  233 */     this.LLowerLeg.field_78809_i = true;
/*  234 */     setRotation(this.LLowerLeg, -0.6283185F, 0.0F, 0.0F);
/*  235 */     this.LFoot = new ModelRenderer(this, 0, 1307);
/*  236 */     this.LFoot.func_78789_a(-18.0F, 59.0F, -10.0F, 36, 12, 20);
/*  237 */     this.LFoot.func_78793_a(52.0F, -52.0F, 36.0F);
/*  238 */     this.LFoot.func_78787_b(64, 32);
/*  239 */     this.LFoot.field_78809_i = true;
/*  240 */     setRotation(this.LFoot, -0.6283185F, 0.0F, 0.0F);
/*  241 */     this.LLClaw1 = new ModelRenderer(this, 0, 1400);
/*  242 */     this.LLClaw1.func_78789_a(-5.0F, -5.0F, -20.0F, 10, 10, 20);
/*  243 */     this.LLClaw1.func_78793_a(67.0F, -2.0F, -7.0F);
/*  244 */     this.LLClaw1.func_78787_b(64, 32);
/*  245 */     this.LLClaw1.field_78809_i = true;
/*  246 */     setRotation(this.LLClaw1, 0.3839724F, 0.0F, 0.0F);
/*  247 */     this.LRClaw1 = new ModelRenderer(this, 0, 1500);
/*  248 */     this.LRClaw1.func_78789_a(-5.0F, -5.0F, -20.0F, 10, 10, 20);
/*  249 */     this.LRClaw1.func_78793_a(37.0F, -2.0F, -7.0F);
/*  250 */     this.LRClaw1.func_78787_b(64, 32);
/*  251 */     this.LRClaw1.field_78809_i = true;
/*  252 */     setRotation(this.LRClaw1, 0.3839724F, 0.0F, 0.0F);
/*  253 */     this.LCClaw2 = new ModelRenderer(this, 0, 1600);
/*  254 */     this.LCClaw2.func_78789_a(-2.0F, -7.0F, -46.0F, 4, 7, 28);
/*  255 */     this.LCClaw2.func_78793_a(52.0F, -2.0F, -7.0F);
/*  256 */     this.LCClaw2.func_78787_b(64, 32);
/*  257 */     this.LCClaw2.field_78809_i = true;
/*  258 */     setRotation(this.LCClaw2, 0.6457718F, 0.0F, 0.0F);
/*  259 */     this.LLClaw2 = new ModelRenderer(this, 0, 1550);
/*  260 */     this.LLClaw2.func_78789_a(-2.0F, -7.0F, -46.0F, 4, 7, 28);
/*  261 */     this.LLClaw2.func_78793_a(67.0F, -2.0F, -7.0F);
/*  262 */     this.LLClaw2.func_78787_b(64, 32);
/*  263 */     this.LLClaw2.field_78809_i = true;
/*  264 */     setRotation(this.LLClaw2, 0.6457718F, 0.0F, 0.0F);
/*  265 */     this.TailSpike = new ModelRenderer(this, 500, 0);
/*  266 */     this.TailSpike.func_78789_a(-2.0F, -1.0F, -7.0F, 4, 4, 53);
/*  267 */     this.TailSpike.func_78793_a(0.0F, -87.0F, 375.0F);
/*  268 */     this.TailSpike.func_78787_b(64, 32);
/*  269 */     this.TailSpike.field_78809_i = true;
/*  270 */     setRotation(this.TailSpike, 0.0F, 0.0F, 0.0F);
/*  271 */     this.LRClaw2 = new ModelRenderer(this, 0, 1650);
/*  272 */     this.LRClaw2.func_78789_a(-2.0F, -7.0F, -46.0F, 4, 7, 28);
/*  273 */     this.LRClaw2.func_78793_a(37.0F, -2.0F, -7.0F);
/*  274 */     this.LRClaw2.func_78787_b(64, 32);
/*  275 */     this.LRClaw2.field_78809_i = true;
/*  276 */     setRotation(this.LRClaw2, 0.6457718F, 0.0F, 0.0F);
/*  277 */     this.LClawRear = new ModelRenderer(this, 0, 1350);
/*  278 */     this.LClawRear.func_78789_a(-2.0F, -3.0F, 0.0F, 4, 9, 28);
/*  279 */     this.LClawRear.func_78793_a(52.0F, 4.0F, 4.0F);
/*  280 */     this.LClawRear.func_78787_b(64, 32);
/*  281 */     this.LClawRear.field_78809_i = true;
/*  282 */     setRotation(this.LClawRear, -0.9250245F, 0.0F, 0.0F);
/*  283 */     this.NeckL1 = new ModelRenderer(this, 500, 1100);
/*  284 */     this.NeckL1.func_78789_a(-12.0F, -12.0F, -24.0F, 24, 24, 24);
/*  285 */     this.NeckL1.func_78793_a(30.0F, -113.0F, -76.0F);
/*  286 */     this.NeckL1.func_78787_b(64, 32);
/*  287 */     this.NeckL1.field_78809_i = true;
/*  288 */     setRotation(this.NeckL1, -0.0523599F, -0.1047198F, 0.0F);
/*  289 */     this.NeckR1 = new ModelRenderer(this, 900, 1100);
/*  290 */     this.NeckR1.func_78789_a(-12.0F, -12.0F, -24.0F, 24, 24, 24);
/*  291 */     this.NeckR1.func_78793_a(-30.0F, -113.0F, -76.0F);
/*  292 */     this.NeckR1.func_78787_b(64, 32);
/*  293 */     this.NeckR1.field_78809_i = true;
/*  294 */     setRotation(this.NeckR1, -0.0523599F, 0.1047198F, 0.0F);
/*  295 */     this.RThigh = new ModelRenderer(this, 200, 1050);
/*  296 */     this.RThigh.func_78789_a(0.0F, -14.0F, -21.0F, 25, 34, 42);
/*  297 */     this.RThigh.func_78793_a(-65.0F, -91.0F, 2.0F);
/*  298 */     this.RThigh.func_78787_b(64, 32);
/*  299 */     this.RThigh.field_78809_i = true;
/*  300 */     setRotation(this.RThigh, 0.7853982F, 0.0F, 0.0F);
/*  301 */     this.RUpperLeg = new ModelRenderer(this, 200, 1137);
/*  302 */     this.RUpperLeg.func_78789_a(0.0F, 12.0F, -16.0F, 24, 52, 24);
/*  303 */     this.RUpperLeg.func_78793_a(-64.0F, -91.0F, 2.0F);
/*  304 */     this.RUpperLeg.func_78787_b(64, 32);
/*  305 */     this.RUpperLeg.field_78809_i = true;
/*  306 */     setRotation(this.RUpperLeg, 0.7853982F, 0.0F, 0.0F);
/*  307 */     this.RLowerLeg = new ModelRenderer(this, 200, 1220);
/*  308 */     this.RLowerLeg.func_78789_a(-4.0F, 0.0F, -10.0F, 22, 59, 20);
/*  309 */     this.RLowerLeg.func_78793_a(-59.0F, -52.0F, 36.0F);
/*  310 */     this.RLowerLeg.func_78787_b(64, 32);
/*  311 */     this.RLowerLeg.field_78809_i = true;
/*  312 */     setRotation(this.RLowerLeg, -0.6283185F, 0.0F, 0.0F);
/*  313 */     this.RFoot = new ModelRenderer(this, 200, 1307);
/*  314 */     this.RFoot.func_78789_a(-11.0F, 59.0F, -10.0F, 36, 12, 20);
/*  315 */     this.RFoot.func_78793_a(-59.0F, -52.0F, 36.0F);
/*  316 */     this.RFoot.func_78787_b(64, 32);
/*  317 */     this.RFoot.field_78809_i = true;
/*  318 */     setRotation(this.RFoot, -0.6283185F, 0.0F, 0.0F);
/*  319 */     this.RClawRear = new ModelRenderer(this, 200, 1350);
/*  320 */     this.RClawRear.func_78789_a(-2.0F, -3.0F, 0.0F, 4, 9, 28);
/*  321 */     this.RClawRear.func_78793_a(-52.0F, 4.0F, 4.0F);
/*  322 */     this.RClawRear.func_78787_b(64, 32);
/*  323 */     this.RClawRear.field_78809_i = true;
/*  324 */     setRotation(this.RClawRear, -0.9250245F, 0.0F, 0.0F);
/*  325 */     this.RLClaw1 = new ModelRenderer(this, 200, 1400);
/*  326 */     this.RLClaw1.func_78789_a(-5.0F, -5.0F, -20.0F, 10, 10, 20);
/*  327 */     this.RLClaw1.func_78793_a(-37.0F, -2.0F, -7.0F);
/*  328 */     this.RLClaw1.func_78787_b(64, 32);
/*  329 */     this.RLClaw1.field_78809_i = true;
/*  330 */     setRotation(this.RLClaw1, 0.3839724F, 0.0F, 0.0F);
/*  331 */     this.RCClaw1 = new ModelRenderer(this, 200, 1450);
/*  332 */     this.RCClaw1.func_78789_a(-5.0F, -5.0F, -20.0F, 10, 10, 20);
/*  333 */     this.RCClaw1.func_78793_a(-52.0F, -2.0F, -7.0F);
/*  334 */     this.RCClaw1.func_78787_b(64, 32);
/*  335 */     this.RCClaw1.field_78809_i = true;
/*  336 */     setRotation(this.RCClaw1, 0.3839724F, 0.0F, 0.0F);
/*  337 */     this.RRClaw1 = new ModelRenderer(this, 200, 1500);
/*  338 */     this.RRClaw1.func_78789_a(-5.0F, -5.0F, -20.0F, 10, 10, 20);
/*  339 */     this.RRClaw1.func_78793_a(-67.0F, -2.0F, -7.0F);
/*  340 */     this.RRClaw1.func_78787_b(64, 32);
/*  341 */     this.RRClaw1.field_78809_i = true;
/*  342 */     setRotation(this.RRClaw1, 0.3839724F, 0.0F, 0.0F);
/*  343 */     this.RLClaw2 = new ModelRenderer(this, 200, 1550);
/*  344 */     this.RLClaw2.func_78789_a(-2.0F, -7.0F, -46.0F, 4, 7, 28);
/*  345 */     this.RLClaw2.func_78793_a(-37.0F, -2.0F, -7.0F);
/*  346 */     this.RLClaw2.func_78787_b(64, 32);
/*  347 */     this.RLClaw2.field_78809_i = true;
/*  348 */     setRotation(this.RLClaw2, 0.6457718F, 0.0F, 0.0F);
/*  349 */     this.RCClaw2 = new ModelRenderer(this, 200, 1600);
/*  350 */     this.RCClaw2.func_78789_a(-2.0F, -7.0F, -46.0F, 4, 7, 28);
/*  351 */     this.RCClaw2.func_78793_a(-52.0F, -2.0F, -7.0F);
/*  352 */     this.RCClaw2.func_78787_b(64, 32);
/*  353 */     this.RCClaw2.field_78809_i = true;
/*  354 */     setRotation(this.RCClaw2, 0.6457718F, 0.0F, 0.0F);
/*  355 */     this.RRClaw2 = new ModelRenderer(this, 200, 1650);
/*  356 */     this.RRClaw2.func_78789_a(-2.0F, -7.0F, -46.0F, 4, 7, 28);
/*  357 */     this.RRClaw2.func_78793_a(-67.0F, -2.0F, -7.0F);
/*  358 */     this.RRClaw2.func_78787_b(64, 32);
/*  359 */     this.RRClaw2.field_78809_i = true;
/*  360 */     setRotation(this.RRClaw2, 0.6457718F, 0.0F, 0.0F);
/*  361 */     this.NeckL2 = new ModelRenderer(this, 500, 1154);
/*  362 */     this.NeckL2.func_78789_a(-11.0F, -11.0F, -40.0F, 22, 22, 40);
/*  363 */     this.NeckL2.func_78793_a(32.0F, -114.0F, -95.0F);
/*  364 */     this.NeckL2.func_78787_b(64, 32);
/*  365 */     this.NeckL2.field_78809_i = true;
/*  366 */     setRotation(this.NeckL2, 0.0F, -0.1745329F, 0.0F);
/*  367 */     this.NeckC2 = new ModelRenderer(this, 700, 1154);
/*  368 */     this.NeckC2.func_78789_a(-11.0F, -11.0F, -40.0F, 22, 22, 40);
/*  369 */     this.NeckC2.func_78793_a(0.0F, -115.0F, -95.0F);
/*  370 */     this.NeckC2.func_78787_b(64, 32);
/*  371 */     this.NeckC2.field_78809_i = true;
/*  372 */     setRotation(this.NeckC2, -0.1570796F, 0.0F, 0.0F);
/*  373 */     this.NeckR2 = new ModelRenderer(this, 900, 1154);
/*  374 */     this.NeckR2.func_78789_a(-11.0F, -11.0F, -40.0F, 22, 22, 40);
/*  375 */     this.NeckR2.func_78793_a(-32.0F, -114.0F, -95.0F);
/*  376 */     this.NeckR2.func_78787_b(64, 32);
/*  377 */     this.NeckR2.field_78809_i = true;
/*  378 */     setRotation(this.NeckR2, -0.0523599F, 0.1745329F, 0.0F);
/*  379 */     this.NeckL3 = new ModelRenderer(this, 500, 1222);
/*  380 */     this.NeckL3.func_78789_a(-10.0F, -10.0F, -40.0F, 20, 20, 40);
/*  381 */     this.NeckL3.func_78793_a(38.0F, -114.0F, -131.0F);
/*  382 */     this.NeckL3.func_78787_b(64, 32);
/*  383 */     this.NeckL3.field_78809_i = true;
/*  384 */     setRotation(this.NeckL3, 0.0698132F, -0.2617994F, 0.0F);
/*  385 */     this.NeckC3 = new ModelRenderer(this, 700, 1222);
/*  386 */     this.NeckC3.func_78789_a(-10.0F, -10.0F, -40.0F, 20, 20, 40);
/*  387 */     this.NeckC3.func_78793_a(0.0F, -120.0F, -131.0F);
/*  388 */     this.NeckC3.func_78787_b(64, 32);
/*  389 */     this.NeckC3.field_78809_i = true;
/*  390 */     setRotation(this.NeckC3, -0.2094395F, 0.0F, 0.0F);
/*  391 */     this.NeckR3 = new ModelRenderer(this, 900, 1222);
/*  392 */     this.NeckR3.func_78789_a(-10.0F, -10.0F, -40.0F, 20, 20, 40);
/*  393 */     this.NeckR3.func_78793_a(-37.0F, -116.0F, -128.0F);
/*  394 */     this.NeckR3.func_78787_b(64, 32);
/*  395 */     this.NeckR3.field_78809_i = true;
/*  396 */     setRotation(this.NeckR3, -0.0523599F, 0.3141593F, 0.0F);
/*  397 */     this.NeckL4 = new ModelRenderer(this, 500, 1300);
/*  398 */     this.NeckL4.func_78789_a(-9.0F, -9.0F, -40.0F, 18, 18, 40);
/*  399 */     this.NeckL4.func_78793_a(46.0F, -112.0F, -163.0F);
/*  400 */     this.NeckL4.func_78787_b(64, 32);
/*  401 */     this.NeckL4.field_78809_i = true;
/*  402 */     setRotation(this.NeckL4, 0.1396263F, -0.3839724F, 0.0F);
/*  403 */     this.LHead1 = new ModelRenderer(this, 500, 1425);
/*  404 */     this.LHead1.func_78789_a(-13.0F, -13.0F, -30.0F, 26, 26, 30);
/*  405 */     this.LHead1.func_78793_a(59.0F, -114.0F, -195.0F);
/*  406 */     this.LHead1.func_78787_b(64, 32);
/*  407 */     this.LHead1.field_78809_i = true;
/*  408 */     setRotation(this.LHead1, 0.1396263F, -0.3839724F, 0.0F);
/*  409 */     this.LHead2 = new ModelRenderer(this, 500, 1550);
/*  410 */     this.LHead2.func_78789_a(-10.0F, -7.0F, -58.0F, 20, 20, 28);
/*  411 */     this.LHead2.func_78793_a(59.0F, -114.0F, -195.0F);
/*  412 */     this.LHead2.func_78787_b(64, 32);
/*  413 */     this.LHead2.field_78809_i = true;
/*  414 */     setRotation(this.LHead2, 0.1396263F, -0.3839724F, 0.0F);
/*  415 */     this.LHead3 = new ModelRenderer(this, 500, 1605);
/*  416 */     this.LHead3.func_78789_a(-8.0F, -3.0F, -83.0F, 16, 16, 26);
/*  417 */     this.LHead3.func_78793_a(59.0F, -114.0F, -195.0F);
/*  418 */     this.LHead3.func_78787_b(64, 32);
/*  419 */     this.LHead3.field_78809_i = true;
/*  420 */     setRotation(this.LHead3, 0.1396263F, -0.3839724F, 0.0F);
/*  421 */     this.LJaw1 = new ModelRenderer(this, 500, 1660);
/*  422 */     this.LJaw1.func_78789_a(-14.0F, -2.0F, -14.0F, 28, 7, 16);
/*  423 */     this.LJaw1.func_78793_a(59.0F, -100.0F, -196.0F);
/*  424 */     this.LJaw1.func_78787_b(64, 32);
/*  425 */     this.LJaw1.field_78809_i = true;
/*  426 */     setRotation(this.LJaw1, 0.2443461F, -0.3839724F, 0.0F);
/*  427 */     this.LJaw2 = new ModelRenderer(this, 500, 1700);
/*  428 */     this.LJaw2.func_78789_a(-12.0F, -2.0F, -55.0F, 24, 6, 46);
/*  429 */     this.LJaw2.func_78793_a(59.0F, -100.0F, -196.0F);
/*  430 */     this.LJaw2.func_78787_b(64, 32);
/*  431 */     this.LJaw2.field_78809_i = true;
/*  432 */     setRotation(this.LJaw2, 0.2443461F, -0.3839724F, 0.0F);
/*  433 */     this.LJaw3 = new ModelRenderer(this, 500, 1765);
/*  434 */     this.LJaw3.func_78789_a(-10.0F, -2.0F, -77.0F, 20, 6, 22);
/*  435 */     this.LJaw3.func_78793_a(59.0F, -100.0F, -196.0F);
/*  436 */     this.LJaw3.func_78787_b(64, 32);
/*  437 */     this.LJaw3.field_78809_i = true;
/*  438 */     setRotation(this.LJaw3, 0.2443461F, -0.3839724F, 0.0F);
/*  439 */     this.LTooth1 = new ModelRenderer(this, 10, 0);
/*  440 */     this.LTooth1.func_78789_a(-10.0F, -10.0F, -77.0F, 2, 8, 2);
/*  441 */     this.LTooth1.func_78793_a(59.0F, -100.0F, -196.0F);
/*  442 */     this.LTooth1.func_78787_b(64, 32);
/*  443 */     this.LTooth1.field_78809_i = true;
/*  444 */     setRotation(this.LTooth1, 0.2443461F, -0.3839724F, 0.0F);
/*  445 */     this.LTooth2 = new ModelRenderer(this, 20, 0);
/*  446 */     this.LTooth2.func_78789_a(8.0F, -10.0F, -77.0F, 2, 8, 2);
/*  447 */     this.LTooth2.func_78793_a(59.0F, -100.0F, -196.0F);
/*  448 */     this.LTooth2.func_78787_b(64, 32);
/*  449 */     this.LTooth2.field_78809_i = true;
/*  450 */     setRotation(this.LTooth2, 0.2443461F, -0.3839724F, 0.0F);
/*  451 */     this.LTooth3 = new ModelRenderer(this, 30, 0);
/*  452 */     this.LTooth3.func_78789_a(-12.0F, -8.0F, -55.0F, 2, 6, 2);
/*  453 */     this.LTooth3.func_78793_a(59.0F, -100.0F, -196.0F);
/*  454 */     this.LTooth3.func_78787_b(64, 32);
/*  455 */     this.LTooth3.field_78809_i = true;
/*  456 */     setRotation(this.LTooth3, 0.2443461F, -0.3839724F, 0.0F);
/*  457 */     this.LTooth4 = new ModelRenderer(this, 40, 0);
/*  458 */     this.LTooth4.func_78789_a(10.0F, -8.0F, -55.0F, 2, 6, 2);
/*  459 */     this.LTooth4.func_78793_a(59.0F, -100.0F, -196.0F);
/*  460 */     this.LTooth4.func_78787_b(64, 32);
/*  461 */     this.LTooth4.field_78809_i = true;
/*  462 */     setRotation(this.LTooth4, 0.2443461F, -0.3839724F, 0.0F);
/*  463 */     this.NeckC4 = new ModelRenderer(this, 700, 1300);
/*  464 */     this.NeckC4.func_78789_a(-9.0F, -9.0F, -40.0F, 18, 18, 40);
/*  465 */     this.NeckC4.func_78793_a(0.0F, -126.0F, -162.0F);
/*  466 */     this.NeckC4.func_78787_b(64, 32);
/*  467 */     this.NeckC4.field_78809_i = true;
/*  468 */     setRotation(this.NeckC4, -0.2617994F, 0.0F, 0.0F);
/*  469 */     this.NeckR4 = new ModelRenderer(this, 900, 1300);
/*  470 */     this.NeckR4.func_78789_a(-9.0F, -9.0F, -40.0F, 18, 18, 40);
/*  471 */     this.NeckR4.func_78793_a(-47.0F, -118.0F, -161.0F);
/*  472 */     this.NeckR4.func_78787_b(64, 32);
/*  473 */     this.NeckR4.field_78809_i = true;
/*  474 */     setRotation(this.NeckR4, -0.1047198F, 0.3665191F, 0.0F);
/*  475 */     this.CHead1 = new ModelRenderer(this, 700, 1425);
/*  476 */     this.CHead1.func_78789_a(-13.0F, -13.0F, -30.0F, 26, 26, 30);
/*  477 */     this.CHead1.func_78793_a(0.0F, -141.0F, -195.0F);
/*  478 */     this.CHead1.func_78787_b(64, 32);
/*  479 */     this.CHead1.field_78809_i = true;
/*  480 */     setRotation(this.CHead1, -0.296706F, 0.0F, 0.0F);
/*  481 */     this.RHead1 = new ModelRenderer(this, 900, 1425);
/*  482 */     this.RHead1.func_78789_a(-13.0F, -13.0F, -30.0F, 26, 26, 30);
/*  483 */     this.RHead1.func_78793_a(-60.0F, -128.0F, -195.0F);
/*  484 */     this.RHead1.func_78787_b(64, 32);
/*  485 */     this.RHead1.field_78809_i = true;
/*  486 */     setRotation(this.RHead1, -0.122173F, 0.418879F, 0.0F);
/*  487 */     this.CHead2 = new ModelRenderer(this, 700, 1550);
/*  488 */     this.CHead2.func_78789_a(-10.0F, -7.0F, -58.0F, 20, 20, 28);
/*  489 */     this.CHead2.func_78793_a(0.0F, -141.0F, -195.0F);
/*  490 */     this.CHead2.func_78787_b(64, 32);
/*  491 */     this.CHead2.field_78809_i = true;
/*  492 */     setRotation(this.CHead2, -0.296706F, 0.0F, 0.0F);
/*  493 */     this.RHead2 = new ModelRenderer(this, 900, 1550);
/*  494 */     this.RHead2.func_78789_a(-10.0F, -7.0F, -58.0F, 20, 20, 28);
/*  495 */     this.RHead2.func_78793_a(-60.0F, -128.0F, -195.0F);
/*  496 */     this.RHead2.func_78787_b(64, 32);
/*  497 */     this.RHead2.field_78809_i = true;
/*  498 */     setRotation(this.RHead2, -0.122173F, 0.418879F, 0.0F);
/*  499 */     this.CHead3 = new ModelRenderer(this, 700, 1605);
/*  500 */     this.CHead3.func_78789_a(-8.0F, -3.0F, -83.0F, 16, 16, 26);
/*  501 */     this.CHead3.func_78793_a(0.0F, -141.0F, -195.0F);
/*  502 */     this.CHead3.func_78787_b(64, 32);
/*  503 */     this.CHead3.field_78809_i = true;
/*  504 */     setRotation(this.CHead3, -0.296706F, 0.0F, 0.0F);
/*  505 */     this.RHead3 = new ModelRenderer(this, 900, 1605);
/*  506 */     this.RHead3.func_78789_a(-8.0F, -3.0F, -83.0F, 16, 16, 26);
/*  507 */     this.RHead3.func_78793_a(-60.0F, -128.0F, -195.0F);
/*  508 */     this.RHead3.func_78787_b(64, 32);
/*  509 */     this.RHead3.field_78809_i = true;
/*  510 */     setRotation(this.RHead3, -0.122173F, 0.418879F, 0.0F);
/*  511 */     this.CJaw1 = new ModelRenderer(this, 700, 1660);
/*  512 */     this.CJaw1.func_78789_a(-14.0F, -2.0F, -14.0F, 28, 7, 16);
/*  513 */     this.CJaw1.func_78793_a(0.0F, -130.0F, -201.0F);
/*  514 */     this.CJaw1.func_78787_b(64, 32);
/*  515 */     this.CJaw1.field_78809_i = true;
/*  516 */     setRotation(this.CJaw1, -0.1047198F, 0.0F, 0.0F);
/*  517 */     this.CJaw2 = new ModelRenderer(this, 700, 1700);
/*  518 */     this.CJaw2.func_78789_a(-12.0F, -2.0F, -55.0F, 24, 6, 46);
/*  519 */     this.CJaw2.func_78793_a(0.0F, -130.0F, -201.0F);
/*  520 */     this.CJaw2.func_78787_b(64, 32);
/*  521 */     this.CJaw2.field_78809_i = true;
/*  522 */     setRotation(this.CJaw2, -0.1047198F, 0.0F, 0.0F);
/*  523 */     this.CJaw3 = new ModelRenderer(this, 700, 1765);
/*  524 */     this.CJaw3.func_78789_a(-10.0F, -2.0F, -77.0F, 20, 6, 22);
/*  525 */     this.CJaw3.func_78793_a(0.0F, -130.0F, -201.0F);
/*  526 */     this.CJaw3.func_78787_b(64, 32);
/*  527 */     this.CJaw3.field_78809_i = true;
/*  528 */     setRotation(this.CJaw3, -0.1047198F, 0.0F, 0.0F);
/*  529 */     this.RJaw1 = new ModelRenderer(this, 900, 1660);
/*  530 */     this.RJaw1.func_78789_a(-14.0F, -2.0F, -14.0F, 28, 7, 16);
/*  531 */     this.RJaw1.func_78793_a(-62.0F, -115.0F, -200.0F);
/*  532 */     this.RJaw1.func_78787_b(64, 32);
/*  533 */     this.RJaw1.field_78809_i = true;
/*  534 */     setRotation(this.RJaw1, 0.1570796F, 0.418879F, 0.0F);
/*  535 */     this.RJaw2 = new ModelRenderer(this, 900, 1700);
/*  536 */     this.RJaw2.func_78789_a(-12.0F, -2.0F, -55.0F, 24, 6, 46);
/*  537 */     this.RJaw2.func_78793_a(-62.0F, -115.0F, -200.0F);
/*  538 */     this.RJaw2.func_78787_b(64, 32);
/*  539 */     this.RJaw2.field_78809_i = true;
/*  540 */     setRotation(this.RJaw2, 0.1570796F, 0.418879F, 0.0F);
/*  541 */     this.RJaw3 = new ModelRenderer(this, 900, 1765);
/*  542 */     this.RJaw3.func_78789_a(-10.0F, -2.0F, -77.0F, 20, 6, 22);
/*  543 */     this.RJaw3.func_78793_a(-62.0F, -115.0F, -200.0F);
/*  544 */     this.RJaw3.func_78787_b(64, 32);
/*  545 */     this.RJaw3.field_78809_i = true;
/*  546 */     setRotation(this.RJaw3, 0.1570796F, 0.418879F, 0.0F);
/*  547 */     this.CTooth3 = new ModelRenderer(this, 70, 0);
/*  548 */     this.CTooth3.func_78789_a(-12.0F, -8.0F, -55.0F, 2, 6, 2);
/*  549 */     this.CTooth3.func_78793_a(0.0F, -130.0F, -201.0F);
/*  550 */     this.CTooth3.func_78787_b(64, 32);
/*  551 */     this.CTooth3.field_78809_i = true;
/*  552 */     setRotation(this.CTooth3, -0.1047198F, 0.0F, 0.0F);
/*  553 */     this.CTooth4 = new ModelRenderer(this, 80, 0);
/*  554 */     this.CTooth4.func_78789_a(10.0F, -8.0F, -55.0F, 2, 6, 2);
/*  555 */     this.CTooth4.func_78793_a(0.0F, -130.0F, -201.0F);
/*  556 */     this.CTooth4.func_78787_b(64, 32);
/*  557 */     this.CTooth4.field_78809_i = true;
/*  558 */     setRotation(this.CTooth4, -0.1047198F, 0.0F, 0.0F);
/*  559 */     this.CTooth1 = new ModelRenderer(this, 50, 0);
/*  560 */     this.CTooth1.func_78789_a(-10.0F, -10.0F, -77.0F, 2, 8, 2);
/*  561 */     this.CTooth1.func_78793_a(0.0F, -130.0F, -201.0F);
/*  562 */     this.CTooth1.func_78787_b(64, 32);
/*  563 */     this.CTooth1.field_78809_i = true;
/*  564 */     setRotation(this.CTooth1, -0.1047198F, 0.0F, 0.0F);
/*  565 */     this.CTooth2 = new ModelRenderer(this, 60, 0);
/*  566 */     this.CTooth2.func_78789_a(8.0F, -10.0F, -77.0F, 2, 8, 2);
/*  567 */     this.CTooth2.func_78793_a(0.0F, -130.0F, -201.0F);
/*  568 */     this.CTooth2.func_78787_b(64, 32);
/*  569 */     this.CTooth2.field_78809_i = true;
/*  570 */     setRotation(this.CTooth2, -0.1047198F, 0.0F, 0.0F);
/*  571 */     this.RTooth3 = new ModelRenderer(this, 110, 0);
/*  572 */     this.RTooth3.func_78789_a(-12.0F, -8.0F, -55.0F, 2, 6, 2);
/*  573 */     this.RTooth3.func_78793_a(-62.0F, -115.0F, -200.0F);
/*  574 */     this.RTooth3.func_78787_b(64, 32);
/*  575 */     this.RTooth3.field_78809_i = true;
/*  576 */     setRotation(this.RTooth3, 0.1570796F, 0.418879F, 0.0F);
/*  577 */     this.RTooth4 = new ModelRenderer(this, 120, 0);
/*  578 */     this.RTooth4.func_78789_a(10.0F, -8.0F, -55.0F, 2, 6, 2);
/*  579 */     this.RTooth4.func_78793_a(-62.0F, -115.0F, -200.0F);
/*  580 */     this.RTooth4.func_78787_b(64, 32);
/*  581 */     this.RTooth4.field_78809_i = true;
/*  582 */     setRotation(this.RTooth4, 0.1570796F, 0.418879F, 0.0F);
/*  583 */     this.RTooth1 = new ModelRenderer(this, 90, 0);
/*  584 */     this.RTooth1.func_78789_a(-10.0F, -10.0F, -77.0F, 2, 8, 2);
/*  585 */     this.RTooth1.func_78793_a(-62.0F, -115.0F, -200.0F);
/*  586 */     this.RTooth1.func_78787_b(64, 32);
/*  587 */     this.RTooth1.field_78809_i = true;
/*  588 */     setRotation(this.RTooth1, 0.1570796F, 0.418879F, 0.0F);
/*  589 */     this.RTooth2 = new ModelRenderer(this, 100, 0);
/*  590 */     this.RTooth2.func_78789_a(8.0F, -10.0F, -77.0F, 2, 8, 2);
/*  591 */     this.RTooth2.func_78793_a(-62.0F, -115.0F, -200.0F);
/*  592 */     this.RTooth2.func_78787_b(64, 32);
/*  593 */     this.RTooth2.field_78809_i = true;
/*  594 */     setRotation(this.RTooth2, 0.1570796F, 0.418879F, 0.0F);
/*  595 */     this.LLEye = new ModelRenderer(this, 500, 1500);
/*  596 */     this.LLEye.func_78789_a(13.0F, -12.0F, -29.0F, 2, 6, 10);
/*  597 */     this.LLEye.func_78793_a(59.0F, -114.0F, -195.0F);
/*  598 */     this.LLEye.func_78787_b(64, 32);
/*  599 */     this.LLEye.field_78809_i = true;
/*  600 */     setRotation(this.LLEye, 0.1396263F, -0.3839724F, 0.0F);
/*  601 */     this.LREye = new ModelRenderer(this, 533, 1500);
/*  602 */     this.LREye.func_78789_a(-15.0F, -12.0F, -29.0F, 2, 6, 10);
/*  603 */     this.LREye.func_78793_a(59.0F, -114.0F, -195.0F);
/*  604 */     this.LREye.func_78787_b(64, 32);
/*  605 */     this.LREye.field_78809_i = true;
/*  606 */     setRotation(this.LREye, 0.1396263F, -0.3839724F, 0.0F);
/*  607 */     this.CLEye = new ModelRenderer(this, 700, 1500);
/*  608 */     this.CLEye.func_78789_a(13.0F, -12.0F, -29.0F, 2, 6, 10);
/*  609 */     this.CLEye.func_78793_a(0.0F, -141.0F, -195.0F);
/*  610 */     this.CLEye.func_78787_b(64, 32);
/*  611 */     this.CLEye.field_78809_i = true;
/*  612 */     setRotation(this.CLEye, -0.296706F, 0.0F, 0.0F);
/*  613 */     this.CREye = new ModelRenderer(this, 733, 1500);
/*  614 */     this.CREye.func_78789_a(-15.0F, -12.0F, -29.0F, 2, 6, 10);
/*  615 */     this.CREye.func_78793_a(0.0F, -141.0F, -195.0F);
/*  616 */     this.CREye.func_78787_b(64, 32);
/*  617 */     this.CREye.field_78809_i = true;
/*  618 */     setRotation(this.CREye, -0.296706F, 0.0F, 0.0F);
/*  619 */     this.RLEye = new ModelRenderer(this, 900, 1500);
/*  620 */     this.RLEye.func_78789_a(13.0F, -12.0F, -29.0F, 2, 6, 10);
/*  621 */     this.RLEye.func_78793_a(-60.0F, -128.0F, -195.0F);
/*  622 */     this.RLEye.func_78787_b(64, 32);
/*  623 */     this.RLEye.field_78809_i = true;
/*  624 */     setRotation(this.RLEye, -0.122173F, 0.418879F, 0.0F);
/*  625 */     this.RREye = new ModelRenderer(this, 933, 1500);
/*  626 */     this.RREye.func_78789_a(-15.0F, -12.0F, -29.0F, 2, 5, 10);
/*  627 */     this.RREye.func_78793_a(-60.0F, -128.0F, -195.0F);
/*  628 */     this.RREye.func_78787_b(64, 32);
/*  629 */     this.RREye.field_78809_i = true;
/*  630 */     setRotation(this.RREye, -0.122173F, 0.418879F, 0.0F);
/*  631 */     this.LHeadMane = new ModelRenderer(this, 500, 1375);
/*  632 */     this.LHeadMane.func_78789_a(0.0F, -14.0F, 0.0F, 1, 23, 19);
/*  633 */     this.LHeadMane.func_78793_a(59.0F, -114.0F, -195.0F);
/*  634 */     this.LHeadMane.func_78787_b(64, 32);
/*  635 */     this.LHeadMane.field_78809_i = true;
/*  636 */     setRotation(this.LHeadMane, 0.5235988F, -0.3839724F, 0.0F);
/*  637 */     this.CHeadMane = new ModelRenderer(this, 700, 1375);
/*  638 */     this.CHeadMane.func_78789_a(0.0F, -14.0F, 0.0F, 1, 23, 19);
/*  639 */     this.CHeadMane.func_78793_a(0.0F, -141.0F, -195.0F);
/*  640 */     this.CHeadMane.func_78787_b(64, 32);
/*  641 */     this.CHeadMane.field_78809_i = true;
/*  642 */     setRotation(this.CHeadMane, 0.1047198F, 0.0F, 0.0F);
/*  643 */     this.RHeadMane = new ModelRenderer(this, 900, 1375);
/*  644 */     this.RHeadMane.func_78789_a(0.0F, -14.0F, 0.0F, 1, 23, 19);
/*  645 */     this.RHeadMane.func_78793_a(-60.0F, -128.0F, -195.0F);
/*  646 */     this.RHeadMane.func_78787_b(64, 32);
/*  647 */     this.RHeadMane.field_78809_i = true;
/*  648 */     setRotation(this.RHeadMane, 0.3665191F, 0.418879F, 0.0F);
/*  649 */     this.LLNoseSpike = new ModelRenderer(this, 0, 300);
/*  650 */     this.LLNoseSpike.func_78789_a(24.0F, -23.0F, -76.0F, 1, 1, 17);
/*  651 */     this.LLNoseSpike.func_78793_a(59.0F, -114.0F, -195.0F);
/*  652 */     this.LLNoseSpike.func_78787_b(64, 32);
/*  653 */     this.LLNoseSpike.field_78809_i = true;
/*  654 */     setRotation(this.LLNoseSpike, 0.4014257F, -0.1570796F, 0.0F);
/*  655 */     this.LRNoseSpike = new ModelRenderer(this, 0, 325);
/*  656 */     this.LRNoseSpike.func_78789_a(-26.0F, -24.0F, -75.0F, 1, 1, 17);
/*  657 */     this.LRNoseSpike.func_78793_a(59.0F, -114.0F, -195.0F);
/*  658 */     this.LRNoseSpike.func_78787_b(64, 32);
/*  659 */     this.LRNoseSpike.field_78809_i = true;
/*  660 */     setRotation(this.LRNoseSpike, 0.418879F, -0.6283185F, 0.0F);
/*  661 */     this.CLNoseSpike = new ModelRenderer(this, 0, 350);
/*  662 */     this.CLNoseSpike.func_78789_a(24.0F, -23.0F, -76.0F, 1, 1, 17);
/*  663 */     this.CLNoseSpike.func_78793_a(0.0F, -141.0F, -195.0F);
/*  664 */     this.CLNoseSpike.func_78787_b(64, 32);
/*  665 */     this.CLNoseSpike.field_78809_i = true;
/*  666 */     setRotation(this.CLNoseSpike, -0.0523599F, 0.2443461F, 0.0F);
/*  667 */     this.CRNoseSpike = new ModelRenderer(this, 0, 375);
/*  668 */     this.CRNoseSpike.func_78789_a(-26.0F, -24.0F, -75.0F, 1, 1, 17);
/*  669 */     this.CRNoseSpike.func_78793_a(0.0F, -141.0F, -195.0F);
/*  670 */     this.CRNoseSpike.func_78787_b(64, 32);
/*  671 */     this.CRNoseSpike.field_78809_i = true;
/*  672 */     setRotation(this.CRNoseSpike, -0.0349066F, -0.2617994F, 0.0F);
/*  673 */     this.RLNoseSpike = new ModelRenderer(this, 0, 400);
/*  674 */     this.RLNoseSpike.func_78789_a(24.0F, -23.0F, -76.0F, 1, 1, 17);
/*  675 */     this.RLNoseSpike.func_78793_a(-60.0F, -128.0F, -195.0F);
/*  676 */     this.RLNoseSpike.func_78787_b(64, 32);
/*  677 */     this.RLNoseSpike.field_78809_i = true;
/*  678 */     setRotation(this.RLNoseSpike, 0.1396263F, 0.6457718F, 0.0F);
/*  679 */     this.RRNoseSpike = new ModelRenderer(this, 0, 425);
/*  680 */     this.RRNoseSpike.func_78789_a(-26.0F, -24.0F, -75.0F, 1, 1, 17);
/*  681 */     this.RRNoseSpike.func_78793_a(-60.0F, -128.0F, -195.0F);
/*  682 */     this.RRNoseSpike.func_78787_b(64, 32);
/*  683 */     this.RRNoseSpike.field_78809_i = true;
/*  684 */     setRotation(this.RRNoseSpike, 0.1570796F, 0.1745329F, 0.0F);
/*  685 */     this.Back1 = new ModelRenderer(this, 167, 186);
/*  686 */     this.Back1.func_78789_a(0.0F, 0.0F, 0.0F, 30, 15, 49);
/*  687 */     this.Back1.func_78793_a(-45.0F, -127.0F, -58.0F);
/*  688 */     this.Back1.func_78787_b(64, 32);
/*  689 */     this.Back1.field_78809_i = true;
/*  690 */     setRotation(this.Back1, -0.0698132F, 0.0F, 0.0F);
/*  691 */     this.Back2 = new ModelRenderer(this, 0, 186);
/*  692 */     this.Back2.func_78789_a(0.0F, 0.0F, 0.0F, 30, 15, 49);
/*  693 */     this.Back2.func_78793_a(15.0F, -127.0F, -58.0F);
/*  694 */     this.Back2.func_78787_b(64, 32);
/*  695 */     this.Back2.field_78809_i = true;
/*  696 */     setRotation(this.Back2, -0.0698132F, 0.0F, 0.0F);
/*  697 */     this.Lwing1 = new ModelRenderer(this, 250, 1000);
/*  698 */     this.Lwing1.func_78789_a(0.0F, 0.0F, 0.0F, 87, 5, 5);
/*  699 */     this.Lwing1.func_78793_a(40.0F, -121.0F, -50.0F);
/*  700 */     this.Lwing1.func_78787_b(64, 32);
/*  701 */     this.Lwing1.field_78809_i = true;
/*  702 */     setRotation(this.Lwing1, 0.0F, 0.0349066F, 0.0F);
/*  703 */     this.Lwing2 = new ModelRenderer(this, 1220, 782);
/*  704 */     this.Lwing2.func_78789_a(0.0F, 2.0F, 0.0F, 87, 1, 110);
/*  705 */     this.Lwing2.func_78793_a(40.0F, -121.0F, -49.0F);
/*  706 */     this.Lwing2.func_78787_b(64, 32);
/*  707 */     this.Lwing2.field_78809_i = true;
/*  708 */     setRotation(this.Lwing2, 0.0F, 0.0349066F, 0.0F);
/*  709 */     this.Lwing3 = new ModelRenderer(this, 250, 975);
/*  710 */     this.Lwing3.func_78789_a(0.0F, 0.0F, 0.0F, 188, 5, 5);
/*  711 */     this.Lwing3.func_78793_a(124.0F, -121.0F, -53.0F);
/*  712 */     this.Lwing3.func_78787_b(64, 32);
/*  713 */     this.Lwing3.field_78809_i = true;
/*  714 */     setRotation(this.Lwing3, 0.0F, 0.0F, 0.0F);
/*  715 */     this.Lwing4 = new ModelRenderer(this, 1341, 625);
/*  716 */     this.Lwing4.func_78789_a(0.0F, 2.0F, 0.0F, 188, 1, 147);
/*  717 */     this.Lwing4.func_78793_a(124.0F, -121.0F, -50.0F);
/*  718 */     this.Lwing4.func_78787_b(64, 32);
/*  719 */     this.Lwing4.field_78809_i = true;
/*  720 */     setRotation(this.Lwing4, 0.0F, 0.0F, 0.0F);
/*  721 */     this.Lwing5 = new ModelRenderer(this, 245, 950);
/*  722 */     this.Lwing5.func_78789_a(0.0F, 0.0F, 0.0F, 87, 5, 5);
/*  723 */     this.Lwing5.func_78793_a(309.0F, -121.0F, -53.0F);
/*  724 */     this.Lwing5.func_78787_b(64, 32);
/*  725 */     this.Lwing5.field_78809_i = true;
/*  726 */     setRotation(this.Lwing5, 0.0F, -0.0349066F, 0.0F);
/*  727 */     this.Lwing6 = new ModelRenderer(this, 1300, 1300);
/*  728 */     this.Lwing6.func_78789_a(0.0F, 2.0F, 1.0F, 87, 1, 125);
/*  729 */     this.Lwing6.func_78793_a(309.0F, -121.0F, -50.0F);
/*  730 */     this.Lwing6.func_78787_b(64, 32);
/*  731 */     this.Lwing6.field_78809_i = true;
/*  732 */     setRotation(this.Lwing6, 0.0F, 0.0F, 0.0F);
/*  733 */     this.Lwing7 = new ModelRenderer(this, 250, 900);
/*  734 */     this.Lwing7.func_78789_a(0.0F, 0.0F, 0.0F, 150, 5, 5);
/*  735 */     this.Lwing7.func_78793_a(124.0F, -121.0F, -53.0F);
/*  736 */     this.Lwing7.func_78787_b(64, 32);
/*  737 */     this.Lwing7.field_78809_i = true;
/*  738 */     setRotation(this.Lwing7, 0.0F, 0.0F, 0.2617994F);
/*  739 */     this.Lwing9 = new ModelRenderer(this, 250, 925);
/*  740 */     this.Lwing9.func_78789_a(0.0F, 0.0F, 0.0F, 175, 5, 5);
/*  741 */     this.Lwing9.func_78793_a(124.0F, -121.0F, -53.0F);
/*  742 */     this.Lwing9.func_78787_b(64, 32);
/*  743 */     this.Lwing9.field_78809_i = true;
/*  744 */     setRotation(this.Lwing9, 0.0F, 0.0F, -0.2617994F);
/*  745 */     this.Lwing8 = new ModelRenderer(this, 1300, 1156);
/*  746 */     this.Lwing8.func_78789_a(0.0F, 2.0F, 0.0F, 150, 1, 120);
/*  747 */     this.Lwing8.func_78793_a(124.0F, -121.0F, -50.0F);
/*  748 */     this.Lwing8.func_78787_b(64, 32);
/*  749 */     this.Lwing8.field_78809_i = true;
/*  750 */     setRotation(this.Lwing8, 0.0F, 0.0F, 0.2617994F);
/*  751 */     this.Lwing10 = new ModelRenderer(this, 1392, 326);
/*  752 */     this.Lwing10.func_78789_a(0.0F, 2.0F, 0.0F, 176, 1, 136);
/*  753 */     this.Lwing10.func_78793_a(124.0F, -121.0F, -50.0F);
/*  754 */     this.Lwing10.func_78787_b(64, 32);
/*  755 */     this.Lwing10.field_78809_i = true;
/*  756 */     setRotation(this.Lwing10, 0.0F, 0.0F, -0.2617994F);
/*  757 */     this.Rwing1 = new ModelRenderer(this, 650, 1000);
/*  758 */     this.Rwing1.func_78789_a(-87.0F, 0.0F, 0.0F, 87, 5, 5);
/*  759 */     this.Rwing1.func_78793_a(-40.0F, -121.0F, -50.0F);
/*  760 */     this.Rwing1.func_78787_b(64, 32);
/*  761 */     this.Rwing1.field_78809_i = true;
/*  762 */     setRotation(this.Rwing1, 0.0F, -0.0349066F, 0.0F);
/*  763 */     this.Rwing2 = new ModelRenderer(this, 1619, 782);
/*  764 */     this.Rwing2.func_78789_a(-87.0F, 2.0F, 0.0F, 87, 1, 110);
/*  765 */     this.Rwing2.func_78793_a(-40.0F, -121.0F, -49.0F);
/*  766 */     this.Rwing2.func_78787_b(64, 32);
/*  767 */     this.Rwing2.field_78809_i = true;
/*  768 */     setRotation(this.Rwing2, 0.0F, -0.0349066F, 0.0F);
/*  769 */     this.Rwing3 = new ModelRenderer(this, 550, 950);
/*  770 */     this.Rwing3.func_78789_a(-188.0F, 0.0F, 0.0F, 188, 5, 5);
/*  771 */     this.Rwing3.func_78793_a(-124.0F, -121.0F, -53.0F);
/*  772 */     this.Rwing3.func_78787_b(64, 32);
/*  773 */     this.Rwing3.field_78809_i = true;
/*  774 */     setRotation(this.Rwing3, 0.0F, 0.0F, 0.0F);
/*  775 */     this.Rwing4 = new ModelRenderer(this, 1341, 470);
/*  776 */     this.Rwing4.func_78789_a(-188.0F, 2.0F, 0.0F, 188, 1, 147);
/*  777 */     this.Rwing4.func_78793_a(-124.0F, -121.0F, -53.0F);
/*  778 */     this.Rwing4.func_78787_b(64, 32);
/*  779 */     this.Rwing4.field_78809_i = true;
/*  780 */     setRotation(this.Rwing4, 0.0F, 0.0F, 0.0F);
/*  781 */     this.Rwing5 = new ModelRenderer(this, 750, 975);
/*  782 */     this.Rwing5.func_78789_a(-87.0F, 0.0F, 0.0F, 87, 5, 5);
/*  783 */     this.Rwing5.func_78793_a(-309.0F, -121.0F, -53.0F);
/*  784 */     this.Rwing5.func_78787_b(64, 32);
/*  785 */     this.Rwing5.field_78809_i = true;
/*  786 */     setRotation(this.Rwing5, 0.0F, 0.0349066F, 0.0F);
/*  787 */     this.Rwing6 = new ModelRenderer(this, 1300, 1436);
/*  788 */     this.Rwing6.func_78789_a(-87.0F, 2.0F, 1.0F, 87, 1, 125);
/*  789 */     this.Rwing6.func_78793_a(-309.0F, -121.0F, -50.0F);
/*  790 */     this.Rwing6.func_78787_b(64, 32);
/*  791 */     this.Rwing6.field_78809_i = true;
/*  792 */     setRotation(this.Rwing6, 0.0F, 0.0F, 0.0F);
/*  793 */     this.Rwing7 = new ModelRenderer(this, 650, 900);
/*  794 */     this.Rwing7.func_78789_a(-150.0F, 0.0F, 0.0F, 150, 5, 5);
/*  795 */     this.Rwing7.func_78793_a(-124.0F, -121.0F, -53.0F);
/*  796 */     this.Rwing7.func_78787_b(64, 32);
/*  797 */     this.Rwing7.field_78809_i = true;
/*  798 */     setRotation(this.Rwing7, 0.0F, 0.0F, -0.2617994F);
/*  799 */     this.Rwing8 = new ModelRenderer(this, 1300, 1024);
/*  800 */     this.Rwing8.func_78789_a(-150.0F, 2.0F, 0.0F, 150, 1, 120);
/*  801 */     this.Rwing8.func_78793_a(-124.0F, -121.0F, -53.0F);
/*  802 */     this.Rwing8.func_78787_b(64, 32);
/*  803 */     this.Rwing8.field_78809_i = true;
/*  804 */     setRotation(this.Rwing8, 0.0F, 0.0F, -0.2617994F);
/*  805 */     this.Rwing9 = new ModelRenderer(this, 621, 925);
/*  806 */     this.Rwing9.func_78789_a(-175.0F, 0.0F, 0.0F, 175, 5, 5);
/*  807 */     this.Rwing9.func_78793_a(-124.0F, -121.0F, -53.0F);
/*  808 */     this.Rwing9.func_78787_b(64, 32);
/*  809 */     this.Rwing9.field_78809_i = true;
/*  810 */     setRotation(this.Rwing9, 0.0F, 0.0F, 0.2617994F);
/*  811 */     this.Rwing10 = new ModelRenderer(this, 1391, 184);
/*  812 */     this.Rwing10.func_78789_a(-176.0F, 2.0F, 0.0F, 176, 1, 136);
/*  813 */     this.Rwing10.func_78793_a(-124.0F, -121.0F, -53.0F);
/*  814 */     this.Rwing10.func_78787_b(64, 32);
/*  815 */     this.Rwing10.field_78809_i = true;
/*  816 */     setRotation(this.Rwing10, 0.0F, 0.0F, 0.2617994F);
/*  817 */     this.TailTip2 = new ModelRenderer(this, 500, 63);
/*  818 */     this.TailTip2.func_78789_a(-35.0F, -2.0F, 36.0F, 70, 4, 26);
/*  819 */     this.TailTip2.func_78793_a(0.0F, -86.0F, 308.0F);
/*  820 */     this.TailTip2.func_78787_b(64, 32);
/*  821 */     this.TailTip2.field_78809_i = true;
/*  822 */     setRotation(this.TailTip2, 0.0F, 0.0F, 0.0F);
/*  823 */     this.Ridge1 = new ModelRenderer(this, 850, 717);
/*  824 */     this.Ridge1.func_78789_a(-1.0F, 0.0F, 0.0F, 3, 10, 24);
/*  825 */     this.Ridge1.func_78793_a(0.0F, -122.0F, -75.0F);
/*  826 */     this.Ridge1.func_78787_b(64, 32);
/*  827 */     this.Ridge1.field_78809_i = true;
/*  828 */     setRotation(this.Ridge1, 0.3665191F, 0.0F, 0.0F);
/*  829 */     this.Ridge2 = new ModelRenderer(this, 850, 676);
/*  830 */     this.Ridge2.func_78789_a(-1.0F, 0.0F, 0.0F, 3, 10, 24);
/*  831 */     this.Ridge2.func_78793_a(0.0F, -122.0F, -50.0F);
/*  832 */     this.Ridge2.func_78787_b(64, 32);
/*  833 */     this.Ridge2.field_78809_i = true;
/*  834 */     setRotation(this.Ridge2, 0.3665191F, 0.0F, 0.0F);
/*  835 */     this.Ridge3 = new ModelRenderer(this, 800, 600);
/*  836 */     this.Ridge3.func_78789_a(-1.0F, 0.0F, 0.0F, 3, 20, 49);
/*  837 */     this.Ridge3.func_78793_a(0.0F, -120.0F, -20.0F);
/*  838 */     this.Ridge3.func_78787_b(64, 32);
/*  839 */     this.Ridge3.field_78809_i = true;
/*  840 */     setRotation(this.Ridge3, 0.3665191F, 0.0F, 0.0F);
/*  841 */     this.Ridge4 = new ModelRenderer(this, 800, 550);
/*  842 */     this.Ridge4.func_78789_a(-1.0F, 3.0F, 9.0F, 3, 10, 22);
/*  843 */     this.Ridge4.func_78793_a(0.0F, -114.0F, 29.0F);
/*  844 */     this.Ridge4.func_78787_b(64, 32);
/*  845 */     this.Ridge4.field_78809_i = true;
/*  846 */     setRotation(this.Ridge4, 0.3665191F, 0.0F, 0.0F);
/*  847 */     this.Ridge5 = new ModelRenderer(this, 800, 500);
/*  848 */     this.Ridge5.func_78789_a(-1.0F, 13.0F, 33.0F, 3, 10, 20);
/*  849 */     this.Ridge5.func_78793_a(0.0F, -114.0F, 29.0F);
/*  850 */     this.Ridge5.func_78787_b(64, 32);
/*  851 */     this.Ridge5.field_78809_i = true;
/*  852 */     setRotation(this.Ridge5, 0.3665191F, 0.0F, 0.0F);
/*  853 */     this.Ridge6 = new ModelRenderer(this, 638, 165);
/*  854 */     this.Ridge6.func_78789_a(-1.0F, 2.0F, 20.0F, 3, 10, 20);
/*  855 */     this.Ridge6.func_78793_a(0.0F, -87.0F, 268.0F);
/*  856 */     this.Ridge6.func_78787_b(64, 32);
/*  857 */     this.Ridge6.field_78809_i = true;
/*  858 */     setRotation(this.Ridge6, 0.3665191F, 0.0F, 0.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*      */     // Byte code:
/*      */     //   0: fconst_0
/*      */     //   1: fstore #8
/*      */     //   3: aload_1
/*      */     //   4: checkcast danger/orespawn/TheKing
/*      */     //   7: astore #9
/*      */     //   9: ldc_w 0.26
/*      */     //   12: fstore #10
/*      */     //   14: ldc_w 0.08
/*      */     //   17: fstore #11
/*      */     //   19: ldc 0.7853982
/*      */     //   21: fstore #12
/*      */     //   23: fconst_0
/*      */     //   24: fstore #13
/*      */     //   26: fconst_0
/*      */     //   27: fstore #14
/*      */     //   29: fconst_0
/*      */     //   30: fstore #15
/*      */     //   32: fconst_0
/*      */     //   33: fstore #16
/*      */     //   35: fconst_0
/*      */     //   36: fstore #17
/*      */     //   38: fconst_0
/*      */     //   39: fstore #18
/*      */     //   41: fconst_0
/*      */     //   42: fstore #19
/*      */     //   44: fconst_0
/*      */     //   45: fstore #20
/*      */     //   47: fconst_0
/*      */     //   48: fstore #21
/*      */     //   50: aload_0
/*      */     //   51: aload_1
/*      */     //   52: fload_2
/*      */     //   53: fload_3
/*      */     //   54: fload #4
/*      */     //   56: fload #5
/*      */     //   58: fload #6
/*      */     //   60: fload #7
/*      */     //   62: invokespecial func_78088_a : (Lnet/minecraft/entity/Entity;FFFFFF)V
/*      */     //   65: aload_0
/*      */     //   66: fload_2
/*      */     //   67: fload_3
/*      */     //   68: fload #4
/*      */     //   70: fload #5
/*      */     //   72: fload #6
/*      */     //   74: fload #7
/*      */     //   76: aload_1
/*      */     //   77: invokevirtual func_78087_a : (FFFFFFLnet/minecraft/entity/Entity;)V
/*      */     //   80: aload #9
/*      */     //   82: invokevirtual getAttacking : ()I
/*      */     //   85: ifeq -> 115
/*      */     //   88: fload #4
/*      */     //   90: ldc_w 0.75
/*      */     //   93: fmul
/*      */     //   94: aload_0
/*      */     //   95: getfield wingspeed : F
/*      */     //   98: fmul
/*      */     //   99: invokestatic func_76134_b : (F)F
/*      */     //   102: ldc_w 3.1415927
/*      */     //   105: fmul
/*      */     //   106: ldc_w 0.21
/*      */     //   109: fmul
/*      */     //   110: fstore #8
/*      */     //   112: goto -> 139
/*      */     //   115: fload #4
/*      */     //   117: ldc_w 0.35
/*      */     //   120: fmul
/*      */     //   121: aload_0
/*      */     //   122: getfield wingspeed : F
/*      */     //   125: fmul
/*      */     //   126: invokestatic func_76134_b : (F)F
/*      */     //   129: ldc_w 3.1415927
/*      */     //   132: fmul
/*      */     //   133: ldc_w 0.15
/*      */     //   136: fmul
/*      */     //   137: fstore #8
/*      */     //   139: aload_0
/*      */     //   140: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   143: fload #8
/*      */     //   145: putfield field_78808_h : F
/*      */     //   148: aload_0
/*      */     //   149: getfield Lwing2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   152: fload #8
/*      */     //   154: putfield field_78808_h : F
/*      */     //   157: aload_0
/*      */     //   158: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   161: fload #8
/*      */     //   163: ldc_w 5.0
/*      */     //   166: fmul
/*      */     //   167: ldc_w 3.0
/*      */     //   170: fdiv
/*      */     //   171: putfield field_78808_h : F
/*      */     //   174: aload_0
/*      */     //   175: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   178: aload_0
/*      */     //   179: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   182: getfield field_78797_d : F
/*      */     //   185: aload_0
/*      */     //   186: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   189: getfield field_78808_h : F
/*      */     //   192: f2d
/*      */     //   193: invokestatic sin : (D)D
/*      */     //   196: d2f
/*      */     //   197: ldc_w 84.0
/*      */     //   200: fmul
/*      */     //   201: fadd
/*      */     //   202: putfield field_78797_d : F
/*      */     //   205: aload_0
/*      */     //   206: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   209: aload_0
/*      */     //   210: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   213: getfield field_78800_c : F
/*      */     //   216: aload_0
/*      */     //   217: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   220: getfield field_78808_h : F
/*      */     //   223: f2d
/*      */     //   224: invokestatic cos : (D)D
/*      */     //   227: d2f
/*      */     //   228: ldc_w 84.0
/*      */     //   231: fmul
/*      */     //   232: fadd
/*      */     //   233: putfield field_78800_c : F
/*      */     //   236: aload_0
/*      */     //   237: getfield Lwing4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   240: aload_0
/*      */     //   241: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   244: getfield field_78808_h : F
/*      */     //   247: putfield field_78808_h : F
/*      */     //   250: aload_0
/*      */     //   251: getfield Lwing4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   254: aload_0
/*      */     //   255: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   258: getfield field_78797_d : F
/*      */     //   261: putfield field_78797_d : F
/*      */     //   264: aload_0
/*      */     //   265: getfield Lwing4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   268: aload_0
/*      */     //   269: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   272: getfield field_78800_c : F
/*      */     //   275: putfield field_78800_c : F
/*      */     //   278: aload_0
/*      */     //   279: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   282: fload #8
/*      */     //   284: ldc_w 7.0
/*      */     //   287: fmul
/*      */     //   288: ldc_w 3.0
/*      */     //   291: fdiv
/*      */     //   292: putfield field_78808_h : F
/*      */     //   295: aload_0
/*      */     //   296: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   299: aload_0
/*      */     //   300: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   303: getfield field_78797_d : F
/*      */     //   306: aload_0
/*      */     //   307: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   310: getfield field_78808_h : F
/*      */     //   313: f2d
/*      */     //   314: invokestatic sin : (D)D
/*      */     //   317: d2f
/*      */     //   318: ldc_w 184.0
/*      */     //   321: fmul
/*      */     //   322: fadd
/*      */     //   323: putfield field_78797_d : F
/*      */     //   326: aload_0
/*      */     //   327: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   330: aload_0
/*      */     //   331: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   334: getfield field_78800_c : F
/*      */     //   337: aload_0
/*      */     //   338: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   341: getfield field_78808_h : F
/*      */     //   344: f2d
/*      */     //   345: invokestatic cos : (D)D
/*      */     //   348: d2f
/*      */     //   349: ldc_w 184.0
/*      */     //   352: fmul
/*      */     //   353: fadd
/*      */     //   354: putfield field_78800_c : F
/*      */     //   357: aload_0
/*      */     //   358: getfield Lwing6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   361: aload_0
/*      */     //   362: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   365: getfield field_78808_h : F
/*      */     //   368: putfield field_78808_h : F
/*      */     //   371: aload_0
/*      */     //   372: getfield Lwing6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   375: aload_0
/*      */     //   376: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   379: getfield field_78797_d : F
/*      */     //   382: putfield field_78797_d : F
/*      */     //   385: aload_0
/*      */     //   386: getfield Lwing6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   389: aload_0
/*      */     //   390: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   393: getfield field_78800_c : F
/*      */     //   396: putfield field_78800_c : F
/*      */     //   399: aload_0
/*      */     //   400: getfield Lwing7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   403: aload_0
/*      */     //   404: getfield Lwing9 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   407: aload_0
/*      */     //   408: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   411: getfield field_78797_d : F
/*      */     //   414: dup_x1
/*      */     //   415: putfield field_78797_d : F
/*      */     //   418: putfield field_78797_d : F
/*      */     //   421: aload_0
/*      */     //   422: getfield Lwing7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   425: aload_0
/*      */     //   426: getfield Lwing9 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   429: aload_0
/*      */     //   430: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   433: getfield field_78800_c : F
/*      */     //   436: dup_x1
/*      */     //   437: putfield field_78800_c : F
/*      */     //   440: putfield field_78800_c : F
/*      */     //   443: aload_0
/*      */     //   444: getfield Lwing8 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   447: aload_0
/*      */     //   448: getfield Lwing10 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   451: aload_0
/*      */     //   452: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   455: getfield field_78797_d : F
/*      */     //   458: dup_x1
/*      */     //   459: putfield field_78797_d : F
/*      */     //   462: putfield field_78797_d : F
/*      */     //   465: aload_0
/*      */     //   466: getfield Lwing8 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   469: aload_0
/*      */     //   470: getfield Lwing10 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   473: aload_0
/*      */     //   474: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   477: getfield field_78800_c : F
/*      */     //   480: dup_x1
/*      */     //   481: putfield field_78800_c : F
/*      */     //   484: putfield field_78800_c : F
/*      */     //   487: aload_0
/*      */     //   488: getfield Lwing7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   491: aload_0
/*      */     //   492: getfield Lwing8 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   495: ldc_w 0.261
/*      */     //   498: aload_0
/*      */     //   499: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   502: getfield field_78808_h : F
/*      */     //   505: fadd
/*      */     //   506: dup_x1
/*      */     //   507: putfield field_78808_h : F
/*      */     //   510: putfield field_78808_h : F
/*      */     //   513: aload_0
/*      */     //   514: getfield Lwing9 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   517: aload_0
/*      */     //   518: getfield Lwing10 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   521: ldc_w -0.261
/*      */     //   524: aload_0
/*      */     //   525: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   528: getfield field_78808_h : F
/*      */     //   531: fadd
/*      */     //   532: dup_x1
/*      */     //   533: putfield field_78808_h : F
/*      */     //   536: putfield field_78808_h : F
/*      */     //   539: aload_0
/*      */     //   540: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   543: fload #8
/*      */     //   545: fneg
/*      */     //   546: putfield field_78808_h : F
/*      */     //   549: aload_0
/*      */     //   550: getfield Rwing2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   553: fload #8
/*      */     //   555: fneg
/*      */     //   556: putfield field_78808_h : F
/*      */     //   559: aload_0
/*      */     //   560: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   563: fload #8
/*      */     //   565: fneg
/*      */     //   566: ldc_w 5.0
/*      */     //   569: fmul
/*      */     //   570: ldc_w 3.0
/*      */     //   573: fdiv
/*      */     //   574: putfield field_78808_h : F
/*      */     //   577: aload_0
/*      */     //   578: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   581: aload_0
/*      */     //   582: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   585: getfield field_78797_d : F
/*      */     //   588: aload_0
/*      */     //   589: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   592: getfield field_78808_h : F
/*      */     //   595: f2d
/*      */     //   596: invokestatic sin : (D)D
/*      */     //   599: d2f
/*      */     //   600: ldc_w 84.0
/*      */     //   603: fmul
/*      */     //   604: fsub
/*      */     //   605: putfield field_78797_d : F
/*      */     //   608: aload_0
/*      */     //   609: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   612: aload_0
/*      */     //   613: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   616: getfield field_78800_c : F
/*      */     //   619: aload_0
/*      */     //   620: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   623: getfield field_78808_h : F
/*      */     //   626: f2d
/*      */     //   627: invokestatic cos : (D)D
/*      */     //   630: d2f
/*      */     //   631: ldc_w 84.0
/*      */     //   634: fmul
/*      */     //   635: fsub
/*      */     //   636: putfield field_78800_c : F
/*      */     //   639: aload_0
/*      */     //   640: getfield Rwing4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   643: aload_0
/*      */     //   644: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   647: getfield field_78808_h : F
/*      */     //   650: putfield field_78808_h : F
/*      */     //   653: aload_0
/*      */     //   654: getfield Rwing4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   657: aload_0
/*      */     //   658: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   661: getfield field_78797_d : F
/*      */     //   664: putfield field_78797_d : F
/*      */     //   667: aload_0
/*      */     //   668: getfield Rwing4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   671: aload_0
/*      */     //   672: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   675: getfield field_78800_c : F
/*      */     //   678: putfield field_78800_c : F
/*      */     //   681: aload_0
/*      */     //   682: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   685: fload #8
/*      */     //   687: fneg
/*      */     //   688: ldc_w 7.0
/*      */     //   691: fmul
/*      */     //   692: ldc_w 3.0
/*      */     //   695: fdiv
/*      */     //   696: putfield field_78808_h : F
/*      */     //   699: aload_0
/*      */     //   700: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   703: aload_0
/*      */     //   704: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   707: getfield field_78797_d : F
/*      */     //   710: aload_0
/*      */     //   711: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   714: getfield field_78808_h : F
/*      */     //   717: f2d
/*      */     //   718: invokestatic sin : (D)D
/*      */     //   721: d2f
/*      */     //   722: ldc_w 184.0
/*      */     //   725: fmul
/*      */     //   726: fsub
/*      */     //   727: putfield field_78797_d : F
/*      */     //   730: aload_0
/*      */     //   731: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   734: aload_0
/*      */     //   735: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   738: getfield field_78800_c : F
/*      */     //   741: aload_0
/*      */     //   742: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   745: getfield field_78808_h : F
/*      */     //   748: f2d
/*      */     //   749: invokestatic cos : (D)D
/*      */     //   752: d2f
/*      */     //   753: ldc_w 184.0
/*      */     //   756: fmul
/*      */     //   757: fsub
/*      */     //   758: putfield field_78800_c : F
/*      */     //   761: aload_0
/*      */     //   762: getfield Rwing6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   765: aload_0
/*      */     //   766: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   769: getfield field_78808_h : F
/*      */     //   772: putfield field_78808_h : F
/*      */     //   775: aload_0
/*      */     //   776: getfield Rwing6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   779: aload_0
/*      */     //   780: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   783: getfield field_78797_d : F
/*      */     //   786: putfield field_78797_d : F
/*      */     //   789: aload_0
/*      */     //   790: getfield Rwing6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   793: aload_0
/*      */     //   794: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   797: getfield field_78800_c : F
/*      */     //   800: putfield field_78800_c : F
/*      */     //   803: aload_0
/*      */     //   804: getfield Rwing7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   807: aload_0
/*      */     //   808: getfield Rwing9 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   811: aload_0
/*      */     //   812: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   815: getfield field_78797_d : F
/*      */     //   818: dup_x1
/*      */     //   819: putfield field_78797_d : F
/*      */     //   822: putfield field_78797_d : F
/*      */     //   825: aload_0
/*      */     //   826: getfield Rwing7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   829: aload_0
/*      */     //   830: getfield Rwing9 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   833: aload_0
/*      */     //   834: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   837: getfield field_78800_c : F
/*      */     //   840: dup_x1
/*      */     //   841: putfield field_78800_c : F
/*      */     //   844: putfield field_78800_c : F
/*      */     //   847: aload_0
/*      */     //   848: getfield Rwing8 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   851: aload_0
/*      */     //   852: getfield Rwing10 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   855: aload_0
/*      */     //   856: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   859: getfield field_78797_d : F
/*      */     //   862: dup_x1
/*      */     //   863: putfield field_78797_d : F
/*      */     //   866: putfield field_78797_d : F
/*      */     //   869: aload_0
/*      */     //   870: getfield Rwing8 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   873: aload_0
/*      */     //   874: getfield Rwing10 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   877: aload_0
/*      */     //   878: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   881: getfield field_78800_c : F
/*      */     //   884: dup_x1
/*      */     //   885: putfield field_78800_c : F
/*      */     //   888: putfield field_78800_c : F
/*      */     //   891: aload_0
/*      */     //   892: getfield Rwing7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   895: aload_0
/*      */     //   896: getfield Rwing8 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   899: ldc_w -0.261
/*      */     //   902: aload_0
/*      */     //   903: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   906: getfield field_78808_h : F
/*      */     //   909: fadd
/*      */     //   910: dup_x1
/*      */     //   911: putfield field_78808_h : F
/*      */     //   914: putfield field_78808_h : F
/*      */     //   917: aload_0
/*      */     //   918: getfield Rwing9 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   921: aload_0
/*      */     //   922: getfield Rwing10 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   925: ldc_w 0.261
/*      */     //   928: aload_0
/*      */     //   929: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   932: getfield field_78808_h : F
/*      */     //   935: fadd
/*      */     //   936: dup_x1
/*      */     //   937: putfield field_78808_h : F
/*      */     //   940: putfield field_78808_h : F
/*      */     //   943: aload #9
/*      */     //   945: invokevirtual getAttacking : ()I
/*      */     //   948: ifeq -> 978
/*      */     //   951: fload #4
/*      */     //   953: ldc_w 0.75
/*      */     //   956: fmul
/*      */     //   957: aload_0
/*      */     //   958: getfield wingspeed : F
/*      */     //   961: fmul
/*      */     //   962: invokestatic func_76134_b : (F)F
/*      */     //   965: ldc_w 3.1415927
/*      */     //   968: fmul
/*      */     //   969: ldc_w 0.25
/*      */     //   972: fmul
/*      */     //   973: fstore #8
/*      */     //   975: goto -> 981
/*      */     //   978: fconst_0
/*      */     //   979: fstore #8
/*      */     //   981: aload_0
/*      */     //   982: getfield LClawRear : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   985: aload_0
/*      */     //   986: getfield RClawRear : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   989: ldc_w -0.925
/*      */     //   992: fload #8
/*      */     //   994: fadd
/*      */     //   995: dup_x1
/*      */     //   996: putfield field_78795_f : F
/*      */     //   999: putfield field_78795_f : F
/*      */     //   1002: aload_0
/*      */     //   1003: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1006: ldc_w 0.384
/*      */     //   1009: fload #8
/*      */     //   1011: fsub
/*      */     //   1012: putfield field_78795_f : F
/*      */     //   1015: aload_0
/*      */     //   1016: getfield LLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1019: ldc_w 0.645
/*      */     //   1022: fload #8
/*      */     //   1024: fsub
/*      */     //   1025: putfield field_78795_f : F
/*      */     //   1028: aload_0
/*      */     //   1029: getfield LCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1032: ldc_w 0.384
/*      */     //   1035: fload #8
/*      */     //   1037: fsub
/*      */     //   1038: putfield field_78795_f : F
/*      */     //   1041: aload_0
/*      */     //   1042: getfield LCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1045: ldc_w 0.645
/*      */     //   1048: fload #8
/*      */     //   1050: fsub
/*      */     //   1051: putfield field_78795_f : F
/*      */     //   1054: aload_0
/*      */     //   1055: getfield LRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1058: ldc_w 0.384
/*      */     //   1061: fload #8
/*      */     //   1063: fsub
/*      */     //   1064: putfield field_78795_f : F
/*      */     //   1067: aload_0
/*      */     //   1068: getfield LRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1071: ldc_w 0.645
/*      */     //   1074: fload #8
/*      */     //   1076: fsub
/*      */     //   1077: putfield field_78795_f : F
/*      */     //   1080: aload_0
/*      */     //   1081: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1084: ldc_w 0.384
/*      */     //   1087: fload #8
/*      */     //   1089: fsub
/*      */     //   1090: putfield field_78795_f : F
/*      */     //   1093: aload_0
/*      */     //   1094: getfield RLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1097: ldc_w 0.645
/*      */     //   1100: fload #8
/*      */     //   1102: fsub
/*      */     //   1103: putfield field_78795_f : F
/*      */     //   1106: aload_0
/*      */     //   1107: getfield RCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1110: ldc_w 0.384
/*      */     //   1113: fload #8
/*      */     //   1115: fsub
/*      */     //   1116: putfield field_78795_f : F
/*      */     //   1119: aload_0
/*      */     //   1120: getfield RCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1123: ldc_w 0.645
/*      */     //   1126: fload #8
/*      */     //   1128: fsub
/*      */     //   1129: putfield field_78795_f : F
/*      */     //   1132: aload_0
/*      */     //   1133: getfield RRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1136: ldc_w 0.384
/*      */     //   1139: fload #8
/*      */     //   1141: fsub
/*      */     //   1142: putfield field_78795_f : F
/*      */     //   1145: aload_0
/*      */     //   1146: getfield RRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1149: ldc_w 0.645
/*      */     //   1152: fload #8
/*      */     //   1154: fsub
/*      */     //   1155: putfield field_78795_f : F
/*      */     //   1158: aload #9
/*      */     //   1160: invokevirtual getAttacking : ()I
/*      */     //   1163: ifeq -> 1193
/*      */     //   1166: fload #4
/*      */     //   1168: ldc_w 0.6
/*      */     //   1171: fmul
/*      */     //   1172: aload_0
/*      */     //   1173: getfield wingspeed : F
/*      */     //   1176: fmul
/*      */     //   1177: invokestatic func_76134_b : (F)F
/*      */     //   1180: ldc_w 3.1415927
/*      */     //   1183: fmul
/*      */     //   1184: ldc_w 0.45
/*      */     //   1187: fmul
/*      */     //   1188: fstore #8
/*      */     //   1190: goto -> 1196
/*      */     //   1193: fconst_0
/*      */     //   1194: fstore #8
/*      */     //   1196: aload_0
/*      */     //   1197: getfield LThigh : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1200: aload_0
/*      */     //   1201: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1204: ldc_w 0.785
/*      */     //   1207: fload #8
/*      */     //   1209: ldc_w 4.0
/*      */     //   1212: fdiv
/*      */     //   1213: fadd
/*      */     //   1214: dup_x1
/*      */     //   1215: putfield field_78795_f : F
/*      */     //   1218: putfield field_78795_f : F
/*      */     //   1221: aload_0
/*      */     //   1222: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1225: aload_0
/*      */     //   1226: getfield LFoot : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1229: ldc_w -0.628
/*      */     //   1232: fload #8
/*      */     //   1234: fconst_2
/*      */     //   1235: fdiv
/*      */     //   1236: fadd
/*      */     //   1237: dup_x1
/*      */     //   1238: putfield field_78795_f : F
/*      */     //   1241: putfield field_78795_f : F
/*      */     //   1244: aload_0
/*      */     //   1245: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1248: aload_0
/*      */     //   1249: getfield LFoot : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1252: aload_0
/*      */     //   1253: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1256: getfield field_78797_d : F
/*      */     //   1259: aload_0
/*      */     //   1260: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1263: getfield field_78795_f : F
/*      */     //   1266: f2d
/*      */     //   1267: invokestatic cos : (D)D
/*      */     //   1270: d2f
/*      */     //   1271: ldc_w 50.0
/*      */     //   1274: fmul
/*      */     //   1275: fadd
/*      */     //   1276: dup_x1
/*      */     //   1277: putfield field_78797_d : F
/*      */     //   1280: putfield field_78797_d : F
/*      */     //   1283: aload_0
/*      */     //   1284: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1287: aload_0
/*      */     //   1288: getfield LFoot : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1291: aload_0
/*      */     //   1292: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1295: getfield field_78798_e : F
/*      */     //   1298: aload_0
/*      */     //   1299: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1302: getfield field_78795_f : F
/*      */     //   1305: f2d
/*      */     //   1306: invokestatic sin : (D)D
/*      */     //   1309: d2f
/*      */     //   1310: ldc_w 50.0
/*      */     //   1313: fmul
/*      */     //   1314: fadd
/*      */     //   1315: dup_x1
/*      */     //   1316: putfield field_78798_e : F
/*      */     //   1319: putfield field_78798_e : F
/*      */     //   1322: aload_0
/*      */     //   1323: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1326: aload_0
/*      */     //   1327: getfield LLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1330: aload_0
/*      */     //   1331: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1334: getfield field_78797_d : F
/*      */     //   1337: aload_0
/*      */     //   1338: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1341: getfield field_78795_f : F
/*      */     //   1344: ldc_w 0.1
/*      */     //   1347: fsub
/*      */     //   1348: f2d
/*      */     //   1349: invokestatic cos : (D)D
/*      */     //   1352: d2f
/*      */     //   1353: ldc_w 66.0
/*      */     //   1356: fmul
/*      */     //   1357: fadd
/*      */     //   1358: dup_x1
/*      */     //   1359: putfield field_78797_d : F
/*      */     //   1362: putfield field_78797_d : F
/*      */     //   1365: aload_0
/*      */     //   1366: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1369: aload_0
/*      */     //   1370: getfield LLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1373: aload_0
/*      */     //   1374: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1377: getfield field_78798_e : F
/*      */     //   1380: aload_0
/*      */     //   1381: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1384: getfield field_78795_f : F
/*      */     //   1387: ldc_w 0.1
/*      */     //   1390: fsub
/*      */     //   1391: f2d
/*      */     //   1392: invokestatic sin : (D)D
/*      */     //   1395: d2f
/*      */     //   1396: ldc_w 66.0
/*      */     //   1399: fmul
/*      */     //   1400: fadd
/*      */     //   1401: dup_x1
/*      */     //   1402: putfield field_78798_e : F
/*      */     //   1405: putfield field_78798_e : F
/*      */     //   1408: aload_0
/*      */     //   1409: getfield LCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1412: aload_0
/*      */     //   1413: getfield LCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1416: aload_0
/*      */     //   1417: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1420: getfield field_78797_d : F
/*      */     //   1423: dup_x1
/*      */     //   1424: putfield field_78797_d : F
/*      */     //   1427: putfield field_78797_d : F
/*      */     //   1430: aload_0
/*      */     //   1431: getfield LRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1434: aload_0
/*      */     //   1435: getfield LRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1438: aload_0
/*      */     //   1439: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1442: getfield field_78797_d : F
/*      */     //   1445: dup_x1
/*      */     //   1446: putfield field_78797_d : F
/*      */     //   1449: putfield field_78797_d : F
/*      */     //   1452: aload_0
/*      */     //   1453: getfield LCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1456: aload_0
/*      */     //   1457: getfield LCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1460: aload_0
/*      */     //   1461: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1464: getfield field_78798_e : F
/*      */     //   1467: dup_x1
/*      */     //   1468: putfield field_78798_e : F
/*      */     //   1471: putfield field_78798_e : F
/*      */     //   1474: aload_0
/*      */     //   1475: getfield LRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1478: aload_0
/*      */     //   1479: getfield LRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1482: aload_0
/*      */     //   1483: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1486: getfield field_78798_e : F
/*      */     //   1489: dup_x1
/*      */     //   1490: putfield field_78798_e : F
/*      */     //   1493: putfield field_78798_e : F
/*      */     //   1496: aload_0
/*      */     //   1497: getfield LClawRear : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1500: aload_0
/*      */     //   1501: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1504: getfield field_78797_d : F
/*      */     //   1507: aload_0
/*      */     //   1508: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1511: getfield field_78795_f : F
/*      */     //   1514: ldc_w 0.15
/*      */     //   1517: fadd
/*      */     //   1518: f2d
/*      */     //   1519: invokestatic cos : (D)D
/*      */     //   1522: d2f
/*      */     //   1523: ldc_w 66.0
/*      */     //   1526: fmul
/*      */     //   1527: fadd
/*      */     //   1528: putfield field_78797_d : F
/*      */     //   1531: aload_0
/*      */     //   1532: getfield LClawRear : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1535: aload_0
/*      */     //   1536: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1539: getfield field_78798_e : F
/*      */     //   1542: aload_0
/*      */     //   1543: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1546: getfield field_78795_f : F
/*      */     //   1549: ldc_w 0.15
/*      */     //   1552: fadd
/*      */     //   1553: f2d
/*      */     //   1554: invokestatic sin : (D)D
/*      */     //   1557: d2f
/*      */     //   1558: ldc_w 66.0
/*      */     //   1561: fmul
/*      */     //   1562: fadd
/*      */     //   1563: putfield field_78798_e : F
/*      */     //   1566: aload_0
/*      */     //   1567: getfield RThigh : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1570: aload_0
/*      */     //   1571: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1574: ldc_w 0.785
/*      */     //   1577: fload #8
/*      */     //   1579: ldc_w 4.0
/*      */     //   1582: fdiv
/*      */     //   1583: fsub
/*      */     //   1584: dup_x1
/*      */     //   1585: putfield field_78795_f : F
/*      */     //   1588: putfield field_78795_f : F
/*      */     //   1591: aload_0
/*      */     //   1592: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1595: aload_0
/*      */     //   1596: getfield RFoot : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1599: ldc_w -0.628
/*      */     //   1602: fload #8
/*      */     //   1604: fconst_2
/*      */     //   1605: fdiv
/*      */     //   1606: fsub
/*      */     //   1607: dup_x1
/*      */     //   1608: putfield field_78795_f : F
/*      */     //   1611: putfield field_78795_f : F
/*      */     //   1614: aload_0
/*      */     //   1615: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1618: aload_0
/*      */     //   1619: getfield RFoot : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1622: aload_0
/*      */     //   1623: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1626: getfield field_78797_d : F
/*      */     //   1629: aload_0
/*      */     //   1630: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1633: getfield field_78795_f : F
/*      */     //   1636: f2d
/*      */     //   1637: invokestatic cos : (D)D
/*      */     //   1640: d2f
/*      */     //   1641: ldc_w 50.0
/*      */     //   1644: fmul
/*      */     //   1645: fadd
/*      */     //   1646: dup_x1
/*      */     //   1647: putfield field_78797_d : F
/*      */     //   1650: putfield field_78797_d : F
/*      */     //   1653: aload_0
/*      */     //   1654: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1657: aload_0
/*      */     //   1658: getfield RFoot : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1661: aload_0
/*      */     //   1662: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1665: getfield field_78798_e : F
/*      */     //   1668: aload_0
/*      */     //   1669: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1672: getfield field_78795_f : F
/*      */     //   1675: f2d
/*      */     //   1676: invokestatic sin : (D)D
/*      */     //   1679: d2f
/*      */     //   1680: ldc_w 50.0
/*      */     //   1683: fmul
/*      */     //   1684: fadd
/*      */     //   1685: dup_x1
/*      */     //   1686: putfield field_78798_e : F
/*      */     //   1689: putfield field_78798_e : F
/*      */     //   1692: aload_0
/*      */     //   1693: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1696: aload_0
/*      */     //   1697: getfield RLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1700: aload_0
/*      */     //   1701: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1704: getfield field_78797_d : F
/*      */     //   1707: aload_0
/*      */     //   1708: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1711: getfield field_78795_f : F
/*      */     //   1714: ldc_w 0.1
/*      */     //   1717: fsub
/*      */     //   1718: f2d
/*      */     //   1719: invokestatic cos : (D)D
/*      */     //   1722: d2f
/*      */     //   1723: ldc_w 66.0
/*      */     //   1726: fmul
/*      */     //   1727: fadd
/*      */     //   1728: dup_x1
/*      */     //   1729: putfield field_78797_d : F
/*      */     //   1732: putfield field_78797_d : F
/*      */     //   1735: aload_0
/*      */     //   1736: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1739: aload_0
/*      */     //   1740: getfield RLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1743: aload_0
/*      */     //   1744: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1747: getfield field_78798_e : F
/*      */     //   1750: aload_0
/*      */     //   1751: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1754: getfield field_78795_f : F
/*      */     //   1757: ldc_w 0.1
/*      */     //   1760: fsub
/*      */     //   1761: f2d
/*      */     //   1762: invokestatic sin : (D)D
/*      */     //   1765: d2f
/*      */     //   1766: ldc_w 66.0
/*      */     //   1769: fmul
/*      */     //   1770: fadd
/*      */     //   1771: dup_x1
/*      */     //   1772: putfield field_78798_e : F
/*      */     //   1775: putfield field_78798_e : F
/*      */     //   1778: aload_0
/*      */     //   1779: getfield RCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1782: aload_0
/*      */     //   1783: getfield RCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1786: aload_0
/*      */     //   1787: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1790: getfield field_78797_d : F
/*      */     //   1793: dup_x1
/*      */     //   1794: putfield field_78797_d : F
/*      */     //   1797: putfield field_78797_d : F
/*      */     //   1800: aload_0
/*      */     //   1801: getfield RRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1804: aload_0
/*      */     //   1805: getfield RRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1808: aload_0
/*      */     //   1809: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1812: getfield field_78797_d : F
/*      */     //   1815: dup_x1
/*      */     //   1816: putfield field_78797_d : F
/*      */     //   1819: putfield field_78797_d : F
/*      */     //   1822: aload_0
/*      */     //   1823: getfield RCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1826: aload_0
/*      */     //   1827: getfield RCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1830: aload_0
/*      */     //   1831: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1834: getfield field_78798_e : F
/*      */     //   1837: dup_x1
/*      */     //   1838: putfield field_78798_e : F
/*      */     //   1841: putfield field_78798_e : F
/*      */     //   1844: aload_0
/*      */     //   1845: getfield RRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1848: aload_0
/*      */     //   1849: getfield RRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1852: aload_0
/*      */     //   1853: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1856: getfield field_78798_e : F
/*      */     //   1859: dup_x1
/*      */     //   1860: putfield field_78798_e : F
/*      */     //   1863: putfield field_78798_e : F
/*      */     //   1866: aload_0
/*      */     //   1867: getfield RClawRear : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1870: aload_0
/*      */     //   1871: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1874: getfield field_78797_d : F
/*      */     //   1877: aload_0
/*      */     //   1878: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1881: getfield field_78795_f : F
/*      */     //   1884: ldc_w 0.15
/*      */     //   1887: fadd
/*      */     //   1888: f2d
/*      */     //   1889: invokestatic cos : (D)D
/*      */     //   1892: d2f
/*      */     //   1893: ldc_w 66.0
/*      */     //   1896: fmul
/*      */     //   1897: fadd
/*      */     //   1898: putfield field_78797_d : F
/*      */     //   1901: aload_0
/*      */     //   1902: getfield RClawRear : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1905: aload_0
/*      */     //   1906: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1909: getfield field_78798_e : F
/*      */     //   1912: aload_0
/*      */     //   1913: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1916: getfield field_78795_f : F
/*      */     //   1919: ldc_w 0.15
/*      */     //   1922: fadd
/*      */     //   1923: f2d
/*      */     //   1924: invokestatic sin : (D)D
/*      */     //   1927: d2f
/*      */     //   1928: ldc_w 66.0
/*      */     //   1931: fmul
/*      */     //   1932: fadd
/*      */     //   1933: putfield field_78798_e : F
/*      */     //   1936: aload #9
/*      */     //   1938: invokevirtual getAttacking : ()I
/*      */     //   1941: ifeq -> 1954
/*      */     //   1944: ldc_w 0.56
/*      */     //   1947: fstore #10
/*      */     //   1949: ldc_w 0.19
/*      */     //   1952: fstore #11
/*      */     //   1954: aload_0
/*      */     //   1955: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1958: fload #4
/*      */     //   1960: fload #10
/*      */     //   1962: fmul
/*      */     //   1963: aload_0
/*      */     //   1964: getfield wingspeed : F
/*      */     //   1967: fmul
/*      */     //   1968: invokestatic func_76134_b : (F)F
/*      */     //   1971: ldc_w 3.1415927
/*      */     //   1974: fmul
/*      */     //   1975: fload #11
/*      */     //   1977: fmul
/*      */     //   1978: fconst_2
/*      */     //   1979: fdiv
/*      */     //   1980: putfield field_78796_g : F
/*      */     //   1983: aload_0
/*      */     //   1984: getfield Ridge4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1987: aload_0
/*      */     //   1988: getfield Ridge5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1991: aload_0
/*      */     //   1992: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   1995: getfield field_78796_g : F
/*      */     //   1998: dup_x1
/*      */     //   1999: putfield field_78796_g : F
/*      */     //   2002: putfield field_78796_g : F
/*      */     //   2005: aload_0
/*      */     //   2006: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2009: aload_0
/*      */     //   2010: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2013: getfield field_78798_e : F
/*      */     //   2016: aload_0
/*      */     //   2017: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2020: getfield field_78796_g : F
/*      */     //   2023: f2d
/*      */     //   2024: invokestatic cos : (D)D
/*      */     //   2027: d2f
/*      */     //   2028: ldc_w 54.0
/*      */     //   2031: fmul
/*      */     //   2032: fadd
/*      */     //   2033: putfield field_78798_e : F
/*      */     //   2036: aload_0
/*      */     //   2037: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2040: aload_0
/*      */     //   2041: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2044: getfield field_78800_c : F
/*      */     //   2047: fconst_1
/*      */     //   2048: fsub
/*      */     //   2049: aload_0
/*      */     //   2050: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2053: getfield field_78796_g : F
/*      */     //   2056: f2d
/*      */     //   2057: invokestatic sin : (D)D
/*      */     //   2060: d2f
/*      */     //   2061: ldc_w 54.0
/*      */     //   2064: fmul
/*      */     //   2065: fadd
/*      */     //   2066: putfield field_78800_c : F
/*      */     //   2069: aload_0
/*      */     //   2070: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2073: fload #4
/*      */     //   2075: fload #10
/*      */     //   2077: fmul
/*      */     //   2078: aload_0
/*      */     //   2079: getfield wingspeed : F
/*      */     //   2082: fmul
/*      */     //   2083: fload #12
/*      */     //   2085: fsub
/*      */     //   2086: invokestatic func_76134_b : (F)F
/*      */     //   2089: ldc_w 3.1415927
/*      */     //   2092: fmul
/*      */     //   2093: fload #11
/*      */     //   2095: fmul
/*      */     //   2096: putfield field_78796_g : F
/*      */     //   2099: aload_0
/*      */     //   2100: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2103: aload_0
/*      */     //   2104: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2107: getfield field_78798_e : F
/*      */     //   2110: aload_0
/*      */     //   2111: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2114: getfield field_78796_g : F
/*      */     //   2117: f2d
/*      */     //   2118: invokestatic cos : (D)D
/*      */     //   2121: d2f
/*      */     //   2122: ldc_w 42.0
/*      */     //   2125: fmul
/*      */     //   2126: fadd
/*      */     //   2127: putfield field_78798_e : F
/*      */     //   2130: aload_0
/*      */     //   2131: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2134: aload_0
/*      */     //   2135: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2138: getfield field_78800_c : F
/*      */     //   2141: aload_0
/*      */     //   2142: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2145: getfield field_78796_g : F
/*      */     //   2148: f2d
/*      */     //   2149: invokestatic sin : (D)D
/*      */     //   2152: d2f
/*      */     //   2153: ldc_w 42.0
/*      */     //   2156: fmul
/*      */     //   2157: fadd
/*      */     //   2158: putfield field_78800_c : F
/*      */     //   2161: aload_0
/*      */     //   2162: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2165: fload #4
/*      */     //   2167: fload #10
/*      */     //   2169: fmul
/*      */     //   2170: aload_0
/*      */     //   2171: getfield wingspeed : F
/*      */     //   2174: fmul
/*      */     //   2175: fconst_2
/*      */     //   2176: fload #12
/*      */     //   2178: fmul
/*      */     //   2179: fsub
/*      */     //   2180: invokestatic func_76134_b : (F)F
/*      */     //   2183: ldc_w 3.1415927
/*      */     //   2186: fmul
/*      */     //   2187: fload #11
/*      */     //   2189: fmul
/*      */     //   2190: putfield field_78796_g : F
/*      */     //   2193: aload_0
/*      */     //   2194: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2197: aload_0
/*      */     //   2198: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2201: getfield field_78798_e : F
/*      */     //   2204: aload_0
/*      */     //   2205: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2208: getfield field_78796_g : F
/*      */     //   2211: f2d
/*      */     //   2212: invokestatic cos : (D)D
/*      */     //   2215: d2f
/*      */     //   2216: ldc_w 41.0
/*      */     //   2219: fmul
/*      */     //   2220: fadd
/*      */     //   2221: putfield field_78798_e : F
/*      */     //   2224: aload_0
/*      */     //   2225: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2228: aload_0
/*      */     //   2229: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2232: getfield field_78800_c : F
/*      */     //   2235: aload_0
/*      */     //   2236: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2239: getfield field_78796_g : F
/*      */     //   2242: f2d
/*      */     //   2243: invokestatic sin : (D)D
/*      */     //   2246: d2f
/*      */     //   2247: ldc_w 41.0
/*      */     //   2250: fmul
/*      */     //   2251: fadd
/*      */     //   2252: putfield field_78800_c : F
/*      */     //   2255: aload_0
/*      */     //   2256: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2259: fload #4
/*      */     //   2261: fload #10
/*      */     //   2263: fmul
/*      */     //   2264: aload_0
/*      */     //   2265: getfield wingspeed : F
/*      */     //   2268: fmul
/*      */     //   2269: ldc_w 3.0
/*      */     //   2272: fload #12
/*      */     //   2274: fmul
/*      */     //   2275: fsub
/*      */     //   2276: invokestatic func_76134_b : (F)F
/*      */     //   2279: ldc_w 3.1415927
/*      */     //   2282: fmul
/*      */     //   2283: fload #11
/*      */     //   2285: fmul
/*      */     //   2286: putfield field_78796_g : F
/*      */     //   2289: fload #4
/*      */     //   2291: fload #10
/*      */     //   2293: fmul
/*      */     //   2294: aload_0
/*      */     //   2295: getfield wingspeed : F
/*      */     //   2298: fmul
/*      */     //   2299: ldc_w 3.0
/*      */     //   2302: fload #12
/*      */     //   2304: fmul
/*      */     //   2305: fsub
/*      */     //   2306: invokestatic func_76134_b : (F)F
/*      */     //   2309: ldc_w 3.1415927
/*      */     //   2312: fmul
/*      */     //   2313: fload #11
/*      */     //   2315: fmul
/*      */     //   2316: fstore #8
/*      */     //   2318: fload #8
/*      */     //   2320: fconst_2
/*      */     //   2321: fdiv
/*      */     //   2322: fstore #8
/*      */     //   2324: aload_0
/*      */     //   2325: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2328: aload_0
/*      */     //   2329: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2332: getfield field_78798_e : F
/*      */     //   2335: aload_0
/*      */     //   2336: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2339: getfield field_78796_g : F
/*      */     //   2342: f2d
/*      */     //   2343: invokestatic cos : (D)D
/*      */     //   2346: d2f
/*      */     //   2347: ldc_w 34.0
/*      */     //   2350: fmul
/*      */     //   2351: fadd
/*      */     //   2352: putfield field_78798_e : F
/*      */     //   2355: aload_0
/*      */     //   2356: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2359: aload_0
/*      */     //   2360: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2363: getfield field_78800_c : F
/*      */     //   2366: aload_0
/*      */     //   2367: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2370: getfield field_78796_g : F
/*      */     //   2373: f2d
/*      */     //   2374: invokestatic sin : (D)D
/*      */     //   2377: d2f
/*      */     //   2378: ldc_w 34.0
/*      */     //   2381: fmul
/*      */     //   2382: fadd
/*      */     //   2383: putfield field_78800_c : F
/*      */     //   2386: aload_0
/*      */     //   2387: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2390: aload_0
/*      */     //   2391: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2394: getfield field_78796_g : F
/*      */     //   2397: fload #8
/*      */     //   2399: fadd
/*      */     //   2400: putfield field_78796_g : F
/*      */     //   2403: aload_0
/*      */     //   2404: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2407: aload_0
/*      */     //   2408: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2411: getfield field_78798_e : F
/*      */     //   2414: aload_0
/*      */     //   2415: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2418: getfield field_78796_g : F
/*      */     //   2421: f2d
/*      */     //   2422: invokestatic cos : (D)D
/*      */     //   2425: d2f
/*      */     //   2426: ldc_w 34.0
/*      */     //   2429: fmul
/*      */     //   2430: fadd
/*      */     //   2431: putfield field_78798_e : F
/*      */     //   2434: aload_0
/*      */     //   2435: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2438: aload_0
/*      */     //   2439: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2442: getfield field_78800_c : F
/*      */     //   2445: aload_0
/*      */     //   2446: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2449: getfield field_78796_g : F
/*      */     //   2452: f2d
/*      */     //   2453: invokestatic sin : (D)D
/*      */     //   2456: d2f
/*      */     //   2457: ldc_w 34.0
/*      */     //   2460: fmul
/*      */     //   2461: fadd
/*      */     //   2462: putfield field_78800_c : F
/*      */     //   2465: aload_0
/*      */     //   2466: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2469: aload_0
/*      */     //   2470: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2473: getfield field_78796_g : F
/*      */     //   2476: fload #8
/*      */     //   2478: fadd
/*      */     //   2479: putfield field_78796_g : F
/*      */     //   2482: aload_0
/*      */     //   2483: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2486: aload_0
/*      */     //   2487: getfield Ridge6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2490: aload_0
/*      */     //   2491: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2494: getfield field_78798_e : F
/*      */     //   2497: aload_0
/*      */     //   2498: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2501: getfield field_78796_g : F
/*      */     //   2504: f2d
/*      */     //   2505: invokestatic cos : (D)D
/*      */     //   2508: d2f
/*      */     //   2509: ldc 40.0
/*      */     //   2511: fmul
/*      */     //   2512: fadd
/*      */     //   2513: dup_x1
/*      */     //   2514: putfield field_78798_e : F
/*      */     //   2517: putfield field_78798_e : F
/*      */     //   2520: aload_0
/*      */     //   2521: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2524: aload_0
/*      */     //   2525: getfield Ridge6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2528: aload_0
/*      */     //   2529: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2532: getfield field_78800_c : F
/*      */     //   2535: aload_0
/*      */     //   2536: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2539: getfield field_78796_g : F
/*      */     //   2542: f2d
/*      */     //   2543: invokestatic sin : (D)D
/*      */     //   2546: d2f
/*      */     //   2547: ldc 40.0
/*      */     //   2549: fmul
/*      */     //   2550: fadd
/*      */     //   2551: dup_x1
/*      */     //   2552: putfield field_78800_c : F
/*      */     //   2555: putfield field_78800_c : F
/*      */     //   2558: aload_0
/*      */     //   2559: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2562: aload_0
/*      */     //   2563: getfield Ridge6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2566: aload_0
/*      */     //   2567: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2570: getfield field_78796_g : F
/*      */     //   2573: fload #8
/*      */     //   2575: fadd
/*      */     //   2576: dup_x1
/*      */     //   2577: putfield field_78796_g : F
/*      */     //   2580: putfield field_78796_g : F
/*      */     //   2583: aload_0
/*      */     //   2584: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2587: aload_0
/*      */     //   2588: getfield TailTip2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2591: aload_0
/*      */     //   2592: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2595: getfield field_78798_e : F
/*      */     //   2598: aload_0
/*      */     //   2599: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2602: getfield field_78796_g : F
/*      */     //   2605: f2d
/*      */     //   2606: invokestatic cos : (D)D
/*      */     //   2609: d2f
/*      */     //   2610: ldc_w 43.0
/*      */     //   2613: fmul
/*      */     //   2614: fadd
/*      */     //   2615: dup_x1
/*      */     //   2616: putfield field_78798_e : F
/*      */     //   2619: putfield field_78798_e : F
/*      */     //   2622: aload_0
/*      */     //   2623: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2626: aload_0
/*      */     //   2627: getfield TailTip2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2630: aload_0
/*      */     //   2631: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2634: getfield field_78800_c : F
/*      */     //   2637: aload_0
/*      */     //   2638: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2641: getfield field_78796_g : F
/*      */     //   2644: f2d
/*      */     //   2645: invokestatic sin : (D)D
/*      */     //   2648: d2f
/*      */     //   2649: ldc_w 43.0
/*      */     //   2652: fmul
/*      */     //   2653: fadd
/*      */     //   2654: dup_x1
/*      */     //   2655: putfield field_78800_c : F
/*      */     //   2658: putfield field_78800_c : F
/*      */     //   2661: aload_0
/*      */     //   2662: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2665: aload_0
/*      */     //   2666: getfield TailTip2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2669: aload_0
/*      */     //   2670: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2673: getfield field_78796_g : F
/*      */     //   2676: fload #8
/*      */     //   2678: fadd
/*      */     //   2679: dup_x1
/*      */     //   2680: putfield field_78796_g : F
/*      */     //   2683: putfield field_78796_g : F
/*      */     //   2686: aload_0
/*      */     //   2687: getfield TailSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2690: aload_0
/*      */     //   2691: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2694: getfield field_78798_e : F
/*      */     //   2697: aload_0
/*      */     //   2698: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2701: getfield field_78796_g : F
/*      */     //   2704: f2d
/*      */     //   2705: invokestatic cos : (D)D
/*      */     //   2708: d2f
/*      */     //   2709: ldc_w 58.0
/*      */     //   2712: fmul
/*      */     //   2713: fadd
/*      */     //   2714: putfield field_78798_e : F
/*      */     //   2717: aload_0
/*      */     //   2718: getfield TailSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2721: aload_0
/*      */     //   2722: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2725: getfield field_78800_c : F
/*      */     //   2728: aload_0
/*      */     //   2729: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2732: getfield field_78796_g : F
/*      */     //   2735: f2d
/*      */     //   2736: invokestatic sin : (D)D
/*      */     //   2739: d2f
/*      */     //   2740: ldc_w 58.0
/*      */     //   2743: fmul
/*      */     //   2744: fadd
/*      */     //   2745: putfield field_78800_c : F
/*      */     //   2748: aload_0
/*      */     //   2749: getfield TailSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2752: aload_0
/*      */     //   2753: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   2756: getfield field_78796_g : F
/*      */     //   2759: fload #8
/*      */     //   2761: fadd
/*      */     //   2762: putfield field_78796_g : F
/*      */     //   2765: aload #9
/*      */     //   2767: invokevirtual getAttacking : ()I
/*      */     //   2770: ifeq -> 3037
/*      */     //   2773: fload #4
/*      */     //   2775: ldc_w 0.3
/*      */     //   2778: fmul
/*      */     //   2779: aload_0
/*      */     //   2780: getfield wingspeed : F
/*      */     //   2783: fmul
/*      */     //   2784: invokestatic func_76126_a : (F)F
/*      */     //   2787: ldc_w 3.1415927
/*      */     //   2790: fmul
/*      */     //   2791: ldc_w 0.25
/*      */     //   2794: fmul
/*      */     //   2795: fstore #13
/*      */     //   2797: fload #4
/*      */     //   2799: ldc_w 0.2
/*      */     //   2802: fmul
/*      */     //   2803: aload_0
/*      */     //   2804: getfield wingspeed : F
/*      */     //   2807: fmul
/*      */     //   2808: invokestatic func_76126_a : (F)F
/*      */     //   2811: ldc_w 3.1415927
/*      */     //   2814: fmul
/*      */     //   2815: ldc_w 0.25
/*      */     //   2818: fmul
/*      */     //   2819: fstore #14
/*      */     //   2821: fload #4
/*      */     //   2823: ldc_w 0.85
/*      */     //   2826: fmul
/*      */     //   2827: aload_0
/*      */     //   2828: getfield wingspeed : F
/*      */     //   2831: fmul
/*      */     //   2832: invokestatic func_76126_a : (F)F
/*      */     //   2835: ldc_w 3.1415927
/*      */     //   2838: fmul
/*      */     //   2839: ldc_w 0.12
/*      */     //   2842: fmul
/*      */     //   2843: fstore #15
/*      */     //   2845: fload #4
/*      */     //   2847: ldc_w 0.32
/*      */     //   2850: fmul
/*      */     //   2851: aload_0
/*      */     //   2852: getfield wingspeed : F
/*      */     //   2855: fmul
/*      */     //   2856: invokestatic func_76126_a : (F)F
/*      */     //   2859: ldc_w 3.1415927
/*      */     //   2862: fmul
/*      */     //   2863: ldc_w 0.25
/*      */     //   2866: fmul
/*      */     //   2867: fstore #19
/*      */     //   2869: fload #4
/*      */     //   2871: ldc_w 0.21
/*      */     //   2874: fmul
/*      */     //   2875: aload_0
/*      */     //   2876: getfield wingspeed : F
/*      */     //   2879: fmul
/*      */     //   2880: invokestatic func_76126_a : (F)F
/*      */     //   2883: ldc_w 3.1415927
/*      */     //   2886: fmul
/*      */     //   2887: ldc_w 0.25
/*      */     //   2890: fmul
/*      */     //   2891: fstore #20
/*      */     //   2893: fload #4
/*      */     //   2895: ldc_w 0.95
/*      */     //   2898: fmul
/*      */     //   2899: aload_0
/*      */     //   2900: getfield wingspeed : F
/*      */     //   2903: fmul
/*      */     //   2904: invokestatic func_76126_a : (F)F
/*      */     //   2907: ldc_w 3.1415927
/*      */     //   2910: fmul
/*      */     //   2911: ldc_w 0.12
/*      */     //   2914: fmul
/*      */     //   2915: fstore #21
/*      */     //   2917: fload #4
/*      */     //   2919: ldc_w 0.28
/*      */     //   2922: fmul
/*      */     //   2923: aload_0
/*      */     //   2924: getfield wingspeed : F
/*      */     //   2927: fmul
/*      */     //   2928: invokestatic func_76126_a : (F)F
/*      */     //   2931: ldc_w 3.1415927
/*      */     //   2934: fmul
/*      */     //   2935: ldc_w 0.25
/*      */     //   2938: fmul
/*      */     //   2939: fstore #16
/*      */     //   2941: fload #4
/*      */     //   2943: ldc_w 0.19
/*      */     //   2946: fmul
/*      */     //   2947: aload_0
/*      */     //   2948: getfield wingspeed : F
/*      */     //   2951: fmul
/*      */     //   2952: invokestatic func_76126_a : (F)F
/*      */     //   2955: ldc_w 3.1415927
/*      */     //   2958: fmul
/*      */     //   2959: ldc_w 0.25
/*      */     //   2962: fmul
/*      */     //   2963: fstore #17
/*      */     //   2965: fload #4
/*      */     //   2967: ldc_w 0.75
/*      */     //   2970: fmul
/*      */     //   2971: aload_0
/*      */     //   2972: getfield wingspeed : F
/*      */     //   2975: fmul
/*      */     //   2976: invokestatic func_76126_a : (F)F
/*      */     //   2979: ldc_w 3.1415927
/*      */     //   2982: fmul
/*      */     //   2983: ldc_w 0.12
/*      */     //   2986: fmul
/*      */     //   2987: fstore #18
/*      */     //   2989: fload #15
/*      */     //   2991: ldc_w 0.5
/*      */     //   2994: fadd
/*      */     //   2995: fstore #15
/*      */     //   2997: fload #15
/*      */     //   2999: fload #14
/*      */     //   3001: fadd
/*      */     //   3002: fstore #15
/*      */     //   3004: fload #18
/*      */     //   3006: ldc_w 0.5
/*      */     //   3009: fadd
/*      */     //   3010: fstore #18
/*      */     //   3012: fload #18
/*      */     //   3014: fload #17
/*      */     //   3016: fadd
/*      */     //   3017: fstore #18
/*      */     //   3019: fload #21
/*      */     //   3021: ldc_w 0.5
/*      */     //   3024: fadd
/*      */     //   3025: fstore #21
/*      */     //   3027: fload #21
/*      */     //   3029: fload #20
/*      */     //   3031: fadd
/*      */     //   3032: fstore #21
/*      */     //   3034: goto -> 3298
/*      */     //   3037: fload #4
/*      */     //   3039: ldc_w 0.17
/*      */     //   3042: fmul
/*      */     //   3043: aload_0
/*      */     //   3044: getfield wingspeed : F
/*      */     //   3047: fmul
/*      */     //   3048: invokestatic func_76126_a : (F)F
/*      */     //   3051: ldc_w 3.1415927
/*      */     //   3054: fmul
/*      */     //   3055: ldc_w 0.08
/*      */     //   3058: fmul
/*      */     //   3059: fstore #13
/*      */     //   3061: fload #4
/*      */     //   3063: ldc_w 0.13
/*      */     //   3066: fmul
/*      */     //   3067: aload_0
/*      */     //   3068: getfield wingspeed : F
/*      */     //   3071: fmul
/*      */     //   3072: invokestatic func_76126_a : (F)F
/*      */     //   3075: ldc_w 3.1415927
/*      */     //   3078: fmul
/*      */     //   3079: ldc_w 0.1
/*      */     //   3082: fmul
/*      */     //   3083: fstore #14
/*      */     //   3085: fload #4
/*      */     //   3087: ldc_w 0.45
/*      */     //   3090: fmul
/*      */     //   3091: aload_0
/*      */     //   3092: getfield wingspeed : F
/*      */     //   3095: fmul
/*      */     //   3096: invokestatic func_76126_a : (F)F
/*      */     //   3099: ldc_w 3.1415927
/*      */     //   3102: fmul
/*      */     //   3103: ldc_w 0.04
/*      */     //   3106: fmul
/*      */     //   3107: fstore #15
/*      */     //   3109: fload #4
/*      */     //   3111: ldc_w 0.19
/*      */     //   3114: fmul
/*      */     //   3115: aload_0
/*      */     //   3116: getfield wingspeed : F
/*      */     //   3119: fmul
/*      */     //   3120: invokestatic func_76126_a : (F)F
/*      */     //   3123: ldc_w 3.1415927
/*      */     //   3126: fmul
/*      */     //   3127: ldc_w 0.08
/*      */     //   3130: fmul
/*      */     //   3131: fstore #19
/*      */     //   3133: fload #4
/*      */     //   3135: ldc_w 0.12
/*      */     //   3138: fmul
/*      */     //   3139: aload_0
/*      */     //   3140: getfield wingspeed : F
/*      */     //   3143: fmul
/*      */     //   3144: invokestatic func_76126_a : (F)F
/*      */     //   3147: ldc_w 3.1415927
/*      */     //   3150: fmul
/*      */     //   3151: ldc_w 0.1
/*      */     //   3154: fmul
/*      */     //   3155: fstore #20
/*      */     //   3157: fload #4
/*      */     //   3159: ldc_w 0.55
/*      */     //   3162: fmul
/*      */     //   3163: aload_0
/*      */     //   3164: getfield wingspeed : F
/*      */     //   3167: fmul
/*      */     //   3168: invokestatic func_76126_a : (F)F
/*      */     //   3171: ldc_w 3.1415927
/*      */     //   3174: fmul
/*      */     //   3175: ldc_w 0.04
/*      */     //   3178: fmul
/*      */     //   3179: fstore #21
/*      */     //   3181: fload #4
/*      */     //   3183: ldc_w 0.13
/*      */     //   3186: fmul
/*      */     //   3187: aload_0
/*      */     //   3188: getfield wingspeed : F
/*      */     //   3191: fmul
/*      */     //   3192: invokestatic func_76126_a : (F)F
/*      */     //   3195: ldc_w 3.1415927
/*      */     //   3198: fmul
/*      */     //   3199: ldc_w 0.08
/*      */     //   3202: fmul
/*      */     //   3203: fstore #16
/*      */     //   3205: fload #4
/*      */     //   3207: ldc_w 0.08
/*      */     //   3210: fmul
/*      */     //   3211: aload_0
/*      */     //   3212: getfield wingspeed : F
/*      */     //   3215: fmul
/*      */     //   3216: invokestatic func_76126_a : (F)F
/*      */     //   3219: ldc_w 3.1415927
/*      */     //   3222: fmul
/*      */     //   3223: ldc_w 0.1
/*      */     //   3226: fmul
/*      */     //   3227: fstore #17
/*      */     //   3229: fload #4
/*      */     //   3231: ldc_w 0.65
/*      */     //   3234: fmul
/*      */     //   3235: aload_0
/*      */     //   3236: getfield wingspeed : F
/*      */     //   3239: fmul
/*      */     //   3240: invokestatic func_76126_a : (F)F
/*      */     //   3243: ldc_w 3.1415927
/*      */     //   3246: fmul
/*      */     //   3247: ldc_w 0.04
/*      */     //   3250: fmul
/*      */     //   3251: fstore #18
/*      */     //   3253: fload #15
/*      */     //   3255: ldc_w 0.25
/*      */     //   3258: fadd
/*      */     //   3259: fstore #15
/*      */     //   3261: fload #15
/*      */     //   3263: fload #14
/*      */     //   3265: fadd
/*      */     //   3266: fstore #15
/*      */     //   3268: fload #18
/*      */     //   3270: ldc_w 0.25
/*      */     //   3273: fadd
/*      */     //   3274: fstore #18
/*      */     //   3276: fload #18
/*      */     //   3278: fload #17
/*      */     //   3280: fadd
/*      */     //   3281: fstore #18
/*      */     //   3283: fload #21
/*      */     //   3285: ldc_w 0.25
/*      */     //   3288: fadd
/*      */     //   3289: fstore #21
/*      */     //   3291: fload #21
/*      */     //   3293: fload #20
/*      */     //   3295: fadd
/*      */     //   3296: fstore #21
/*      */     //   3298: fload #13
/*      */     //   3300: fload #16
/*      */     //   3302: fcmpl
/*      */     //   3303: ifle -> 3310
/*      */     //   3306: fload #16
/*      */     //   3308: fstore #13
/*      */     //   3310: fload #19
/*      */     //   3312: fload #16
/*      */     //   3314: fcmpg
/*      */     //   3315: ifge -> 3322
/*      */     //   3318: fload #16
/*      */     //   3320: fstore #19
/*      */     //   3322: aload_0
/*      */     //   3323: fload #13
/*      */     //   3325: fload #14
/*      */     //   3327: fload #15
/*      */     //   3329: invokespecial moveLeftHead : (FFF)V
/*      */     //   3332: aload_0
/*      */     //   3333: fload #16
/*      */     //   3335: fload #17
/*      */     //   3337: fload #18
/*      */     //   3339: invokespecial moveCenterHead : (FFF)V
/*      */     //   3342: aload_0
/*      */     //   3343: fload #19
/*      */     //   3345: fload #20
/*      */     //   3347: fload #21
/*      */     //   3349: invokespecial moveRightHead : (FFF)V
/*      */     //   3352: aload_0
/*      */     //   3353: getfield LCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3356: fload #7
/*      */     //   3358: invokevirtual func_78785_a : (F)V
/*      */     //   3361: aload_0
/*      */     //   3362: getfield LThigh : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3365: fload #7
/*      */     //   3367: invokevirtual func_78785_a : (F)V
/*      */     //   3370: aload_0
/*      */     //   3371: getfield LUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3374: fload #7
/*      */     //   3376: invokevirtual func_78785_a : (F)V
/*      */     //   3379: aload_0
/*      */     //   3380: getfield TailTip : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3383: fload #7
/*      */     //   3385: invokevirtual func_78785_a : (F)V
/*      */     //   3388: aload_0
/*      */     //   3389: getfield Tail1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3392: fload #7
/*      */     //   3394: invokevirtual func_78785_a : (F)V
/*      */     //   3397: aload_0
/*      */     //   3398: getfield Tail2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3401: fload #7
/*      */     //   3403: invokevirtual func_78785_a : (F)V
/*      */     //   3406: aload_0
/*      */     //   3407: getfield Tail3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3410: fload #7
/*      */     //   3412: invokevirtual func_78785_a : (F)V
/*      */     //   3415: aload_0
/*      */     //   3416: getfield Tail4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3419: fload #7
/*      */     //   3421: invokevirtual func_78785_a : (F)V
/*      */     //   3424: aload_0
/*      */     //   3425: getfield Tail5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3428: fload #7
/*      */     //   3430: invokevirtual func_78785_a : (F)V
/*      */     //   3433: aload_0
/*      */     //   3434: getfield Tail6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3437: fload #7
/*      */     //   3439: invokevirtual func_78785_a : (F)V
/*      */     //   3442: aload_0
/*      */     //   3443: getfield Tail7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3446: fload #7
/*      */     //   3448: invokevirtual func_78785_a : (F)V
/*      */     //   3451: aload_0
/*      */     //   3452: getfield Body1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3455: fload #7
/*      */     //   3457: invokevirtual func_78785_a : (F)V
/*      */     //   3460: aload_0
/*      */     //   3461: getfield Chest : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3464: fload #7
/*      */     //   3466: invokevirtual func_78785_a : (F)V
/*      */     //   3469: aload_0
/*      */     //   3470: getfield NeckC1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3473: fload #7
/*      */     //   3475: invokevirtual func_78785_a : (F)V
/*      */     //   3478: aload_0
/*      */     //   3479: getfield LLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3482: fload #7
/*      */     //   3484: invokevirtual func_78785_a : (F)V
/*      */     //   3487: aload_0
/*      */     //   3488: getfield LFoot : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3491: fload #7
/*      */     //   3493: invokevirtual func_78785_a : (F)V
/*      */     //   3496: aload_0
/*      */     //   3497: getfield LLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3500: fload #7
/*      */     //   3502: invokevirtual func_78785_a : (F)V
/*      */     //   3505: aload_0
/*      */     //   3506: getfield LRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3509: fload #7
/*      */     //   3511: invokevirtual func_78785_a : (F)V
/*      */     //   3514: aload_0
/*      */     //   3515: getfield LCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3518: fload #7
/*      */     //   3520: invokevirtual func_78785_a : (F)V
/*      */     //   3523: aload_0
/*      */     //   3524: getfield LLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3527: fload #7
/*      */     //   3529: invokevirtual func_78785_a : (F)V
/*      */     //   3532: aload_0
/*      */     //   3533: getfield TailSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3536: fload #7
/*      */     //   3538: invokevirtual func_78785_a : (F)V
/*      */     //   3541: aload_0
/*      */     //   3542: getfield LRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3545: fload #7
/*      */     //   3547: invokevirtual func_78785_a : (F)V
/*      */     //   3550: aload_0
/*      */     //   3551: getfield LClawRear : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3554: fload #7
/*      */     //   3556: invokevirtual func_78785_a : (F)V
/*      */     //   3559: aload_0
/*      */     //   3560: getfield NeckL1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3563: fload #7
/*      */     //   3565: invokevirtual func_78785_a : (F)V
/*      */     //   3568: aload_0
/*      */     //   3569: getfield NeckR1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3572: fload #7
/*      */     //   3574: invokevirtual func_78785_a : (F)V
/*      */     //   3577: aload_0
/*      */     //   3578: getfield RThigh : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3581: fload #7
/*      */     //   3583: invokevirtual func_78785_a : (F)V
/*      */     //   3586: aload_0
/*      */     //   3587: getfield RUpperLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3590: fload #7
/*      */     //   3592: invokevirtual func_78785_a : (F)V
/*      */     //   3595: aload_0
/*      */     //   3596: getfield RLowerLeg : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3599: fload #7
/*      */     //   3601: invokevirtual func_78785_a : (F)V
/*      */     //   3604: aload_0
/*      */     //   3605: getfield RFoot : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3608: fload #7
/*      */     //   3610: invokevirtual func_78785_a : (F)V
/*      */     //   3613: aload_0
/*      */     //   3614: getfield RClawRear : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3617: fload #7
/*      */     //   3619: invokevirtual func_78785_a : (F)V
/*      */     //   3622: aload_0
/*      */     //   3623: getfield RLClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3626: fload #7
/*      */     //   3628: invokevirtual func_78785_a : (F)V
/*      */     //   3631: aload_0
/*      */     //   3632: getfield RCClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3635: fload #7
/*      */     //   3637: invokevirtual func_78785_a : (F)V
/*      */     //   3640: aload_0
/*      */     //   3641: getfield RRClaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3644: fload #7
/*      */     //   3646: invokevirtual func_78785_a : (F)V
/*      */     //   3649: aload_0
/*      */     //   3650: getfield RLClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3653: fload #7
/*      */     //   3655: invokevirtual func_78785_a : (F)V
/*      */     //   3658: aload_0
/*      */     //   3659: getfield RCClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3662: fload #7
/*      */     //   3664: invokevirtual func_78785_a : (F)V
/*      */     //   3667: aload_0
/*      */     //   3668: getfield RRClaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3671: fload #7
/*      */     //   3673: invokevirtual func_78785_a : (F)V
/*      */     //   3676: aload_0
/*      */     //   3677: getfield NeckL2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3680: fload #7
/*      */     //   3682: invokevirtual func_78785_a : (F)V
/*      */     //   3685: aload_0
/*      */     //   3686: getfield NeckC2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3689: fload #7
/*      */     //   3691: invokevirtual func_78785_a : (F)V
/*      */     //   3694: aload_0
/*      */     //   3695: getfield NeckR2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3698: fload #7
/*      */     //   3700: invokevirtual func_78785_a : (F)V
/*      */     //   3703: aload_0
/*      */     //   3704: getfield NeckL3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3707: fload #7
/*      */     //   3709: invokevirtual func_78785_a : (F)V
/*      */     //   3712: aload_0
/*      */     //   3713: getfield NeckC3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3716: fload #7
/*      */     //   3718: invokevirtual func_78785_a : (F)V
/*      */     //   3721: aload_0
/*      */     //   3722: getfield NeckR3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3725: fload #7
/*      */     //   3727: invokevirtual func_78785_a : (F)V
/*      */     //   3730: aload_0
/*      */     //   3731: getfield NeckL4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3734: fload #7
/*      */     //   3736: invokevirtual func_78785_a : (F)V
/*      */     //   3739: aload_0
/*      */     //   3740: getfield LHead1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3743: fload #7
/*      */     //   3745: invokevirtual func_78785_a : (F)V
/*      */     //   3748: aload_0
/*      */     //   3749: getfield LHead2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3752: fload #7
/*      */     //   3754: invokevirtual func_78785_a : (F)V
/*      */     //   3757: aload_0
/*      */     //   3758: getfield LHead3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3761: fload #7
/*      */     //   3763: invokevirtual func_78785_a : (F)V
/*      */     //   3766: aload_0
/*      */     //   3767: getfield LJaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3770: fload #7
/*      */     //   3772: invokevirtual func_78785_a : (F)V
/*      */     //   3775: aload_0
/*      */     //   3776: getfield LJaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3779: fload #7
/*      */     //   3781: invokevirtual func_78785_a : (F)V
/*      */     //   3784: aload_0
/*      */     //   3785: getfield LJaw3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3788: fload #7
/*      */     //   3790: invokevirtual func_78785_a : (F)V
/*      */     //   3793: aload_0
/*      */     //   3794: getfield LTooth1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3797: fload #7
/*      */     //   3799: invokevirtual func_78785_a : (F)V
/*      */     //   3802: aload_0
/*      */     //   3803: getfield LTooth2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3806: fload #7
/*      */     //   3808: invokevirtual func_78785_a : (F)V
/*      */     //   3811: aload_0
/*      */     //   3812: getfield LTooth3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3815: fload #7
/*      */     //   3817: invokevirtual func_78785_a : (F)V
/*      */     //   3820: aload_0
/*      */     //   3821: getfield LTooth4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3824: fload #7
/*      */     //   3826: invokevirtual func_78785_a : (F)V
/*      */     //   3829: aload_0
/*      */     //   3830: getfield NeckC4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3833: fload #7
/*      */     //   3835: invokevirtual func_78785_a : (F)V
/*      */     //   3838: aload_0
/*      */     //   3839: getfield NeckR4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3842: fload #7
/*      */     //   3844: invokevirtual func_78785_a : (F)V
/*      */     //   3847: aload_0
/*      */     //   3848: getfield CHead1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3851: fload #7
/*      */     //   3853: invokevirtual func_78785_a : (F)V
/*      */     //   3856: aload_0
/*      */     //   3857: getfield RHead1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3860: fload #7
/*      */     //   3862: invokevirtual func_78785_a : (F)V
/*      */     //   3865: aload_0
/*      */     //   3866: getfield CHead2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3869: fload #7
/*      */     //   3871: invokevirtual func_78785_a : (F)V
/*      */     //   3874: aload_0
/*      */     //   3875: getfield RHead2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3878: fload #7
/*      */     //   3880: invokevirtual func_78785_a : (F)V
/*      */     //   3883: aload_0
/*      */     //   3884: getfield CHead3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3887: fload #7
/*      */     //   3889: invokevirtual func_78785_a : (F)V
/*      */     //   3892: aload_0
/*      */     //   3893: getfield RHead3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3896: fload #7
/*      */     //   3898: invokevirtual func_78785_a : (F)V
/*      */     //   3901: aload_0
/*      */     //   3902: getfield CJaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3905: fload #7
/*      */     //   3907: invokevirtual func_78785_a : (F)V
/*      */     //   3910: aload_0
/*      */     //   3911: getfield CJaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3914: fload #7
/*      */     //   3916: invokevirtual func_78785_a : (F)V
/*      */     //   3919: aload_0
/*      */     //   3920: getfield CJaw3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3923: fload #7
/*      */     //   3925: invokevirtual func_78785_a : (F)V
/*      */     //   3928: aload_0
/*      */     //   3929: getfield RJaw1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3932: fload #7
/*      */     //   3934: invokevirtual func_78785_a : (F)V
/*      */     //   3937: aload_0
/*      */     //   3938: getfield RJaw2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3941: fload #7
/*      */     //   3943: invokevirtual func_78785_a : (F)V
/*      */     //   3946: aload_0
/*      */     //   3947: getfield RJaw3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3950: fload #7
/*      */     //   3952: invokevirtual func_78785_a : (F)V
/*      */     //   3955: aload_0
/*      */     //   3956: getfield CTooth3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3959: fload #7
/*      */     //   3961: invokevirtual func_78785_a : (F)V
/*      */     //   3964: aload_0
/*      */     //   3965: getfield CTooth4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3968: fload #7
/*      */     //   3970: invokevirtual func_78785_a : (F)V
/*      */     //   3973: aload_0
/*      */     //   3974: getfield CTooth1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3977: fload #7
/*      */     //   3979: invokevirtual func_78785_a : (F)V
/*      */     //   3982: aload_0
/*      */     //   3983: getfield CTooth2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3986: fload #7
/*      */     //   3988: invokevirtual func_78785_a : (F)V
/*      */     //   3991: aload_0
/*      */     //   3992: getfield RTooth3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   3995: fload #7
/*      */     //   3997: invokevirtual func_78785_a : (F)V
/*      */     //   4000: aload_0
/*      */     //   4001: getfield RTooth4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4004: fload #7
/*      */     //   4006: invokevirtual func_78785_a : (F)V
/*      */     //   4009: aload_0
/*      */     //   4010: getfield RTooth1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4013: fload #7
/*      */     //   4015: invokevirtual func_78785_a : (F)V
/*      */     //   4018: aload_0
/*      */     //   4019: getfield RTooth2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4022: fload #7
/*      */     //   4024: invokevirtual func_78785_a : (F)V
/*      */     //   4027: aload_0
/*      */     //   4028: getfield LLEye : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4031: fload #7
/*      */     //   4033: invokevirtual func_78785_a : (F)V
/*      */     //   4036: aload_0
/*      */     //   4037: getfield LREye : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4040: fload #7
/*      */     //   4042: invokevirtual func_78785_a : (F)V
/*      */     //   4045: aload_0
/*      */     //   4046: getfield CLEye : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4049: fload #7
/*      */     //   4051: invokevirtual func_78785_a : (F)V
/*      */     //   4054: aload_0
/*      */     //   4055: getfield CREye : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4058: fload #7
/*      */     //   4060: invokevirtual func_78785_a : (F)V
/*      */     //   4063: aload_0
/*      */     //   4064: getfield RLEye : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4067: fload #7
/*      */     //   4069: invokevirtual func_78785_a : (F)V
/*      */     //   4072: aload_0
/*      */     //   4073: getfield RREye : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4076: fload #7
/*      */     //   4078: invokevirtual func_78785_a : (F)V
/*      */     //   4081: aload_0
/*      */     //   4082: getfield LHeadMane : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4085: fload #7
/*      */     //   4087: invokevirtual func_78785_a : (F)V
/*      */     //   4090: aload_0
/*      */     //   4091: getfield CHeadMane : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4094: fload #7
/*      */     //   4096: invokevirtual func_78785_a : (F)V
/*      */     //   4099: aload_0
/*      */     //   4100: getfield RHeadMane : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4103: fload #7
/*      */     //   4105: invokevirtual func_78785_a : (F)V
/*      */     //   4108: aload_0
/*      */     //   4109: getfield LLNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4112: fload #7
/*      */     //   4114: invokevirtual func_78785_a : (F)V
/*      */     //   4117: aload_0
/*      */     //   4118: getfield LRNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4121: fload #7
/*      */     //   4123: invokevirtual func_78785_a : (F)V
/*      */     //   4126: aload_0
/*      */     //   4127: getfield CLNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4130: fload #7
/*      */     //   4132: invokevirtual func_78785_a : (F)V
/*      */     //   4135: aload_0
/*      */     //   4136: getfield CRNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4139: fload #7
/*      */     //   4141: invokevirtual func_78785_a : (F)V
/*      */     //   4144: aload_0
/*      */     //   4145: getfield RLNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4148: fload #7
/*      */     //   4150: invokevirtual func_78785_a : (F)V
/*      */     //   4153: aload_0
/*      */     //   4154: getfield RRNoseSpike : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4157: fload #7
/*      */     //   4159: invokevirtual func_78785_a : (F)V
/*      */     //   4162: aload_0
/*      */     //   4163: getfield Back1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4166: fload #7
/*      */     //   4168: invokevirtual func_78785_a : (F)V
/*      */     //   4171: aload_0
/*      */     //   4172: getfield Back2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4175: fload #7
/*      */     //   4177: invokevirtual func_78785_a : (F)V
/*      */     //   4180: aload_0
/*      */     //   4181: getfield Lwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4184: fload #7
/*      */     //   4186: invokevirtual func_78785_a : (F)V
/*      */     //   4189: aload_0
/*      */     //   4190: getfield Lwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4193: fload #7
/*      */     //   4195: invokevirtual func_78785_a : (F)V
/*      */     //   4198: aload_0
/*      */     //   4199: getfield Lwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4202: fload #7
/*      */     //   4204: invokevirtual func_78785_a : (F)V
/*      */     //   4207: aload_0
/*      */     //   4208: getfield Lwing7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4211: fload #7
/*      */     //   4213: invokevirtual func_78785_a : (F)V
/*      */     //   4216: aload_0
/*      */     //   4217: getfield Lwing9 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4220: fload #7
/*      */     //   4222: invokevirtual func_78785_a : (F)V
/*      */     //   4225: aload_0
/*      */     //   4226: getfield Rwing1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4229: fload #7
/*      */     //   4231: invokevirtual func_78785_a : (F)V
/*      */     //   4234: aload_0
/*      */     //   4235: getfield Rwing3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4238: fload #7
/*      */     //   4240: invokevirtual func_78785_a : (F)V
/*      */     //   4243: aload_0
/*      */     //   4244: getfield Rwing5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4247: fload #7
/*      */     //   4249: invokevirtual func_78785_a : (F)V
/*      */     //   4252: aload_0
/*      */     //   4253: getfield Rwing7 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4256: fload #7
/*      */     //   4258: invokevirtual func_78785_a : (F)V
/*      */     //   4261: aload_0
/*      */     //   4262: getfield Rwing9 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4265: fload #7
/*      */     //   4267: invokevirtual func_78785_a : (F)V
/*      */     //   4270: aload_0
/*      */     //   4271: getfield TailTip2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4274: fload #7
/*      */     //   4276: invokevirtual func_78785_a : (F)V
/*      */     //   4279: aload_0
/*      */     //   4280: getfield Ridge1 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4283: fload #7
/*      */     //   4285: invokevirtual func_78785_a : (F)V
/*      */     //   4288: aload_0
/*      */     //   4289: getfield Ridge2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4292: fload #7
/*      */     //   4294: invokevirtual func_78785_a : (F)V
/*      */     //   4297: aload_0
/*      */     //   4298: getfield Ridge3 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4301: fload #7
/*      */     //   4303: invokevirtual func_78785_a : (F)V
/*      */     //   4306: aload_0
/*      */     //   4307: getfield Ridge4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4310: fload #7
/*      */     //   4312: invokevirtual func_78785_a : (F)V
/*      */     //   4315: aload_0
/*      */     //   4316: getfield Ridge5 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4319: fload #7
/*      */     //   4321: invokevirtual func_78785_a : (F)V
/*      */     //   4324: aload_0
/*      */     //   4325: getfield Ridge6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4328: fload #7
/*      */     //   4330: invokevirtual func_78785_a : (F)V
/*      */     //   4333: invokestatic glPushMatrix : ()V
/*      */     //   4336: sipush #2977
/*      */     //   4339: invokestatic glEnable : (I)V
/*      */     //   4342: sipush #3042
/*      */     //   4345: invokestatic glEnable : (I)V
/*      */     //   4348: sipush #770
/*      */     //   4351: sipush #771
/*      */     //   4354: invokestatic glBlendFunc : (II)V
/*      */     //   4357: ldc_w 0.75
/*      */     //   4360: ldc_w 0.75
/*      */     //   4363: ldc_w 0.75
/*      */     //   4366: ldc_w 0.55
/*      */     //   4369: invokestatic glColor4f : (FFFF)V
/*      */     //   4372: aload_0
/*      */     //   4373: getfield Lwing2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4376: fload #7
/*      */     //   4378: invokevirtual func_78785_a : (F)V
/*      */     //   4381: aload_0
/*      */     //   4382: getfield Lwing4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4385: fload #7
/*      */     //   4387: invokevirtual func_78785_a : (F)V
/*      */     //   4390: aload_0
/*      */     //   4391: getfield Lwing6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4394: fload #7
/*      */     //   4396: invokevirtual func_78785_a : (F)V
/*      */     //   4399: aload_0
/*      */     //   4400: getfield Lwing8 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4403: fload #7
/*      */     //   4405: invokevirtual func_78785_a : (F)V
/*      */     //   4408: aload_0
/*      */     //   4409: getfield Lwing10 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4412: fload #7
/*      */     //   4414: invokevirtual func_78785_a : (F)V
/*      */     //   4417: aload_0
/*      */     //   4418: getfield Rwing2 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4421: fload #7
/*      */     //   4423: invokevirtual func_78785_a : (F)V
/*      */     //   4426: aload_0
/*      */     //   4427: getfield Rwing4 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4430: fload #7
/*      */     //   4432: invokevirtual func_78785_a : (F)V
/*      */     //   4435: aload_0
/*      */     //   4436: getfield Rwing6 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4439: fload #7
/*      */     //   4441: invokevirtual func_78785_a : (F)V
/*      */     //   4444: aload_0
/*      */     //   4445: getfield Rwing8 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4448: fload #7
/*      */     //   4450: invokevirtual func_78785_a : (F)V
/*      */     //   4453: aload_0
/*      */     //   4454: getfield Rwing10 : Lnet/minecraft/client/model/ModelRenderer;
/*      */     //   4457: fload #7
/*      */     //   4459: invokevirtual func_78785_a : (F)V
/*      */     //   4462: sipush #3042
/*      */     //   4465: invokestatic glDisable : (I)V
/*      */     //   4468: invokestatic glPopMatrix : ()V
/*      */     //   4471: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #863	-> 0
/*      */     //   #864	-> 3
/*      */     //   #865	-> 9
/*      */     //   #866	-> 14
/*      */     //   #867	-> 19
/*      */     //   #868	-> 23
/*      */     //   #869	-> 26
/*      */     //   #870	-> 29
/*      */     //   #871	-> 32
/*      */     //   #872	-> 35
/*      */     //   #873	-> 38
/*      */     //   #874	-> 41
/*      */     //   #875	-> 44
/*      */     //   #876	-> 47
/*      */     //   #878	-> 50
/*      */     //   #879	-> 65
/*      */     //   #881	-> 80
/*      */     //   #882	-> 88
/*      */     //   #884	-> 115
/*      */     //   #888	-> 139
/*      */     //   #889	-> 148
/*      */     //   #890	-> 157
/*      */     //   #891	-> 174
/*      */     //   #892	-> 205
/*      */     //   #893	-> 236
/*      */     //   #894	-> 250
/*      */     //   #895	-> 264
/*      */     //   #896	-> 278
/*      */     //   #897	-> 295
/*      */     //   #898	-> 326
/*      */     //   #899	-> 357
/*      */     //   #900	-> 371
/*      */     //   #901	-> 385
/*      */     //   #902	-> 399
/*      */     //   #903	-> 421
/*      */     //   #904	-> 443
/*      */     //   #905	-> 465
/*      */     //   #906	-> 487
/*      */     //   #907	-> 513
/*      */     //   #909	-> 539
/*      */     //   #910	-> 549
/*      */     //   #911	-> 559
/*      */     //   #912	-> 577
/*      */     //   #913	-> 608
/*      */     //   #914	-> 639
/*      */     //   #915	-> 653
/*      */     //   #916	-> 667
/*      */     //   #917	-> 681
/*      */     //   #918	-> 699
/*      */     //   #919	-> 730
/*      */     //   #920	-> 761
/*      */     //   #921	-> 775
/*      */     //   #922	-> 789
/*      */     //   #923	-> 803
/*      */     //   #924	-> 825
/*      */     //   #925	-> 847
/*      */     //   #926	-> 869
/*      */     //   #927	-> 891
/*      */     //   #928	-> 917
/*      */     //   #930	-> 943
/*      */     //   #931	-> 951
/*      */     //   #933	-> 978
/*      */     //   #936	-> 981
/*      */     //   #938	-> 1002
/*      */     //   #939	-> 1015
/*      */     //   #940	-> 1028
/*      */     //   #941	-> 1041
/*      */     //   #942	-> 1054
/*      */     //   #943	-> 1067
/*      */     //   #945	-> 1080
/*      */     //   #946	-> 1093
/*      */     //   #947	-> 1106
/*      */     //   #948	-> 1119
/*      */     //   #949	-> 1132
/*      */     //   #950	-> 1145
/*      */     //   #952	-> 1158
/*      */     //   #953	-> 1166
/*      */     //   #955	-> 1193
/*      */     //   #958	-> 1196
/*      */     //   #959	-> 1221
/*      */     //   #960	-> 1244
/*      */     //   #961	-> 1283
/*      */     //   #962	-> 1322
/*      */     //   #963	-> 1365
/*      */     //   #964	-> 1408
/*      */     //   #965	-> 1430
/*      */     //   #966	-> 1452
/*      */     //   #967	-> 1474
/*      */     //   #968	-> 1496
/*      */     //   #969	-> 1531
/*      */     //   #971	-> 1566
/*      */     //   #972	-> 1591
/*      */     //   #973	-> 1614
/*      */     //   #974	-> 1653
/*      */     //   #975	-> 1692
/*      */     //   #976	-> 1735
/*      */     //   #977	-> 1778
/*      */     //   #978	-> 1800
/*      */     //   #979	-> 1822
/*      */     //   #980	-> 1844
/*      */     //   #981	-> 1866
/*      */     //   #982	-> 1901
/*      */     //   #985	-> 1936
/*      */     //   #986	-> 1944
/*      */     //   #987	-> 1949
/*      */     //   #990	-> 1954
/*      */     //   #991	-> 1983
/*      */     //   #993	-> 2005
/*      */     //   #994	-> 2036
/*      */     //   #995	-> 2069
/*      */     //   #997	-> 2099
/*      */     //   #998	-> 2130
/*      */     //   #999	-> 2161
/*      */     //   #1001	-> 2193
/*      */     //   #1002	-> 2224
/*      */     //   #1003	-> 2255
/*      */     //   #1005	-> 2289
/*      */     //   #1006	-> 2318
/*      */     //   #1007	-> 2324
/*      */     //   #1008	-> 2355
/*      */     //   #1009	-> 2386
/*      */     //   #1011	-> 2403
/*      */     //   #1012	-> 2434
/*      */     //   #1013	-> 2465
/*      */     //   #1015	-> 2482
/*      */     //   #1016	-> 2520
/*      */     //   #1017	-> 2558
/*      */     //   #1019	-> 2583
/*      */     //   #1020	-> 2622
/*      */     //   #1021	-> 2661
/*      */     //   #1023	-> 2686
/*      */     //   #1024	-> 2717
/*      */     //   #1025	-> 2748
/*      */     //   #1029	-> 2765
/*      */     //   #1030	-> 2773
/*      */     //   #1031	-> 2797
/*      */     //   #1032	-> 2821
/*      */     //   #1034	-> 2845
/*      */     //   #1035	-> 2869
/*      */     //   #1036	-> 2893
/*      */     //   #1038	-> 2917
/*      */     //   #1039	-> 2941
/*      */     //   #1040	-> 2965
/*      */     //   #1042	-> 2989
/*      */     //   #1043	-> 2997
/*      */     //   #1044	-> 3004
/*      */     //   #1045	-> 3012
/*      */     //   #1046	-> 3019
/*      */     //   #1047	-> 3027
/*      */     //   #1049	-> 3037
/*      */     //   #1050	-> 3061
/*      */     //   #1051	-> 3085
/*      */     //   #1053	-> 3109
/*      */     //   #1054	-> 3133
/*      */     //   #1055	-> 3157
/*      */     //   #1057	-> 3181
/*      */     //   #1058	-> 3205
/*      */     //   #1059	-> 3229
/*      */     //   #1061	-> 3253
/*      */     //   #1062	-> 3261
/*      */     //   #1063	-> 3268
/*      */     //   #1064	-> 3276
/*      */     //   #1065	-> 3283
/*      */     //   #1066	-> 3291
/*      */     //   #1070	-> 3298
/*      */     //   #1071	-> 3310
/*      */     //   #1074	-> 3322
/*      */     //   #1075	-> 3332
/*      */     //   #1076	-> 3342
/*      */     //   #1083	-> 3352
/*      */     //   #1084	-> 3361
/*      */     //   #1085	-> 3370
/*      */     //   #1086	-> 3379
/*      */     //   #1087	-> 3388
/*      */     //   #1088	-> 3397
/*      */     //   #1089	-> 3406
/*      */     //   #1090	-> 3415
/*      */     //   #1091	-> 3424
/*      */     //   #1092	-> 3433
/*      */     //   #1093	-> 3442
/*      */     //   #1094	-> 3451
/*      */     //   #1095	-> 3460
/*      */     //   #1096	-> 3469
/*      */     //   #1097	-> 3478
/*      */     //   #1098	-> 3487
/*      */     //   #1099	-> 3496
/*      */     //   #1100	-> 3505
/*      */     //   #1101	-> 3514
/*      */     //   #1102	-> 3523
/*      */     //   #1103	-> 3532
/*      */     //   #1104	-> 3541
/*      */     //   #1105	-> 3550
/*      */     //   #1106	-> 3559
/*      */     //   #1107	-> 3568
/*      */     //   #1108	-> 3577
/*      */     //   #1109	-> 3586
/*      */     //   #1110	-> 3595
/*      */     //   #1111	-> 3604
/*      */     //   #1112	-> 3613
/*      */     //   #1113	-> 3622
/*      */     //   #1114	-> 3631
/*      */     //   #1115	-> 3640
/*      */     //   #1116	-> 3649
/*      */     //   #1117	-> 3658
/*      */     //   #1118	-> 3667
/*      */     //   #1119	-> 3676
/*      */     //   #1120	-> 3685
/*      */     //   #1121	-> 3694
/*      */     //   #1122	-> 3703
/*      */     //   #1123	-> 3712
/*      */     //   #1124	-> 3721
/*      */     //   #1125	-> 3730
/*      */     //   #1126	-> 3739
/*      */     //   #1127	-> 3748
/*      */     //   #1128	-> 3757
/*      */     //   #1129	-> 3766
/*      */     //   #1130	-> 3775
/*      */     //   #1131	-> 3784
/*      */     //   #1132	-> 3793
/*      */     //   #1133	-> 3802
/*      */     //   #1134	-> 3811
/*      */     //   #1135	-> 3820
/*      */     //   #1136	-> 3829
/*      */     //   #1137	-> 3838
/*      */     //   #1138	-> 3847
/*      */     //   #1139	-> 3856
/*      */     //   #1140	-> 3865
/*      */     //   #1141	-> 3874
/*      */     //   #1142	-> 3883
/*      */     //   #1143	-> 3892
/*      */     //   #1144	-> 3901
/*      */     //   #1145	-> 3910
/*      */     //   #1146	-> 3919
/*      */     //   #1147	-> 3928
/*      */     //   #1148	-> 3937
/*      */     //   #1149	-> 3946
/*      */     //   #1150	-> 3955
/*      */     //   #1151	-> 3964
/*      */     //   #1152	-> 3973
/*      */     //   #1153	-> 3982
/*      */     //   #1154	-> 3991
/*      */     //   #1155	-> 4000
/*      */     //   #1156	-> 4009
/*      */     //   #1157	-> 4018
/*      */     //   #1158	-> 4027
/*      */     //   #1159	-> 4036
/*      */     //   #1160	-> 4045
/*      */     //   #1161	-> 4054
/*      */     //   #1162	-> 4063
/*      */     //   #1163	-> 4072
/*      */     //   #1164	-> 4081
/*      */     //   #1165	-> 4090
/*      */     //   #1166	-> 4099
/*      */     //   #1167	-> 4108
/*      */     //   #1168	-> 4117
/*      */     //   #1169	-> 4126
/*      */     //   #1170	-> 4135
/*      */     //   #1171	-> 4144
/*      */     //   #1172	-> 4153
/*      */     //   #1173	-> 4162
/*      */     //   #1174	-> 4171
/*      */     //   #1175	-> 4180
/*      */     //   #1176	-> 4189
/*      */     //   #1177	-> 4198
/*      */     //   #1178	-> 4207
/*      */     //   #1179	-> 4216
/*      */     //   #1180	-> 4225
/*      */     //   #1181	-> 4234
/*      */     //   #1182	-> 4243
/*      */     //   #1183	-> 4252
/*      */     //   #1184	-> 4261
/*      */     //   #1185	-> 4270
/*      */     //   #1186	-> 4279
/*      */     //   #1187	-> 4288
/*      */     //   #1188	-> 4297
/*      */     //   #1189	-> 4306
/*      */     //   #1190	-> 4315
/*      */     //   #1191	-> 4324
/*      */     //   #1193	-> 4333
/*      */     //   #1194	-> 4336
/*      */     //   #1195	-> 4342
/*      */     //   #1196	-> 4348
/*      */     //   #1198	-> 4357
/*      */     //   #1199	-> 4372
/*      */     //   #1200	-> 4381
/*      */     //   #1201	-> 4390
/*      */     //   #1202	-> 4399
/*      */     //   #1203	-> 4408
/*      */     //   #1204	-> 4417
/*      */     //   #1205	-> 4426
/*      */     //   #1206	-> 4435
/*      */     //   #1207	-> 4444
/*      */     //   #1208	-> 4453
/*      */     //   #1209	-> 4462
/*      */     //   #1210	-> 4468
/*      */     //   #1213	-> 4471
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	4472	0	this	Ldanger/orespawn/ModelTheKing;
/*      */     //   0	4472	1	entity	Lnet/minecraft/entity/Entity;
/*      */     //   0	4472	2	f	F
/*      */     //   0	4472	3	f1	F
/*      */     //   0	4472	4	f2	F
/*      */     //   0	4472	5	f3	F
/*      */     //   0	4472	6	f4	F
/*      */     //   0	4472	7	f5	F
/*      */     //   3	4469	8	newangle	F
/*      */     //   9	4463	9	k	Ldanger/orespawn/TheKing;
/*      */     //   14	4458	10	tailspeed	F
/*      */     //   19	4453	11	tailamp	F
/*      */     //   23	4449	12	pi4	F
/*      */     //   26	4446	13	Lheadlr	F
/*      */     //   29	4443	14	Lheadud	F
/*      */     //   32	4440	15	Ljawangle	F
/*      */     //   35	4437	16	Cheadlr	F
/*      */     //   38	4434	17	Cheadud	F
/*      */     //   41	4431	18	Cjawangle	F
/*      */     //   44	4428	19	Rheadlr	F
/*      */     //   47	4425	20	Rheadud	F
/*      */     //   50	4422	21	Rjawangle	F
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 1217 */     model.field_78795_f = x;
/* 1218 */     model.field_78796_g = y;
/* 1219 */     model.field_78808_h = z;
/*      */   }
/*      */ 
/*      */   
/*      */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 1224 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void moveLeftHead(float Lheadlr, float Lheadud, float Ljawangle) {
/* 1232 */     this.LJaw1.field_78795_f = Ljawangle;
/* 1233 */     this.LJaw2.field_78795_f = Ljawangle;
/* 1234 */     this.LJaw3.field_78795_f = Ljawangle;
/* 1235 */     this.LTooth1.field_78795_f = Ljawangle;
/* 1236 */     this.LTooth2.field_78795_f = Ljawangle;
/* 1237 */     this.LTooth3.field_78795_f = Ljawangle;
/* 1238 */     this.LTooth4.field_78795_f = Ljawangle;
/*      */ 
/*      */ 
/*      */     
/* 1242 */     this.NeckL1.field_78796_g = Lheadlr * 0.125F;
/* 1243 */     this.NeckL1.field_78798_e -= (float)Math.cos(this.NeckL1.field_78796_g) * 20.0F;
/* 1244 */     this.NeckL1.field_78800_c -= (float)Math.sin(this.NeckL1.field_78796_g) * 20.0F;
/* 1245 */     this.NeckL2.field_78796_g = Lheadlr * 0.25F;
/* 1246 */     this.NeckL2.field_78798_e -= (float)Math.cos(this.NeckL2.field_78796_g) * 36.0F;
/* 1247 */     this.NeckL2.field_78800_c -= (float)Math.sin(this.NeckL2.field_78796_g) * 36.0F;
/* 1248 */     this.NeckL3.field_78796_g = Lheadlr * 0.38F;
/* 1249 */     this.NeckL3.field_78798_e -= (float)Math.cos(this.NeckL3.field_78796_g) * 36.0F;
/* 1250 */     this.NeckL3.field_78800_c -= (float)Math.sin(this.NeckL3.field_78796_g) * 36.0F;
/* 1251 */     this.NeckL4.field_78796_g = Lheadlr * 0.5F;
/* 1252 */     this.NeckL4.field_78798_e -= (float)Math.cos(this.NeckL4.field_78796_g) * 36.0F;
/* 1253 */     this.NeckL4.field_78800_c -= (float)Math.sin(this.NeckL4.field_78796_g) * 36.0F;
/* 1254 */     this.LHead1.field_78796_g = Lheadlr;
/*      */     
/* 1256 */     this.LHead2.field_78796_g = Lheadlr;
/* 1257 */     this.LHead2.field_78798_e = this.LHead1.field_78798_e;
/* 1258 */     this.LHead2.field_78800_c = this.LHead1.field_78800_c;
/* 1259 */     this.LHead3.field_78796_g = Lheadlr;
/* 1260 */     this.LHead3.field_78798_e = this.LHead1.field_78798_e;
/* 1261 */     this.LHead3.field_78800_c = this.LHead1.field_78800_c;
/* 1262 */     this.LHeadMane.field_78796_g = Lheadlr;
/* 1263 */     this.LHeadMane.field_78798_e = this.LHead1.field_78798_e;
/* 1264 */     this.LHeadMane.field_78800_c = this.LHead1.field_78800_c;
/* 1265 */     this.LLEye.field_78796_g = Lheadlr;
/* 1266 */     this.LLEye.field_78798_e = this.LHead1.field_78798_e;
/* 1267 */     this.LLEye.field_78800_c = this.LHead1.field_78800_c;
/* 1268 */     this.LREye.field_78796_g = Lheadlr;
/* 1269 */     this.LREye.field_78798_e = this.LHead1.field_78798_e;
/* 1270 */     this.LREye.field_78800_c = this.LHead1.field_78800_c;
/* 1271 */     this.LLNoseSpike.field_78796_g = 0.244F + Lheadlr;
/* 1272 */     this.LLNoseSpike.field_78798_e = this.LHead1.field_78798_e;
/* 1273 */     this.LLNoseSpike.field_78800_c = this.LHead1.field_78800_c;
/* 1274 */     this.LRNoseSpike.field_78796_g = -0.261F + Lheadlr;
/* 1275 */     this.LRNoseSpike.field_78798_e = this.LHead1.field_78798_e;
/* 1276 */     this.LRNoseSpike.field_78800_c = this.LHead1.field_78800_c;
/*      */ 
/*      */     
/* 1279 */     this.LJaw1.field_78796_g = Lheadlr;
/* 1280 */     this.NeckL4.field_78798_e -= (float)Math.cos(this.NeckL4.field_78796_g) * 37.0F;
/* 1281 */     this.NeckL4.field_78800_c -= (float)Math.sin(this.NeckL4.field_78796_g) * 37.0F;
/*      */     
/* 1283 */     this.LJaw2.field_78796_g = Lheadlr;
/* 1284 */     this.LJaw2.field_78798_e = this.LJaw1.field_78798_e;
/* 1285 */     this.LJaw2.field_78800_c = this.LJaw1.field_78800_c;
/* 1286 */     this.LJaw3.field_78796_g = Lheadlr;
/* 1287 */     this.LJaw3.field_78798_e = this.LJaw1.field_78798_e;
/* 1288 */     this.LJaw3.field_78800_c = this.LJaw1.field_78800_c;
/* 1289 */     this.LTooth1.field_78796_g = Lheadlr;
/* 1290 */     this.LTooth1.field_78798_e = this.LJaw1.field_78798_e;
/* 1291 */     this.LTooth1.field_78800_c = this.LJaw1.field_78800_c;
/* 1292 */     this.LTooth2.field_78796_g = Lheadlr;
/* 1293 */     this.LTooth2.field_78798_e = this.LJaw1.field_78798_e;
/* 1294 */     this.LTooth2.field_78800_c = this.LJaw1.field_78800_c;
/* 1295 */     this.LTooth3.field_78796_g = Lheadlr;
/* 1296 */     this.LTooth3.field_78798_e = this.LJaw1.field_78798_e;
/* 1297 */     this.LTooth3.field_78800_c = this.LJaw1.field_78800_c;
/* 1298 */     this.LTooth4.field_78796_g = Lheadlr;
/* 1299 */     this.LTooth4.field_78798_e = this.LJaw1.field_78798_e;
/* 1300 */     this.LTooth4.field_78800_c = this.LJaw1.field_78800_c;
/*      */ 
/*      */ 
/*      */     
/* 1304 */     this.NeckL1.field_78795_f = Lheadud * 0.125F;
/* 1305 */     this.NeckL1.field_78797_d += (float)Math.sin(this.NeckL1.field_78795_f) * 20.0F;
/* 1306 */     this.NeckL1.field_78798_e += (this.NeckL2.field_78798_e - this.NeckL1.field_78798_e) * (float)Math.cos(this.NeckL1.field_78795_f);
/* 1307 */     this.NeckL1.field_78800_c += (this.NeckL2.field_78800_c - this.NeckL1.field_78800_c) * (float)Math.cos(this.NeckL1.field_78795_f);
/* 1308 */     this.NeckL2.field_78795_f = Lheadud * 0.25F;
/* 1309 */     this.NeckL2.field_78797_d += (float)Math.sin(this.NeckL2.field_78795_f) * 36.0F;
/* 1310 */     this.NeckL2.field_78798_e += (this.NeckL3.field_78798_e - this.NeckL2.field_78798_e) * (float)Math.cos(this.NeckL2.field_78795_f);
/* 1311 */     this.NeckL2.field_78800_c += (this.NeckL3.field_78800_c - this.NeckL2.field_78800_c) * (float)Math.cos(this.NeckL2.field_78795_f);
/* 1312 */     this.NeckL3.field_78795_f = Lheadud * 0.38F;
/* 1313 */     this.NeckL3.field_78797_d += (float)Math.sin(this.NeckL3.field_78795_f) * 36.0F;
/* 1314 */     this.NeckL3.field_78798_e += (this.NeckL4.field_78798_e - this.NeckL3.field_78798_e) * (float)Math.cos(this.NeckL3.field_78795_f);
/* 1315 */     this.NeckL3.field_78800_c += (this.NeckL4.field_78800_c - this.NeckL3.field_78800_c) * (float)Math.cos(this.NeckL3.field_78795_f);
/* 1316 */     this.NeckL4.field_78795_f = Lheadud * 0.5F;
/* 1317 */     this.NeckL4.field_78797_d += (float)Math.sin(this.NeckL4.field_78795_f) * 36.0F;
/* 1318 */     this.NeckL4.field_78798_e += (this.LHead1.field_78798_e - this.NeckL4.field_78798_e) * (float)Math.cos(this.NeckL4.field_78795_f);
/* 1319 */     this.NeckL4.field_78800_c += (this.LHead1.field_78800_c - this.NeckL4.field_78800_c) * (float)Math.cos(this.NeckL4.field_78795_f);
/* 1320 */     this.LHead1.field_78795_f = Lheadud;
/*      */     
/* 1322 */     this.LHead2.field_78795_f = Lheadud;
/* 1323 */     this.LHead2.field_78798_e = this.LHead1.field_78798_e;
/* 1324 */     this.LHead2.field_78800_c = this.LHead1.field_78800_c;
/* 1325 */     this.LHead2.field_78797_d = this.LHead1.field_78797_d;
/* 1326 */     this.LHead3.field_78795_f = Lheadud;
/* 1327 */     this.LHead3.field_78798_e = this.LHead1.field_78798_e;
/* 1328 */     this.LHead3.field_78800_c = this.LHead1.field_78800_c;
/* 1329 */     this.LHead3.field_78797_d = this.LHead1.field_78797_d;
/* 1330 */     this.LHeadMane.field_78795_f = 0.384F + Lheadud;
/* 1331 */     this.LHeadMane.field_78798_e = this.LHead1.field_78798_e;
/* 1332 */     this.LHeadMane.field_78800_c = this.LHead1.field_78800_c;
/* 1333 */     this.LHeadMane.field_78797_d = this.LHead1.field_78797_d;
/* 1334 */     this.LLEye.field_78795_f = Lheadud;
/* 1335 */     this.LLEye.field_78798_e = this.LHead1.field_78798_e;
/* 1336 */     this.LLEye.field_78800_c = this.LHead1.field_78800_c;
/* 1337 */     this.LLEye.field_78797_d = this.LHead1.field_78797_d;
/* 1338 */     this.LREye.field_78795_f = Lheadud;
/* 1339 */     this.LREye.field_78798_e = this.LHead1.field_78798_e;
/* 1340 */     this.LREye.field_78800_c = this.LHead1.field_78800_c;
/* 1341 */     this.LREye.field_78797_d = this.LHead1.field_78797_d;
/* 1342 */     this.LLNoseSpike.field_78795_f = 0.244F + Lheadud;
/* 1343 */     this.LLNoseSpike.field_78798_e = this.LHead1.field_78798_e;
/* 1344 */     this.LLNoseSpike.field_78800_c = this.LHead1.field_78800_c;
/* 1345 */     this.LLNoseSpike.field_78797_d = this.LHead1.field_78797_d;
/* 1346 */     this.LRNoseSpike.field_78795_f = 0.261F + Lheadud;
/* 1347 */     this.LRNoseSpike.field_78798_e = this.LHead1.field_78798_e;
/* 1348 */     this.LRNoseSpike.field_78800_c = this.LHead1.field_78800_c;
/* 1349 */     this.LRNoseSpike.field_78797_d = this.LHead1.field_78797_d;
/*      */ 
/*      */     
/* 1352 */     this.LHead1.field_78797_d += (float)Math.cos(this.LHead1.field_78795_f) * 14.0F;
/* 1353 */     this.NeckL4.field_78798_e += (this.LJaw1.field_78798_e - this.NeckL4.field_78798_e) * (float)Math.cos(this.NeckL4.field_78795_f);
/* 1354 */     this.LJaw1.field_78798_e += (float)Math.sin(this.LHead1.field_78795_f) * 14.0F;
/* 1355 */     this.NeckL4.field_78800_c += (this.LJaw1.field_78800_c - this.NeckL4.field_78800_c) * (float)Math.cos(this.NeckL4.field_78795_f);
/*      */     
/* 1357 */     this.LJaw2.field_78798_e = this.LJaw1.field_78798_e;
/* 1358 */     this.LJaw2.field_78800_c = this.LJaw1.field_78800_c;
/* 1359 */     this.LJaw2.field_78797_d = this.LJaw1.field_78797_d;
/* 1360 */     this.LJaw3.field_78798_e = this.LJaw1.field_78798_e;
/* 1361 */     this.LJaw3.field_78800_c = this.LJaw1.field_78800_c;
/* 1362 */     this.LJaw3.field_78797_d = this.LJaw1.field_78797_d;
/* 1363 */     this.LTooth1.field_78798_e = this.LJaw1.field_78798_e;
/* 1364 */     this.LTooth1.field_78800_c = this.LJaw1.field_78800_c;
/* 1365 */     this.LTooth1.field_78797_d = this.LJaw1.field_78797_d;
/* 1366 */     this.LTooth2.field_78798_e = this.LJaw1.field_78798_e;
/* 1367 */     this.LTooth2.field_78800_c = this.LJaw1.field_78800_c;
/* 1368 */     this.LTooth2.field_78797_d = this.LJaw1.field_78797_d;
/* 1369 */     this.LTooth3.field_78798_e = this.LJaw1.field_78798_e;
/* 1370 */     this.LTooth3.field_78800_c = this.LJaw1.field_78800_c;
/* 1371 */     this.LTooth3.field_78797_d = this.LJaw1.field_78797_d;
/* 1372 */     this.LTooth4.field_78798_e = this.LJaw1.field_78798_e;
/* 1373 */     this.LTooth4.field_78800_c = this.LJaw1.field_78800_c;
/* 1374 */     this.LTooth4.field_78797_d = this.LJaw1.field_78797_d;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void moveCenterHead(float Cheadlr, float Cheadud, float Cjawangle) {
/* 1382 */     this.CJaw1.field_78795_f = Cjawangle;
/* 1383 */     this.CJaw2.field_78795_f = Cjawangle;
/* 1384 */     this.CJaw3.field_78795_f = Cjawangle;
/* 1385 */     this.CTooth1.field_78795_f = Cjawangle;
/* 1386 */     this.CTooth2.field_78795_f = Cjawangle;
/* 1387 */     this.CTooth3.field_78795_f = Cjawangle;
/* 1388 */     this.CTooth4.field_78795_f = Cjawangle;
/*      */ 
/*      */ 
/*      */     
/* 1392 */     this.NeckC1.field_78796_g = Cheadlr * 0.125F;
/* 1393 */     this.NeckC1.field_78798_e -= (float)Math.cos(this.NeckC1.field_78796_g) * 20.0F;
/* 1394 */     this.NeckC1.field_78800_c -= (float)Math.sin(this.NeckC1.field_78796_g) * 20.0F;
/* 1395 */     this.NeckC2.field_78796_g = Cheadlr * 0.25F;
/* 1396 */     this.NeckC2.field_78798_e -= (float)Math.cos(this.NeckC2.field_78796_g) * 36.0F;
/* 1397 */     this.NeckC2.field_78800_c -= (float)Math.sin(this.NeckC2.field_78796_g) * 36.0F;
/* 1398 */     this.NeckC3.field_78796_g = Cheadlr * 0.38F;
/* 1399 */     this.NeckC3.field_78798_e -= (float)Math.cos(this.NeckC3.field_78796_g) * 36.0F;
/* 1400 */     this.NeckC3.field_78800_c -= (float)Math.sin(this.NeckC3.field_78796_g) * 36.0F;
/* 1401 */     this.NeckC4.field_78796_g = Cheadlr * 0.5F;
/* 1402 */     this.NeckC4.field_78798_e -= (float)Math.cos(this.NeckC4.field_78796_g) * 36.0F;
/* 1403 */     this.NeckC4.field_78800_c -= (float)Math.sin(this.NeckC4.field_78796_g) * 36.0F;
/* 1404 */     this.CHead1.field_78796_g = Cheadlr;
/*      */     
/* 1406 */     this.CHead2.field_78796_g = Cheadlr;
/* 1407 */     this.CHead2.field_78798_e = this.CHead1.field_78798_e;
/* 1408 */     this.CHead2.field_78800_c = this.CHead1.field_78800_c;
/* 1409 */     this.CHead3.field_78796_g = Cheadlr;
/* 1410 */     this.CHead3.field_78798_e = this.CHead1.field_78798_e;
/* 1411 */     this.CHead3.field_78800_c = this.CHead1.field_78800_c;
/* 1412 */     this.CHeadMane.field_78796_g = Cheadlr;
/* 1413 */     this.CHeadMane.field_78798_e = this.CHead1.field_78798_e;
/* 1414 */     this.CHeadMane.field_78800_c = this.CHead1.field_78800_c;
/* 1415 */     this.CLEye.field_78796_g = Cheadlr;
/* 1416 */     this.CLEye.field_78798_e = this.CHead1.field_78798_e;
/* 1417 */     this.CLEye.field_78800_c = this.CHead1.field_78800_c;
/* 1418 */     this.CREye.field_78796_g = Cheadlr;
/* 1419 */     this.CREye.field_78798_e = this.CHead1.field_78798_e;
/* 1420 */     this.CREye.field_78800_c = this.CHead1.field_78800_c;
/* 1421 */     this.CLNoseSpike.field_78796_g = 0.244F + Cheadlr;
/* 1422 */     this.CLNoseSpike.field_78798_e = this.CHead1.field_78798_e;
/* 1423 */     this.CLNoseSpike.field_78800_c = this.CHead1.field_78800_c;
/* 1424 */     this.CRNoseSpike.field_78796_g = -0.261F + Cheadlr;
/* 1425 */     this.CRNoseSpike.field_78798_e = this.CHead1.field_78798_e;
/* 1426 */     this.CRNoseSpike.field_78800_c = this.CHead1.field_78800_c;
/*      */ 
/*      */     
/* 1429 */     this.CJaw1.field_78796_g = Cheadlr;
/* 1430 */     this.NeckC4.field_78798_e -= (float)Math.cos(this.NeckC4.field_78796_g) * 37.0F;
/* 1431 */     this.NeckC4.field_78800_c -= (float)Math.sin(this.NeckC4.field_78796_g) * 37.0F;
/*      */     
/* 1433 */     this.CJaw2.field_78796_g = Cheadlr;
/* 1434 */     this.CJaw2.field_78798_e = this.CJaw1.field_78798_e;
/* 1435 */     this.CJaw2.field_78800_c = this.CJaw1.field_78800_c;
/* 1436 */     this.CJaw3.field_78796_g = Cheadlr;
/* 1437 */     this.CJaw3.field_78798_e = this.CJaw1.field_78798_e;
/* 1438 */     this.CJaw3.field_78800_c = this.CJaw1.field_78800_c;
/* 1439 */     this.CTooth1.field_78796_g = Cheadlr;
/* 1440 */     this.CTooth1.field_78798_e = this.CJaw1.field_78798_e;
/* 1441 */     this.CTooth1.field_78800_c = this.CJaw1.field_78800_c;
/* 1442 */     this.CTooth2.field_78796_g = Cheadlr;
/* 1443 */     this.CTooth2.field_78798_e = this.CJaw1.field_78798_e;
/* 1444 */     this.CTooth2.field_78800_c = this.CJaw1.field_78800_c;
/* 1445 */     this.CTooth3.field_78796_g = Cheadlr;
/* 1446 */     this.CTooth3.field_78798_e = this.CJaw1.field_78798_e;
/* 1447 */     this.CTooth3.field_78800_c = this.CJaw1.field_78800_c;
/* 1448 */     this.CTooth4.field_78796_g = Cheadlr;
/* 1449 */     this.CTooth4.field_78798_e = this.CJaw1.field_78798_e;
/* 1450 */     this.CTooth4.field_78800_c = this.CJaw1.field_78800_c;
/*      */ 
/*      */ 
/*      */     
/* 1454 */     this.NeckC1.field_78795_f = Cheadud * 0.125F;
/* 1455 */     this.NeckC1.field_78797_d += (float)Math.sin(this.NeckC1.field_78795_f) * 20.0F;
/* 1456 */     this.NeckC1.field_78798_e += (this.NeckC2.field_78798_e - this.NeckC1.field_78798_e) * (float)Math.cos(this.NeckC1.field_78795_f);
/* 1457 */     this.NeckC1.field_78800_c += (this.NeckC2.field_78800_c - this.NeckC1.field_78800_c) * (float)Math.cos(this.NeckC1.field_78795_f);
/* 1458 */     this.NeckC2.field_78795_f = Cheadud * 0.25F;
/* 1459 */     this.NeckC2.field_78797_d += (float)Math.sin(this.NeckC2.field_78795_f) * 36.0F;
/* 1460 */     this.NeckC2.field_78798_e += (this.NeckC3.field_78798_e - this.NeckC2.field_78798_e) * (float)Math.cos(this.NeckC2.field_78795_f);
/* 1461 */     this.NeckC2.field_78800_c += (this.NeckC3.field_78800_c - this.NeckC2.field_78800_c) * (float)Math.cos(this.NeckC2.field_78795_f);
/* 1462 */     this.NeckC3.field_78795_f = Cheadud * 0.38F;
/* 1463 */     this.NeckC3.field_78797_d += (float)Math.sin(this.NeckC3.field_78795_f) * 36.0F;
/* 1464 */     this.NeckC3.field_78798_e += (this.NeckC4.field_78798_e - this.NeckC3.field_78798_e) * (float)Math.cos(this.NeckC3.field_78795_f);
/* 1465 */     this.NeckC3.field_78800_c += (this.NeckC4.field_78800_c - this.NeckC3.field_78800_c) * (float)Math.cos(this.NeckC3.field_78795_f);
/* 1466 */     this.NeckC4.field_78795_f = Cheadud * 0.5F;
/* 1467 */     this.NeckC4.field_78797_d += (float)Math.sin(this.NeckC4.field_78795_f) * 36.0F;
/* 1468 */     this.NeckC4.field_78798_e += (this.CHead1.field_78798_e - this.NeckC4.field_78798_e) * (float)Math.cos(this.NeckC4.field_78795_f);
/* 1469 */     this.NeckC4.field_78800_c += (this.CHead1.field_78800_c - this.NeckC4.field_78800_c) * (float)Math.cos(this.NeckC4.field_78795_f);
/* 1470 */     this.CHead1.field_78795_f = Cheadud;
/*      */     
/* 1472 */     this.CHead2.field_78795_f = Cheadud;
/* 1473 */     this.CHead2.field_78798_e = this.CHead1.field_78798_e;
/* 1474 */     this.CHead2.field_78800_c = this.CHead1.field_78800_c;
/* 1475 */     this.CHead2.field_78797_d = this.CHead1.field_78797_d;
/* 1476 */     this.CHead3.field_78795_f = Cheadud;
/* 1477 */     this.CHead3.field_78798_e = this.CHead1.field_78798_e;
/* 1478 */     this.CHead3.field_78800_c = this.CHead1.field_78800_c;
/* 1479 */     this.CHead3.field_78797_d = this.CHead1.field_78797_d;
/* 1480 */     this.CHeadMane.field_78795_f = 0.384F + Cheadud;
/* 1481 */     this.CHeadMane.field_78798_e = this.CHead1.field_78798_e;
/* 1482 */     this.CHeadMane.field_78800_c = this.CHead1.field_78800_c;
/* 1483 */     this.CHeadMane.field_78797_d = this.CHead1.field_78797_d;
/* 1484 */     this.CLEye.field_78795_f = Cheadud;
/* 1485 */     this.CLEye.field_78798_e = this.CHead1.field_78798_e;
/* 1486 */     this.CLEye.field_78800_c = this.CHead1.field_78800_c;
/* 1487 */     this.CLEye.field_78797_d = this.CHead1.field_78797_d;
/* 1488 */     this.CREye.field_78795_f = Cheadud;
/* 1489 */     this.CREye.field_78798_e = this.CHead1.field_78798_e;
/* 1490 */     this.CREye.field_78800_c = this.CHead1.field_78800_c;
/* 1491 */     this.CREye.field_78797_d = this.CHead1.field_78797_d;
/* 1492 */     this.CLNoseSpike.field_78795_f = 0.244F + Cheadud;
/* 1493 */     this.CLNoseSpike.field_78798_e = this.CHead1.field_78798_e;
/* 1494 */     this.CLNoseSpike.field_78800_c = this.CHead1.field_78800_c;
/* 1495 */     this.CLNoseSpike.field_78797_d = this.CHead1.field_78797_d;
/* 1496 */     this.CRNoseSpike.field_78795_f = 0.261F + Cheadud;
/* 1497 */     this.CRNoseSpike.field_78798_e = this.CHead1.field_78798_e;
/* 1498 */     this.CRNoseSpike.field_78800_c = this.CHead1.field_78800_c;
/* 1499 */     this.CRNoseSpike.field_78797_d = this.CHead1.field_78797_d;
/*      */ 
/*      */     
/* 1502 */     this.CHead1.field_78797_d += (float)Math.cos(this.CHead1.field_78795_f) * 14.0F;
/* 1503 */     this.NeckC4.field_78798_e += (this.CJaw1.field_78798_e - this.NeckC4.field_78798_e) * (float)Math.cos(this.NeckC4.field_78795_f);
/* 1504 */     this.CJaw1.field_78798_e += (float)Math.sin(this.CHead1.field_78795_f) * 14.0F;
/* 1505 */     this.NeckC4.field_78800_c += (this.CJaw1.field_78800_c - this.NeckC4.field_78800_c) * (float)Math.cos(this.NeckC4.field_78795_f);
/*      */     
/* 1507 */     this.CJaw2.field_78798_e = this.CJaw1.field_78798_e;
/* 1508 */     this.CJaw2.field_78800_c = this.CJaw1.field_78800_c;
/* 1509 */     this.CJaw2.field_78797_d = this.CJaw1.field_78797_d;
/* 1510 */     this.CJaw3.field_78798_e = this.CJaw1.field_78798_e;
/* 1511 */     this.CJaw3.field_78800_c = this.CJaw1.field_78800_c;
/* 1512 */     this.CJaw3.field_78797_d = this.CJaw1.field_78797_d;
/* 1513 */     this.CTooth1.field_78798_e = this.CJaw1.field_78798_e;
/* 1514 */     this.CTooth1.field_78800_c = this.CJaw1.field_78800_c;
/* 1515 */     this.CTooth1.field_78797_d = this.CJaw1.field_78797_d;
/* 1516 */     this.CTooth2.field_78798_e = this.CJaw1.field_78798_e;
/* 1517 */     this.CTooth2.field_78800_c = this.CJaw1.field_78800_c;
/* 1518 */     this.CTooth2.field_78797_d = this.CJaw1.field_78797_d;
/* 1519 */     this.CTooth3.field_78798_e = this.CJaw1.field_78798_e;
/* 1520 */     this.CTooth3.field_78800_c = this.CJaw1.field_78800_c;
/* 1521 */     this.CTooth3.field_78797_d = this.CJaw1.field_78797_d;
/* 1522 */     this.CTooth4.field_78798_e = this.CJaw1.field_78798_e;
/* 1523 */     this.CTooth4.field_78800_c = this.CJaw1.field_78800_c;
/* 1524 */     this.CTooth4.field_78797_d = this.CJaw1.field_78797_d;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void moveRightHead(float Rheadlr, float Rheadud, float Rjawangle) {
/* 1532 */     this.RJaw1.field_78795_f = Rjawangle;
/* 1533 */     this.RJaw2.field_78795_f = Rjawangle;
/* 1534 */     this.RJaw3.field_78795_f = Rjawangle;
/* 1535 */     this.RTooth1.field_78795_f = Rjawangle;
/* 1536 */     this.RTooth2.field_78795_f = Rjawangle;
/* 1537 */     this.RTooth3.field_78795_f = Rjawangle;
/* 1538 */     this.RTooth4.field_78795_f = Rjawangle;
/*      */ 
/*      */ 
/*      */     
/* 1542 */     this.NeckR1.field_78796_g = Rheadlr * 0.125F;
/* 1543 */     this.NeckR1.field_78798_e -= (float)Math.cos(this.NeckR1.field_78796_g) * 20.0F;
/* 1544 */     this.NeckR1.field_78800_c -= (float)Math.sin(this.NeckR1.field_78796_g) * 20.0F;
/* 1545 */     this.NeckR2.field_78796_g = Rheadlr * 0.25F;
/* 1546 */     this.NeckR2.field_78798_e -= (float)Math.cos(this.NeckR2.field_78796_g) * 36.0F;
/* 1547 */     this.NeckR2.field_78800_c -= (float)Math.sin(this.NeckR2.field_78796_g) * 36.0F;
/* 1548 */     this.NeckR3.field_78796_g = Rheadlr * 0.38F;
/* 1549 */     this.NeckR3.field_78798_e -= (float)Math.cos(this.NeckR3.field_78796_g) * 36.0F;
/* 1550 */     this.NeckR3.field_78800_c -= (float)Math.sin(this.NeckR3.field_78796_g) * 36.0F;
/* 1551 */     this.NeckR4.field_78796_g = Rheadlr * 0.5F;
/* 1552 */     this.NeckR4.field_78798_e -= (float)Math.cos(this.NeckR4.field_78796_g) * 36.0F;
/* 1553 */     this.NeckR4.field_78800_c -= (float)Math.sin(this.NeckR4.field_78796_g) * 36.0F;
/* 1554 */     this.RHead1.field_78796_g = Rheadlr;
/*      */     
/* 1556 */     this.RHead2.field_78796_g = Rheadlr;
/* 1557 */     this.RHead2.field_78798_e = this.RHead1.field_78798_e;
/* 1558 */     this.RHead2.field_78800_c = this.RHead1.field_78800_c;
/* 1559 */     this.RHead3.field_78796_g = Rheadlr;
/* 1560 */     this.RHead3.field_78798_e = this.RHead1.field_78798_e;
/* 1561 */     this.RHead3.field_78800_c = this.RHead1.field_78800_c;
/* 1562 */     this.RHeadMane.field_78796_g = Rheadlr;
/* 1563 */     this.RHeadMane.field_78798_e = this.RHead1.field_78798_e;
/* 1564 */     this.RHeadMane.field_78800_c = this.RHead1.field_78800_c;
/* 1565 */     this.RLEye.field_78796_g = Rheadlr;
/* 1566 */     this.RLEye.field_78798_e = this.RHead1.field_78798_e;
/* 1567 */     this.RLEye.field_78800_c = this.RHead1.field_78800_c;
/* 1568 */     this.RREye.field_78796_g = Rheadlr;
/* 1569 */     this.RREye.field_78798_e = this.RHead1.field_78798_e;
/* 1570 */     this.RREye.field_78800_c = this.RHead1.field_78800_c;
/* 1571 */     this.RLNoseSpike.field_78796_g = 0.244F + Rheadlr;
/* 1572 */     this.RLNoseSpike.field_78798_e = this.RHead1.field_78798_e;
/* 1573 */     this.RLNoseSpike.field_78800_c = this.RHead1.field_78800_c;
/* 1574 */     this.RRNoseSpike.field_78796_g = -0.261F + Rheadlr;
/* 1575 */     this.RRNoseSpike.field_78798_e = this.RHead1.field_78798_e;
/* 1576 */     this.RRNoseSpike.field_78800_c = this.RHead1.field_78800_c;
/*      */ 
/*      */     
/* 1579 */     this.RJaw1.field_78796_g = Rheadlr;
/* 1580 */     this.NeckR4.field_78798_e -= (float)Math.cos(this.NeckR4.field_78796_g) * 37.0F;
/* 1581 */     this.NeckR4.field_78800_c -= (float)Math.sin(this.NeckR4.field_78796_g) * 37.0F;
/*      */     
/* 1583 */     this.RJaw2.field_78796_g = Rheadlr;
/* 1584 */     this.RJaw2.field_78798_e = this.RJaw1.field_78798_e;
/* 1585 */     this.RJaw2.field_78800_c = this.RJaw1.field_78800_c;
/* 1586 */     this.RJaw3.field_78796_g = Rheadlr;
/* 1587 */     this.RJaw3.field_78798_e = this.RJaw1.field_78798_e;
/* 1588 */     this.RJaw3.field_78800_c = this.RJaw1.field_78800_c;
/* 1589 */     this.RTooth1.field_78796_g = Rheadlr;
/* 1590 */     this.RTooth1.field_78798_e = this.RJaw1.field_78798_e;
/* 1591 */     this.RTooth1.field_78800_c = this.RJaw1.field_78800_c;
/* 1592 */     this.RTooth2.field_78796_g = Rheadlr;
/* 1593 */     this.RTooth2.field_78798_e = this.RJaw1.field_78798_e;
/* 1594 */     this.RTooth2.field_78800_c = this.RJaw1.field_78800_c;
/* 1595 */     this.RTooth3.field_78796_g = Rheadlr;
/* 1596 */     this.RTooth3.field_78798_e = this.RJaw1.field_78798_e;
/* 1597 */     this.RTooth3.field_78800_c = this.RJaw1.field_78800_c;
/* 1598 */     this.RTooth4.field_78796_g = Rheadlr;
/* 1599 */     this.RTooth4.field_78798_e = this.RJaw1.field_78798_e;
/* 1600 */     this.RTooth4.field_78800_c = this.RJaw1.field_78800_c;
/*      */ 
/*      */ 
/*      */     
/* 1604 */     this.NeckR1.field_78795_f = Rheadud * 0.125F;
/* 1605 */     this.NeckR1.field_78797_d += (float)Math.sin(this.NeckR1.field_78795_f) * 20.0F;
/* 1606 */     this.NeckR1.field_78798_e += (this.NeckR2.field_78798_e - this.NeckR1.field_78798_e) * (float)Math.cos(this.NeckR1.field_78795_f);
/* 1607 */     this.NeckR1.field_78800_c += (this.NeckR2.field_78800_c - this.NeckR1.field_78800_c) * (float)Math.cos(this.NeckR1.field_78795_f);
/* 1608 */     this.NeckR2.field_78795_f = Rheadud * 0.25F;
/* 1609 */     this.NeckR2.field_78797_d += (float)Math.sin(this.NeckR2.field_78795_f) * 36.0F;
/* 1610 */     this.NeckR2.field_78798_e += (this.NeckR3.field_78798_e - this.NeckR2.field_78798_e) * (float)Math.cos(this.NeckR2.field_78795_f);
/* 1611 */     this.NeckR2.field_78800_c += (this.NeckR3.field_78800_c - this.NeckR2.field_78800_c) * (float)Math.cos(this.NeckR2.field_78795_f);
/* 1612 */     this.NeckR3.field_78795_f = Rheadud * 0.38F;
/* 1613 */     this.NeckR3.field_78797_d += (float)Math.sin(this.NeckR3.field_78795_f) * 36.0F;
/* 1614 */     this.NeckR3.field_78798_e += (this.NeckR4.field_78798_e - this.NeckR3.field_78798_e) * (float)Math.cos(this.NeckR3.field_78795_f);
/* 1615 */     this.NeckR3.field_78800_c += (this.NeckR4.field_78800_c - this.NeckR3.field_78800_c) * (float)Math.cos(this.NeckR3.field_78795_f);
/* 1616 */     this.NeckR4.field_78795_f = Rheadud * 0.5F;
/* 1617 */     this.NeckR4.field_78797_d += (float)Math.sin(this.NeckR4.field_78795_f) * 36.0F;
/* 1618 */     this.NeckR4.field_78798_e += (this.RHead1.field_78798_e - this.NeckR4.field_78798_e) * (float)Math.cos(this.NeckR4.field_78795_f);
/* 1619 */     this.NeckR4.field_78800_c += (this.RHead1.field_78800_c - this.NeckR4.field_78800_c) * (float)Math.cos(this.NeckR4.field_78795_f);
/* 1620 */     this.RHead1.field_78795_f = Rheadud;
/*      */     
/* 1622 */     this.RHead2.field_78795_f = Rheadud;
/* 1623 */     this.RHead2.field_78798_e = this.RHead1.field_78798_e;
/* 1624 */     this.RHead2.field_78800_c = this.RHead1.field_78800_c;
/* 1625 */     this.RHead2.field_78797_d = this.RHead1.field_78797_d;
/* 1626 */     this.RHead3.field_78795_f = Rheadud;
/* 1627 */     this.RHead3.field_78798_e = this.RHead1.field_78798_e;
/* 1628 */     this.RHead3.field_78800_c = this.RHead1.field_78800_c;
/* 1629 */     this.RHead3.field_78797_d = this.RHead1.field_78797_d;
/* 1630 */     this.RHeadMane.field_78795_f = 0.384F + Rheadud;
/* 1631 */     this.RHeadMane.field_78798_e = this.RHead1.field_78798_e;
/* 1632 */     this.RHeadMane.field_78800_c = this.RHead1.field_78800_c;
/* 1633 */     this.RHeadMane.field_78797_d = this.RHead1.field_78797_d;
/* 1634 */     this.RLEye.field_78795_f = Rheadud;
/* 1635 */     this.RLEye.field_78798_e = this.RHead1.field_78798_e;
/* 1636 */     this.RLEye.field_78800_c = this.RHead1.field_78800_c;
/* 1637 */     this.RLEye.field_78797_d = this.RHead1.field_78797_d;
/* 1638 */     this.RREye.field_78795_f = Rheadud;
/* 1639 */     this.RREye.field_78798_e = this.RHead1.field_78798_e;
/* 1640 */     this.RREye.field_78800_c = this.RHead1.field_78800_c;
/* 1641 */     this.RREye.field_78797_d = this.RHead1.field_78797_d;
/* 1642 */     this.RLNoseSpike.field_78795_f = 0.244F + Rheadud;
/* 1643 */     this.RLNoseSpike.field_78798_e = this.RHead1.field_78798_e;
/* 1644 */     this.RLNoseSpike.field_78800_c = this.RHead1.field_78800_c;
/* 1645 */     this.RLNoseSpike.field_78797_d = this.RHead1.field_78797_d;
/* 1646 */     this.RRNoseSpike.field_78795_f = 0.261F + Rheadud;
/* 1647 */     this.RRNoseSpike.field_78798_e = this.RHead1.field_78798_e;
/* 1648 */     this.RRNoseSpike.field_78800_c = this.RHead1.field_78800_c;
/* 1649 */     this.RRNoseSpike.field_78797_d = this.RHead1.field_78797_d;
/*      */ 
/*      */     
/* 1652 */     this.RHead1.field_78797_d += (float)Math.cos(this.RHead1.field_78795_f) * 14.0F;
/* 1653 */     this.NeckR4.field_78798_e += (this.RJaw1.field_78798_e - this.NeckR4.field_78798_e) * (float)Math.cos(this.NeckR4.field_78795_f);
/* 1654 */     this.RJaw1.field_78798_e += (float)Math.sin(this.RHead1.field_78795_f) * 14.0F;
/* 1655 */     this.NeckR4.field_78800_c += (this.RJaw1.field_78800_c - this.NeckR4.field_78800_c) * (float)Math.cos(this.NeckR4.field_78795_f);
/*      */     
/* 1657 */     this.RJaw2.field_78798_e = this.RJaw1.field_78798_e;
/* 1658 */     this.RJaw2.field_78800_c = this.RJaw1.field_78800_c;
/* 1659 */     this.RJaw2.field_78797_d = this.RJaw1.field_78797_d;
/* 1660 */     this.RJaw3.field_78798_e = this.RJaw1.field_78798_e;
/* 1661 */     this.RJaw3.field_78800_c = this.RJaw1.field_78800_c;
/* 1662 */     this.RJaw3.field_78797_d = this.RJaw1.field_78797_d;
/* 1663 */     this.RTooth1.field_78798_e = this.RJaw1.field_78798_e;
/* 1664 */     this.RTooth1.field_78800_c = this.RJaw1.field_78800_c;
/* 1665 */     this.RTooth1.field_78797_d = this.RJaw1.field_78797_d;
/* 1666 */     this.RTooth2.field_78798_e = this.RJaw1.field_78798_e;
/* 1667 */     this.RTooth2.field_78800_c = this.RJaw1.field_78800_c;
/* 1668 */     this.RTooth2.field_78797_d = this.RJaw1.field_78797_d;
/* 1669 */     this.RTooth3.field_78798_e = this.RJaw1.field_78798_e;
/* 1670 */     this.RTooth3.field_78800_c = this.RJaw1.field_78800_c;
/* 1671 */     this.RTooth3.field_78797_d = this.RJaw1.field_78797_d;
/* 1672 */     this.RTooth4.field_78798_e = this.RJaw1.field_78798_e;
/* 1673 */     this.RTooth4.field_78800_c = this.RJaw1.field_78800_c;
/* 1674 */     this.RTooth4.field_78797_d = this.RJaw1.field_78797_d;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelTheKing.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */