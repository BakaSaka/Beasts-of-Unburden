// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAnimalChest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "animalchest"), "main");
	private final ModelPart displays;
	private final ModelPart base;
	private final ModelPart top;
	private final ModelPart villager_portrait;

	public ModelAnimalChest(ModelPart root) {
		this.displays = root.getChild("displays");
		this.base = root.getChild("base");
		this.top = root.getChild("top");
		this.villager_portrait = root.getChild("villager_portrait");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition displays = partdefinition.addOrReplaceChild("displays",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-14.5F, -16.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-7.5F, -16.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-14.5F, -8.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(-7.5F, -8.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(9, 14)
						.addBox(-14.0F, -2.0F, 0.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 13)
						.addBox(-14.0F, -10.0F, 0.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-14.0F, -16.0F, 1.0F, 14.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, 24.0F, -7.0F));

		PartDefinition top = partdefinition.addOrReplaceChild("top",
				CubeListBuilder.create().texOffs(0, 9)
						.addBox(-14.0F, -18.0F, 0.0F, 14.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(8, 15)
						.addBox(-14.0F, -20.0F, 1.0F, 14.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, 24.0F, -7.0F));

		PartDefinition villager_frame_r1 = top.addOrReplaceChild("villager_frame_r1",
				CubeListBuilder.create().texOffs(11, 0).addBox(-6.0F, -8.3827F, -0.5761F, 12.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -19.0F, 7.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition villager_portrait = partdefinition.addOrReplaceChild("villager_portrait", CubeListBuilder
				.create().texOffs(0, 0).addBox(-8.0F, -10.5F, 2.5F, 16.0F, 2.5F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.5F));

		PartDefinition villager_portrait_r1 = villager_portrait.addOrReplaceChild(
				"villager_portrait_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -8.0F, 0.0F, 11.5F, 9.5F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		displays.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		top.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		villager_portrait.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}