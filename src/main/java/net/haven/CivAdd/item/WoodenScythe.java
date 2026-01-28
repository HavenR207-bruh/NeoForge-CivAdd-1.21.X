//package net.haven.CivAdd.item;
//
//import net.minecraft.world.InteractionResult;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.*;
//import net.minecraft.world.item.ToolMaterial;
//import net.minecraft.world.item.context.UseOnContext;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.block.CropBlock;
//
//import java.util.Map;
//
//public class WoodenScythe extends Item {
//    private ToolMaterial propertyinquestion;
//
//    private static final Map<ToolMaterial,Integer> Cooking =
//            Map.of(
//            ToolMaterial.WOOD,      1,
//            ToolMaterial.STONE,     2,
//            ToolMaterial.COPPER,    3,
//            ToolMaterial.IRON,      4,
//            ToolMaterial.GOLD,      8,
//            ToolMaterial.DIAMOND,   5,
//            ToolMaterial.NETHERITE, 6
//            );
//    public WoodenScythe(Properties properties,ToolMaterial toolMaterial) {
//        super(properties);
//        propertyinquestion = toolMaterial;
//    }
//    public InteractionResult useOn(UseOnContext context) {
//        Level level = context.getLevel();
//        Player player = context.getPlayer();
//        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();
//        if(!level.isClientSide()) {
//            return InteractionResult.SUCCESS;
//        }
//        if(clickedBlock.canHarvestBlock(clickedBlock.defaultBlockState(),level,context.getClickedPos(), player)){
//            if(Cooking.containsKey(propertyinquestion)){
//                player.getInventory().add(new ItemStack(clickedBlock.asItem(), Cooking.get(propertyinquestion)));
//            }
//        }
//        return InteractionResult.SUCCESS;
//    }
//}