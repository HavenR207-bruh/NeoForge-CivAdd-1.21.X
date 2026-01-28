package net.haven.CivAdd.item;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collections;
import java.util.Properties;

import static net.haven.CivAdd.CivAdd.MODID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> STONE_COIN = ITEMS.registerSimpleItem("stone_coin", p -> p.rarity(Rarity.COMMON));
    public static final DeferredItem<Item> COPPER_COIN = ITEMS.registerSimpleItem("copper_coin", p -> p.rarity(Rarity.UNCOMMON));
    public static final DeferredItem<Item> IRON_COIN = ITEMS.registerSimpleItem("iron_coin", p -> p.rarity(Rarity.EPIC));
    public static final DeferredItem<Item> GOLD_COIN = ITEMS.registerSimpleItem("gold_coin", p -> p.rarity(Rarity.RARE));
    public static final DeferredItem<Item> DIAMOND_COIN = ITEMS.registerSimpleItem("diamond_coin", p -> p.rarity(Rarity.RARE));


    //public static final DeferredItem<Item> WOODEN_SCYTHE_BUT_BETTER = ITEMS.registerSimpleItem("Wooden_Scythe", p -> p.hoe());
    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
