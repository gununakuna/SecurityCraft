package net.geforcemods.securitycraft.datagen;

import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.SCTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;

public class BlockTagGenerator extends BlockTagsProvider
{
	protected BlockTagGenerator(DataGenerator dataGenerator)
	{
		super(dataGenerator);
	}

	@Override
	protected void registerTags()
	{
		//securitycraft tags
		getBuilder(SCTags.Blocks.REINFORCED_ACACIA_LOGS).add(
				SCContent.reinforcedAcaciaLog,
				SCContent.reinforcedAcaciaWood,
				SCContent.reinforcedStrippedAcaciaLog,
				SCContent.reinforcedStrippedAcaciaWood);
		getBuilder(SCTags.Blocks.REINFORCED_BIRCH_LOGS).add(
				SCContent.reinforcedBirchLog,
				SCContent.reinforcedBirchWood,
				SCContent.reinforcedStrippedBirchLog,
				SCContent.reinforcedStrippedBirchWood);
		getBuilder(SCTags.Blocks.REINFORCED_CARPETS).add(
				SCContent.reinforcedWhiteCarpet,
				SCContent.reinforcedOrangeCarpet,
				SCContent.reinforcedMagentaCarpet,
				SCContent.reinforcedLightBlueCarpet,
				SCContent.reinforcedYellowCarpet,
				SCContent.reinforcedLimeCarpet,
				SCContent.reinforcedPinkCarpet,
				SCContent.reinforcedGrayCarpet,
				SCContent.reinforcedLightGrayCarpet,
				SCContent.reinforcedCyanCarpet,
				SCContent.reinforcedPurpleCarpet,
				SCContent.reinforcedBlueCarpet,
				SCContent.reinforcedBrownCarpet,
				SCContent.reinforcedGreenCarpet,
				SCContent.reinforcedRedCarpet,
				SCContent.reinforcedBlackCarpet);
		getBuilder(SCTags.Blocks.REINFORCED_DARK_OAK_LOGS).add(
				SCContent.reinforcedDarkOakLog,
				SCContent.reinforcedDarkOakWood,
				SCContent.reinforcedStrippedDarkOakLog,
				SCContent.reinforcedStrippedDarkOakWood);
		getBuilder(SCTags.Blocks.REINFORCED_JUNGLE_LOGS).add(
				SCContent.reinforcedJungleLog,
				SCContent.reinforcedJungleWood,
				SCContent.reinforcedStrippedJungleLog,
				SCContent.reinforcedStrippedJungleWood);
		getBuilder(SCTags.Blocks.REINFORCED_LOGS).add(
				SCTags.Blocks.REINFORCED_ACACIA_LOGS,
				SCTags.Blocks.REINFORCED_BIRCH_LOGS,
				SCTags.Blocks.REINFORCED_DARK_OAK_LOGS,
				SCTags.Blocks.REINFORCED_JUNGLE_LOGS,
				SCTags.Blocks.REINFORCED_OAK_LOGS,
				SCTags.Blocks.REINFORCED_SPRUCE_LOGS);
		getBuilder(SCTags.Blocks.REINFORCED_OAK_LOGS).add(
				SCContent.reinforcedOakLog,
				SCContent.reinforcedOakWood,
				SCContent.reinforcedStrippedOakLog,
				SCContent.reinforcedStrippedOakWood);
		getBuilder(SCTags.Blocks.REINFORCED_PLANKS).add(
				SCContent.reinforcedAcaciaPlanks,
				SCContent.reinforcedBirchPlanks,
				SCContent.reinforcedDarkOakPlanks,
				SCContent.reinforcedJunglePlanks,
				SCContent.reinforcedOakPlanks,
				SCContent.reinforcedSprucePlanks);
		getBuilder(SCTags.Blocks.REINFORCED_SLABS).add(SCTags.Blocks.REINFORCED_WOODEN_SLABS).add(
				SCContent.reinforcedNormalStoneSlab,
				SCContent.reinforcedSmoothStoneSlab,
				SCContent.reinforcedSandstoneSlab,
				SCContent.reinforcedCobblestoneSlab,
				SCContent.reinforcedBrickSlab,
				SCContent.reinforcedStoneBrickSlab,
				SCContent.reinforcedNetherBrickSlab,
				SCContent.reinforcedQuartzSlab,
				SCContent.reinforcedRedSandstoneSlab,
				SCContent.reinforcedPurpurSlab,
				SCContent.reinforcedPrismarineSlab,
				SCContent.reinforcedPrismarineBrickSlab,
				SCContent.reinforcedDarkPrismarineSlab,
				SCContent.reinforcedPolishedGraniteSlab,
				SCContent.reinforcedSmoothRedSandstoneSlab,
				SCContent.reinforcedMossyStoneBrickSlab,
				SCContent.reinforcedPolishedDioriteSlab,
				SCContent.reinforcedMossyCobblestoneSlab,
				SCContent.reinforcedEndStoneBrickSlab,
				SCContent.reinforcedSmoothSandstoneSlab,
				SCContent.reinforcedSmoothQuartzSlab,
				SCContent.reinforcedGraniteSlab,
				SCContent.reinforcedAndesiteSlab,
				SCContent.reinforcedRedNetherBrickSlab,
				SCContent.reinforcedPolishedAndesiteSlab,
				SCContent.reinforcedDioriteSlab,
				SCContent.reinforcedCrystalQuartzSlab);
		getBuilder(SCTags.Blocks.REINFORCED_SPRUCE_LOGS).add(
				SCContent.reinforcedSpruceLog,
				SCContent.reinforcedSpruceWood,
				SCContent.reinforcedStrippedSpruceLog,
				SCContent.reinforcedStrippedSpruceWood);
		getBuilder(SCTags.Blocks.REINFORCED_STAIRS).add(SCTags.Blocks.REINFORCED_WOODEN_STAIRS).add(
				SCContent.reinforcedPurpurStairs,
				SCContent.reinforcedCobblestoneStairs,
				SCContent.reinforcedBrickStairs,
				SCContent.reinforcedStoneBrickStairs,
				SCContent.reinforcedNetherBrickStairs,
				SCContent.reinforcedSandstoneStairs,
				SCContent.reinforcedQuartzStairs,
				SCContent.reinforcedPrismarineStairs,
				SCContent.reinforcedPrismarineBrickStairs,
				SCContent.reinforcedDarkPrismarineStairs,
				SCContent.reinforcedRedSandstoneStairs,
				SCContent.reinforcedPolishedGraniteStairs,
				SCContent.reinforcedSmoothRedSandstoneStairs,
				SCContent.reinforcedMossyStoneBrickStairs,
				SCContent.reinforcedPolishedDioriteStairs,
				SCContent.reinforcedMossyCobblestoneStairs,
				SCContent.reinforcedEndStoneBrickStairs,
				SCContent.reinforcedStoneStairs,
				SCContent.reinforcedSmoothSandstoneStairs,
				SCContent.reinforcedSmoothQuartzStairs,
				SCContent.reinforcedGraniteStairs,
				SCContent.reinforcedAndesiteStairs,
				SCContent.reinforcedRedNetherBrickStairs,
				SCContent.reinforcedPolishedAndesiteStairs,
				SCContent.reinforcedDioriteStairs,
				SCContent.reinforcedCrystalQuartzStairs);
		getBuilder(SCTags.Blocks.REINFORCED_STONE_BRICKS).add(
				SCContent.reinforcedStoneBricks,
				SCContent.reinforcedMossyStoneBricks,
				SCContent.reinforcedCrackedStoneBricks,
				SCContent.reinforcedChiseledStoneBricks);
		getBuilder(SCTags.Blocks.REINFORCED_WOODEN_SLABS).add(
				SCContent.reinforcedOakSlab,
				SCContent.reinforcedSpruceSlab,
				SCContent.reinforcedBirchSlab,
				SCContent.reinforcedJungleSlab,
				SCContent.reinforcedAcaciaSlab,
				SCContent.reinforcedDarkOakSlab);
		getBuilder(SCTags.Blocks.REINFORCED_WOODEN_STAIRS).add(
				SCContent.reinforcedOakStairs,
				SCContent.reinforcedSpruceStairs,
				SCContent.reinforcedBirchStairs,
				SCContent.reinforcedJungleStairs,
				SCContent.reinforcedAcaciaStairs,
				SCContent.reinforcedDarkOakStairs);
		getBuilder(SCTags.Blocks.REINFORCED_WOOL).add(
				SCContent.reinforcedWhiteWool,
				SCContent.reinforcedOrangeWool,
				SCContent.reinforcedMagentaWool,
				SCContent.reinforcedLightBlueWool,
				SCContent.reinforcedYellowWool,
				SCContent.reinforcedLimeWool,
				SCContent.reinforcedPinkWool,
				SCContent.reinforcedGrayWool,
				SCContent.reinforcedLightGrayWool,
				SCContent.reinforcedCyanWool,
				SCContent.reinforcedPurpleWool,
				SCContent.reinforcedBlueWool,
				SCContent.reinforcedBrownWool,
				SCContent.reinforcedGreenWool,
				SCContent.reinforcedRedWool,
				SCContent.reinforcedBlackWool);
		getBuilder(SCTags.Blocks.SECRET_SIGNS).add(SCTags.Blocks.SECRET_STANDING_SIGNS, SCTags.Blocks.SECRET_WALL_SIGNS);
		getBuilder(SCTags.Blocks.SECRET_STANDING_SIGNS).add(
				SCContent.secretAcaciaSign,
				SCContent.secretBirchSign,
				SCContent.secretDarkOakSign,
				SCContent.secretJungleSign,
				SCContent.secretOakSign,
				SCContent.secretSpruceSign);
		getBuilder(SCTags.Blocks.SECRET_WALL_SIGNS).add(
				SCContent.secretAcaciaWallSign,
				SCContent.secretBirchWallSign,
				SCContent.secretDarkOakWallSign,
				SCContent.secretJungleWallSign,
				SCContent.secretOakWallSign,
				SCContent.secretSpruceWallSign);
		getBuilder(SCTags.Blocks.REINFORCED_STONE).add(
				SCContent.reinforcedAndesite,
				SCContent.reinforcedDiorite,
				SCContent.reinforcedGranite,
				SCContent.reinforcedStone,
				SCContent.reinforcedPolishedAndesite,
				SCContent.reinforcedPolishedDiorite,
				SCContent.reinforcedPolishedGranite);

		//minecraft tags
		getBuilder(BlockTags.CARPETS).add(SCTags.Blocks.REINFORCED_CARPETS);
		getBuilder(BlockTags.FENCES).add(SCContent.ironFence);
		getBuilder(BlockTags.RAILS).add(SCContent.trackMine);
		getBuilder(BlockTags.SLABS).add(SCTags.Blocks.REINFORCED_SLABS).add(SCContent.crystalQuartzSlab);
		getBuilder(BlockTags.STAIRS).add(SCTags.Blocks.REINFORCED_STAIRS).add(SCContent.stairsCrystalQuartz);
		getBuilder(BlockTags.SIGNS).add(SCTags.Blocks.SECRET_SIGNS);
		getBuilder(BlockTags.STANDING_SIGNS).add(SCTags.Blocks.SECRET_STANDING_SIGNS);
		getBuilder(BlockTags.TRAPDOORS).add(SCContent.reinforcedIronTrapdoor);
		getBuilder(BlockTags.WALL_SIGNS).add(SCTags.Blocks.SECRET_WALL_SIGNS);

		//forge tags
		getBuilder(Tags.Blocks.SUPPORTS_BEACON).add(SCContent.reinforcedIronBlock, SCContent.reinforcedGoldBlock, SCContent.reinforcedDiamondBlock, SCContent.reinforcedEmeraldBlock);
		getBuilder(Tags.Blocks.SUPPORTS_CONDUIT).add(SCContent.reinforcedPrismarine, SCContent.reinforcedPrismarineBricks, SCContent.reinforcedSeaLantern, SCContent.reinforcedDarkPrismarine);
	}

	@Override
	public String getName()
	{
		return "SecurityCraft Block Tags";
	}
}
