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
public class Modeldragon_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bou", "modeldragon_villager"), "main");
	public final ModelPart neck_up;
	public final ModelPart head_group;
	public final ModelPart bottom_jaw;
	public final ModelPart top_jaw;
	public final ModelPart body;
	public final ModelPart rightwing;
	public final ModelPart leftwing;
	public final ModelPart tail;
	public final ModelPart tailbone2;
	public final ModelPart tailbone3;
	public final ModelPart tailbone4;
	public final ModelPart arms;
	public final ModelPart mirrored;
	public final ModelPart right_leg;
	public final ModelPart left_leg;

	public Modeldragon_villager(ModelPart root) {
		this.neck_up = root.getChild("neck_up");
		this.head_group = this.neck_up.getChild("head_group");
		this.bottom_jaw = this.head_group.getChild("bottom_jaw");
		this.top_jaw = this.head_group.getChild("top_jaw");
		this.body = root.getChild("body");
		this.rightwing = this.body.getChild("rightwing");
		this.leftwing = this.body.getChild("leftwing");
		this.tail = root.getChild("tail");
		this.tailbone2 = this.tail.getChild("tailbone2");
		this.tailbone3 = this.tailbone2.getChild("tailbone3");
		this.tailbone4 = this.tailbone3.getChild("tailbone4");
		this.arms = root.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition neck_up = partdefinition.addOrReplaceChild("neck_up", CubeListBuilder.create().texOffs(42, 10).addBox(-3.0F, -9.0F, -2.0F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spine3_r1 = neck_up.addOrReplaceChild("spine3_r1", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition spine2_r1 = neck_up.addOrReplaceChild("spine2_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 4.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition head_group = neck_up.addOrReplaceChild("head_group",
				CubeListBuilder.create().texOffs(12, 0).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-0.5F, -9.0F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, -1.0F));
		PartDefinition horn_left_r1 = head_group.addOrReplaceChild("horn_left_r1",
				CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -2.0F, -2.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 8).mirror().addBox(-6.0F, -2.0F, -2.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, -7.0F, 1.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bottom_jaw = head_group.addOrReplaceChild("bottom_jaw",
				CubeListBuilder.create().texOffs(39, 1).addBox(-2.0F, -0.1F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(34, 47).addBox(-2.0F, -0.8F, -5.1F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, -1.0F, -5.0F));
		PartDefinition top_jaw = head_group.addOrReplaceChild("top_jaw",
				CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -1.6F, -5.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(16, 46).addBox(-2.0F, -0.6F, -5.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.15F)),
				PartPose.offset(0.0F, -2.0F, -5.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(14, 15).addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition spine4_r1 = body.addOrReplaceChild("spine4_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.0F, 4.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition rightwing = body.addOrReplaceChild("rightwing", CubeListBuilder.create(), PartPose.offset(3.3431F, -23.0F, 3.0F));
		PartDefinition wing_tip_right_r1 = rightwing.addOrReplaceChild("wing_tip_right_r1", CubeListBuilder.create().texOffs(17, 33).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.6066F, 0.0F, 4.9497F, 0.0F, 0.7854F, 0.0F));
		PartDefinition wing_tip_membrane_right_r1 = rightwing.addOrReplaceChild("wing_tip_membrane_right_r1", CubeListBuilder.create().texOffs(18, 38).mirror().addBox(0.4F, 1.0F, -16.0F, 0.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.6066F, 0.0F, 4.9497F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition wing_base_right_r1 = rightwing.addOrReplaceChild("wing_base_right_r1", CubeListBuilder.create().texOffs(31, 33).mirror().addBox(2.5F, -24.0F, 3.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.2929F, 23.0F, 0.7071F, 0.0F, 0.7854F, 0.0F));
		PartDefinition wing_base_membrane_right_r1 = rightwing.addOrReplaceChild("wing_base_membrane_right_r1", CubeListBuilder.create().texOffs(50, 48).mirror().addBox(3.6F, -34.0F, 4.0F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.0F, 36.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition leftwing = body.addOrReplaceChild("leftwing", CubeListBuilder.create(), PartPose.offset(-3.0503F, -23.0F, 2.7071F));
		PartDefinition wing_tip_left_r1 = leftwing.addOrReplaceChild("wing_tip_left_r1", CubeListBuilder.create().texOffs(17, 33).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8995F, 1.0F, 5.2426F, 0.0F, -0.7854F, 0.0F));
		PartDefinition wing_tip_membrane_left_r1 = leftwing.addOrReplaceChild("wing_tip_membrane_left_r1", CubeListBuilder.create().texOffs(18, 38).addBox(-0.4F, 0.0F, -16.0F, 0.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8995F, 1.0F, 5.2426F, 3.1416F, 0.7854F, 3.1416F));
		PartDefinition wing_base_membrane_left_r1 = leftwing.addOrReplaceChild("wing_base_membrane_left_r1", CubeListBuilder.create().texOffs(50, 48).addBox(-3.6F, -34.0F, 4.0F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7071F, 36.0F, 0.2929F, 0.0F, -0.7854F, 0.0F));
		PartDefinition wing_base_left_r1 = leftwing.addOrReplaceChild("wing_base_left_r1", CubeListBuilder.create().texOffs(31, 33).addBox(-4.5F, -24.0F, 3.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 23.0F, 1.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(46, 38).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 0).mirror().addBox(-0.5F, -3.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 8.0F, 3.0F));
		PartDefinition tailbone2 = tail.addOrReplaceChild("tailbone2",
				CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-2.0F, -1.0F, 0.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 0).addBox(-0.5F, -3.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 5.0F));
		PartDefinition tailbone3 = tailbone2.addOrReplaceChild("tailbone3",
				CubeListBuilder.create().texOffs(46, 38).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 0).mirror().addBox(-0.5F, -2.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -1.0F, 5.0F));
		PartDefinition tailbone4 = tailbone3.addOrReplaceChild("tailbone4",
				CubeListBuilder.create().texOffs(48, 30).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 0).addBox(-0.5F, -1.5F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 5.0F));
		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(42, 24).addBox(-4.0F, 3.0F, -1.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(1, 17).addBox(-7.0F, -2.0F, -1.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.95F, -1.05F, -0.7505F, 0.0F, 0.0F));
		PartDefinition mirrored = arms.addOrReplaceChild("mirrored", CubeListBuilder.create().texOffs(1, 17).mirror().addBox(4.0F, -23.05F, -2.05F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 21.05F, 1.05F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 55).addBox(-1.5F, 10.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 12.0F, 0.0F));
		PartDefinition right_shin_r1 = right_leg.addOrReplaceChild("right_shin_r1", CubeListBuilder.create().texOffs(2, 39).addBox(-7.0F, -1.0F, -3.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 3.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition right_foot_r1 = right_leg.addOrReplaceChild("right_foot_r1", CubeListBuilder.create().texOffs(1, 49).addBox(-4.0F, -1.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 11.0F, -0.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition right_thigh_r1 = right_leg.addOrReplaceChild("right_thigh_r1", CubeListBuilder.create().texOffs(-1, 28).addBox(-3.5F, -3.0F, -3.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-2.5F, 10.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.0F, 12.0F, 0.0F));
		PartDefinition left_shin_r1 = left_leg.addOrReplaceChild("left_shin_r1", CubeListBuilder.create().texOffs(2, 39).mirror().addBox(-3.0F, -1.0F, -3.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition left_foot_r1 = left_leg.addOrReplaceChild("left_foot_r1", CubeListBuilder.create().texOffs(1, 49).mirror().addBox(1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 11.0F, -0.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition left_thigh_r1 = left_leg.addOrReplaceChild("left_thigh_r1", CubeListBuilder.create().texOffs(-1, 28).mirror().addBox(-3.5F, -3.0F, -3.0F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		neck_up.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightwing.yRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.leftwing.yRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.neck_up.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.neck_up.xRot = headPitch / (180F / (float) Math.PI);
		this.tailbone3.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.tailbone2.yRot = netHeadYaw / (180F / (float) Math.PI);
	}
}