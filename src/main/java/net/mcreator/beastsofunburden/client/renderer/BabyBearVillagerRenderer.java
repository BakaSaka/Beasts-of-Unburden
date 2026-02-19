package net.mcreator.beastsofunburden.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.beastsofunburden.procedures.*;
import net.mcreator.beastsofunburden.entity.BabyBearVillagerEntity;
import net.mcreator.beastsofunburden.client.model.Modelbaby_panda_villager;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BabyBearVillagerRenderer extends MobRenderer<BabyBearVillagerEntity, Modelbaby_panda_villager<BabyBearVillagerEntity>> {
	public BabyBearVillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaby_panda_villager<BabyBearVillagerEntity>(context.bakeLayer(Modelbaby_panda_villager.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BabyBearVillagerEntity, Modelbaby_panda_villager<BabyBearVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_bear_villager_panda.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyBearVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyBearPandaProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_panda_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_panda_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyBearVillagerEntity, Modelbaby_panda_villager<BabyBearVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_bear_villager_black.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyBearVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyBearBlackProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_panda_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_panda_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyBearVillagerEntity, Modelbaby_panda_villager<BabyBearVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_bear_villager_grey.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyBearVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyBearGreyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_panda_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_panda_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyBearVillagerEntity, Modelbaby_panda_villager<BabyBearVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_bear_villager_grizzly.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyBearVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyBearGrizzlyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_panda_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_panda_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyBearVillagerEntity, Modelbaby_panda_villager<BabyBearVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_bear_villager_polar.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyBearVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyBearPolarProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_panda_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_panda_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyBearVillagerEntity, Modelbaby_panda_villager<BabyBearVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_bear_villager_sun.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyBearVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyBearSunProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_panda_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_panda_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(BabyBearVillagerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.65f, 0.65f, 0.65f);
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(BabyBearVillagerEntity entity) {
		return new ResourceLocation("bou:textures/entities/blank_standin_texture.png");
	}
}