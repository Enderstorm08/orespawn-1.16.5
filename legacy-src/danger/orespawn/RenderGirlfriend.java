/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.renderer.entity.RenderBiped
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.util.ResourceLocation
 */
package danger.orespawn;

import danger.orespawn.Girlfriend;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderGirlfriend
extends RenderBiped {
    protected ModelBiped model;

    public RenderGirlfriend(ModelBiped par1ModelBase, float par2) {
        super(par1ModelBase, par2);
        this.model = (ModelBiped)this.field_77045_g;
    }

    public void renderGirlfriend(Girlfriend par1EntityGirlfriend, double par2, double par4, double par6, float par8, float par9) {
        super.func_76986_a((EntityLiving)par1EntityGirlfriend, par2, par4, par6, par8, par9);
    }

    public void func_76986_a(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        this.renderGirlfriend((Girlfriend)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    public void func_76986_a(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        this.renderGirlfriend((Girlfriend)par1Entity, par2, par4, par6, par8, par9);
    }

    protected ResourceLocation func_110775_a(Entity entity) {
        Girlfriend g = (Girlfriend)entity;
        return g.getTexture();
    }
}

