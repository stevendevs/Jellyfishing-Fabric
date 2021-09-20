package blueduck.jellyfishing.registry;

import blueduck.jellyfishing.Jellyfishing;
import blueduck.jellyfishing.blocks.*;
import blueduck.jellyfishing.blocks.publicMC.JDeadCoralBlock;
import blueduck.jellyfishing.blocks.publicMC.JDoorBlock;
import blueduck.jellyfishing.blocks.publicMC.JStairsBlock;
import blueduck.jellyfishing.blocks.publicMC.JTrapdoorBlock;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.DataUtil;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

@SuppressWarnings({"unused", "deprecation"})
public class JellyfishingBlocks {
    private static final BlockHelper HELPER = Jellyfishing.REGISTRATOR.getHelper(Registry.BLOCK);

    public static final Block JELLY_BLOCK = add("jelly_block", new HoneyBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MapColor.ORANGE).velocityMultiplier(0.4F).jumpVelocityMultiplier(0.5F).nonOpaque().sounds(BlockSoundGroup.HONEY)));
    public static final Item JELLY_BLOCK_ITEM = add("jelly_block", new BlockItemBase(JELLY_BLOCK));

    public static final Block BLUE_JELLY_BLOCK = add("blue_jelly_block", new SlimeBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MapColor.ORANGE).velocityMultiplier(0.4F).jumpVelocityMultiplier(2F).nonOpaque().sounds(BlockSoundGroup.HONEY)));
    public static final Item BLUE_JELLY_BLOCK_ITEM = add("blue_jelly_block", new BlockItemBase(BLUE_JELLY_BLOCK));

    public static final Block CORAL_PLANT = add("coral_plant", new JDeadCoralBlock(FabricBlockSettings.of(Material.UNDERWATER_PLANT, MapColor.ORANGE).nonOpaque().sounds(BlockSoundGroup.SLIME).noCollision().luminance(blockState -> 12)));
    public static final Item CORAL_PLANT_ITEM = add("coral_plant", new BlockItemBase(CORAL_PLANT));

    public static final Block TUBE_PLANT = add("tube_plant", new JDeadCoralBlock(FabricBlockSettings.of(Material.UNDERWATER_PLANT, MapColor.ORANGE).nonOpaque().sounds(BlockSoundGroup.SLIME).noCollision()));
    public static final Item TUBE_PLANT_ITEM = add("tube_plant", new BlockItemBase(TUBE_PLANT));

    public static final Block SCRAP_METAL = add("scrap_metal", new Block(FabricBlockSettings.of(Material.METAL, MapColor.BROWN).sounds(BlockSoundGroup.METAL).strength(2F, 2F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));
    public static final Item SCRAP_METAL_ITEM = add("scrap_metal", new BlockItemBase(SCRAP_METAL));

    public static final Block SCRAP_METAL_STAIRS = add("scrap_metal_stairs", new JStairsBlock(SCRAP_METAL, FabricBlockSettings.copy(SCRAP_METAL)));
    public static final Item SCRAP_METAL_STAIRS_ITEM = add("scrap_metal_stairs", new BlockItemBase(SCRAP_METAL_STAIRS));

    public static final Block SCRAP_METAL_SLAB = add("scrap_metal_slab", new SlabBlock(FabricBlockSettings.copy(SCRAP_METAL)));
    public static final Item SCRAP_METAL_SLAB_ITEM = add("scrap_metal_slab", new BlockItemBase(SCRAP_METAL_SLAB));

    public static final Block CHROME_METAL = add("chrome_metal", new Block(FabricBlockSettings.of(Material.METAL, MapColor.BROWN).sounds(BlockSoundGroup.METAL).strength(2F, 2F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));
    public static final Item CHROME_METAL_ITEM = add("chrome_metal", new BlockItemBase(CHROME_METAL));

    public static final Block CHROME_METAL_STAIRS = add("chrome_metal_stairs", new JStairsBlock(CHROME_METAL, FabricBlockSettings.copy(CHROME_METAL)));
    public static final Item CHROME_METAL_STAIRS_ITEM = add("chrome_metal_stairs", new BlockItemBase(CHROME_METAL_STAIRS));

    public static final Block CHROME_METAL_SLAB = add("chrome_metal_slab", new SlabBlock(FabricBlockSettings.copy(CHROME_METAL)));
    public static final Item CHROME_METAL_SLAB_ITEM = add("chrome_metal_slab", new BlockItemBase(CHROME_METAL_SLAB));

    public static final Block CHROME_BRICKS = add("chrome_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.BROWN).sounds(BlockSoundGroup.METAL).strength(2F, 2F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));
    public static final Item CHROME_BRICKS_ITEM = add("chrome_bricks", new BlockItemBase(CHROME_BRICKS));

    public static final Block CHROME_BRICK_STAIRS = add("chrome_brick_stairs", new JStairsBlock(CHROME_METAL, FabricBlockSettings.copy(CHROME_METAL)));
    public static final Item CHROME_BRICK_STAIRS_ITEM = add("chrome_brick_stairs", new BlockItemBase(CHROME_BRICK_STAIRS));

    public static final Block CHROME_BRICK_SLAB = add("chrome_brick_slab", new SlabBlock(FabricBlockSettings.copy(CHROME_METAL)));
    public static final Item CHROME_BRICK_SLAB_ITEM = add("chrome_brick_slab", new BlockItemBase(CHROME_BRICK_SLAB));

    public static final Block VAULT_DOOR = add("vault_door", new JDoorBlock(FabricBlockSettings.of(Material.PISTON, MapColor.GRAY).sounds(BlockSoundGroup.METAL).strength(2F, 2F).nonOpaque().breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));
    public static final Item VAULT_DOOR_ITEM = add("vault_door", new BlockItemBase(VAULT_DOOR, new Item.Settings().group(ItemGroup.REDSTONE)));

    public static final Block VAULT_TRAPDOOR = add("vault_trapdoor", new JTrapdoorBlock(FabricBlockSettings.copy(VAULT_DOOR)));
    public static final Item VAULT_TRAPDOOR_ITEM = add("vault_trapdoor", new BlockItemBase(VAULT_TRAPDOOR, new Item.Settings().group(ItemGroup.REDSTONE)));

    public static final Block SCRAP_METAL_WINDOW = add("scrap_metal_window", new JTrapdoorBlock(FabricBlockSettings.copy(VAULT_DOOR).nonOpaque()));
    public static final Item SCRAP_METAL_WINDOW_ITEM = add("scrap_metal_window", new BlockItemBase(SCRAP_METAL_WINDOW, new Item.Settings().group(ItemGroup.REDSTONE)));

    public static final Block CHROME_DOOR = add("chrome_door", new JDoorBlock(FabricBlockSettings.of(Material.PISTON, MapColor.GRAY).sounds(BlockSoundGroup.METAL).strength(2F, 2F).nonOpaque().breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));
    public static final Item CHROME_DOOR_ITEM = add("chrome_door", new BlockItemBase(CHROME_DOOR, new Item.Settings().group(ItemGroup.REDSTONE)));

    public static final Block CHROME_VENT = add("chrome_vent", new JTrapdoorBlock(FabricBlockSettings.copy(VAULT_DOOR)));
    public static final Item CHROME_VENT_ITEM = add("chrome_vent", new BlockItemBase(CHROME_VENT, new Item.Settings().group(ItemGroup.REDSTONE)));


    public static final Block SEANUT_BRITTLE_BLOCK = add("seanut_brittle_block", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.BROWN).sounds(BlockSoundGroup.STONE).strength(0.3F, 0.3F).breakByTool(FabricToolTags.PICKAXES)));
    public static final Item SEANUT_BRITTLE_BLOCK_ITEM = add("seanut_brittle_block", new BlockItemBase(SEANUT_BRITTLE_BLOCK));

    public static final Block PINEAPPLE_BLOCK = add("pineapple_block", new Block(FabricBlockSettings.of(Material.DECORATION, MapColor.YELLOW).sounds(BlockSoundGroup.WET_GRASS).strength(0.9F, 0.9F).breakByTool(FabricToolTags.AXES)));
    public static final Item PINEAPPLE_BLOCK_ITEM = add("pineapple_block", new BlockItemBase(PINEAPPLE_BLOCK));

    public static final Block PINEAPPLE_PILLAR = add("pineapple_pillar", new PillarBlock(FabricBlockSettings.copy(PINEAPPLE_BLOCK)));
    public static final Item PINEAPPLE_PILLAR_ITEM = add("pineapple_pillar", new BlockItemBase(PINEAPPLE_PILLAR));

    public static final Block CHISELED_PINEAPPLE_BLOCK = add("chiseled_pineapple_block", new Block(FabricBlockSettings.copy(PINEAPPLE_BLOCK)));
    public static final Item CHISELED_PINEAPPLE_BLOCK_ITEM = add("chiseled_pineapple_block", new BlockItemBase(CHISELED_PINEAPPLE_BLOCK));

    public static final Block CORALSTONE = add("coralstone", new Block(FabricBlockSettings.of(Material.STONE, MapColor.PURPLE).sounds(BlockSoundGroup.STONE).strength(1.5F, 1F).breakByTool(FabricToolTags.PICKAXES).requiresTool()));
    public static final Item CORALSTONE_ITEM = add("coralstone", new BlockItemBase(CORALSTONE));

    public static final Block CORALSTONE_WALL = add("coralstone_wall", new WallBlock(FabricBlockSettings.copy(CORALSTONE)));
    public static final Item CORALSTONE_WALL_ITEM = add("coralstone_wall", new BlockItemBase(CORALSTONE_WALL));

    public static final Block CORALSTONE_STAIRS = add("coralstone_stairs", new JStairsBlock(CORALSTONE, FabricBlockSettings.copy(CORALSTONE)));
    public static final Item CORALSTONE_STAIRS_ITEM = add("coralstone_stairs", new BlockItemBase(CORALSTONE_STAIRS));

    public static final Block CORALSTONE_SLAB = add("coralstone_slab", new SlabBlock(FabricBlockSettings.copy(CORALSTONE)));
    public static final Item CORALSTONE_SLAB_ITEM = add("coralstone_slab", new BlockItemBase(CORALSTONE_SLAB));

    public static final Block POLISHED_CORALSTONE = add("polished_coralstone", new Block(FabricBlockSettings.of(Material.STONE, MapColor.PURPLE).sounds(BlockSoundGroup.STONE).strength(1.5F, 1F).breakByTool(FabricToolTags.PICKAXES).requiresTool()));
    public static final Item POLISHED_CORALSTONE_ITEM = add("polished_coralstone", new BlockItemBase(POLISHED_CORALSTONE));

    public static final Block POLISHED_CORALSTONE_STAIRS = add("polished_coralstone_stairs", new JStairsBlock(POLISHED_CORALSTONE, FabricBlockSettings.copy(POLISHED_CORALSTONE)));
    public static final Item POLISHED_CORALSTONE_STAIRS_ITEM = add("polished_coralstone_stairs", new BlockItemBase(POLISHED_CORALSTONE_STAIRS));

    public static final Block POLISHED_CORALSTONE_SLAB = add("polished_coralstone_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_CORALSTONE)));
    public static final Item POLISHED_CORALSTONE_SLAB_ITEM = add("polished_coralstone_slab", new BlockItemBase(POLISHED_CORALSTONE_SLAB));

    public static final Block ALGAE_GRASS = add("algae_grass", new AlgaeGrassBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC, MapColor.LIME).sounds(BlockSoundGroup.WET_GRASS).strength(1F, 1F).breakByTool(FabricToolTags.SHOVELS)));
    public static final Item ALGAE_GRASS_ITEM = add("algae_grass", new BlockItemBase(ALGAE_GRASS));

    public static final Block ALGAE_BLOCK = add("algae_block", new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIME).sounds(BlockSoundGroup.WET_GRASS).strength(1F, 1F).breakByTool(FabricToolTags.SHOVELS)));
    public static final Item ALGAE_BLOCK_ITEM = add("algae_block", new BlockItemBase(ALGAE_BLOCK));

    public static final Block PATTY_TILES = add("patty_tiles", new Block(FabricBlockSettings.of(Material.WOOL, MapColor.TERRACOTTA_ORANGE).sounds(BlockSoundGroup.NETHER_STEM).strength(1F, 1F).breakByTool(FabricToolTags.SHOVELS)));
    public static final Item PATTY_TILES_ITEM = add("patty_tiles", new BlockItemBase(PATTY_TILES));

    public static final Block BAMBOO_WALL = add("bamboo_wall", new PillarBlock(FabricBlockSettings.copy(Blocks.BAMBOO)));
    public static final Item BAMBOO_WALL_ITEM = add("bamboo_wall", new BlockItemBase(BAMBOO_WALL));

    public static final Block PINK_BAMBOO_WALL = add("pink_bamboo_wall", new PillarBlock(FabricBlockSettings.copy(Blocks.BAMBOO)));
    public static final Item PINK_BAMBOO_WALL_ITEM = add("pink_bamboo_wall", new BlockItemBase(PINK_BAMBOO_WALL));

    public static final Block BLUE_BAMBOO_WALL = add("blue_bamboo_wall", new PillarBlock(FabricBlockSettings.copy(Blocks.BAMBOO)));
    public static final Item BLUE_BAMBOO_WALL_ITEM = add("blue_bamboo_wall", new BlockItemBase(BLUE_BAMBOO_WALL));

    public static final Block YELLOW_BAMBOO_WALL = add("yellow_bamboo_wall", new PillarBlock(FabricBlockSettings.copy(Blocks.BAMBOO)));
    public static final Item YELLOW_BAMBOO_WALL_ITEM = add("yellow_bamboo_wall", new BlockItemBase(YELLOW_BAMBOO_WALL));


    public static final Block WHITE_CARPETED_TILES = add("white_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item WHITE_CARPETED_TILES_ITEM = add("white_carpeted_tiles", new BlockItemBase(WHITE_CARPETED_TILES));

    public static final Block ORANGE_CARPETED_TILES = add("orange_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_ORANGE).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item ORANGE_CARPETED_TILES_ITEM = add("orange_carpeted_tiles", new BlockItemBase(ORANGE_CARPETED_TILES));

    public static final Block MAGENTA_CARPETED_TILES = add("magenta_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_MAGENTA).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item MAGENTA_CARPETED_TILES_ITEM = add("magenta_carpeted_tiles", new BlockItemBase(MAGENTA_CARPETED_TILES));

    public static final Block LIGHT_BLUE_CARPETED_TILES = add("light_blue_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_LIGHT_BLUE).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item LIGHT_BLUE_CARPETED_TILES_ITEM = add("light_blue_carpeted_tiles", new BlockItemBase(LIGHT_BLUE_CARPETED_TILES));

    public static final Block YELLOW_CARPETED_TILES = add("yellow_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item YELLOW_CARPETED_TILES_ITEM = add("yellow_carpeted_tiles", new BlockItemBase(YELLOW_CARPETED_TILES));

    public static final Block LIME_CARPETED_TILES = add("lime_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_LIME).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item LIME_CARPETED_TILES_ITEM = add("lime_carpeted_tiles", new BlockItemBase(LIME_CARPETED_TILES));

    public static final Block PINK_CARPETED_TILES = add("pink_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item PINK_CARPETED_TILES_ITEM = add("pink_carpeted_tiles", new BlockItemBase(PINK_CARPETED_TILES));

    public static final Block GRAY_CARPETED_TILES = add("gray_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_GRAY).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item GRAY_CARPETED_TILES_ITEM = add("gray_carpeted_tiles", new BlockItemBase(GRAY_CARPETED_TILES));

    public static final Block LIGHT_GRAY_CARPETED_TILES = add("light_gray_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_LIGHT_GRAY).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item LIGHT_GRAY_CARPETED_TILES_ITEM = add("light_gray_carpeted_tiles", new BlockItemBase(LIGHT_GRAY_CARPETED_TILES));

    public static final Block CYAN_CARPETED_TILES = add("cyan_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_CYAN).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item CYAN_CARPETED_TILES_ITEM = add("cyan_carpeted_tiles", new BlockItemBase(CYAN_CARPETED_TILES));

    public static final Block PURPLE_CARPETED_TILES = add("purple_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_PURPLE).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item PURPLE_CARPETED_TILES_ITEM = add("purple_carpeted_tiles", new BlockItemBase(PURPLE_CARPETED_TILES));

    public static final Block BLUE_CARPETED_TILES = add("blue_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_BLUE).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item BLUE_CARPETED_TILES_ITEM = add("blue_carpeted_tiles", new BlockItemBase(BLUE_CARPETED_TILES));

    public static final Block BROWN_CARPETED_TILES = add("brown_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_BROWN).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item BROWN_CARPETED_TILES_ITEM = add("brown_carpeted_tiles", new BlockItemBase(BROWN_CARPETED_TILES));

    public static final Block GREEN_CARPETED_TILES = add("green_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_GREEN).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item GREEN_CARPETED_TILES_ITEM = add("green_carpeted_tiles", new BlockItemBase(GREEN_CARPETED_TILES));

    public static final Block RED_CARPETED_TILES = add("red_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_RED).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item RED_CARPETED_TILES_ITEM = add("red_carpeted_tiles", new BlockItemBase(RED_CARPETED_TILES));

    public static final Block BLACK_CARPETED_TILES = add("black_carpeted_tiles", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_BLACK).strength(2.0F, 3.0F).sounds(JellyfishingSounds.CARPETED_WOOD)));
    public static final Item BLACK_CARPETED_TILES_ITEM = add("black_carpeted_tiles", new BlockItemBase(BLACK_CARPETED_TILES));




    public static final Block SEANUT_BUSH = add("seanut_bush", new SeanutBush(FabricBlockSettings.of(Material.UNDERWATER_PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));
    public static final Block PINEAPPLE_PLANT = add("pineapple_plant", new PineapplePlant(FabricBlockSettings.of(Material.UNDERWATER_PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

    public static final Block BUBBLE_BLOCK = add("bubble_block", new BubbleBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MapColor.GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()));

    public static final Block GRILL = add("grill", new WaterloggableDirectionalBlock(FabricBlockSettings.of(Material.METAL, MapColor.BROWN).sounds(BlockSoundGroup.METAL).strength(2F, 2F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().nonOpaque()));
    public static final Item GRILL_ITEM = add("grill", new BlockItem(GRILL, new Item.Settings().group(ItemGroup.DECORATIONS)));


    public static final Block POTTED_PINEAPPLE = add("potted_pineapple", new FlowerPotBlock(PINEAPPLE_PLANT, FabricBlockSettings.copy(Blocks.FLOWER_POT)));

    //public static final Block JELLYFISH_MACHINE = add("jellyfish_machine", new JellyfishMachineBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MapColor.BROWN).sounds(BlockSoundGroup.METAL)));
    //public static final Item JELLYFISH_MACHINE_ITEM = add("jellyfish_machine", new BlockItemBase(JELLYFISH_MACHINE));

    public static Block add(String name, Block block) {
        return Registry.register(Registry.BLOCK, Jellyfishing.id(name), block);
    }

    public static Item add(String name, BlockItem block) {
        return Registry.register(Registry.ITEM, Jellyfishing.id(name), block);
    }

    public static void registerFlammables() {
        DataUtil.registerFlammable(BAMBOO_WALL, 10, 20);
        DataUtil.registerFlammable(PINK_BAMBOO_WALL, 10, 20);
        DataUtil.registerFlammable(BLUE_BAMBOO_WALL, 10, 20);
        DataUtil.registerFlammable(YELLOW_BAMBOO_WALL, 10, 20);

        DataUtil.registerFlammable(WHITE_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(ORANGE_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(MAGENTA_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(LIGHT_BLUE_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(YELLOW_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(LIME_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(PINK_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(GRAY_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(LIGHT_GRAY_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(CYAN_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(PURPLE_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(BLUE_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(BROWN_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(GREEN_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(RED_CARPETED_TILES, 8, 20);
        DataUtil.registerFlammable(BLACK_CARPETED_TILES, 8, 20);
    }

    public static class BlockItemBase extends BlockItem {
        public BlockItemBase(Block block) {
            super(block, new Settings().group(ItemGroup.BUILDING_BLOCKS));
        }

        public BlockItemBase(Block block, Settings settings) {
            super(block, settings);
        }
    }

    public static boolean isLoaded(String modid) {
        return FabricLoader.INSTANCE.isModLoaded(modid);
    }
}