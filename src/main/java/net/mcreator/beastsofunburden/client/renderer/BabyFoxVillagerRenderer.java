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

import net.mcreator.beastsofunburden.procedures.BabyFoxSnowyProcedure;
import net.mcreator.beastsofunburden.procedures.BabyFoxSilverProcedure;
import net.mcreator.beastsofunburden.procedures.BabyFoxSandyProcedure;
import net.mcreator.beastsofunburden.procedures.BabyFoxRedProcedure;
import net.mcreator.beastsofunburden.procedures.BabyFoxGreyProcedure;
import net.mcreator.beastsofunburden.entity.BabyFoxVillagerEntity;
import net.mcreator.beastsofunburden.client.model.Modelbaby_fox_villager;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BabyFoxVillagerRenderer extends MobRenderer<BabyFoxVillagerEntity, Modelbaby_fox_villager<BabyFoxVillagerEntity>> {
	public BabyFoxVillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaby_fox_villager<BabyFoxVillagerEntity>(context.bakeLayer(Modelbaby_fox_villager.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BabyFoxVillagerEntity, Modelbaby_fox_villager<BabyFoxVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_fox_villager_red.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyFoxVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyFoxRedProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_fox_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_fox_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyFoxVillagerEntity, Modelbaby_fox_villager<BabyFoxVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_fox_villager_grey.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyFoxVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyFoxGreyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_fox_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_fox_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyFoxVillagerEntity, Modelbaby_fox_villager<BabyFoxVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_fox_villager_sandy.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyFoxVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyFoxSandyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_fox_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_fox_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyFoxVillagerEntity, Modelbaby_fox_villager<BabyFoxVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_fox_villager_snowy.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyFoxVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyFoxSnowyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_fox_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_fox_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyFoxVillagerEntity, Modelbaby_fox_villager<BabyFoxVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_fox_villager_silver.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyFoxVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyFoxSilverProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_fox_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_fox_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(BabyFoxVillagerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.6f, 0.6f, 0.6f);
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(BabyFoxVillagerEntity entity) {
		return new ResourceLocation("bou:textures/entities/blank_standin_texture.png");
	}
}