package blueduck.jellyfishing.misc;

import blueduck.jellyfishing.registry.JellyfishingEnchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class PlunderingEnchantment extends Enchantment {
    public PlunderingEnchantment(Rarity weight, EquipmentSlot[] slotTypes) {
        super(weight, JellyfishingEnchantments.NET_TARGET, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 10 + 10 * (level - 1);
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
        return 3;
    }
}