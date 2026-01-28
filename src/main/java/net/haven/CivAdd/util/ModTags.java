package net.haven.CivAdd.util;
import net.haven.CivAdd.CivAdd;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.slot.ContentsSlotSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.neoforge.event.entity.player.UseItemOnBlockEvent;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDSSCYTHETOOL = createTag("needs_scythe_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(CivAdd.MODID, name));
    }
    }


    public static class Items {

        public static final TagKey<Item> Scythe = createTag("scythe");





        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(CivAdd.MODID, name));
        }

    }
}

