// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbaby_spider_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "baby_spider_villager"), "main");
	private final ModelPart head;
	private final ModelPart headwear;
	private final ModelPart mouth;
	private final ModelPart body;
	private final ModelPart bodywear;
	private final ModelPart arms;
	private final ModelPart mirrored;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public Modelbaby_spider_villager(ModelPart root) {
		this.head = root.getChild("head");
		this.headwear = root.getChild("headwear");
		this.mouth = root.getChild("mouth");
		this.body = root.getChild("body");
		this.bodywear = root.getChild("bodywear");
		this.arms = root.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.5F, -8.0F, -4.5F, 9.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition headwear = partdefinition.addOrReplaceChild("headwear", CubeListBuilder.create().texOffs(0, 32)
				.addBox(-4.5F, -8.0F, -4.5F, 9.0F, 8.0F, 9.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition mouth = partdefinition.addOrReplaceChild("mouth",
				CubeListBuilder.create().texOffs(1, 18).mirror()
						.addBox(0.5F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(1, 18).addBox(-2.5F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(3, 18)
						.addBox(-4.0F, -6.0F, -3.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 9)
						.addBox(-4.0F, -6.0F, 4.0F, 8.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition bodywear = partdefinition.addOrReplaceChild("bodywear",
				CubeListBuilder.create().texOffs(0, 50)
						.addBox(-4.0F, -6.0F, -3.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.5F)).texOffs(31, 49)
						.addBox(-4.0F, -6.0F, 5.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -1.2686F, -1.318F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.95F, -1.05F, -0.7505F, 0.0F, 0.0F));

		PartDefinition mirrored = arms.addOrReplaceChild("mirrored",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(4.0F, -23.05F, -3.05F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 21.7814F, 1.732F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(28, 0)
						.addBox(-4.0F, 0.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(1.5F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-3.0F, 0.0F, 1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 1.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(28, 0).mirror()
						.addBox(2.0F, 0.0F, -3.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(28, 0).mirror().addBox(-3.5F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(28, 0).mirror()
						.addBox(1.0F, 0.0F, 1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 20.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mouth.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodywear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.headwear.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.headwear.xRot = headPitch / (180F / (float) Math.PI);
		this.mouth.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.mouth.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}