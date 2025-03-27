package net.mcreator.mariocraft.block.model;

public class QuestionMarkBlockModel extends GeoModel<QuestionMarkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(QuestionMarkTileEntity animatable) {
		return new ResourceLocation("mario_craft", "animations/qustion_mark_block_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(QuestionMarkTileEntity animatable) {
		return new ResourceLocation("mario_craft", "geo/qustion_mark_block_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(QuestionMarkTileEntity animatable) {
		return new ResourceLocation("mario_craft", "textures/block/mario.png");
	}
}