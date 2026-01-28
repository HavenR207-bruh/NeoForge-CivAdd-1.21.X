package net.haven.CivAdd.item.custom;

import net.haven.CivAdd.util.ModTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class ScytheItem extends Item {
    public ScytheItem (Item.Properties properties) {super(properties);}

    public static Item.Properties scytheProperties(ToolMaterial material, Item.Properties properties, float attackDamage, float attackSpeed, int durability) {
        // Note that attackDamage is modified by the tool material's damage
        // (i.e. attackDamage will be attackDamage + material.attackDamageBonus, attackSpeed will just be attackSpeed)
        // Durability is set by the code
        return properties
                .tool(material, ModTags.Blocks.NEEDSSCYTHETOOL, attackDamage, attackSpeed, 0.0F)
                .durability(durability);
    }

}
