// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbaby_axolotl_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "baby_axolotl_villager"), "main");
	private final ModelPart head;
	private final ModelPart nose;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart arms;
	private final ModelPart mirrored;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public Modelbaby_axolotl_villager(ModelPart root) {
		this.head = root.getChild("head");
		this.nose = root.getChild("nose");
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
		this.arms = root.getChild("arms");
		this.mirrored = this.arms.getChild("mirrored");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(3, 6)
						.addBox(-6.0F, -7.0F, -6.0F, 12.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.mirror().addBox(6.0F, -8.0F, 1.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 6).addBox(-12.0F, -8.0F, 1.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(4, 0).addBox(-9.0F, -13.0F, 1.0F, 18.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition nose = partdefinition.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(7, 22).addBox(
				-3.0F, -3.5F, -8.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 28)
						.addBox(-5.0F, 0.0F, -3.0F, 10.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-3.0F, -1.0F, -2.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 6)
						.addBox(-3.0F, -7.0F, 3.0F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 29)
						.addBox(0.0F, -9.0F, 1.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(44, 46)
						.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(46, 26)
						.addBox(0.0F, -6.0F, 0.0F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(48, 19)
						.addBox(0.0F, -5.0F, 9.0F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 9)
						.addBox(0.0F, -7.0F, 16.0F, 0.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 4.0F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(15, 47)
						.addBox(-7.0F, -2.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 57)
						.addBox(-6.5F, 4.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 57)
						.mirror().addBox(5.5F, 4.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.95F, -1.05F, -0.7505F, 0.0F, 0.0F));

		PartDefinition mirrored = arms.addOrReplaceChild("mirrored",
				CubeListBuilder.create().texOffs(15, 47).mirror()
						.addBox(5.0F, -23.05F, -1.05F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 21.05F, 1.05F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(2, 47)
						.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 60)
						.addBox(-3.0F, 7.0F, 0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(1, 60)
						.addBox(-1.0F, 7.0F, 0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 47).mirror()
						.addBox(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		nose.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.nose.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.nose.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tail.xRot = headPitch / (180F / (float) Math.PI);
	}
}