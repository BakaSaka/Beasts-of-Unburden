package net.mcreator.beastsofunburden.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.beastsofunburden.entity.AnimalChestEntityEntity;
import net.mcreator.beastsofunburden.client.model.ModelAnimalChest;

public class AnimalChestEntityRenderer extends MobRenderer<AnimalChestEntityEntity, ModelAnimalChest<AnimalChestEntityEntity>> {
	public AnimalChestEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAnimalChest<AnimalChestEntityEntity>(context.bakeLayer(ModelAnimalChest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnimalChestEntityEntity entity) {
		return new ResourceLocation("bou:textures/entities/sheep_chest.png");
	}

	@Override
	protected boolean isBodyVisible(AnimalChestEntityEntity entity) {
		return false;
	}
}