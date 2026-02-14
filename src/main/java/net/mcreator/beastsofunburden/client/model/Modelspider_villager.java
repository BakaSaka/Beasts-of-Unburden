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
public class Modelspider_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bou", "modelspider_villager"), "main");
	public final ModelPart head;
	public final ModelPart mouth;
	public final ModelPart body;
	public final ModelPart arms;
	public final ModelPart mirrored;
	public final ModelPart right_legs;
	public final ModelPart left_legs;

	public Modelspider_villager(ModelPart root) {
		this.head = root.getChild("head");
		this.mouth = root.getChild("mouth");
		this.body = root.getChild("body");
		this.arms = root.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.right_legs = root.getChild("right_legs");
		this.left_legs = root.getChild("left_legs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition mouth = partdefinition.addOrReplaceChild("mouth",
				CubeListBuilder.create().texOffs(0, 2).mirror().addBox(0.5F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 2).addBox(-2.5F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(3, 17).addBox(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(39, 16)
				.addBox(-3.0F, -5.0F, 4.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 24).addBox(-4.0F, -6.0F, 6.0F, 8.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(36, 11).addBox(-4.0F, 4.7314F, -1.318F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 0).addBox(-6.0F, -1.2687F, -1.318F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.95F, -1.05F, -0.7505F, 0.0F, 0.0F));
		PartDefinition mirrored = arms.addOrReplaceChild("mirrored", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(4.0F, -23.05F, -3.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 21.7813F, 1.732F));
		PartDefinition right_legs = partdefinition.addOrReplaceChild("right_legs", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition right_leg_back_r1 = right_legs.addOrReplaceChild("right_leg_back_r1", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 5.0F, 0.3927F, 0.0F, 0.7854F));
		PartDefinition left_leg_middle_r1 = right_legs.addOrReplaceChild("left_leg_middle_r1", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, 0.0F, -3.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition right_leg_front_r1 = right_legs.addOrReplaceChild("right_leg_front_r1", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.7854F));
		PartDefinition left_legs = partdefinition.addOrReplaceChild("left_legs", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition left_leg_back_r1 = left_legs.addOrReplaceChild("left_leg_back_r1", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.0F, 0.0F, -2.5F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 0.0F, 5.0F, 0.3927F, 0.0F, -0.7854F));
		PartDefinition right_leg_middle_r1 = left_legs.addOrReplaceChild("right_leg_middle_r1", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-1.5F, 0.0F, -3.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition left_leg_front_r1 = left_legs.addOrReplaceChild("left_leg_front_r1", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(0.0F, 0.0F, -2.5F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.3927F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mouth.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.mouth.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.mouth.xRot = headPitch / (180F / (float) Math.PI);
		this.left_legs.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_legs.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}