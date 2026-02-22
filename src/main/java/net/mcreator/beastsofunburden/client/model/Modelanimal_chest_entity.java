package net.mcreator.beastsofunburden.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelanimal_chest_entity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bou", "modelanimal_chest_entity"), "main");
	public final ModelPart shop;
	public final ModelPart base;
	public final ModelPart top;
	public final ModelPart up_frame;
	public final ModelPart top_entity;
	public final ModelPart bottom_entity;

	public Modelanimal_chest_entity(ModelPart root) {
		this.shop = root.getChild("shop");
		this.base = this.shop.getChild("base");
		this.top = this.shop.getChild("top");
		this.up_frame = root.getChild("up_frame");
		this.top_entity = root.getChild("top_entity");
		this.bottom_entity = root.getChild("bottom_entity");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition shop = partdefinition.addOrReplaceChild("shop", CubeListBuilder.create(), PartPose.offset(7.0F, 24.0F, -7.0F));
		PartDefinition base = shop.addOrReplaceChild("base", CubeListBuilder.create().texOffs(2, 47).addBox(-14.0F, -2.0F, 0.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 47)
				.addBox(-14.0F, -10.0F, 0.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-14.0F, -16.0F, 1.0F, 14.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition top = shop.addOrReplaceChild("top",
				CubeListBuilder.create().texOffs(0, 30).addBox(-14.0F, -18.0F, 0.0F, 14.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-14.0F, -19.0F, 1.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition up_frame = partdefinition.addOrReplaceChild("up_frame", CubeListBuilder.create().texOffs(32, 47).addBox(-8.0F, -11.5F, 3.5F, 16.0F, 2.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -3.5F));
		PartDefinition villager_frame_r1 = up_frame.addOrReplaceChild("villager_frame_r1", CubeListBuilder.create().texOffs(8, 50).addBox(-6.0F, -8.0F, -0.5F, 12.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition head_r1 = up_frame.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(40, 51).mirror().addBox(-5.5F, -10.0F, 0.0F, 11.0F, 9.5F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition top_entity = partdefinition.addOrReplaceChild("top_entity",
				CubeListBuilder.create().texOffs(0, 37).addBox(-14.5F, -16.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(44, 37).addBox(-7.5F, -16.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));
		PartDefinition bottom_entity = partdefinition.addOrReplaceChild("bottom_entity",
				CubeListBuilder.create().texOffs(0, 30).addBox(-7.5F, -8.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(44, 30).addBox(-14.5F, -8.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		shop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		up_frame.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		top_entity.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bottom_entity.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.top.yRot = ageInTicks;
		this.bottom_entity.yRot = ageInTicks;
		this.up_frame.zRot = ageInTicks / 20.f;
	}
}