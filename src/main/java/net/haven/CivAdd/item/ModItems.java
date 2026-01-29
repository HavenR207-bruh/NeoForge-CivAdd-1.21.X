package net.haven.CivAdd.item;

import com.sun.nio.sctp.SctpChannel;
import net.haven.CivAdd.item.custom.ScytheItem;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
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
    public static final DeferredItem<Item> IRON_COIN = ITEMS.registerSimpleItem("iron_coin", p -> p.rarity(Rarity.COMMON));
    public static final DeferredItem<Item> GOLD_COIN = ITEMS.registerSimpleItem("gold_coin", p -> p.rarity(Rarity.UNCOMMON));
    public static final DeferredItem<Item> DIAMOND_COIN = ITEMS.registerSimpleItem("diamond_coin", p -> p.rarity(Rarity.RARE));

    public static final DeferredItem<Item> WoodenScythe = ITEMS.registerItem(
            "wooden_scythe",
            ScytheItem::new,
            () -> ScytheItem.scytheProperties(
                    ToolMaterial.WOOD,
                    new Item.Properties(),
                            5.0f,
                            -3.3f,
                            150

            )


    );

    public static final DeferredItem<Item> StoneScythe = ITEMS.registerItem(
            "stone_scythe",
            ScytheItem::new,
            () -> ScytheItem.scytheProperties(
                    ToolMaterial.STONE,
                    new Item.Properties(),
                    5.0f,
                    -3.3f,
                    150

            )


    );

    public static final DeferredItem<Item> CopperScythe = ITEMS.registerItem(
            "copper_scythe",
            ScytheItem::new,
            () -> ScytheItem.scytheProperties(
                    ToolMaterial.COPPER,
                    new Item.Properties(),
                    5.0f,
                    -3.3f,
                    150

            )


    );

    public static final DeferredItem<Item> IronScythe = ITEMS.registerItem(
            "iron_scythe",
            ScytheItem::new,
            () -> ScytheItem.scytheProperties(
                    ToolMaterial.IRON,
                    new Item.Properties(),
                    5.0f,
                    -3.3f,
                    150

            )


    );

    public static final DeferredItem<Item> GoldScythe = ITEMS.registerItem(
            "gold_scythe",
            ScytheItem::new,
            () -> ScytheItem.scytheProperties(
                    ToolMaterial.GOLD,
                    new Item.Properties(),
                    5.0f,
                    -3.3f,
                    150

            )


    );

    public static final DeferredItem<Item> DiamondScythe = ITEMS.registerItem(
            "diamond_scythe",
            ScytheItem::new,
            () -> ScytheItem.scytheProperties(
                    ToolMaterial.DIAMOND,
                    new Item.Properties(),
                    5.0f,
                    -3.3f,
                    150

            )


    );

    public static final DeferredItem<Item> NetheriteScythe = ITEMS.registerItem(
            "netherite_scythe",
            ScytheItem::new,
            () -> ScytheItem.scytheProperties(
            ToolMaterial.NETHERITE,
            new Item.Properties(),
            5.0f,
            -3.3f,
            150
            )
    );
//    public static final DeferredItem<Item> WOODEN_SCYTHE = ITEMS.register("wooden_scythe", identifier -> new Item(new Item.Properties()));
//            () -> new WoodenScythe(new Item.Properties().hoe(ToolMaterial.WOOD, 1, -1).durability(100),ToolMaterial.WOOD));

    //public static final DeferredItem<Item> WOODEN_SCYTHE_BUT_BETTER = ITEMS.registerSimpleItem("Wooden_Scythe", p -> p.hoe());
    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
