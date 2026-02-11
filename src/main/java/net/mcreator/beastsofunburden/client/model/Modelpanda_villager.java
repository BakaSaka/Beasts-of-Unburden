package net.mcreator.beastsofunburden.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelpanda_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bou", "modelpanda_villager"), "main");
	public final ModelPart head;
	public final ModelPart headwear;
	public final ModelPart nose;
	public final ModelPart body;
	public final ModelPart bodywear;
	public final ModelPart arms;
	public final ModelPart mirrored;
	public final ModelPart armwear;
	public final ModelPart mirrored2;
	public final ModelPart right_leg;
	public final ModelPart right_legwear;
	public final ModelPart left_leg;
	public final ModelPart left_legwear;

	public Modelpanda_villager(ModelPart root) {
		this.head = root.getChild("head");
		this.headwear = root.getChild("headwear");
		this.nose = root.getChild("nose");
		this.body = root.getChild("body");
		this.bodywear = root.getChild("bodywear");
		this.arms = root.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.armwear = root.getChild("armwear");
		this.mirrored2 = this.armwear.getChild("mirrored2");
		this.right_leg = root.getChild("right_leg");
		this.right_legwear = root.getChild("right_legwear");
		this.left_leg = root.getChild("left_leg");
		this.left_legwear = root.getChild("left_legwear");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -4.0F, 10.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(3.0F, -11.0F, 1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).mirror().addBox(-6.0F, -11.0F, 1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition headwear = partdefinition.addOrReplaceChild("headwear", CubeListBuilder.create().texOffs(0, 35).addBox(-5.0F, -9.0F, -4.0F, 10.0F, 7.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition nose = partdefinition.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(30, 0).addBox(-2.5F, -2.0F, -6.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(28, 12).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 17).addBox(-1.5F, 8.0F, 5.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bodywear = partdefinition.addOrReplaceChild("bodywear", CubeListBuilder.create().texOffs(28, 43).addBox(-5.0F, -0.6F, -3.0F, 10.0F, 13.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(40, 33).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.95F, -1.05F, -0.7505F, 0.0F, 0.0F));
		PartDefinition mirrored = arms.addOrReplaceChild("mirrored", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(4.0F, -23.05F, -3.05F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 21.05F, 1.05F));
		PartDefinition armwear = partdefinition.addOrReplaceChild("armwear", CubeListBuilder.create().texOffs(28, 37).addBox(-8.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 2.95F, -1.05F, -0.7505F, 0.0F, 0.0F));
		PartDefinition mirrored2 = armwear.addOrReplaceChild("mirrored2", CubeListBuilder.create().texOffs(28, 37).mirror().addBox(4.0F, -23.05F, -3.05F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offset(0.0F, 21.05F, 1.05F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 13.0F, 0.0F));
		PartDefinition right_legwear = partdefinition.addOrReplaceChild("right_legwear", CubeListBuilder.create().texOffs(0, 50).addBox(-3.2F, 0.0F, -2.0F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offset(-2.0F, 13.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-2.0F, 0.0F, -2.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 13.0F, 0.0F));
		PartDefinition left_legwear = partdefinition.addOrReplaceChild("left_legwear", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.8F, 0.0F, -2.0F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offset(2.0F, 13.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		nose.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodywear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_legwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_legwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.nose.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.nose.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_legwear.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.headwear.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.headwear.xRot = headPitch / (180F / (float) Math.PI);
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_legwear.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}