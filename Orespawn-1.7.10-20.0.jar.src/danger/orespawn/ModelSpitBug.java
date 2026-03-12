/*      */ package danger.orespawn;
/*      */ 
/*      */ import net.minecraft.client.model.ModelBase;
/*      */ import net.minecraft.client.model.ModelRenderer;
/*      */ import net.minecraft.entity.Entity;
/*      */ import net.minecraft.util.MathHelper;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ModelSpitBug
/*      */   extends ModelBase
/*      */ {
/*   22 */   private float wingspeed = 1.0F;
/*      */   
/*      */   ModelRenderer legintersection;
/*      */   
/*      */   ModelRenderer legintersectionpart2;
/*      */   ModelRenderer legintersectionpart3;
/*      */   ModelRenderer leg1start;
/*      */   ModelRenderer leg1startpart2;
/*      */   ModelRenderer leg1startpart3;
/*      */   ModelRenderer leg1;
/*      */   ModelRenderer leg1part2;
/*      */   ModelRenderer leg1part2b;
/*      */   ModelRenderer leg1part2c;
/*      */   ModelRenderer leg1part2d;
/*      */   ModelRenderer leg1part3;
/*      */   ModelRenderer leg1part3b;
/*      */   ModelRenderer leg1part3c;
/*      */   ModelRenderer leg2start;
/*      */   ModelRenderer leg2startpart2;
/*      */   ModelRenderer leg2startpart3;
/*      */   ModelRenderer leg2;
/*      */   ModelRenderer leg2part2;
/*      */   ModelRenderer leg2part2b;
/*      */   ModelRenderer leg2part2c;
/*      */   ModelRenderer leg2part2d;
/*      */   ModelRenderer leg2part3;
/*      */   ModelRenderer leg2part3b;
/*      */   ModelRenderer leg2part3c;
/*      */   ModelRenderer leg3start;
/*      */   ModelRenderer leg3startpart2;
/*      */   ModelRenderer leg3startpart3;
/*      */   ModelRenderer leg3;
/*      */   ModelRenderer leg3part2;
/*      */   ModelRenderer leg3part2b;
/*      */   ModelRenderer leg3part2c;
/*      */   ModelRenderer leg3part2d;
/*      */   ModelRenderer leg3part3;
/*      */   ModelRenderer leg3part3b;
/*      */   ModelRenderer leg3part3c;
/*      */   ModelRenderer leg4start;
/*      */   ModelRenderer leg4startpart2;
/*      */   ModelRenderer leg4startpart3;
/*      */   ModelRenderer leg4;
/*      */   ModelRenderer leg4part2;
/*      */   ModelRenderer leg4part2b;
/*      */   ModelRenderer leg4part2c;
/*      */   ModelRenderer leg4part2d;
/*      */   ModelRenderer leg4part3;
/*      */   ModelRenderer leg4part3b;
/*      */   ModelRenderer leg4part3c;
/*      */   ModelRenderer bodybase;
/*      */   ModelRenderer bodybasepart2;
/*      */   ModelRenderer bodybasepart3;
/*      */   ModelRenderer bodybasepart4;
/*      */   ModelRenderer bodybasepart5;
/*      */   ModelRenderer bodybasepart6;
/*      */   ModelRenderer bodybasepart7;
/*      */   ModelRenderer bodybasepart8;
/*      */   ModelRenderer bodybasepart9;
/*      */   ModelRenderer bodybasepart10;
/*      */   ModelRenderer bodybasepart11;
/*      */   ModelRenderer bodybasepart12;
/*      */   ModelRenderer bodybasepart13;
/*      */   ModelRenderer bodybasepart14;
/*      */   ModelRenderer bodybasepart15;
/*      */   ModelRenderer upperjawbase;
/*      */   ModelRenderer upperjawbasepart1;
/*      */   ModelRenderer upperjawbasepart2;
/*      */   ModelRenderer upperjawbasepart3;
/*      */   ModelRenderer tooth1;
/*      */   ModelRenderer tooth2;
/*      */   ModelRenderer tooth3;
/*      */   ModelRenderer tooth4;
/*      */   ModelRenderer tooth5;
/*      */   ModelRenderer lowerjawbase;
/*      */   ModelRenderer lowerjawbasepart1;
/*      */   ModelRenderer lowerjawbasepart2;
/*      */   ModelRenderer lowerjawbasepart3;
/*      */   ModelRenderer lowerjawbasepart4;
/*      */   ModelRenderer lowerjawbasepart5;
/*      */   ModelRenderer lowerjawbasepart6;
/*      */   ModelRenderer lowerjawbasepart7;
/*      */   ModelRenderer lowerjawbasepart8;
/*      */   ModelRenderer lowerjawbasepart9;
/*      */   ModelRenderer lowerjawbasepart10;
/*      */   ModelRenderer lowerjawbasepart11;
/*      */   ModelRenderer arm1start;
/*      */   ModelRenderer arm1;
/*      */   ModelRenderer arm1part2;
/*      */   ModelRenderer arm1end;
/*      */   ModelRenderer arm2start;
/*      */   ModelRenderer arm2;
/*      */   ModelRenderer arm2part2;
/*      */   ModelRenderer arm2end;
/*      */   ModelRenderer eye1;
/*      */   ModelRenderer eye2;
/*      */   
/*      */   public ModelSpitBug(float f1) {
/*  120 */     this.wingspeed = f1;
/*      */     
/*  122 */     this.field_78090_t = 512;
/*  123 */     this.field_78089_u = 256;
/*      */     
/*  125 */     this.legintersection = new ModelRenderer(this, 0, 0);
/*  126 */     this.legintersection.func_78789_a(-6.0F, -2.0F, -7.0F, 12, 6, 14);
/*  127 */     this.legintersection.func_78793_a(0.0F, 3.0F, 1.0F);
/*  128 */     this.legintersection.func_78787_b(512, 256);
/*  129 */     this.legintersection.field_78809_i = true;
/*  130 */     setRotation(this.legintersection, 0.0F, 0.0F, 0.0F);
/*  131 */     this.legintersectionpart2 = new ModelRenderer(this, 0, 21);
/*  132 */     this.legintersectionpart2.func_78789_a(-8.0F, -2.0F, 0.0F, 8, 6, 8);
/*  133 */     this.legintersectionpart2.func_78793_a(0.0F, 3.0F, 2.0F);
/*  134 */     this.legintersectionpart2.func_78787_b(512, 256);
/*  135 */     this.legintersectionpart2.field_78809_i = true;
/*  136 */     setRotation(this.legintersectionpart2, 0.0F, 0.7853982F, 0.0F);
/*  137 */     this.legintersectionpart3 = new ModelRenderer(this, 282, 18);
/*  138 */     this.legintersectionpart3.func_78789_a(-7.0F, 3.0F, -6.0F, 14, 2, 12);
/*  139 */     this.legintersectionpart3.func_78793_a(0.0F, 3.0F, 1.0F);
/*  140 */     this.legintersectionpart3.func_78787_b(512, 256);
/*  141 */     this.legintersectionpart3.field_78809_i = true;
/*  142 */     setRotation(this.legintersectionpart3, 0.0F, 0.0F, 0.0F);
/*  143 */     this.leg1start = new ModelRenderer(this, 53, 0);
/*  144 */     this.leg1start.func_78789_a(-3.0F, -3.0F, -3.0F, 6, 6, 4);
/*  145 */     this.leg1start.func_78793_a(4.0F, 3.0F, -4.0F);
/*  146 */     this.leg1start.func_78787_b(512, 256);
/*  147 */     this.leg1start.field_78809_i = true;
/*  148 */     setRotation(this.leg1start, 0.0F, -0.7853982F, 0.0F);
/*  149 */     this.leg1startpart2 = new ModelRenderer(this, 53, 19);
/*  150 */     this.leg1startpart2.func_78789_a(-2.5F, -2.0F, -3.0F, 5, 5, 4);
/*  151 */     this.leg1startpart2.func_78793_a(6.0F, 3.0F, -6.0F);
/*  152 */     this.leg1startpart2.func_78787_b(512, 256);
/*  153 */     this.leg1startpart2.field_78809_i = true;
/*  154 */     setRotation(this.leg1startpart2, 0.3717861F, -0.7853982F, 0.0F);
/*  155 */     this.leg1startpart3 = new ModelRenderer(this, 53, 29);
/*  156 */     this.leg1startpart3.func_78789_a(-2.0F, -2.0F, -4.0F, 4, 4, 2);
/*  157 */     this.leg1startpart3.func_78793_a(6.0F, 3.0F, -6.0F);
/*  158 */     this.leg1startpart3.func_78787_b(512, 256);
/*  159 */     this.leg1startpart3.field_78809_i = true;
/*  160 */     setRotation(this.leg1startpart3, 0.669215F, -0.7853982F, 0.0F);
/*  161 */     this.leg1 = new ModelRenderer(this, 45, 36);
/*  162 */     this.leg1.func_78789_a(-1.5F, -3.0F, -13.0F, 3, 3, 10);
/*  163 */     this.leg1.func_78793_a(6.0F, 3.0F, -6.0F);
/*  164 */     this.leg1.func_78787_b(512, 256);
/*  165 */     this.leg1.field_78809_i = true;
/*  166 */     setRotation(this.leg1, 1.041001F, -0.7853982F, 0.0F);
/*  167 */     this.leg1part2 = new ModelRenderer(this, 33, 50);
/*  168 */     this.leg1part2.func_78789_a(-2.0F, -1.5F, -13.0F, 4, 3, 15);
/*  169 */     this.leg1part2.func_78793_a(12.0F, 13.0F, -12.0F);
/*  170 */     this.leg1part2.func_78787_b(512, 256);
/*  171 */     this.leg1part2.field_78809_i = true;
/*  172 */     setRotation(this.leg1part2, -1.152537F, -0.7853982F, 0.0F);
/*  173 */     this.leg1part2b = new ModelRenderer(this, 33, 50);
/*  174 */     this.leg1part2b.func_78789_a(-2.0F, 0.5F, 1.0F, 4, 1, 3);
/*  175 */     this.leg1part2b.func_78793_a(12.0F, 13.0F, -12.0F);
/*  176 */     this.leg1part2b.func_78787_b(512, 256);
/*  177 */     this.leg1part2b.field_78809_i = true;
/*  178 */     setRotation(this.leg1part2b, -0.7435722F, -0.7853982F, 0.0F);
/*  179 */     this.leg1part2c = new ModelRenderer(this, 33, 50);
/*  180 */     this.leg1part2c.func_78789_a(-2.0F, -7.5F, -13.0F, 4, 1, 3);
/*  181 */     this.leg1part2c.func_78793_a(12.0F, 13.0F, -12.0F);
/*  182 */     this.leg1part2c.func_78787_b(512, 256);
/*  183 */     this.leg1part2c.field_78809_i = true;
/*  184 */     setRotation(this.leg1part2c, -0.6320451F, -0.7853982F, 0.0F);
/*  185 */     this.leg1part2d = new ModelRenderer(this, 2, 50);
/*  186 */     this.leg1part2d.func_78789_a(-1.5F, -1.5F, -10.0F, 3, 3, 12);
/*  187 */     this.leg1part2d.func_78793_a(12.0F, 13.0F, -12.0F);
/*  188 */     this.leg1part2d.func_78787_b(512, 256);
/*  189 */     this.leg1part2d.field_78809_i = true;
/*  190 */     setRotation(this.leg1part2d, -1.041001F, -0.7853982F, 0.0F);
/*  191 */     this.leg1part3 = new ModelRenderer(this, 51, 69);
/*  192 */     this.leg1part3.func_78789_a(-1.5F, -1.5F, -7.0F, 3, 3, 7);
/*  193 */     this.leg1part3.func_78793_a(16.0F, 3.0F, -16.0F);
/*  194 */     this.leg1part3.func_78787_b(512, 256);
/*  195 */     this.leg1part3.field_78809_i = true;
/*  196 */     setRotation(this.leg1part3, 0.669215F, -0.7853982F, 0.0F);
/*  197 */     this.leg1part3b = new ModelRenderer(this, 55, 80);
/*  198 */     this.leg1part3b.func_78789_a(-2.0F, -2.0F, -2.0F, 4, 16, 4);
/*  199 */     this.leg1part3b.func_78793_a(20.0F, 8.0F, -20.0F);
/*  200 */     this.leg1part3b.func_78787_b(512, 256);
/*  201 */     this.leg1part3b.field_78809_i = true;
/*  202 */     setRotation(this.leg1part3b, -0.4833219F, -0.7853982F, -0.0349066F);
/*  203 */     this.leg1part3c = new ModelRenderer(this, 42, 80);
/*  204 */     this.leg1part3c.func_78789_a(-2.0F, 14.0F, 0.0F, 4, 3, 2);
/*  205 */     this.leg1part3c.func_78793_a(20.0F, 8.0F, -20.0F);
/*  206 */     this.leg1part3c.func_78787_b(512, 256);
/*  207 */     this.leg1part3c.field_78809_i = true;
/*  208 */     setRotation(this.leg1part3c, -0.4833219F, -0.7853982F, -0.0349066F);
/*  209 */     this.leg2start = new ModelRenderer(this, 52, 0);
/*  210 */     this.leg2start.func_78789_a(-3.0F, -3.0F, -3.0F, 6, 6, 4);
/*  211 */     this.leg2start.func_78793_a(-4.0F, 3.0F, -4.0F);
/*  212 */     this.leg2start.func_78787_b(512, 256);
/*  213 */     this.leg2start.field_78809_i = true;
/*  214 */     setRotation(this.leg2start, 0.0F, 0.7853982F, 0.0F);
/*  215 */     this.leg2startpart2 = new ModelRenderer(this, 53, 19);
/*  216 */     this.leg2startpart2.func_78789_a(-2.5F, -2.0F, -3.0F, 5, 5, 4);
/*  217 */     this.leg2startpart2.func_78793_a(-6.0F, 3.0F, -6.0F);
/*  218 */     this.leg2startpart2.func_78787_b(512, 256);
/*  219 */     this.leg2startpart2.field_78809_i = true;
/*  220 */     setRotation(this.leg2startpart2, 0.3717861F, 0.7853982F, 0.0F);
/*  221 */     this.leg2startpart3 = new ModelRenderer(this, 53, 29);
/*  222 */     this.leg2startpart3.func_78789_a(-2.0F, -2.0F, -4.0F, 4, 4, 2);
/*  223 */     this.leg2startpart3.func_78793_a(-6.0F, 3.0F, -6.0F);
/*  224 */     this.leg2startpart3.func_78787_b(512, 256);
/*  225 */     this.leg2startpart3.field_78809_i = true;
/*  226 */     setRotation(this.leg2startpart3, 0.669215F, 0.7853982F, 0.0F);
/*  227 */     this.leg2 = new ModelRenderer(this, 45, 36);
/*  228 */     this.leg2.func_78789_a(-1.5F, -3.0F, -13.0F, 3, 3, 10);
/*  229 */     this.leg2.func_78793_a(-6.0F, 3.0F, -6.0F);
/*  230 */     this.leg2.func_78787_b(512, 256);
/*  231 */     this.leg2.field_78809_i = true;
/*  232 */     setRotation(this.leg2, 1.041001F, 0.7853982F, 0.0F);
/*  233 */     this.leg2part2 = new ModelRenderer(this, 72, 50);
/*  234 */     this.leg2part2.func_78789_a(-2.0F, -1.5F, -13.0F, 4, 3, 15);
/*  235 */     this.leg2part2.func_78793_a(-12.0F, 13.0F, -12.0F);
/*  236 */     this.leg2part2.func_78787_b(512, 256);
/*  237 */     this.leg2part2.field_78809_i = true;
/*  238 */     setRotation(this.leg2part2, -1.152537F, 0.7853982F, 0.0F);
/*  239 */     this.leg2part2b = new ModelRenderer(this, 33, 50);
/*  240 */     this.leg2part2b.func_78789_a(-2.0F, 0.5F, 1.0F, 4, 1, 3);
/*  241 */     this.leg2part2b.func_78793_a(-12.0F, 13.0F, -12.0F);
/*  242 */     this.leg2part2b.func_78787_b(512, 256);
/*  243 */     this.leg2part2b.field_78809_i = true;
/*  244 */     setRotation(this.leg2part2b, -0.7435722F, 0.7853982F, 0.0F);
/*  245 */     this.leg2part2c = new ModelRenderer(this, 33, 50);
/*  246 */     this.leg2part2c.func_78789_a(-2.0F, -7.5F, -13.0F, 4, 1, 3);
/*  247 */     this.leg2part2c.func_78793_a(-12.0F, 13.0F, -12.0F);
/*  248 */     this.leg2part2c.func_78787_b(512, 256);
/*  249 */     this.leg2part2c.field_78809_i = true;
/*  250 */     setRotation(this.leg2part2c, -0.6320451F, 0.7853982F, 0.0F);
/*  251 */     this.leg2part2d = new ModelRenderer(this, 2, 50);
/*  252 */     this.leg2part2d.func_78789_a(-1.5F, -1.5F, -10.0F, 3, 3, 12);
/*  253 */     this.leg2part2d.func_78793_a(-12.0F, 13.0F, -12.0F);
/*  254 */     this.leg2part2d.func_78787_b(512, 256);
/*  255 */     this.leg2part2d.field_78809_i = true;
/*  256 */     setRotation(this.leg2part2d, -1.041001F, 0.7853982F, 0.0F);
/*  257 */     this.leg2part3 = new ModelRenderer(this, 51, 69);
/*  258 */     this.leg2part3.func_78789_a(-1.5F, -1.5F, -7.0F, 3, 3, 7);
/*  259 */     this.leg2part3.func_78793_a(-16.0F, 3.0F, -16.0F);
/*  260 */     this.leg2part3.func_78787_b(512, 256);
/*  261 */     this.leg2part3.field_78809_i = true;
/*  262 */     setRotation(this.leg2part3, 0.669215F, 0.7853982F, 0.0F);
/*  263 */     this.leg2part3b = new ModelRenderer(this, 55, 80);
/*  264 */     this.leg2part3b.func_78789_a(-2.0F, -2.0F, -2.0F, 4, 16, 4);
/*  265 */     this.leg2part3b.func_78793_a(-20.0F, 8.0F, -20.0F);
/*  266 */     this.leg2part3b.func_78787_b(512, 256);
/*  267 */     this.leg2part3b.field_78809_i = true;
/*  268 */     setRotation(this.leg2part3b, -0.4833219F, 0.7853982F, -0.0349066F);
/*  269 */     this.leg2part3c = new ModelRenderer(this, 42, 80);
/*  270 */     this.leg2part3c.func_78789_a(-2.0F, 14.0F, 0.0F, 4, 3, 2);
/*  271 */     this.leg2part3c.func_78793_a(-20.0F, 8.0F, -20.0F);
/*  272 */     this.leg2part3c.func_78787_b(512, 256);
/*  273 */     this.leg2part3c.field_78809_i = true;
/*  274 */     setRotation(this.leg2part3c, -0.4833219F, 0.7853982F, -0.0349066F);
/*  275 */     this.leg3start = new ModelRenderer(this, 52, 0);
/*  276 */     this.leg3start.func_78789_a(-3.0F, -3.0F, -3.0F, 6, 6, 4);
/*  277 */     this.leg3start.func_78793_a(4.0F, 3.0F, 6.0F);
/*  278 */     this.leg3start.func_78787_b(512, 256);
/*  279 */     this.leg3start.field_78809_i = true;
/*  280 */     setRotation(this.leg3start, 0.0F, -2.356194F, 0.0F);
/*  281 */     this.leg3startpart2 = new ModelRenderer(this, 72, 19);
/*  282 */     this.leg3startpart2.func_78789_a(-2.5F, -2.0F, -3.0F, 5, 5, 4);
/*  283 */     this.leg3startpart2.func_78793_a(6.0F, 3.0F, 8.0F);
/*  284 */     this.leg3startpart2.func_78787_b(512, 256);
/*  285 */     this.leg3startpart2.field_78809_i = true;
/*  286 */     setRotation(this.leg3startpart2, 0.3717861F, -2.356194F, 0.0F);
/*  287 */     this.leg3startpart3 = new ModelRenderer(this, 72, 29);
/*  288 */     this.leg3startpart3.func_78789_a(-2.0F, -2.0F, -4.0F, 4, 4, 2);
/*  289 */     this.leg3startpart3.func_78793_a(6.0F, 3.0F, 8.0F);
/*  290 */     this.leg3startpart3.func_78787_b(512, 256);
/*  291 */     this.leg3startpart3.field_78809_i = true;
/*  292 */     setRotation(this.leg3startpart3, 0.669215F, -2.356194F, 0.0F);
/*  293 */     this.leg3 = new ModelRenderer(this, 72, 36);
/*  294 */     this.leg3.func_78789_a(-1.5F, -3.0F, -13.0F, 3, 3, 10);
/*  295 */     this.leg3.func_78793_a(6.0F, 3.0F, 8.0F);
/*  296 */     this.leg3.func_78787_b(512, 256);
/*  297 */     this.leg3.field_78809_i = true;
/*  298 */     setRotation(this.leg3, 1.041001F, -2.356194F, 0.0F);
/*  299 */     this.leg3part2 = new ModelRenderer(this, 33, 50);
/*  300 */     this.leg3part2.func_78789_a(-2.0F, -1.5F, -13.0F, 4, 3, 15);
/*  301 */     this.leg3part2.func_78793_a(12.0F, 13.0F, 14.0F);
/*  302 */     this.leg3part2.func_78787_b(512, 256);
/*  303 */     this.leg3part2.field_78809_i = true;
/*  304 */     setRotation(this.leg3part2, -1.152537F, -2.356194F, 0.0F);
/*  305 */     this.leg3part2b = new ModelRenderer(this, 33, 50);
/*  306 */     this.leg3part2b.func_78789_a(-2.0F, 0.5F, 1.0F, 4, 1, 3);
/*  307 */     this.leg3part2b.func_78793_a(12.0F, 13.0F, 14.0F);
/*  308 */     this.leg3part2b.func_78787_b(512, 256);
/*  309 */     this.leg3part2b.field_78809_i = true;
/*  310 */     setRotation(this.leg3part2b, -0.7435722F, -2.356194F, 0.0F);
/*  311 */     this.leg3part2c = new ModelRenderer(this, 33, 50);
/*  312 */     this.leg3part2c.func_78789_a(-2.0F, -7.5F, -13.0F, 4, 1, 3);
/*  313 */     this.leg3part2c.func_78793_a(12.0F, 13.0F, 14.0F);
/*  314 */     this.leg3part2c.func_78787_b(512, 256);
/*  315 */     this.leg3part2c.field_78809_i = true;
/*  316 */     setRotation(this.leg3part2c, -0.6320451F, -2.356194F, 0.0F);
/*  317 */     this.leg3part2d = new ModelRenderer(this, 111, 50);
/*  318 */     this.leg3part2d.func_78789_a(-1.5F, -1.5F, -10.0F, 3, 3, 12);
/*  319 */     this.leg3part2d.func_78793_a(12.0F, 13.0F, 14.0F);
/*  320 */     this.leg3part2d.func_78787_b(512, 256);
/*  321 */     this.leg3part2d.field_78809_i = true;
/*  322 */     setRotation(this.leg3part2d, -1.041001F, -2.356194F, 0.0F);
/*  323 */     this.leg3part3 = new ModelRenderer(this, 72, 69);
/*  324 */     this.leg3part3.func_78789_a(-1.5F, -1.5F, -7.0F, 3, 3, 7);
/*  325 */     this.leg3part3.func_78793_a(16.0F, 3.0F, 18.0F);
/*  326 */     this.leg3part3.func_78787_b(512, 256);
/*  327 */     this.leg3part3.field_78809_i = true;
/*  328 */     setRotation(this.leg3part3, 0.669215F, -2.356194F, 0.0F);
/*  329 */     this.leg3part3b = new ModelRenderer(this, 72, 80);
/*  330 */     this.leg3part3b.func_78789_a(-2.0F, -2.0F, -2.0F, 4, 16, 4);
/*  331 */     this.leg3part3b.func_78793_a(20.0F, 8.0F, 22.0F);
/*  332 */     this.leg3part3b.func_78787_b(512, 256);
/*  333 */     this.leg3part3b.field_78809_i = true;
/*  334 */     setRotation(this.leg3part3b, -0.4833219F, -2.356194F, -0.0349066F);
/*  335 */     this.leg3part3c = new ModelRenderer(this, 89, 80);
/*  336 */     this.leg3part3c.func_78789_a(-2.0F, 14.0F, 0.0F, 4, 3, 2);
/*  337 */     this.leg3part3c.func_78793_a(20.0F, 8.0F, 22.0F);
/*  338 */     this.leg3part3c.func_78787_b(512, 256);
/*  339 */     this.leg3part3c.field_78809_i = true;
/*  340 */     setRotation(this.leg3part3c, -0.4833219F, -2.356194F, -0.0349066F);
/*  341 */     this.leg4start = new ModelRenderer(this, 52, 0);
/*  342 */     this.leg4start.func_78789_a(-3.0F, -3.0F, -3.0F, 6, 6, 4);
/*  343 */     this.leg4start.func_78793_a(-4.0F, 3.0F, 6.0F);
/*  344 */     this.leg4start.func_78787_b(512, 256);
/*  345 */     this.leg4start.field_78809_i = true;
/*  346 */     setRotation(this.leg4start, 0.0F, 2.356194F, 0.0F);
/*  347 */     this.leg4startpart2 = new ModelRenderer(this, 72, 19);
/*  348 */     this.leg4startpart2.func_78789_a(-2.5F, -2.0F, -3.0F, 5, 5, 4);
/*  349 */     this.leg4startpart2.func_78793_a(-6.0F, 3.0F, 8.0F);
/*  350 */     this.leg4startpart2.func_78787_b(512, 256);
/*  351 */     this.leg4startpart2.field_78809_i = true;
/*  352 */     setRotation(this.leg4startpart2, 0.3717861F, 2.356194F, 0.0F);
/*  353 */     this.leg4startpart3 = new ModelRenderer(this, 72, 29);
/*  354 */     this.leg4startpart3.func_78789_a(-2.0F, -2.0F, -4.0F, 4, 4, 2);
/*  355 */     this.leg4startpart3.func_78793_a(-6.0F, 3.0F, 8.0F);
/*  356 */     this.leg4startpart3.func_78787_b(512, 256);
/*  357 */     this.leg4startpart3.field_78809_i = true;
/*  358 */     setRotation(this.leg4startpart3, 0.669215F, 2.356194F, 0.0F);
/*  359 */     this.leg4 = new ModelRenderer(this, 72, 36);
/*  360 */     this.leg4.func_78789_a(-1.5F, -3.0F, -13.0F, 3, 3, 10);
/*  361 */     this.leg4.func_78793_a(-6.0F, 3.0F, 8.0F);
/*  362 */     this.leg4.func_78787_b(512, 256);
/*  363 */     this.leg4.field_78809_i = true;
/*  364 */     setRotation(this.leg4, 1.041001F, 2.356194F, 0.0F);
/*  365 */     this.leg4part2 = new ModelRenderer(this, 72, 50);
/*  366 */     this.leg4part2.func_78789_a(-2.0F, -1.5F, -13.0F, 4, 3, 15);
/*  367 */     this.leg4part2.func_78793_a(-12.0F, 13.0F, 14.0F);
/*  368 */     this.leg4part2.func_78787_b(512, 256);
/*  369 */     this.leg4part2.field_78809_i = true;
/*  370 */     setRotation(this.leg4part2, -1.152537F, 2.356194F, 0.0F);
/*  371 */     this.leg4part2b = new ModelRenderer(this, 33, 50);
/*  372 */     this.leg4part2b.func_78789_a(-2.0F, 0.5F, 1.0F, 4, 1, 3);
/*  373 */     this.leg4part2b.func_78793_a(-12.0F, 13.0F, 14.0F);
/*  374 */     this.leg4part2b.func_78787_b(512, 256);
/*  375 */     this.leg4part2b.field_78809_i = true;
/*  376 */     setRotation(this.leg4part2b, -0.7435722F, 2.363176F, 0.0F);
/*  377 */     this.leg4part2c = new ModelRenderer(this, 33, 50);
/*  378 */     this.leg4part2c.func_78789_a(-2.0F, -7.5F, -13.0F, 4, 1, 3);
/*  379 */     this.leg4part2c.func_78793_a(-12.0F, 13.0F, 14.0F);
/*  380 */     this.leg4part2c.func_78787_b(512, 256);
/*  381 */     this.leg4part2c.field_78809_i = true;
/*  382 */     setRotation(this.leg4part2c, -0.6320451F, 2.356194F, 0.0F);
/*  383 */     this.leg4part2d = new ModelRenderer(this, 111, 50);
/*  384 */     this.leg4part2d.func_78789_a(-1.5F, -1.5F, -10.0F, 3, 3, 12);
/*  385 */     this.leg4part2d.func_78793_a(-12.0F, 13.0F, 14.0F);
/*  386 */     this.leg4part2d.func_78787_b(512, 256);
/*  387 */     this.leg4part2d.field_78809_i = true;
/*  388 */     setRotation(this.leg4part2d, -1.041001F, 2.356194F, 0.0F);
/*  389 */     this.leg4part3 = new ModelRenderer(this, 72, 69);
/*  390 */     this.leg4part3.func_78789_a(-1.5F, -1.5F, -7.0F, 3, 3, 7);
/*  391 */     this.leg4part3.func_78793_a(-16.0F, 3.0F, 18.0F);
/*  392 */     this.leg4part3.func_78787_b(512, 256);
/*  393 */     this.leg4part3.field_78809_i = true;
/*  394 */     setRotation(this.leg4part3, 0.669215F, 2.356194F, 0.0F);
/*  395 */     this.leg4part3b = new ModelRenderer(this, 72, 80);
/*  396 */     this.leg4part3b.func_78789_a(-2.0F, -2.0F, -2.0F, 4, 16, 4);
/*  397 */     this.leg4part3b.func_78793_a(-20.0F, 8.0F, 22.0F);
/*  398 */     this.leg4part3b.func_78787_b(512, 256);
/*  399 */     this.leg4part3b.field_78809_i = true;
/*  400 */     setRotation(this.leg4part3b, -0.4833219F, 2.356194F, -0.0349066F);
/*  401 */     this.leg4part3c = new ModelRenderer(this, 42, 80);
/*  402 */     this.leg4part3c.func_78789_a(-2.0F, 14.0F, 0.0F, 4, 3, 2);
/*  403 */     this.leg4part3c.func_78793_a(-20.0F, 8.0F, 22.0F);
/*  404 */     this.leg4part3c.func_78787_b(512, 256);
/*  405 */     this.leg4part3c.field_78809_i = true;
/*  406 */     setRotation(this.leg4part3c, -0.4833219F, 2.356194F, -0.0349066F);
/*  407 */     this.bodybase = new ModelRenderer(this, 98, 0);
/*  408 */     this.bodybase.func_78789_a(-5.0F, -20.0F, -6.5F, 10, 20, 13);
/*  409 */     this.bodybase.func_78793_a(0.0F, 1.0F, 1.0F);
/*  410 */     this.bodybase.func_78787_b(512, 256);
/*  411 */     this.bodybase.field_78809_i = true;
/*  412 */     setRotation(this.bodybase, 0.0F, 0.0F, 0.0F);
/*  413 */     this.bodybasepart2 = new ModelRenderer(this, 146, 0);
/*  414 */     this.bodybasepart2.func_78789_a(-6.0F, -20.0F, -7.5F, 12, 12, 21);
/*  415 */     this.bodybasepart2.func_78793_a(0.0F, 1.0F, 1.0F);
/*  416 */     this.bodybasepart2.func_78787_b(512, 256);
/*  417 */     this.bodybasepart2.field_78809_i = true;
/*  418 */     setRotation(this.bodybasepart2, 0.0F, 0.0F, 0.0F);
/*  419 */     this.bodybasepart3 = new ModelRenderer(this, 213, 0);
/*  420 */     this.bodybasepart3.func_78789_a(-6.5F, -20.0F, -7.5F, 13, 12, 21);
/*  421 */     this.bodybasepart3.func_78793_a(0.0F, 1.0F, 1.0F);
/*  422 */     this.bodybasepart3.func_78787_b(512, 256);
/*  423 */     this.bodybasepart3.field_78809_i = true;
/*  424 */     setRotation(this.bodybasepart3, 0.0F, 0.0F, 0.0F);
/*  425 */     this.bodybasepart4 = new ModelRenderer(this, 132, 34);
/*  426 */     this.bodybasepart4.func_78789_a(-5.0F, -18.0F, -16.5F, 10, 8, 9);
/*  427 */     this.bodybasepart4.func_78793_a(0.0F, 1.0F, 1.0F);
/*  428 */     this.bodybasepart4.func_78787_b(512, 256);
/*  429 */     this.bodybasepart4.field_78809_i = true;
/*  430 */     setRotation(this.bodybasepart4, 0.0F, 0.0F, 0.0F);
/*  431 */     this.bodybasepart5 = new ModelRenderer(this, 172, 36);
/*  432 */     this.bodybasepart5.func_78789_a(-5.0F, -19.0F, 13.5F, 10, 10, 5);
/*  433 */     this.bodybasepart5.func_78793_a(0.0F, 1.0F, 1.0F);
/*  434 */     this.bodybasepart5.func_78787_b(512, 256);
/*  435 */     this.bodybasepart5.field_78809_i = true;
/*  436 */     setRotation(this.bodybasepart5, 0.0F, 0.0F, 0.0F);
/*  437 */     this.bodybasepart6 = new ModelRenderer(this, 142, 53);
/*  438 */     this.bodybasepart6.func_78789_a(-4.5F, -18.0F, 18.5F, 9, 4, 3);
/*  439 */     this.bodybasepart6.func_78793_a(0.0F, 1.0F, 1.0F);
/*  440 */     this.bodybasepart6.func_78787_b(512, 256);
/*  441 */     this.bodybasepart6.field_78809_i = true;
/*  442 */     setRotation(this.bodybasepart6, 0.0F, 0.0F, 0.0F);
/*  443 */     this.bodybasepart7 = new ModelRenderer(this, 167, 53);
/*  444 */     this.bodybasepart7.func_78789_a(-2.5F, -26.0F, -10.5F, 5, 2, 9);
/*  445 */     this.bodybasepart7.func_78793_a(0.0F, 1.0F, 1.0F);
/*  446 */     this.bodybasepart7.func_78787_b(512, 256);
/*  447 */     this.bodybasepart7.field_78809_i = true;
/*  448 */     setRotation(this.bodybasepart7, -1.264073F, 0.0F, 0.0F);
/*  449 */     this.bodybasepart8 = new ModelRenderer(this, 111, 68);
/*  450 */     this.bodybasepart8.func_78789_a(-6.0F, -13.0F, -18.5F, 12, 10, 11);
/*  451 */     this.bodybasepart8.func_78793_a(0.0F, 1.0F, 1.0F);
/*  452 */     this.bodybasepart8.func_78787_b(512, 256);
/*  453 */     this.bodybasepart8.field_78809_i = true;
/*  454 */     setRotation(this.bodybasepart8, -0.4089647F, 0.0F, 0.0F);
/*  455 */     this.bodybasepart9 = new ModelRenderer(this, 157, 66);
/*  456 */     this.bodybasepart9.func_78789_a(-7.5F, -14.0F, -11.5F, 15, 16, 7);
/*  457 */     this.bodybasepart9.func_78793_a(0.0F, 1.0F, 1.0F);
/*  458 */     this.bodybasepart9.func_78787_b(512, 256);
/*  459 */     this.bodybasepart9.field_78809_i = true;
/*  460 */     setRotation(this.bodybasepart9, -1.412787F, 0.0F, 0.0F);
/*  461 */     this.bodybasepart10 = new ModelRenderer(this, 204, 35);
/*  462 */     this.bodybasepart10.func_78789_a(-7.5F, -22.0F, -9.5F, 15, 5, 22);
/*  463 */     this.bodybasepart10.func_78793_a(0.0F, 1.0F, 1.0F);
/*  464 */     this.bodybasepart10.func_78787_b(512, 256);
/*  465 */     this.bodybasepart10.field_78809_i = true;
/*  466 */     setRotation(this.bodybasepart10, 0.0F, 0.0F, 0.0F);
/*  467 */     this.bodybasepart11 = new ModelRenderer(this, 204, 63);
/*  468 */     this.bodybasepart11.func_78789_a(-6.5F, -21.0F, -14.5F, 13, 4, 5);
/*  469 */     this.bodybasepart11.func_78793_a(0.0F, 1.0F, 1.0F);
/*  470 */     this.bodybasepart11.func_78787_b(512, 256);
/*  471 */     this.bodybasepart11.field_78809_i = true;
/*  472 */     setRotation(this.bodybasepart11, 0.0F, 0.0F, 0.0F);
/*  473 */     this.bodybasepart12 = new ModelRenderer(this, 282, 0);
/*  474 */     this.bodybasepart12.func_78789_a(-5.0F, -3.0F, 2.5F, 10, 4, 12);
/*  475 */     this.bodybasepart12.func_78793_a(0.0F, 1.0F, 1.0F);
/*  476 */     this.bodybasepart12.func_78787_b(512, 256);
/*  477 */     this.bodybasepart12.field_78809_i = true;
/*  478 */     setRotation(this.bodybasepart12, 0.4833219F, 0.0F, 0.0F);
/*  479 */     this.bodybasepart13 = new ModelRenderer(this, 327, 0);
/*  480 */     this.bodybasepart13.func_78789_a(4.0F, 1.0F, -3.5F, 4, 2, 10);
/*  481 */     this.bodybasepart13.func_78793_a(0.0F, 1.0F, 1.0F);
/*  482 */     this.bodybasepart13.func_78787_b(512, 256);
/*  483 */     this.bodybasepart13.field_78809_i = true;
/*  484 */     setRotation(this.bodybasepart13, 0.1858931F, 0.0F, -1.003822F);
/*  485 */     this.bodybasepart14 = new ModelRenderer(this, 327, 0);
/*  486 */     this.bodybasepart14.func_78789_a(-8.0F, 1.0F, -3.5F, 4, 2, 10);
/*  487 */     this.bodybasepart14.func_78793_a(0.0F, 1.0F, 1.0F);
/*  488 */     this.bodybasepart14.func_78787_b(512, 256);
/*  489 */     this.bodybasepart14.field_78809_i = true;
/*  490 */     setRotation(this.bodybasepart14, 0.185895F, 0.0F, 1.003826F);
/*  491 */     this.bodybasepart15 = new ModelRenderer(this, 144, 91);
/*  492 */     this.bodybasepart15.func_78789_a(-2.5F, -25.0F, 1.5F, 5, 3, 7);
/*  493 */     this.bodybasepart15.func_78793_a(0.0F, 1.0F, 1.0F);
/*  494 */     this.bodybasepart15.func_78787_b(512, 256);
/*  495 */     this.bodybasepart15.field_78809_i = true;
/*  496 */     setRotation(this.bodybasepart15, -0.7504916F, 0.0F, 0.0F);
/*  497 */     this.upperjawbase = new ModelRenderer(this, 0, 37);
/*  498 */     this.upperjawbase.func_78789_a(-3.5F, -2.0F, -6.0F, 7, 5, 6);
/*  499 */     this.upperjawbase.func_78793_a(0.0F, -13.0F, -15.0F);
/*  500 */     this.upperjawbase.func_78787_b(512, 256);
/*  501 */     this.upperjawbase.field_78809_i = true;
/*  502 */     setRotation(this.upperjawbase, 0.0F, 0.0F, 0.0F);
/*  503 */     this.upperjawbasepart1 = new ModelRenderer(this, 35, 28);
/*  504 */     this.upperjawbasepart1.func_78789_a(-4.5F, -1.0F, -7.0F, 3, 3, 2);
/*  505 */     this.upperjawbasepart1.func_78793_a(0.0F, -13.0F, -15.0F);
/*  506 */     this.upperjawbasepart1.func_78787_b(512, 256);
/*  507 */     this.upperjawbasepart1.field_78809_i = true;
/*  508 */     setRotation(this.upperjawbasepart1, 0.0F, 0.0F, 0.0F);
/*  509 */     this.upperjawbasepart2 = new ModelRenderer(this, 35, 28);
/*  510 */     this.upperjawbasepart2.func_78789_a(1.5F, -1.0F, -7.0F, 3, 3, 2);
/*  511 */     this.upperjawbasepart2.func_78793_a(0.0F, -13.0F, -15.0F);
/*  512 */     this.upperjawbasepart2.func_78787_b(512, 256);
/*  513 */     this.upperjawbasepart2.field_78809_i = true;
/*  514 */     setRotation(this.upperjawbasepart2, 0.0F, 0.0F, 0.0F);
/*  515 */     this.upperjawbasepart3 = new ModelRenderer(this, 27, 37);
/*  516 */     this.upperjawbasepart3.func_78789_a(-1.0F, -1.0F, -7.0F, 2, 3, 2);
/*  517 */     this.upperjawbasepart3.func_78793_a(0.0F, -13.0F, -15.0F);
/*  518 */     this.upperjawbasepart3.func_78787_b(512, 256);
/*  519 */     this.upperjawbasepart3.field_78809_i = true;
/*  520 */     setRotation(this.upperjawbasepart3, 0.0F, 0.0F, 0.0F);
/*  521 */     this.tooth1 = new ModelRenderer(this, 116, 34);
/*  522 */     this.tooth1.func_78789_a(-1.5F, -2.0F, -14.0F, 2, 2, 7);
/*  523 */     this.tooth1.func_78793_a(0.0F, -13.0F, -15.0F);
/*  524 */     this.tooth1.func_78787_b(512, 256);
/*  525 */     this.tooth1.field_78809_i = true;
/*  526 */     setRotation(this.tooth1, 0.2602503F, 0.3717861F, 0.0F);
/*  527 */     this.tooth2 = new ModelRenderer(this, 116, 34);
/*  528 */     this.tooth2.func_78789_a(-0.5F, -2.0F, -14.0F, 2, 2, 7);
/*  529 */     this.tooth2.func_78793_a(0.0F, -13.0F, -15.0F);
/*  530 */     this.tooth2.func_78787_b(512, 256);
/*  531 */     this.tooth2.field_78809_i = true;
/*  532 */     setRotation(this.tooth2, 0.2602503F, -0.3717861F, 0.0F);
/*  533 */     this.tooth3 = new ModelRenderer(this, 116, 34);
/*  534 */     this.tooth3.func_78789_a(-1.0F, -2.0F, -14.0F, 2, 2, 7);
/*  535 */     this.tooth3.func_78793_a(0.0F, -13.0F, -15.0F);
/*  536 */     this.tooth3.func_78787_b(512, 256);
/*  537 */     this.tooth3.field_78809_i = true;
/*  538 */     setRotation(this.tooth3, 0.2602503F, 0.0F, 0.0F);
/*  539 */     this.tooth4 = new ModelRenderer(this, 90, 111);
/*  540 */     this.tooth4.func_78789_a(-5.5F, 1.5F, -23.5F, 3, 2, 5);
/*  541 */     this.tooth4.func_78793_a(0.0F, 0.0F, -6.0F);
/*  542 */     this.tooth4.func_78787_b(512, 256);
/*  543 */     this.tooth4.field_78809_i = true;
/*  544 */     setRotation(this.tooth4, -0.2230717F, 0.0F, 0.0F);
/*  545 */     this.tooth5 = new ModelRenderer(this, 90, 111);
/*  546 */     this.tooth5.func_78789_a(2.5F, 1.5F, -23.5F, 3, 2, 5);
/*  547 */     this.tooth5.func_78793_a(0.0F, 0.0F, -6.0F);
/*  548 */     this.tooth5.func_78787_b(512, 256);
/*  549 */     this.tooth5.field_78809_i = true;
/*  550 */     setRotation(this.tooth5, -0.2230717F, 0.0F, 0.0F);
/*  551 */     this.lowerjawbase = new ModelRenderer(this, 90, 91);
/*  552 */     this.lowerjawbase.func_78789_a(-5.0F, -1.0F, -15.5F, 10, 2, 16);
/*  553 */     this.lowerjawbase.func_78793_a(0.0F, 0.0F, -6.0F);
/*  554 */     this.lowerjawbase.func_78787_b(512, 256);
/*  555 */     this.lowerjawbase.field_78809_i = true;
/*  556 */     setRotation(this.lowerjawbase, 0.0F, 0.0F, 0.0F);
/*  557 */     this.lowerjawbasepart1 = new ModelRenderer(this, 0, 69);
/*  558 */     this.lowerjawbasepart1.func_78789_a(-5.0F, -3.0F, -15.5F, 1, 2, 16);
/*  559 */     this.lowerjawbasepart1.func_78793_a(0.0F, 0.0F, -6.0F);
/*  560 */     this.lowerjawbasepart1.func_78787_b(512, 256);
/*  561 */     this.lowerjawbasepart1.field_78809_i = true;
/*  562 */     setRotation(this.lowerjawbasepart1, 0.0F, 0.0F, 0.0F);
/*  563 */     this.lowerjawbasepart2 = new ModelRenderer(this, 0, 69);
/*  564 */     this.lowerjawbasepart2.func_78789_a(4.0F, -3.0F, -15.5F, 1, 2, 16);
/*  565 */     this.lowerjawbasepart2.func_78793_a(0.0F, 0.0F, -6.0F);
/*  566 */     this.lowerjawbasepart2.func_78787_b(512, 256);
/*  567 */     this.lowerjawbasepart2.field_78809_i = true;
/*  568 */     setRotation(this.lowerjawbasepart2, 0.0F, 0.0F, 0.0F);
/*  569 */     this.lowerjawbasepart3 = new ModelRenderer(this, 0, 88);
/*  570 */     this.lowerjawbasepart3.func_78789_a(-4.0F, -2.0F, -15.5F, 1, 1, 16);
/*  571 */     this.lowerjawbasepart3.func_78793_a(0.0F, 0.0F, -6.0F);
/*  572 */     this.lowerjawbasepart3.func_78787_b(512, 256);
/*  573 */     this.lowerjawbasepart3.field_78809_i = true;
/*  574 */     setRotation(this.lowerjawbasepart3, 0.0F, 0.0F, 0.0F);
/*  575 */     this.lowerjawbasepart4 = new ModelRenderer(this, 0, 88);
/*  576 */     this.lowerjawbasepart4.func_78789_a(3.0F, -2.0F, -15.5F, 1, 1, 16);
/*  577 */     this.lowerjawbasepart4.func_78793_a(0.0F, 0.0F, -6.0F);
/*  578 */     this.lowerjawbasepart4.func_78787_b(512, 256);
/*  579 */     this.lowerjawbasepart4.field_78809_i = true;
/*  580 */     setRotation(this.lowerjawbasepart4, 0.0F, 0.0F, 0.0F);
/*  581 */     this.lowerjawbasepart5 = new ModelRenderer(this, 35, 134);
/*  582 */     this.lowerjawbasepart5.func_78789_a(5.0F, -5.0F, -16.5F, 2, 4, 20);
/*  583 */     this.lowerjawbasepart5.func_78793_a(0.0F, 0.0F, -6.0F);
/*  584 */     this.lowerjawbasepart5.func_78787_b(512, 256);
/*  585 */     this.lowerjawbasepart5.field_78809_i = true;
/*  586 */     setRotation(this.lowerjawbasepart5, 0.0F, 0.0F, 0.0F);
/*  587 */     this.lowerjawbasepart6 = new ModelRenderer(this, 35, 109);
/*  588 */     this.lowerjawbasepart6.func_78789_a(-7.0F, -5.0F, -16.5F, 2, 4, 20);
/*  589 */     this.lowerjawbasepart6.func_78793_a(0.0F, 0.0F, -6.0F);
/*  590 */     this.lowerjawbasepart6.func_78787_b(512, 256);
/*  591 */     this.lowerjawbasepart6.field_78809_i = true;
/*  592 */     setRotation(this.lowerjawbasepart6, 0.0F, 0.0F, 0.0F);
/*  593 */     this.lowerjawbasepart7 = new ModelRenderer(this, 73, 101);
/*  594 */     this.lowerjawbasepart7.func_78789_a(-6.0F, -3.0F, -19.5F, 4, 3, 4);
/*  595 */     this.lowerjawbasepart7.func_78793_a(0.0F, 0.0F, -6.0F);
/*  596 */     this.lowerjawbasepart7.func_78787_b(512, 256);
/*  597 */     this.lowerjawbasepart7.field_78809_i = true;
/*  598 */     setRotation(this.lowerjawbasepart7, 0.0F, 0.0F, 0.0F);
/*  599 */     this.lowerjawbasepart8 = new ModelRenderer(this, 73, 101);
/*  600 */     this.lowerjawbasepart8.func_78789_a(2.0F, -3.0F, -19.5F, 4, 3, 4);
/*  601 */     this.lowerjawbasepart8.func_78793_a(0.0F, 0.0F, -6.0F);
/*  602 */     this.lowerjawbasepart8.func_78787_b(512, 256);
/*  603 */     this.lowerjawbasepart8.field_78809_i = true;
/*  604 */     setRotation(this.lowerjawbasepart8, 0.0F, 0.0F, 0.0F);
/*  605 */     this.lowerjawbasepart9 = new ModelRenderer(this, 95, 72);
/*  606 */     this.lowerjawbasepart9.func_78789_a(-2.0F, -2.0F, -18.5F, 4, 2, 3);
/*  607 */     this.lowerjawbasepart9.func_78793_a(0.0F, 0.0F, -6.0F);
/*  608 */     this.lowerjawbasepart9.func_78787_b(512, 256);
/*  609 */     this.lowerjawbasepart9.field_78809_i = true;
/*  610 */     setRotation(this.lowerjawbasepart9, 0.0F, 0.0F, 0.0F);
/*  611 */     this.lowerjawbasepart10 = new ModelRenderer(this, 0, 106);
/*  612 */     this.lowerjawbasepart10.func_78789_a(-8.0F, -3.0F, -12.5F, 1, 2, 16);
/*  613 */     this.lowerjawbasepart10.func_78793_a(0.0F, 0.0F, -6.0F);
/*  614 */     this.lowerjawbasepart10.func_78787_b(512, 256);
/*  615 */     this.lowerjawbasepart10.field_78809_i = true;
/*  616 */     setRotation(this.lowerjawbasepart10, 0.0F, 0.0F, 0.0F);
/*  617 */     this.lowerjawbasepart11 = new ModelRenderer(this, 0, 106);
/*  618 */     this.lowerjawbasepart11.func_78789_a(7.0F, -3.0F, -12.5F, 1, 2, 16);
/*  619 */     this.lowerjawbasepart11.func_78793_a(0.0F, 0.0F, -6.0F);
/*  620 */     this.lowerjawbasepart11.func_78787_b(512, 256);
/*  621 */     this.lowerjawbasepart11.field_78809_i = true;
/*  622 */     setRotation(this.lowerjawbasepart11, 0.0F, 0.0F, 0.0F);
/*  623 */     this.arm1start = new ModelRenderer(this, 0, 50);
/*  624 */     this.arm1start.func_78789_a(-0.5F, -1.0F, -1.0F, 3, 2, 2);
/*  625 */     this.arm1start.func_78793_a(5.0F, -11.0F, -14.0F);
/*  626 */     this.arm1start.func_78787_b(512, 256);
/*  627 */     this.arm1start.field_78809_i = true;
/*  628 */     setRotation(this.arm1start, 0.0F, 0.0F, 0.0F);
/*  629 */     this.arm1 = new ModelRenderer(this, 9, 125);
/*  630 */     this.arm1.func_78789_a(-0.5F, -1.0F, -1.0F, 2, 5, 2);
/*  631 */     this.arm1.func_78793_a(7.0F, -11.0F, -14.0F);
/*  632 */     this.arm1.func_78787_b(512, 256);
/*  633 */     this.arm1.field_78809_i = true;
/*  634 */     setRotation(this.arm1, -0.8922867F, 0.0F, 0.0F);
/*  635 */     this.arm1part2 = new ModelRenderer(this, 9, 133);
/*  636 */     this.arm1part2.func_78789_a(-0.5F, -1.0F, -1.0F, 2, 5, 2);
/*  637 */     this.arm1part2.func_78793_a(7.0F, -9.0F, -16.5F);
/*  638 */     this.arm1part2.func_78787_b(512, 256);
/*  639 */     this.arm1part2.field_78809_i = true;
/*  640 */     setRotation(this.arm1part2, 0.7435722F, 0.0F, 0.0F);
/*  641 */     this.arm1end = new ModelRenderer(this, 9, 141);
/*  642 */     this.arm1end.func_78789_a(1.0F, 3.0F, 1.0F, 1, 1, 2);
/*  643 */     this.arm1end.func_78793_a(6.0F, -9.0F, -16.5F);
/*  644 */     this.arm1end.func_78787_b(512, 256);
/*  645 */     this.arm1end.field_78809_i = true;
/*  646 */     setRotation(this.arm1end, 0.7435722F, 0.0F, 0.0F);
/*  647 */     this.arm2start = new ModelRenderer(this, 0, 50);
/*  648 */     this.arm2start.func_78789_a(-2.5F, -1.0F, -1.0F, 3, 2, 2);
/*  649 */     this.arm2start.func_78793_a(-5.0F, -11.0F, -14.0F);
/*  650 */     this.arm2start.func_78787_b(512, 256);
/*  651 */     this.arm2start.field_78809_i = true;
/*  652 */     setRotation(this.arm2start, 0.0F, 0.0F, 0.0F);
/*  653 */     this.arm2 = new ModelRenderer(this, 0, 125);
/*  654 */     this.arm2.func_78789_a(-1.5F, -1.0F, -1.0F, 2, 5, 2);
/*  655 */     this.arm2.func_78793_a(-7.0F, -11.0F, -14.0F);
/*  656 */     this.arm2.func_78787_b(512, 256);
/*  657 */     this.arm2.field_78809_i = true;
/*  658 */     setRotation(this.arm2, -0.8922867F, 0.0F, 0.0F);
/*  659 */     this.arm2part2 = new ModelRenderer(this, 0, 133);
/*  660 */     this.arm2part2.func_78789_a(-1.5F, -1.0F, -1.0F, 2, 5, 2);
/*  661 */     this.arm2part2.func_78793_a(-7.0F, -9.0F, -16.5F);
/*  662 */     this.arm2part2.func_78787_b(512, 256);
/*  663 */     this.arm2part2.field_78809_i = true;
/*  664 */     setRotation(this.arm2part2, 0.7435722F, 0.0F, 0.0F);
/*  665 */     this.arm2end = new ModelRenderer(this, 0, 141);
/*  666 */     this.arm2end.func_78789_a(-1.0F, 3.0F, 1.0F, 1, 1, 2);
/*  667 */     this.arm2end.func_78793_a(-7.0F, -9.0F, -16.5F);
/*  668 */     this.arm2end.func_78787_b(512, 256);
/*  669 */     this.arm2end.field_78809_i = true;
/*  670 */     setRotation(this.arm2end, 0.7435722F, 0.0F, 0.0F);
/*  671 */     this.eye1 = new ModelRenderer(this, 36, 37);
/*  672 */     this.eye1.func_78789_a(-0.5F, -1.0F, -1.0F, 1, 2, 2);
/*  673 */     this.eye1.func_78793_a(6.5F, -10.0F, -11.0F);
/*  674 */     this.eye1.func_78787_b(512, 256);
/*  675 */     this.eye1.field_78809_i = true;
/*  676 */     setRotation(this.eye1, 0.0F, 0.0F, 0.0F);
/*  677 */     this.eye2 = new ModelRenderer(this, 36, 37);
/*  678 */     this.eye2.func_78789_a(-0.5F, -1.0F, -1.0F, 1, 2, 2);
/*  679 */     this.eye2.func_78793_a(-6.5F, -10.0F, -11.0F);
/*  680 */     this.eye2.func_78787_b(512, 256);
/*  681 */     this.eye2.field_78809_i = true;
/*  682 */     setRotation(this.eye2, 0.0F, 0.0F, 0.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/*  689 */     SpitBug e = (SpitBug)entity;
/*  690 */     RenderInfo r = null;
/*  691 */     super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
/*  692 */     func_78087_a(f, f1, f2, f3, f4, f5, entity);
/*  693 */     float newangle = 0.0F, upangle = 0.0F, nextangle = 0.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  700 */     float pi4 = 1.570795F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  863 */     newangle = MathHelper.func_76126_a(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/*  864 */     nextangle = MathHelper.func_76126_a((f2 + 0.1F) * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1;
/*  865 */     upangle = 0.0F;
/*  866 */     if (nextangle > newangle)
/*  867 */       upangle = Math.abs(MathHelper.func_76134_b(f2 * 2.0F * this.wingspeed) * 3.1415927F * 0.12F * f1); 
/*  868 */     doLeftFrontLeg(newangle, upangle);
/*  869 */     doLeftRearLeg(-newangle, upangle);
/*      */     
/*  871 */     newangle = MathHelper.func_76126_a((float)((f2 * 2.0F * this.wingspeed) + Math.PI)) * 3.1415927F * 0.12F * f1;
/*  872 */     nextangle = MathHelper.func_76126_a((float)(((f2 + 0.1F) * 2.0F * this.wingspeed) + Math.PI)) * 3.1415927F * 0.12F * f1;
/*  873 */     upangle = 0.0F;
/*  874 */     if (nextangle > newangle)
/*  875 */       upangle = Math.abs(MathHelper.func_76134_b((float)((f2 * 2.0F * this.wingspeed) + Math.PI)) * 3.1415927F * 0.12F * f1); 
/*  876 */     doRightFrontLeg(-newangle, upangle);
/*  877 */     doRightRearLeg(newangle, upangle);
/*      */ 
/*      */ 
/*      */     
/*  881 */     if (e.getAttacking() == 0) {
/*  882 */       newangle = MathHelper.func_76134_b(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.015F;
/*      */     } else {
/*  884 */       newangle = MathHelper.func_76134_b(f2 * 2.6F * this.wingspeed) * 3.1415927F * 0.1F;
/*      */     } 
/*  886 */     newangle = Math.abs(newangle);
/*      */     
/*  888 */     this.upperjawbasepart1.field_78795_f = newangle;
/*  889 */     this.upperjawbasepart2.field_78795_f = newangle;
/*  890 */     this.upperjawbasepart3.field_78795_f = newangle;
/*  891 */     this.tooth1.field_78795_f = 0.26F + newangle;
/*  892 */     this.tooth2.field_78795_f = 0.26F + newangle;
/*  893 */     this.tooth3.field_78795_f = 0.26F + newangle;
/*      */     
/*  895 */     this.legintersection.func_78785_a(f5);
/*  896 */     this.legintersectionpart2.func_78785_a(f5);
/*  897 */     this.legintersectionpart3.func_78785_a(f5);
/*  898 */     this.leg1start.func_78785_a(f5);
/*  899 */     this.leg1startpart2.func_78785_a(f5);
/*  900 */     this.leg1startpart3.func_78785_a(f5);
/*  901 */     this.leg1.func_78785_a(f5);
/*  902 */     this.leg1part2.func_78785_a(f5);
/*  903 */     this.leg1part2b.func_78785_a(f5);
/*  904 */     this.leg1part2c.func_78785_a(f5);
/*  905 */     this.leg1part2d.func_78785_a(f5);
/*  906 */     this.leg1part3.func_78785_a(f5);
/*  907 */     this.leg1part3b.func_78785_a(f5);
/*  908 */     this.leg1part3c.func_78785_a(f5);
/*  909 */     this.leg2start.func_78785_a(f5);
/*  910 */     this.leg2startpart2.func_78785_a(f5);
/*  911 */     this.leg2startpart3.func_78785_a(f5);
/*  912 */     this.leg2.func_78785_a(f5);
/*  913 */     this.leg2part2.func_78785_a(f5);
/*  914 */     this.leg2part2b.func_78785_a(f5);
/*  915 */     this.leg2part2c.func_78785_a(f5);
/*  916 */     this.leg2part2d.func_78785_a(f5);
/*  917 */     this.leg2part3.func_78785_a(f5);
/*  918 */     this.leg2part3b.func_78785_a(f5);
/*  919 */     this.leg2part3c.func_78785_a(f5);
/*  920 */     this.leg3start.func_78785_a(f5);
/*  921 */     this.leg3startpart2.func_78785_a(f5);
/*  922 */     this.leg3startpart3.func_78785_a(f5);
/*  923 */     this.leg3.func_78785_a(f5);
/*  924 */     this.leg3part2.func_78785_a(f5);
/*  925 */     this.leg3part2b.func_78785_a(f5);
/*  926 */     this.leg3part2c.func_78785_a(f5);
/*  927 */     this.leg3part2d.func_78785_a(f5);
/*  928 */     this.leg3part3.func_78785_a(f5);
/*  929 */     this.leg3part3b.func_78785_a(f5);
/*  930 */     this.leg3part3c.func_78785_a(f5);
/*  931 */     this.leg4start.func_78785_a(f5);
/*  932 */     this.leg4startpart2.func_78785_a(f5);
/*  933 */     this.leg4startpart3.func_78785_a(f5);
/*  934 */     this.leg4.func_78785_a(f5);
/*  935 */     this.leg4part2.func_78785_a(f5);
/*  936 */     this.leg4part2b.func_78785_a(f5);
/*  937 */     this.leg4part2c.func_78785_a(f5);
/*  938 */     this.leg4part2d.func_78785_a(f5);
/*  939 */     this.leg4part3.func_78785_a(f5);
/*  940 */     this.leg4part3b.func_78785_a(f5);
/*  941 */     this.leg4part3c.func_78785_a(f5);
/*  942 */     this.bodybase.func_78785_a(f5);
/*  943 */     this.bodybasepart2.func_78785_a(f5);
/*  944 */     this.bodybasepart3.func_78785_a(f5);
/*  945 */     this.bodybasepart4.func_78785_a(f5);
/*  946 */     this.bodybasepart5.func_78785_a(f5);
/*  947 */     this.bodybasepart6.func_78785_a(f5);
/*  948 */     this.bodybasepart7.func_78785_a(f5);
/*  949 */     this.bodybasepart8.func_78785_a(f5);
/*  950 */     this.bodybasepart9.func_78785_a(f5);
/*  951 */     this.bodybasepart10.func_78785_a(f5);
/*  952 */     this.bodybasepart11.func_78785_a(f5);
/*  953 */     this.bodybasepart12.func_78785_a(f5);
/*  954 */     this.bodybasepart13.func_78785_a(f5);
/*  955 */     this.bodybasepart14.func_78785_a(f5);
/*  956 */     this.bodybasepart15.func_78785_a(f5);
/*  957 */     this.upperjawbase.func_78785_a(f5);
/*  958 */     this.upperjawbasepart1.func_78785_a(f5);
/*  959 */     this.upperjawbasepart2.func_78785_a(f5);
/*  960 */     this.upperjawbasepart3.func_78785_a(f5);
/*  961 */     this.tooth1.func_78785_a(f5);
/*  962 */     this.tooth2.func_78785_a(f5);
/*  963 */     this.tooth3.func_78785_a(f5);
/*  964 */     this.tooth4.func_78785_a(f5);
/*  965 */     this.tooth5.func_78785_a(f5);
/*  966 */     this.lowerjawbase.func_78785_a(f5);
/*  967 */     this.lowerjawbasepart1.func_78785_a(f5);
/*  968 */     this.lowerjawbasepart2.func_78785_a(f5);
/*  969 */     this.lowerjawbasepart3.func_78785_a(f5);
/*  970 */     this.lowerjawbasepart4.func_78785_a(f5);
/*  971 */     this.lowerjawbasepart5.func_78785_a(f5);
/*  972 */     this.lowerjawbasepart6.func_78785_a(f5);
/*  973 */     this.lowerjawbasepart7.func_78785_a(f5);
/*  974 */     this.lowerjawbasepart8.func_78785_a(f5);
/*  975 */     this.lowerjawbasepart9.func_78785_a(f5);
/*  976 */     this.lowerjawbasepart10.func_78785_a(f5);
/*  977 */     this.lowerjawbasepart11.func_78785_a(f5);
/*  978 */     this.arm1start.func_78785_a(f5);
/*  979 */     this.arm1.func_78785_a(f5);
/*  980 */     this.arm1part2.func_78785_a(f5);
/*  981 */     this.arm1end.func_78785_a(f5);
/*  982 */     this.arm2start.func_78785_a(f5);
/*  983 */     this.arm2.func_78785_a(f5);
/*  984 */     this.arm2part2.func_78785_a(f5);
/*  985 */     this.arm2end.func_78785_a(f5);
/*  986 */     this.eye1.func_78785_a(f5);
/*  987 */     this.eye2.func_78785_a(f5);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/*  993 */     model.field_78795_f = x;
/*  994 */     model.field_78796_g = y;
/*  995 */     model.field_78808_h = z;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 1001 */     super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void doRightFrontLeg(float angle, float upangle) {
/* 1009 */     this.leg1.field_78796_g = -1.2F + angle;
/* 1010 */     this.leg1part2.field_78796_g = this.leg1.field_78796_g;
/* 1011 */     this.leg1part2b.field_78796_g = this.leg1.field_78796_g;
/* 1012 */     this.leg1part2c.field_78796_g = this.leg1.field_78796_g;
/* 1013 */     this.leg1part2d.field_78796_g = this.leg1.field_78796_g;
/* 1014 */     this.leg1part3.field_78796_g = this.leg1.field_78796_g;
/* 1015 */     this.leg1part3b.field_78796_g = this.leg1.field_78796_g;
/* 1016 */     this.leg1part3c.field_78796_g = this.leg1.field_78796_g;
/*      */     
/* 1018 */     float dist = 14.0F;
/* 1019 */     dist = (float)(dist * Math.cos(this.leg1.field_78795_f));
/* 1020 */     this.leg1part2d.field_78798_e = (float)(this.leg1.field_78798_e - Math.cos(this.leg1.field_78796_g) * dist);
/* 1021 */     this.leg1part2d.field_78800_c = (float)(this.leg1.field_78800_c - Math.sin(this.leg1.field_78796_g) * dist);
/*      */     
/* 1023 */     this.leg1part2.field_78795_f = -1.152F + upangle;
/* 1024 */     this.leg1part2b.field_78795_f = -0.743F + upangle;
/* 1025 */     this.leg1part2c.field_78795_f = -0.632F + upangle;
/* 1026 */     this.leg1part2d.field_78795_f = -1.041F + upangle;
/*      */     
/* 1028 */     dist = 14.0F;
/* 1029 */     dist = (float)(dist * Math.cos(this.leg1part2.field_78795_f));
/* 1030 */     this.leg1part3.field_78798_e = (float)(this.leg1part2.field_78798_e - Math.cos(this.leg1part2.field_78796_g) * dist);
/* 1031 */     this.leg1part3.field_78800_c = (float)(this.leg1part2.field_78800_c - Math.sin(this.leg1part2.field_78796_g) * dist);
/*      */     
/* 1033 */     this.leg1part3.field_78795_f = 0.669F - upangle;
/*      */     
/* 1035 */     dist = 8.0F;
/* 1036 */     dist = (float)Math.abs(dist * Math.cos(this.leg1part3.field_78795_f));
/* 1037 */     this.leg1part3c.field_78798_e = (float)(this.leg1part3.field_78798_e - Math.cos(this.leg1part3.field_78796_g) * dist);
/* 1038 */     this.leg1part3c.field_78800_c = (float)(this.leg1part3.field_78800_c - Math.sin(this.leg1part3.field_78796_g) * dist);
/*      */     
/* 1040 */     this.leg1part3b.field_78795_f = -0.48F - upangle;
/* 1041 */     this.leg1part3c.field_78795_f = -0.48F - upangle;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void doLeftFrontLeg(float angle, float upangle) {
/* 1048 */     this.leg2.field_78796_g = 1.2F + angle;
/* 1049 */     this.leg2part2.field_78796_g = this.leg2.field_78796_g;
/* 1050 */     this.leg2part2b.field_78796_g = this.leg2.field_78796_g;
/* 1051 */     this.leg2part2c.field_78796_g = this.leg2.field_78796_g;
/* 1052 */     this.leg2part2d.field_78796_g = this.leg2.field_78796_g;
/* 1053 */     this.leg2part3.field_78796_g = this.leg2.field_78796_g;
/* 1054 */     this.leg2part3b.field_78796_g = this.leg2.field_78796_g;
/* 1055 */     this.leg2part3c.field_78796_g = this.leg2.field_78796_g;
/*      */     
/* 1057 */     float dist = 14.0F;
/* 1058 */     dist = (float)(dist * Math.cos(this.leg2.field_78795_f));
/* 1059 */     this.leg2part2d.field_78798_e = (float)(this.leg2.field_78798_e - Math.cos(this.leg2.field_78796_g) * dist);
/* 1060 */     this.leg2part2d.field_78800_c = (float)(this.leg2.field_78800_c - Math.sin(this.leg2.field_78796_g) * dist);
/*      */     
/* 1062 */     this.leg2part2.field_78795_f = -1.152F + upangle;
/* 1063 */     this.leg2part2b.field_78795_f = -0.743F + upangle;
/* 1064 */     this.leg2part2c.field_78795_f = -0.632F + upangle;
/* 1065 */     this.leg2part2d.field_78795_f = -1.041F + upangle;
/*      */     
/* 1067 */     dist = 14.0F;
/* 1068 */     dist = (float)(dist * Math.cos(this.leg2part2.field_78795_f));
/* 1069 */     this.leg2part3.field_78798_e = (float)(this.leg2part2.field_78798_e - Math.cos(this.leg2part2.field_78796_g) * dist);
/* 1070 */     this.leg2part3.field_78800_c = (float)(this.leg2part2.field_78800_c - Math.sin(this.leg2part2.field_78796_g) * dist);
/*      */     
/* 1072 */     this.leg2part3.field_78795_f = 0.669F - upangle;
/*      */     
/* 1074 */     dist = 8.0F;
/* 1075 */     dist = (float)Math.abs(dist * Math.cos(this.leg2part3.field_78795_f));
/* 1076 */     this.leg2part3c.field_78798_e = (float)(this.leg2part3.field_78798_e - Math.cos(this.leg2part3.field_78796_g) * dist);
/* 1077 */     this.leg2part3c.field_78800_c = (float)(this.leg2part3.field_78800_c - Math.sin(this.leg2part3.field_78796_g) * dist);
/*      */     
/* 1079 */     this.leg2part3b.field_78795_f = -0.48F - upangle;
/* 1080 */     this.leg2part3c.field_78795_f = -0.48F - upangle;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void doRightRearLeg(float angle, float upangle) {
/* 1089 */     this.leg4.field_78796_g = 2.1F + angle;
/* 1090 */     this.leg4part2.field_78796_g = this.leg4.field_78796_g;
/* 1091 */     this.leg4part2b.field_78796_g = this.leg4.field_78796_g;
/* 1092 */     this.leg4part2c.field_78796_g = this.leg4.field_78796_g;
/* 1093 */     this.leg4part2d.field_78796_g = this.leg4.field_78796_g;
/* 1094 */     this.leg4part3.field_78796_g = this.leg4.field_78796_g;
/* 1095 */     this.leg4part3b.field_78796_g = this.leg4.field_78796_g;
/* 1096 */     this.leg4part3c.field_78796_g = this.leg4.field_78796_g;
/*      */     
/* 1098 */     float dist = 14.0F;
/* 1099 */     dist = (float)(dist * Math.cos(this.leg4.field_78795_f));
/* 1100 */     this.leg4part2d.field_78798_e = (float)(this.leg4.field_78798_e - Math.cos(this.leg4.field_78796_g) * dist);
/* 1101 */     this.leg4part2d.field_78800_c = (float)(this.leg4.field_78800_c - Math.sin(this.leg4.field_78796_g) * dist);
/*      */     
/* 1103 */     this.leg4part2.field_78795_f = -1.152F + upangle;
/* 1104 */     this.leg4part2b.field_78795_f = -0.743F + upangle;
/* 1105 */     this.leg4part2c.field_78795_f = -0.632F + upangle;
/* 1106 */     this.leg4part2d.field_78795_f = -1.041F + upangle;
/*      */     
/* 1108 */     dist = 14.0F;
/* 1109 */     dist = (float)(dist * Math.cos(this.leg4part2.field_78795_f));
/* 1110 */     this.leg4part3.field_78798_e = (float)(this.leg4part2.field_78798_e - Math.cos(this.leg4part2.field_78796_g) * dist);
/* 1111 */     this.leg4part3.field_78800_c = (float)(this.leg4part2.field_78800_c - Math.sin(this.leg4part2.field_78796_g) * dist);
/*      */     
/* 1113 */     this.leg4part3.field_78795_f = 0.669F - upangle;
/*      */     
/* 1115 */     dist = 8.0F;
/* 1116 */     dist = (float)Math.abs(dist * Math.cos(this.leg4part3.field_78795_f));
/* 1117 */     this.leg4part3c.field_78798_e = (float)(this.leg4part3.field_78798_e - Math.cos(this.leg4part3.field_78796_g) * dist);
/* 1118 */     this.leg4part3c.field_78800_c = (float)(this.leg4part3.field_78800_c - Math.sin(this.leg4part3.field_78796_g) * dist);
/*      */     
/* 1120 */     this.leg4part3b.field_78795_f = -0.48F - upangle;
/* 1121 */     this.leg4part3c.field_78795_f = -0.48F - upangle;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void doLeftRearLeg(float angle, float upangle) {
/* 1128 */     this.leg3.field_78796_g = -2.1F + angle;
/* 1129 */     this.leg3part2.field_78796_g = this.leg3.field_78796_g;
/* 1130 */     this.leg3part2b.field_78796_g = this.leg3.field_78796_g;
/* 1131 */     this.leg3part2c.field_78796_g = this.leg3.field_78796_g;
/* 1132 */     this.leg3part2d.field_78796_g = this.leg3.field_78796_g;
/* 1133 */     this.leg3part3.field_78796_g = this.leg3.field_78796_g;
/* 1134 */     this.leg3part3b.field_78796_g = this.leg3.field_78796_g;
/* 1135 */     this.leg3part3c.field_78796_g = this.leg3.field_78796_g;
/*      */     
/* 1137 */     float dist = 14.0F;
/* 1138 */     dist = (float)(dist * Math.cos(this.leg3.field_78795_f));
/* 1139 */     this.leg3part2d.field_78798_e = (float)(this.leg3.field_78798_e - Math.cos(this.leg3.field_78796_g) * dist);
/* 1140 */     this.leg3part2d.field_78800_c = (float)(this.leg3.field_78800_c - Math.sin(this.leg3.field_78796_g) * dist);
/*      */     
/* 1142 */     this.leg3part2.field_78795_f = -1.152F + upangle;
/* 1143 */     this.leg3part2b.field_78795_f = -0.743F + upangle;
/* 1144 */     this.leg3part2c.field_78795_f = -0.632F + upangle;
/* 1145 */     this.leg3part2d.field_78795_f = -1.041F + upangle;
/*      */     
/* 1147 */     dist = 14.0F;
/* 1148 */     dist = (float)(dist * Math.cos(this.leg3part2.field_78795_f));
/* 1149 */     this.leg3part3.field_78798_e = (float)(this.leg3part2.field_78798_e - Math.cos(this.leg3part2.field_78796_g) * dist);
/* 1150 */     this.leg3part3.field_78800_c = (float)(this.leg3part2.field_78800_c - Math.sin(this.leg3part2.field_78796_g) * dist);
/*      */     
/* 1152 */     this.leg3part3.field_78795_f = 0.669F - upangle;
/*      */     
/* 1154 */     dist = 8.0F;
/* 1155 */     dist = (float)Math.abs(dist * Math.cos(this.leg3part3.field_78795_f));
/* 1156 */     this.leg3part3c.field_78798_e = (float)(this.leg3part3.field_78798_e - Math.cos(this.leg3part3.field_78796_g) * dist);
/* 1157 */     this.leg3part3c.field_78800_c = (float)(this.leg3part3.field_78800_c - Math.sin(this.leg3part3.field_78796_g) * dist);
/*      */     
/* 1159 */     this.leg3part3b.field_78795_f = -0.48F - upangle;
/* 1160 */     this.leg3part3c.field_78795_f = -0.48F - upangle;
/*      */   }
/*      */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelSpitBug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */