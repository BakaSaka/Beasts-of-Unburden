// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbee_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bee_villager"), "main");
	private final ModelPart head;
	private final ModelPart headgear;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart bodywear;
	private final ModelPart tailwear;
	private final ModelPart right_wing;
	private final ModelPart left_wing;
	private final ModelPart arms;
	private final ModelPart right_leg_front;
	private final ModelPart right_leg_back;
	private final ModelPart left_leg_front;
	private final ModelPart left_leg_back;

	public Modelbee_villager(ModelPart root) {
		this.head = root.getChild("head");
		this.headgear = root.getChild("headgear");
		this.body = root.getChild("body");
		this.tail = this.body.getChild("tail");
		this.bodywear = root.getChild("bodywear");
		this.tailwear = this.bodywear.getChild("tailwear");
		this.right_wing = root.getChild("right_wing");
		this.left_wing = root.getChild("left_wing");
		this.arms = root.getChild("arms");
		this.right_leg_front = root.getChild("right_leg_front");
		this.right_leg_back = root.getChild("right_leg_back");
		this.left_leg_front = root.getChild("left_leg_front");
		this.left_leg_back = root.getChild("left_leg_back");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(25, 4)
						.addBox(-2.0F, -3.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 1)
						.addBox(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(25, -5)
						.addBox(3.0F, -10.5F, -9.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, -5)
						.addBox(-3.0F, -10.5F, -9.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, -6.0F));

		PartDefinition headgear = partdefinition.addOrReplaceChild("headgear", CubeListBuilder.create().texOffs(28, 17)
				.addBox(-5.0F, -8.0F, -4.0F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 2.0F, -6.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -6.0F, 0.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-4.0F, -7.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, -1.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(27, 29)
						.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26)
						.addBox(-4.0F, -4.0F, 1.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-3.0F, -3.0F, 9.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 4.0F));

		PartDefinition bodywear = partdefinition.addOrReplaceChild("bodywear",
				CubeListBuilder.create().texOffs(40, 42)
						.addBox(-3.5F, -6.5F, -5.5F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.6F)).texOffs(44, 54)
						.addBox(-3.5F, -5.5F, 0.5F, 7.0F, 7.0F, 3.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 9.0F, -1.0F));

		PartDefinition tailwear = bodywear.addOrReplaceChild("tailwear", CubeListBuilder.create().texOffs(34, 29)
				.addBox(-4.0F, -3.5F, 1.5F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, -1.0F, 4.0F));

		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing",
				CubeListBuilder.create().texOffs(4, 43).mirror()
						.addBox(-6.0F, 0.5F, 0.0F, 7.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.0F, 2.0F, -1.0F));

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(4, 43)
				.addBox(-1.0F, 0.5F, 0.0F, 7.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 2.0F, -1.0F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create().texOffs(0, 27)
				.addBox(-4.5F, -0.682F, -1.2687F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
				.addBox(-5.0F, 3.318F, -2.2687F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 27).mirror()
				.addBox(2.5F, -0.682F, -1.2687F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.95F, -6.05F, -0.7505F, 0.0F, 0.0F));

		PartDefinition right_leg_front = partdefinition.addOrReplaceChild("right_leg_front", CubeListBuilder.create()
				.texOffs(0, 27).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 10.0F, -5.0F));

		PartDefinition right_leg_front_shin_r1 = right_leg_front.addOrReplaceChild(
				"right_leg_front_shin_r1", CubeListBuilder.create().texOffs(0, 50).addBox(-4.0F, -2.2588F, -2.4659F,
						3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 4.0F, 1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_leg_back = partdefinition.addOrReplaceChild("right_leg_back", CubeListBuilder.create()
				.texOffs(0, 27).addBox(-2.5F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 11.0F, 1.0F));

		PartDefinition right_leg_shin_r1 = right_leg_back.addOrReplaceChild(
				"right_leg_shin_r1", CubeListBuilder.create().texOffs(26, 56).addBox(-4.0F, -1.5F, -2.5F, 3.0F, 3.0F,
						5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.5F, 0.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition left_leg_front = partdefinition.addOrReplaceChild("left_leg_front", CubeListBuilder.create()
				.texOffs(0, 27).addBox(0.5F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 11.0F, 1.0F));

		PartDefinition left_leg_shin_r1 = left_leg_front.addOrReplaceChild("left_leg_shin_r1",
				CubeListBuilder.create().texOffs(26, 56).addBox(2.0F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 5.5F, 0.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition left_leg_back = partdefinition.addOrReplaceChild("left_leg_back", CubeListBuilder.create()
				.texOffs(0, 27).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 10.0F, -5.0F));

		PartDefinition left_leg_front_shin_r1 = left_leg_back.addOrReplaceChild(
				"left_leg_front_shin_r1", CubeListBuilder.create().texOffs(0, 50).addBox(1.0F, -2.2588F, -2.4659F, 3.0F,
						5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.0F, 1.5F, 0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headgear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodywear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg_front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg_back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg_front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg_back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_wing.xRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.tail.xRot = headPitch / (180F / (float) Math.PI);
		this.headgear.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.headgear.xRot = headPitch / (180F / (float) Math.PI);
		this.right_leg_back.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_leg_front.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg_front.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.tailwear.xRot = headPitch / (180F / (float) Math.PI);
		this.left_wing.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.left_leg_back.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}