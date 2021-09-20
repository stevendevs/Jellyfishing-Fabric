package blueduck.jellyfishing.misc;

import blueduck.jellyfishing.registry.JellyfishingEnchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class AgilityEnchantment extends Enchantment {
    public AgilityEnchantment(Rarity weight, EquipmentSlot[] slots) {
        super(weight, JellyfishingEnchantments.NET_TARGET, slots);
    }

    @Override
    public int getMinPower(int level) {
        return 0;
    }

    @Override
    public int getMaxPower(int level) {
        return 50;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    /**
     * Returns the maximum level that the enchantment can have.
     */
    @Override
    public int getMaxLevel() {
        return 1;
    }
}