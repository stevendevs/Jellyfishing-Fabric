package blueduck.jellyfishing.misc.config;

import blueduck.jellyfishing.Jellyfishing;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.Config.Gui.Background;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = Jellyfishing.MOD_ID)
@Background(value = Jellyfishing.MOD_ID + ":textures/block/blue_bamboo_wall.png")
public class JellyfishingConfig implements ConfigData {
    @Comment("Should Caught and Released Jellyfish sting?")
    public Boolean caught_jellyfish_sting = false;
    @Comment("Biome Weight of Jellyfish Fields\n" + "\tRange: 1 ~ 100")
    public Integer jellyfish_fields_weight = 2;
    @Comment("Should Jellyfish be fishable with a fishing rod?")
    public Boolean jellyfish_fishable = true;
    @Comment("Should Jellyfish Nets be fishable with a fishing rod?")
    public Boolean nets_fishable = true;
    @Comment("Should Jellyfish sting?")
    public Boolean jellyfish_sting = true;

    @CollapsibleObject
    public BiomeOptions biome = new BiomeOptions();
    @CollapsibleObject
    public AttackDamageOptions attackDamages = new AttackDamageOptions();
    @CollapsibleObject
    public OptimizationOptions optimization = new OptimizationOptions();
    @CollapsibleObject
    public Client client = new Client();

    public static class BiomeOptions {
        @Comment("Enable Flower Clouds?")
        public Boolean flower_clouds = true;
    }

    public static class AttackDamageOptions {
        @Comment("Damage of the Spatula\n" + "\t\tRange: 1 ~ 1000")
        public Integer spatula_damage = 6;
        @Comment("Damage of the Master Karate Glove\n" + "\t\tRange: 1 ~ 1000")
        public Integer master_karate_damage = 5;
        @Comment("Damage of the Power Karate Glove\n" + "\t\tRange: 1 ~ 1000")
        public Integer power_karate_damage = 18;
        @Comment("Damage of the Golden Spatula\n" + "\t\tRange: 1 ~ 1000")
        public Integer golden_spatula_damage = 8;
        @Comment("Damage of the Karate Glove\n" + "\t\tRange: 1 ~ 1000")
        public Integer karate_damage = 3;
    }

    public static class OptimizationOptions {
        @Comment("With this enabled, right clicking will produce a few of the jellyfish's jelly item and destroy the jellyfish item")
        public Boolean no_place_jellyfish = false;
    }

    public static class Client {
        @Comment("Enable custom music in the Jellyfish Fields?")
        public Boolean music = true;
    }

    public static void init() {
        AutoConfig.register(JellyfishingConfig.class, GsonConfigSerializer::new);
    }

    public static JellyfishingConfig get() {
        return AutoConfig.getConfigHolder(JellyfishingConfig.class).getConfig();
    }
}