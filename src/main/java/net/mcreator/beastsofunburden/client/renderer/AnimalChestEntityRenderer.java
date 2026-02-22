package net.mcreator.beastsofunburden.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.beastsofunburden.procedures.*;
import net.mcreator.beastsofunburden.entity.AnimalChestEntityEntity;
import net.mcreator.beastsofunburden.client.model.Modelanimal_chest_entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AnimalChestEntityRenderer extends MobRenderer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>> {
	public AnimalChestEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanimal_chest_entity<AnimalChestEntityEntity>(context.bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestBasicProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_fox.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestRedProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_orange.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestOrangeProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_yellow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestYellowProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_green.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestGreenProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_cyan.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestCyanProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_blue.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestBlueProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_purple.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestPurpleProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_pink.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestPinkProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_white.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestWhiteProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AnimalChestEntityEntity, Modelanimal_chest_entity<AnimalChestEntityEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/animal_chest_texture_black.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnimalChestEntityEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ChestBlackProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelanimal_chest_entity(Minecraft.getInstance().getEntityModels().bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(AnimalChestEntityEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(AnimalChestEntityEntity entity) {
		return new ResourceLocation("bou:textures/entities/animal_chest_texture.png");
	}
}