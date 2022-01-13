package blueduck.jellyfishing.registry;

import blueduck.jellyfishing.Jellyfishing;
import blueduck.jellyfishing.items.*;
import blueduck.jellyfishing.misc.config.JellyfishingConfig;
import co.eltrut.differentiate.core.registrator.ItemHelper;
import co.eltrut.differentiate.core.util.DataUtil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

public class JellyfishingItems {
    private static final ItemHelper HELPER = Jellyfishing.REGISTRATOR.getHelper(Registry.ITEM);

    // Food //
    public static final Item JELLYFISH_JELLY = HELPER.createItem("jellyfish_jelly", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build())));
    public static final Item BLUE_JELLYFISH_JELLY = HELPER.createItem("blue_jellyfish_jelly", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.3F).build())));
    public static final Item SEANUT = HELPER.createItem("seanut", new AliasedBlockItem(JellyfishingBlocks.SEANUT_BUSH, (new Item.Settings()).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1F).build())));
    public static final Item ROASTED_SEANUT = HELPER.createItem("roasted_seanut", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4F).build())));
    public static final Item SEANUT_BUTTER = HELPER.createItem("seanut_butter", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5F).build())));
    public static final Item SEANUT_BRITTLE = HELPER.createItem("seanut_brittle", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8F).build())));
    public static final Item JELLYFISH_JELLY_SANDWICH = HELPER.createItem("jellyfish_jelly_sandwich", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.45F).build())));
    public static final Item BLUE_JELLYFISH_JELLY_SANDWICH = HELPER.createItem("blue_jellyfish_jelly_sandwich", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(12).saturationModifier(0.55F).build())));
    public static final Item SEANUT_JELLYFISH_JELLY_SANDWICH = HELPER.createItem("seanut_butter_jellyfish_jelly_sandwich", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(11).saturationModifier(0.55F).build())));
    public static final Item SEANUT_BLUE_JELLYFISH_JELLY_SANDWICH = HELPER.createItem("seanut_butter_blue_jellyfish_jelly_sandwich", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(15).saturationModifier(0.7F).build())));
    public static final Item TRIPLE_GOOBERBERRY_SUNRISE = HELPER.createItem("triple_gooberberry_sunrise", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6F).snack().build())));
    public static final Item KELP_SHAKE = HELPER.createItem("kelp_shake", new KelpShakeItem(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.2F).build())));
    public static final Item KRABBY_PATTY = HELPER.createItem("krabby_patty", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(1.5F).meat().build()).rarity(Rarity.RARE)));
    public static final Item PINEAPPLE = HELPER.createItem("pineapple", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build())));

    // Materials //
    public static final Item JELLYFISH = HELPER.createItem("jellyfish", new JellyfishItem(new FabricItemSettings().group(ItemGroup.MATERIALS),  JellyfishingEntities.JELLYFISH));
    public static final Item BLUE_JELLYFISH = HELPER.createItem("blue_jellyfish", new JellyfishItem(new FabricItemSettings().group(ItemGroup.MATERIALS),  JellyfishingEntities.BLUE_JELLYFISH));
    public static final Item PINEAPPLE_SEEDS = HELPER.createItem("pineapple_seeds", new AliasedBlockItem(JellyfishingBlocks.PINEAPPLE_PLANT, (new Item.Settings()).group(ItemGroup.MATERIALS)));

    // Combat //
    public static final Item SPATULA = HELPER.createItem("spatula", new SpatulaItem(new FabricItemSettings().maxDamage(250).group(ItemGroup.COMBAT), JellyfishingConfig.get().attackDamages.spatula_damage - 3, -2, ToolMaterials.IRON));
    public static final Item GOLDEN_SPATULA = HELPER.createItem("golden_spatula", new SpatulaItem(new FabricItemSettings().maxDamage(2031).group(ItemGroup.COMBAT).rarity(Rarity.RARE), JellyfishingConfig.get().attackDamages.golden_spatula_damage - 3, -2F, ToolMaterials.NETHERITE));
    public static final Item KARATE_GLOVE = HELPER.createItem("karate_glove", new GloveItem(new FabricItemSettings().maxDamage(1000).group(ItemGroup.COMBAT), JellyfishingConfig.get().attackDamages.karate_damage - 1, -1.5F));
    public static final Item MASTER_KARATE_GLOVE = HELPER.createItem("master_karate_glove", new GloveItem(new FabricItemSettings().maxDamage(2031).group(ItemGroup.COMBAT), JellyfishingConfig.get().attackDamages.master_karate_damage - 1, -1.5F));
    public static final Item POWER_KARATE_GLOVE = HELPER.createItem("power_karate_glove", new GloveItem(new FabricItemSettings().maxDamage(2031).group(ItemGroup.COMBAT), JellyfishingConfig.get().attackDamages.power_karate_damage - 1, -3.625F));

    // Tools //
    public static final Item JELLYFISH_NET = HELPER.createItem("jellyfish_net", new JellyfishNetItem(new FabricItemSettings().group(ItemGroup.TOOLS).maxDamageIfAbsent(148)));
    public static final Item BUBBLE_WAND = HELPER.createItem("bubble_wand", new BubbleKitItem(new FabricItemSettings().group(ItemGroup.TOOLS).maxDamageIfAbsent(128)));

    // Armor //
    public static final Item KELP_MUSTACHE = HELPER.createItem("kelp_mustache", new ArmorItem(new KelpMaterial(), EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final SuitMaterial SUIT_MATERIAL = new SuitMaterial();
    public static final Item AIR_SUIT_HELMET = HELPER.createItem("air_suit_helmet", new ArmorItem(SUIT_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item AIR_SUIT_CHESTPLATE = HELPER.createItem("air_suit_chestplate", new ArmorItem(SUIT_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item AIR_SUIT_LEGGINGS = HELPER.createItem("air_suit_leggings", new ArmorItem(SUIT_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item AIR_SUIT_BOOTS = HELPER.createItem("air_suit_boots", new ArmorItem(SUIT_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item DIVER_SUIT_HELMET = null;//HELPER.createItem("diver_suit_helmet", new ArmorItem(SUIT_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Misc //
    public static final Item JELLYFISH_SPAWN_EGG = HELPER.createItem("jellyfish_spawn_egg", new SpawnEggItem(JellyfishingEntities.JELLYFISH,15615448, 15615377, new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item BLUE_JELLYFISH_SPAWN_EGG = HELPER.createItem("blue_jellyfish_spawn_egg", new SpawnEggItem(JellyfishingEntities.BLUE_JELLYFISH,5733356, 5719532, new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item GREASE_BALL = HELPER.createItem("grease_ball", new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_JELLYFISH_FIELDS = HELPER.createItem("music_disc_jellyfish_fields", new MusicDiscItem(15, JellyfishingSounds.JELLYFISH_FIELDS, new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE).maxCount(1)));


    public static void registerCompostables() {
        DataUtil.registerCompostable(SEANUT, 0.3F);
        DataUtil.registerCompostable(PINEAPPLE_SEEDS, 0.3F);
        DataUtil.registerCompostable(PINEAPPLE, 0.7F);
    }

    public static boolean hasAllSuitPieces(@NotNull LivingEntity player) {
        var headItem = player.getEquippedStack(EquipmentSlot.HEAD).getItem();
        var chestItem = player.getEquippedStack(EquipmentSlot.CHEST).getItem();
        var legItem = player.getEquippedStack(EquipmentSlot.LEGS).getItem();
        var feetItem = player.getEquippedStack(EquipmentSlot.FEET).getItem();
        return headItem == AIR_SUIT_HELMET &&
                chestItem == AIR_SUIT_CHESTPLATE &&
                legItem == AIR_SUIT_LEGGINGS &&
                feetItem == AIR_SUIT_BOOTS;
    }
}