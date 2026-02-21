package net.mcreator.beastsofunburden.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.beastsofunburden.entity.ChestEntityEntity;
import net.mcreator.beastsofunburden.client.model.Modelanimal_chest_entity;

public class ChestEntityRenderer extends MobRenderer<ChestEntityEntity, Modelanimal_chest_entity<ChestEntityEntity>> {
	public ChestEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanimal_chest_entity<ChestEntityEntity>(context.bakeLayer(Modelanimal_chest_entity.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChestEntityEntity entity) {
		return new ResourceLocation("bou:textures/entities/animal_chest_texture.png");
	}
}