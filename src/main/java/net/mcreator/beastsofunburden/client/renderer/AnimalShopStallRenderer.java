package net.mcreator.beastsofunburden.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.beastsofunburden.entity.AnimalShopStallEntity;
import net.mcreator.beastsofunburden.client.model.Modelanimal_chest_entity;

import com.mojang.blaze3d.vertex.PoseStack;

public class AnimalShopStallRenderer extends MobRenderer<AnimalShopStallEntity, Modelanimal_chest_entity<AnimalShopStallEntity>> {
	public AnimalShopStallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanimal_chest_entity<AnimalShopStallEntity>(context.bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION)), 0.1f);
	}

	@Override
	protected void scale(AnimalShopStallEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(AnimalShopStallEntity entity) {
		return new ResourceLocation("bou:textures/entities/animal_chest_texture.png");
	}
}