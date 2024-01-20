package net.truebat.batfirstmod.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    COPPER(MiningLevels.IRON, 200, 7.0f, 2.5f,100, ()-> Ingredient.ofItems(Items.COPPER_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchatability;
    private final Supplier<Ingredient> repairIngrediant;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchatability, Supplier<Ingredient> repairIngrediant) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchatability = enchatability;
        this.repairIngrediant = repairIngrediant;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchatability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngrediant.get();
    }
}
