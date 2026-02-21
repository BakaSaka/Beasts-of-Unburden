// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelanimal_chest_entity_bottom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "animal_chest_entity_bottom"), "main");
	private final ModelPart shop;
	private final ModelPart base;
	private final ModelPart top_entity;

	public Modelanimal_chest_entity_bottom(ModelPart root) {
		this.shop = root.getChild("shop");
		this.base = this.shop.getChild("base");
		this.top_entity = root.getChild("top_entity");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition shop = partdefinition.addOrReplaceChild("shop", CubeListBuilder.create(),
				PartPose.offset(7.0F, 24.0F, -7.0F));

		PartDefinition base = shop.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(2, 47)
						.addBox(-14.0F, -2.0F, 0.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 47)
						.addBox(-14.0F, -10.0F, 0.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -16.0F, 1.0F, 14.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_entity = partdefinition.addOrReplaceChild("top_entity",
				CubeListBuilder.create().texOffs(0, 37)
						.addBox(-14.5F, -16.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 37)
						.addBox(-7.5F, -16.0F, 1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		shop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		top_entity.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}