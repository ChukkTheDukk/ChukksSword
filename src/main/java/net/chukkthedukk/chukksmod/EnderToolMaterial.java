package net.chukkthedukk.chukksmod;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;

public class EnderToolMaterial
implements ToolMaterial {
        public static final EnderToolMaterial INSTANCE = new EnderToolMaterial();
    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 0.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
