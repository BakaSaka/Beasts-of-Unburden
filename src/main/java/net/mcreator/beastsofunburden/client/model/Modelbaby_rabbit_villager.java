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
public class Modelbaby_rabbit_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bou", "modelbaby_rabbit_villager"), "main");
	public final ModelPart head;
	public final ModelPart headwear;
	public final ModelPart nose;
	public final ModelPart body;
	public final ModelPart bodywear;
	public final ModelPart arms;
	public final ModelPart mirrored;
	public final ModelPart right_leg;
	public final ModelPart right_foot;
	public final ModelPart left_leg;
	public final ModelPart left_foot;

	public Modelbaby_rabbit_villager(ModelPart root) {
		this.head = root.getChild("head");
		this.headwear = root.getChild("headwear");
		this.nose = root.getChild("nose");
		this.body = root.getChild("body");
		this.bodywear = root.getChild("bodywear");
		this.arms = root.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.right_leg = root.getChild("right_leg");
		this.right_foot = this.right_leg.getChild("right_foot");
		this.left_leg = root.getChild("left_leg");
		this.left_foot = this.left_leg.getChild("left_foot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(23, 1).addBox(-5.5F, -9.0F, -4.0F, 11.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
				.addBox(-4.0F, -15.0F, 1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 0).mirror().addBox(1.0F, -15.0F, 1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition headwear = partdefinition.addOrReplaceChild("headwear", CubeListBuilder.create().texOffs(0, 49).addBox(-5.5F, -9.0F, -4.0F, 11.0F, 6.0F, 9.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition nose = partdefinition.addOrReplaceChild("nose",
				CubeListBuilder.create().texOffs(54, 4).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 1).addBox(-1.0F, -3.5F, -5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(36, 21).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(29, 20).addBox(-2.0F, 5.0F, 3.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition bodywear = partdefinition.addOrReplaceChild("bodywear", CubeListBuilder.create().texOffs(36, 38).addBox(-4.0F, 0.6F, -3.0F, 8.0F, 14.0F, 6.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(1, 11).addBox(-4.0F, 2.55F, -1.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-7.0F, -2.45F, -1.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.95F, -1.05F, -0.7505F, 0.0F, 0.0F));
		PartDefinition mirrored = arms.addOrReplaceChild("mirrored", CubeListBuilder.create().texOffs(6, 0).mirror().addBox(4.0F, -23.5F, -2.05F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 21.05F, 1.05F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(3, 18).addBox(-2.5F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 29).addBox(-2.0F, 5.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 14.0F, 0.0F));
		PartDefinition right_foot = right_leg.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(0, 28).addBox(-2.5F, 0.0F, -6.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(3, 18).mirror().addBox(-1.5F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 29).addBox(-1.0F, 5.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 14.0F, 0.0F));
		PartDefinition left_foot = left_leg.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, 0.0F, -6.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		nose.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodywear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}