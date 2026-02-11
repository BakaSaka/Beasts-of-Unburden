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
import net.mcreator.beastsofunburden.entity.BabyHorseVillagerEntity;
import net.mcreator.beastsofunburden.client.model.Modelbaby_horse_villager;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BabyHorseVillagerRenderer extends MobRenderer<BabyHorseVillagerEntity, Modelbaby_horse_villager<BabyHorseVillagerEntity>> {
	public BabyHorseVillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaby_horse_villager<BabyHorseVillagerEntity>(context.bakeLayer(Modelbaby_horse_villager.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BabyHorseVillagerEntity, Modelbaby_horse_villager<BabyHorseVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_horse_villager_chestnut.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyHorseVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyHorseChestnutProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_horse_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_horse_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyHorseVillagerEntity, Modelbaby_horse_villager<BabyHorseVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_horse_villager_tan.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyHorseVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyHorseTanProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_horse_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_horse_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyHorseVillagerEntity, Modelbaby_horse_villager<BabyHorseVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_horse_villager_mahogany.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyHorseVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyHorseMahoganyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_horse_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_horse_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyHorseVillagerEntity, Modelbaby_horse_villager<BabyHorseVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_horse_villager_white.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyHorseVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyHorseWhiteProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_horse_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_horse_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyHorseVillagerEntity, Modelbaby_horse_villager<BabyHorseVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_horse_villager_grey.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyHorseVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyHorseGreyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_horse_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_horse_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyHorseVillagerEntity, Modelbaby_horse_villager<BabyHorseVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_horse_villager_black.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyHorseVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyHorseBlackProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_horse_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_horse_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyHorseVillagerEntity, Modelbaby_horse_villager<BabyHorseVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_horse_villager.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyHorseVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyHorseHorseyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_horse_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_horse_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(BabyHorseVillagerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.7f, 0.7f, 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyHorseVillagerEntity entity) {
		return new ResourceLocation("bou:textures/entities/blank_standin_texture.png");
	}
}