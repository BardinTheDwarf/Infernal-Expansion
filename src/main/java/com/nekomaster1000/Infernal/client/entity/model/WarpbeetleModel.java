package com.nekomaster1000.Infernal.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.nekomaster1000.Infernal.entities.WarpbeetleEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;

public class WarpbeetleModel<T extends WarpbeetleEntity> extends EntityModel<T> {
    private final ModelRenderer warpbeetle;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer left_wing;
    private final ModelRenderer right_wing;
    private final ModelRenderer left_leg_1;
    private final ModelRenderer left_leg_2;
    private final ModelRenderer left_leg_3;
    private final ModelRenderer right_leg_1;
    private final ModelRenderer right_leg_2;
    private final ModelRenderer right_leg_3;

    public WarpbeetleModel() {
        textureWidth = 128;
        textureHeight = 128;

        warpbeetle = new ModelRenderer(this);
        warpbeetle.setRotationPoint(0.0F, 24.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, -1.0F, 0.0F);
        warpbeetle.addChild(body);
        body.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -9.0F, 10.0F, 6.0F, 17.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -2.0F, -9.0F);
        body.addChild(head);
        head.setTextureOffset(43, 8).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);
        head.setTextureOffset(0, 15).addBox(0.0F, -9.0F, -8.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);

        left_wing = new ModelRenderer(this);
        left_wing.setRotationPoint(5.0F, -6.0F, -6.0F);
        body.addChild(left_wing);
        left_wing.setTextureOffset(28, 29).addBox(-5.0F, -1.0F, 0.0F, 6.0F, 6.0F, 16.0F, 0.0F, false);

        right_wing = new ModelRenderer(this);
        right_wing.setRotationPoint(-5.0F, -6.0F, -6.0F);
        body.addChild(right_wing);
        right_wing.setTextureOffset(0, 23).addBox(-1.0F, -1.0F, 0.0F, 6.0F, 6.0F, 16.0F, 0.0F, false);

        left_leg_1 = new ModelRenderer(this);
        left_leg_1.setRotationPoint(5.0F, -1.0F, -6.0F);
        body.addChild(left_leg_1);
        setRotationAngle(left_leg_1, 0.0F, 0.0F, 0.3491F);
        left_leg_1.setTextureOffset(31, 6).addBox(0.0F, 0.0F, -5.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);

        left_leg_2 = new ModelRenderer(this);
        left_leg_2.setRotationPoint(5.0F, -1.0F, -2.0F);
        body.addChild(left_leg_2);
        setRotationAngle(left_leg_2, 0.0F, 0.0F, 0.3491F);
        left_leg_2.setTextureOffset(31, 0).addBox(0.0F, 0.0F, -1.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);

        left_leg_3 = new ModelRenderer(this);
        left_leg_3.setRotationPoint(5.0F, -1.0F, 4.0F);
        body.addChild(left_leg_3);
        setRotationAngle(left_leg_3, 0.0F, 0.0F, 0.3491F);
        left_leg_3.setTextureOffset(22, 29).addBox(0.0F, 0.0F, -1.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);

        right_leg_1 = new ModelRenderer(this);
        right_leg_1.setRotationPoint(-5.0F, -1.0F, -6.0F);
        body.addChild(right_leg_1);
        setRotationAngle(right_leg_1, 0.0F, 0.0F, -0.3491F);
        right_leg_1.setTextureOffset(22, 23).addBox(-5.0F, 0.0F, -5.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);

        right_leg_2 = new ModelRenderer(this);
        right_leg_2.setRotationPoint(-5.0F, -1.0F, -2.0F);
        body.addChild(right_leg_2);
        setRotationAngle(right_leg_2, 0.0F, 0.0F, -0.3491F);
        right_leg_2.setTextureOffset(0, 6).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);

        right_leg_3 = new ModelRenderer(this);
        right_leg_3.setRotationPoint(-5.0F, -1.0F, 4.0F);
        body.addChild(right_leg_3);
        setRotationAngle(right_leg_3, 0.0F, 0.0F, -0.3491F);
        right_leg_3.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 0.0F, 6.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        warpbeetle.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }
}