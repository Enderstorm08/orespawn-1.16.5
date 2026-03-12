/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
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
/*     */ public class ModelHammy
/*     */   extends ModelBase
/*     */ {
/*     */   ModelRenderer Handle1;
/*     */   ModelRenderer Handle2;
/*     */   ModelRenderer Handle3;
/*     */   ModelRenderer Head1;
/*     */   ModelRenderer Head2;
/*     */   ModelRenderer Head3;
/*     */   ModelRenderer Head4;
/*     */   ModelRenderer Band1;
/*     */   ModelRenderer Band2;
/*     */   ModelRenderer Band3;
/*     */   ModelRenderer Band4;
/*     */   ModelRenderer Band5;
/*     */   ModelRenderer Band6;
/*     */   ModelRenderer Band7;
/*     */   ModelRenderer Band8;
/*     */   ModelRenderer Point1;
/*     */   ModelRenderer Spike1;
/*     */   ModelRenderer Spike2;
/*     */   ModelRenderer Spike3;
/*     */   ModelRenderer Spike4;
/*     */   ModelRenderer Band1b;
/*     */   ModelRenderer Band2b;
/*     */   ModelRenderer Band3b;
/*     */   ModelRenderer Band4b;
/*     */   ModelRenderer Band5b;
/*     */   ModelRenderer Band6b;
/*     */   ModelRenderer Band7b;
/*     */   ModelRenderer Band8b;
/*     */   ModelRenderer Point1b;
/*     */   ModelRenderer Spike2b;
/*     */   ModelRenderer Spike1b;
/*     */   ModelRenderer Spike3b;
/*     */   ModelRenderer Spike4b;
/*     */   
/*     */   public ModelHammy() {
/* 285 */     this.field_78090_t = 128;
/* 286 */     this.field_78089_u = 256;
/*     */     
/* 288 */     this.Handle1 = new ModelRenderer(this, 0, 0);
/* 289 */     this.Handle1.func_78789_a(-0.5F, -12.0F, -1.0F, 1, 36, 2);
/* 290 */     this.Handle1.func_78793_a(0.0F, 0.0F, 0.0F);
/* 291 */     this.Handle1.func_78787_b(128, 256);
/* 292 */     this.Handle1.field_78809_i = true;
/* 293 */     setRotation(this.Handle1, 0.0F, 0.0F, 0.0F);
/* 294 */     this.Handle2 = new ModelRenderer(this, 7, 0);
/* 295 */     this.Handle2.func_78789_a(-0.5F, -12.0F, -1.0F, 1, 36, 2);
/* 296 */     this.Handle2.func_78793_a(0.0F, 0.0F, 0.0F);
/* 297 */     this.Handle2.func_78787_b(128, 256);
/* 298 */     this.Handle2.field_78809_i = true;
/* 299 */     setRotation(this.Handle2, 0.0F, 1.047198F, 0.0F);
/* 300 */     this.Handle3 = new ModelRenderer(this, 14, 0);
/* 301 */     this.Handle3.func_78789_a(-0.5F, -12.0F, -1.0F, 1, 36, 2);
/* 302 */     this.Handle3.func_78793_a(0.0F, 0.0F, 0.0F);
/* 303 */     this.Handle3.func_78787_b(128, 256);
/* 304 */     this.Handle3.field_78809_i = true;
/* 305 */     setRotation(this.Handle3, 0.0F, -1.047198F, 0.0F);
/* 306 */     this.Head1 = new ModelRenderer(this, 0, 230);
/* 307 */     this.Head1.func_78789_a(-20.0F, -22.0F, -7.0F, 40, 6, 14);
/* 308 */     this.Head1.func_78793_a(0.0F, 0.0F, 0.0F);
/* 309 */     this.Head1.func_78787_b(128, 256);
/* 310 */     this.Head1.field_78809_i = true;
/* 311 */     setRotation(this.Head1, 0.0F, 0.0F, 0.0F);
/* 312 */     this.Head2 = new ModelRenderer(this, 0, 184);
/* 313 */     this.Head2.func_78789_a(-20.0F, -26.0F, -3.0F, 40, 14, 6);
/* 314 */     this.Head2.func_78793_a(0.0F, 0.0F, 0.0F);
/* 315 */     this.Head2.func_78787_b(128, 256);
/* 316 */     this.Head2.field_78809_i = true;
/* 317 */     setRotation(this.Head2, 0.0F, 0.0F, 0.0F);
/* 318 */     this.Head3 = new ModelRenderer(this, 0, 161);
/* 319 */     this.Head3.func_78789_a(-20.0F, -16.5F, 6.4F, 40, 6, 14);
/* 320 */     this.Head3.func_78793_a(0.0F, 0.0F, 0.0F);
/* 321 */     this.Head3.func_78787_b(128, 256);
/* 322 */     this.Head3.field_78809_i = true;
/* 323 */     setRotation(this.Head3, 0.7853982F, 0.0F, 0.0F);
/* 324 */     this.Head4 = new ModelRenderer(this, 0, 207);
/* 325 */     this.Head4.func_78789_a(-20.0F, -16.5F, -20.4F, 40, 6, 14);
/* 326 */     this.Head4.func_78793_a(0.0F, 0.0F, 0.0F);
/* 327 */     this.Head4.func_78787_b(128, 256);
/* 328 */     this.Head4.field_78809_i = true;
/* 329 */     setRotation(this.Head4, -0.7853982F, 0.0F, 0.0F);
/* 330 */     this.Band1 = new ModelRenderer(this, 0, 88);
/* 331 */     this.Band1.func_78789_a(12.0F, -22.5F, -8.0F, 5, 7, 1);
/* 332 */     this.Band1.func_78793_a(0.0F, 0.0F, 0.0F);
/* 333 */     this.Band1.func_78787_b(128, 256);
/* 334 */     this.Band1.field_78809_i = true;
/* 335 */     setRotation(this.Band1, 0.0F, 0.0F, 0.0F);
/* 336 */     this.Band2 = new ModelRenderer(this, 0, 128);
/* 337 */     this.Band2.func_78789_a(12.0F, -22.5F, 7.0F, 5, 7, 1);
/* 338 */     this.Band2.func_78793_a(0.0F, 0.0F, 0.0F);
/* 339 */     this.Band2.func_78787_b(128, 256);
/* 340 */     this.Band2.field_78809_i = true;
/* 341 */     setRotation(this.Band2, 0.0F, 0.0F, 0.0F);
/* 342 */     this.Band3 = new ModelRenderer(this, 0, 98);
/* 343 */     this.Band3.func_78789_a(12.0F, -17.0F, 5.4F, 5, 7, 1);
/* 344 */     this.Band3.func_78793_a(0.0F, 0.0F, 0.0F);
/* 345 */     this.Band3.func_78787_b(128, 256);
/* 346 */     this.Band3.field_78809_i = true;
/* 347 */     setRotation(this.Band3, 0.7853982F, 0.0F, 0.0F);
/* 348 */     this.Band4 = new ModelRenderer(this, 0, 118);
/* 349 */     this.Band4.func_78789_a(12.0F, -16.9F, -6.4F, 5, 7, 1);
/* 350 */     this.Band4.func_78793_a(0.0F, 0.0F, 0.0F);
/* 351 */     this.Band4.func_78787_b(128, 256);
/* 352 */     this.Band4.field_78809_i = true;
/* 353 */     setRotation(this.Band4, -0.7853982F, 0.0F, 0.0F);
/* 354 */     this.Band5 = new ModelRenderer(this, 0, 108);
/* 355 */     this.Band5.func_78789_a(12.0F, -12.0F, -3.5F, 5, 1, 7);
/* 356 */     this.Band5.func_78793_a(0.0F, 0.0F, 0.0F);
/* 357 */     this.Band5.func_78787_b(128, 256);
/* 358 */     this.Band5.field_78809_i = true;
/* 359 */     setRotation(this.Band5, 0.0F, 0.0F, 0.0F);
/* 360 */     this.Band6 = new ModelRenderer(this, 0, 79);
/* 361 */     this.Band6.func_78789_a(12.0F, -16.5F, -21.4F, 5, 6, 1);
/* 362 */     this.Band6.func_78793_a(0.0F, 0.0F, 0.0F);
/* 363 */     this.Band6.func_78787_b(128, 256);
/* 364 */     this.Band6.field_78809_i = true;
/* 365 */     setRotation(this.Band6, -0.7853982F, 0.0F, 0.0F);
/* 366 */     this.Band7 = new ModelRenderer(this, 0, 138);
/* 367 */     this.Band7.func_78789_a(12.0F, -17.0F, 20.4F, 5, 7, 1);
/* 368 */     this.Band7.func_78793_a(0.0F, 0.0F, 0.0F);
/* 369 */     this.Band7.func_78787_b(128, 256);
/* 370 */     this.Band7.field_78809_i = true;
/* 371 */     setRotation(this.Band7, 0.7853982F, 0.0F, 0.0F);
/* 372 */     this.Band8 = new ModelRenderer(this, 0, 148);
/* 373 */     this.Band8.func_78789_a(12.0F, -27.0F, -3.5F, 5, 1, 7);
/* 374 */     this.Band8.func_78793_a(0.0F, 0.0F, 0.0F);
/* 375 */     this.Band8.func_78787_b(128, 256);
/* 376 */     this.Band8.field_78809_i = true;
/* 377 */     setRotation(this.Band8, 0.0F, 0.0F, 0.0F);
/* 378 */     this.Point1 = new ModelRenderer(this, 28, 130);
/* 379 */     this.Point1.func_78789_a(-2.5F, -29.5F, -0.5F, 5, 5, 1);
/* 380 */     this.Point1.func_78793_a(0.0F, 0.0F, 0.0F);
/* 381 */     this.Point1.func_78787_b(128, 256);
/* 382 */     this.Point1.field_78809_i = true;
/* 383 */     setRotation(this.Point1, 0.0F, 0.0F, 0.7853982F);
/* 384 */     this.Spike1 = new ModelRenderer(this, 67, 0);
/* 385 */     this.Spike1.func_78789_a(14.0F, -20.0F, -10.0F, 1, 1, 20);
/* 386 */     this.Spike1.func_78793_a(0.0F, 0.0F, 0.0F);
/* 387 */     this.Spike1.func_78787_b(128, 256);
/* 388 */     this.Spike1.field_78809_i = true;
/* 389 */     setRotation(this.Spike1, 0.0F, 0.0F, 0.0F);
/* 390 */     this.Spike2 = new ModelRenderer(this, 49, 0);
/* 391 */     this.Spike2.func_78789_a(14.0F, -29.0F, 0.0F, 1, 20, 1);
/* 392 */     this.Spike2.func_78793_a(0.0F, 0.0F, 0.0F);
/* 393 */     this.Spike2.func_78787_b(128, 256);
/* 394 */     this.Spike2.field_78809_i = true;
/* 395 */     setRotation(this.Spike2, 0.0F, 0.0F, 0.0F);
/* 396 */     this.Spike3 = new ModelRenderer(this, 55, 0);
/* 397 */     this.Spike3.func_78789_a(14.0F, -23.5F, 13.0F, 1, 20, 1);
/* 398 */     this.Spike3.func_78793_a(0.0F, 0.0F, 0.0F);
/* 399 */     this.Spike3.func_78787_b(128, 256);
/* 400 */     this.Spike3.field_78809_i = true;
/* 401 */     setRotation(this.Spike3, 0.7853982F, 0.0F, 0.0F);
/* 402 */     this.Spike4 = new ModelRenderer(this, 61, 0);
/* 403 */     this.Spike4.func_78789_a(-15.0F, -23.5F, -14.0F, 1, 20, 1);
/* 404 */     this.Spike4.func_78793_a(0.0F, 0.0F, 0.0F);
/* 405 */     this.Spike4.func_78787_b(128, 256);
/* 406 */     this.Spike4.field_78809_i = true;
/* 407 */     setRotation(this.Spike4, -0.7853982F, 0.0F, 0.0F);
/* 408 */     this.Band1b = new ModelRenderer(this, 0, 88);
/* 409 */     this.Band1b.func_78789_a(-17.0F, -22.5F, -8.0F, 5, 7, 1);
/* 410 */     this.Band1b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 411 */     this.Band1b.func_78787_b(128, 256);
/* 412 */     this.Band1b.field_78809_i = true;
/* 413 */     setRotation(this.Band1b, 0.0F, 0.0F, 0.0F);
/* 414 */     this.Band2b = new ModelRenderer(this, 0, 128);
/* 415 */     this.Band2b.func_78789_a(-17.0F, -22.5F, 7.0F, 5, 7, 1);
/* 416 */     this.Band2b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 417 */     this.Band2b.func_78787_b(128, 256);
/* 418 */     this.Band2b.field_78809_i = true;
/* 419 */     setRotation(this.Band2b, 0.0F, 0.0F, 0.0F);
/* 420 */     this.Band3b = new ModelRenderer(this, 0, 98);
/* 421 */     this.Band3b.func_78789_a(-17.0F, -17.0F, 5.4F, 5, 7, 1);
/* 422 */     this.Band3b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 423 */     this.Band3b.func_78787_b(128, 256);
/* 424 */     this.Band3b.field_78809_i = true;
/* 425 */     setRotation(this.Band3b, 0.7853982F, 0.0F, 0.0F);
/* 426 */     this.Band4b = new ModelRenderer(this, 0, 118);
/* 427 */     this.Band4b.func_78789_a(-17.0F, -16.9F, -6.4F, 5, 7, 1);
/* 428 */     this.Band4b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 429 */     this.Band4b.func_78787_b(128, 256);
/* 430 */     this.Band4b.field_78809_i = true;
/* 431 */     setRotation(this.Band4b, -0.7853982F, 0.0F, 0.0F);
/* 432 */     this.Band5b = new ModelRenderer(this, 0, 108);
/* 433 */     this.Band5b.func_78789_a(-17.0F, -12.0F, -3.5F, 5, 1, 7);
/* 434 */     this.Band5b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 435 */     this.Band5b.func_78787_b(128, 256);
/* 436 */     this.Band5b.field_78809_i = true;
/* 437 */     setRotation(this.Band5b, 0.0F, 0.0F, 0.0F);
/* 438 */     this.Band6b = new ModelRenderer(this, 0, 79);
/* 439 */     this.Band6b.func_78789_a(-17.0F, -16.5F, -21.4F, 5, 6, 1);
/* 440 */     this.Band6b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 441 */     this.Band6b.func_78787_b(128, 256);
/* 442 */     this.Band6b.field_78809_i = true;
/* 443 */     setRotation(this.Band6b, -0.7853982F, 0.0F, 0.0F);
/* 444 */     this.Band7b = new ModelRenderer(this, 0, 138);
/* 445 */     this.Band7b.func_78789_a(-17.0F, -17.0F, 20.4F, 5, 7, 1);
/* 446 */     this.Band7b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 447 */     this.Band7b.func_78787_b(128, 256);
/* 448 */     this.Band7b.field_78809_i = true;
/* 449 */     setRotation(this.Band7b, 0.7853982F, 0.0F, 0.0F);
/* 450 */     this.Band8b = new ModelRenderer(this, 0, 148);
/* 451 */     this.Band8b.func_78789_a(-17.0F, -27.0F, -3.5F, 5, 1, 7);
/* 452 */     this.Band8b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 453 */     this.Band8b.func_78787_b(128, 256);
/* 454 */     this.Band8b.field_78809_i = true;
/* 455 */     setRotation(this.Band8b, 0.0F, 0.0F, 0.0F);
/* 456 */     this.Point1b = new ModelRenderer(this, 28, 130);
/* 457 */     this.Point1b.func_78789_a(-29.5F, -2.5F, -0.5F, 5, 5, 1);
/* 458 */     this.Point1b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 459 */     this.Point1b.func_78787_b(128, 256);
/* 460 */     this.Point1b.field_78809_i = true;
/* 461 */     setRotation(this.Point1b, 0.0F, 0.0F, 0.7853982F);
/* 462 */     this.Spike2b = new ModelRenderer(this, 49, 0);
/* 463 */     this.Spike2b.func_78789_a(-15.0F, -29.0F, 0.0F, 1, 20, 1);
/* 464 */     this.Spike2b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 465 */     this.Spike2b.func_78787_b(128, 256);
/* 466 */     this.Spike2b.field_78809_i = true;
/* 467 */     setRotation(this.Spike2b, 0.0F, 0.0F, 0.0F);
/* 468 */     this.Spike1b = new ModelRenderer(this, 67, 0);
/* 469 */     this.Spike1b.func_78789_a(-15.0F, -20.0F, -10.0F, 1, 1, 20);
/* 470 */     this.Spike1b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 471 */     this.Spike1b.func_78787_b(128, 256);
/* 472 */     this.Spike1b.field_78809_i = true;
/* 473 */     setRotation(this.Spike1b, 0.0F, 0.0F, 0.0F);
/* 474 */     this.Spike3b = new ModelRenderer(this, 55, 0);
/* 475 */     this.Spike3b.func_78789_a(-15.0F, -23.5F, 13.0F, 1, 20, 1);
/* 476 */     this.Spike3b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 477 */     this.Spike3b.func_78787_b(128, 256);
/* 478 */     this.Spike3b.field_78809_i = true;
/* 479 */     setRotation(this.Spike3b, 0.7853982F, 0.0F, 0.0F);
/* 480 */     this.Spike4b = new ModelRenderer(this, 61, 0);
/* 481 */     this.Spike4b.func_78789_a(14.0F, -23.5F, -14.0F, 1, 20, 1);
/* 482 */     this.Spike4b.func_78793_a(0.0F, 0.0F, 0.0F);
/* 483 */     this.Spike4b.func_78787_b(128, 256);
/* 484 */     this.Spike4b.field_78809_i = true;
/* 485 */     setRotation(this.Spike4b, -0.7853982F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void render() {
/* 490 */     float f5 = 1.0F;
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
/* 527 */     this.Handle1.func_78785_a(f5);
/* 528 */     this.Handle2.func_78785_a(f5);
/* 529 */     this.Handle3.func_78785_a(f5);
/* 530 */     this.Head1.func_78785_a(f5);
/* 531 */     this.Head2.func_78785_a(f5);
/* 532 */     this.Head3.func_78785_a(f5);
/* 533 */     this.Head4.func_78785_a(f5);
/* 534 */     this.Band1.func_78785_a(f5);
/* 535 */     this.Band2.func_78785_a(f5);
/* 536 */     this.Band3.func_78785_a(f5);
/* 537 */     this.Band4.func_78785_a(f5);
/* 538 */     this.Band5.func_78785_a(f5);
/* 539 */     this.Band6.func_78785_a(f5);
/* 540 */     this.Band7.func_78785_a(f5);
/* 541 */     this.Band8.func_78785_a(f5);
/* 542 */     this.Point1.func_78785_a(f5);
/* 543 */     this.Spike1.func_78785_a(f5);
/* 544 */     this.Spike2.func_78785_a(f5);
/* 545 */     this.Spike3.func_78785_a(f5);
/* 546 */     this.Spike4.func_78785_a(f5);
/* 547 */     this.Band1b.func_78785_a(f5);
/* 548 */     this.Band2b.func_78785_a(f5);
/* 549 */     this.Band3b.func_78785_a(f5);
/* 550 */     this.Band4b.func_78785_a(f5);
/* 551 */     this.Band5b.func_78785_a(f5);
/* 552 */     this.Band6b.func_78785_a(f5);
/* 553 */     this.Band7b.func_78785_a(f5);
/* 554 */     this.Band8b.func_78785_a(f5);
/* 555 */     this.Point1b.func_78785_a(f5);
/* 556 */     this.Spike2b.func_78785_a(f5);
/* 557 */     this.Spike1b.func_78785_a(f5);
/* 558 */     this.Spike3b.func_78785_a(f5);
/* 559 */     this.Spike4b.func_78785_a(f5);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 564 */     model.field_78795_f = x;
/* 565 */     model.field_78796_g = y;
/* 566 */     model.field_78808_h = z;
/*     */   }
/*     */ }


/* Location:              F:\CODEX\P10\Orespawn-1.7.10-20.0.jar!\danger\orespawn\ModelHammy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */