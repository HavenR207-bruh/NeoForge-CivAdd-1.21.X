package net.haven.CivAdd.item.custom;

import net.haven.CivAdd.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.neoforge.event.LootTableLoadEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

import javax.tools.Tool;

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

    private static boolean isMature(BlockState state) {
        if (state.getBlock() instanceof CocoaBlock) {
            return state.getValue(CocoaBlock.AGE) >= CocoaBlock.MAX_AGE;
        } else if (state.getBlock() instanceof CropBlock cropBlock) {
            return cropBlock.isMaxAge(state);
        } else if (state.getBlock() instanceof NetherWartBlock) {
            return state.getValue(NetherWartBlock.AGE) >= NetherWartBlock.MAX_AGE;
        }

        return false;
    }

    private static int checkTier(ToolMaterial material) {

        if (material == ToolMaterial.WOOD) return 1;
        if (material == ToolMaterial.STONE) return 2;
        if (material == ToolMaterial.COPPER) return 3;
        if (material == ToolMaterial.IRON) return 4;
        if (material == ToolMaterial.GOLD) return 6;
        if (material == ToolMaterial.DIAMOND) return 5;
        if (material == ToolMaterial.NETHERITE) return 6;

        return 1;
    }

    public static ToolMaterial getMaterial(Item item) {
        return getMaterial(item);}


    public static void onCropBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        if (player == null) return;

        ItemStack held = player.getMainHandItem();
        if (!(held.getItem() instanceof ScytheItem scytheItem)) return;

        BlockState state = event.getState();
        if (!isMature(state)) return;

        int cropMultiplier = checkTier(getMaterial(held.getItem()));

        event.setCanceled(true);

        var level = event.getLevel();
        var pos = event.getPos();

        for (int i = 0; i < cropMultiplier; i++) {
            Block.dropResources(state, (Level) level, pos, null, player, held);
        }

        level.removeBlock(pos, false);
    }

}
