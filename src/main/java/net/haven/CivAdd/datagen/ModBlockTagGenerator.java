package net.haven.CivAdd.datagen;

import net.haven.CivAdd.CivAdd;
import net.haven.CivAdd.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider ){
        super(output, lookupProvider, CivAdd.MODID);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.NEEDSSCYTHETOOL)
                .addTag(BlockTags.MINEABLE_WITH_HOE);
    }
}
