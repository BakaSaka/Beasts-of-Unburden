// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsquid_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "squid_villager"), "main");
	private final ModelPart head;
	private final ModelPart headwear;
	private final ModelPart body;
	private final ModelPart arms;
	private final ModelPart mirrored;
	private final ModelPart arms2;
	private final ModelPart mirrored2;
	private final ModelPart right_leg;
	private final ModelPart right_leg_back;
	private final ModelPart left_leg;
	private final ModelPart left_leg_back;

	public Modelsquid_villager(ModelPart root) {
		this.head = root.getChild("head");
		this.headwear = root.getChild("headwear");
		this.body = root.getChild("body");
		this.arms = root.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.arms2 = root.getChild("arms2");
		this.mirrored2 = this.arms2.getChild("mirrored2");
		this.right_leg = root.getChild("right_leg");
		this.right_leg_back = root.getChild("right_leg_back");
		this.left_leg = root.getChild("left_leg");
		this.left_leg_back = root.getChild("left_leg_back");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -12.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition headwear = partdefinition.addOrReplaceChild("headwear", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -12.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.51F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 21).addBox(
				-4.0F, 0.0F, -3.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create().texOffs(0, 39)
				.addBox(-4.0F, 5.364F, -1.4627F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 35).mirror()
				.addBox(-6.0F, -0.636F, -1.4627F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.95F, -0.05F, -0.7505F, 0.0F, 0.0F));

		PartDefinition mirrored = arms.addOrReplaceChild("mirrored",
				CubeListBuilder.create().texOffs(22, 35).mirror()
						.addBox(4.0F, -23.05F, -1.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 22.414F, -0.4127F));

		PartDefinition arms2 = partdefinition.addOrReplaceChild("arms2",
				CubeListBuilder.create().texOffs(0, 39).mirror()
						.addBox(-4.0F, 4.682F, -0.7313F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(22, 35).addBox(-6.0F, -1.318F, -0.7313F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.95F, -0.05F, -0.7505F, 0.0F, 0.0F));

		PartDefinition mirrored2 = arms2.addOrReplaceChild("mirrored2", CubeListBuilder.create().texOffs(22, 35)
				.addBox(4.0F, -23.05F, -1.05F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.732F, 0.3186F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 45)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 7.0F, -2.0F));

		PartDefinition right_leg_back = partdefinition.addOrReplaceChild("right_leg_back", CubeListBuilder.create()
				.texOffs(9, 45).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 7.0F, 2.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(9, 45).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.0F, 7.0F, -2.0F));

		PartDefinition left_leg_back = partdefinition.addOrReplaceChild("left_leg_back",
				CubeListBuilder.create().texOffs(0, 45).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 7.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg_back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg_back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.headwear.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.headwear.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.yRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.right_leg.yRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.left_leg_back.yRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.right_leg_back.yRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
	}
}