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
import net.mcreator.beastsofunburden.entity.BabyDragonVillagerEntity;
import net.mcreator.beastsofunburden.client.model.Modeldragon_villager;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BabyDragonVillagerRenderer extends MobRenderer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>> {
	public BabyDragonVillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon_villager<BabyDragonVillagerEntity>(context.bakeLayer(Modeldragon_villager.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_obsidian.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonObsidianProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_silver.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonSilverProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_platinum.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonPlatinumProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_ruby.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonRubyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_copper.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonCopperProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_gold.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonGoldProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_emerald.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonEmeraldProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_fluorite.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonFluoriteProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_sapphire.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonSapphireProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_amethyst.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonAmethystProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_rosegold.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonRoseGoldProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<BabyDragonVillagerEntity, Modeldragon_villager<BabyDragonVillagerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("bou:textures/entities/dragon_villager_chromatic.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BabyDragonVillagerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (BabyDragonChromaticProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modeldragon_villager(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldragon_villager.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(BabyDragonVillagerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.2f, 1.2f, 1.2f);
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(BabyDragonVillagerEntity entity) {
		return new ResourceLocation("bou:textures/entities/blank_standin_texture.png");
	}
}