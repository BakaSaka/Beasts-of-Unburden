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

import net.mcreator.beastsofunburden.procedures.BabyTurtleSeaProcedure;
import net.mcreator.beastsofunburden.procedures.BabyTurtleRiverProcedure;
import net.mcreator.beastsofunburden.procedures.BabyTurtleForestProcedure;
import net.mcreator.beastsofunburden.procedures.BabyTurtleDuneProcedure;
import net.mcreator.beastsofunburden.procedures.BabyTurtleBeachProcedure;
import net.mcreator.beastsofunburden.entity.BabyTurtleVillagerEntity;
import net.mcreator.beastsofunburden.client.model.Modelturtle_villager;
import net.mcreator.beastsofunburden.client.model.Modelbaby_turtle_villager;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BabyTurtleVillagerRenderer extends MobRenderer<BabyTurtleVillagerEntity, Modelturtle_villager<BabyTurtleVillagerEntity>> {
	public BabyTurtleVillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelturtle_villager<BabyTurtleVillagerEntity>(context.bakeLayer(Modelturtle_villager.LAYER_LOCATION)), 0.4f);
		this.addLayer(new RenderLayer<BabyTurtleVillagerEntity, Modelturtle_villager<BabyTurtleVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_turtle_villager_sea.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyTurtleVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyTurtleSeaProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_turtle_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_turtle_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyTurtleVillagerEntity, Modelturtle_villager<BabyTurtleVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_turtle_villager_forest.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyTurtleVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyTurtleForestProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_turtle_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_turtle_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyTurtleVillagerEntity, Modelturtle_villager<BabyTurtleVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_turtle_villager_river.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyTurtleVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyTurtleRiverProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_turtle_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_turtle_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyTurtleVillagerEntity, Modelturtle_villager<BabyTurtleVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_turtle_villager_beach.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyTurtleVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyTurtleBeachProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_turtle_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_turtle_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyTurtleVillagerEntity, Modelturtle_villager<BabyTurtleVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/baby_turtle_villager_dune.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyTurtleVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyTurtleDuneProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelbaby_turtle_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbaby_turtle_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(BabyTurtleVillagerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.6f, 0.6f, 0.6f);
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(BabyTurtleVillagerEntity entity) {
		return new ResourceLocation("bou:textures/entities/blank_standin_texture.png");
	}
}