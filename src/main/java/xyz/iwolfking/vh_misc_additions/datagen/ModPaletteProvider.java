package xyz.iwolfking.vh_misc_additions.datagen;


import iskallia.vault.VaultMod;
import iskallia.vault.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Blocks;
import xyz.iwolfking.vh_misc_additions.VHMiscAdditions;
import xyz.iwolfking.vhapi.api.datagen.gen.AbstractPaletteProvider;
import xyz.iwolfking.vhapi.api.datagen.lib.gen.palette.PaletteBuilder;

public class ModPaletteProvider extends AbstractPaletteProvider {
    public ModPaletteProvider(DataGenerator generator) {
        super(generator, VHMiscAdditions.MOD_ID);
    }

    @Override
    protected void registerPalettes() {
        add(VaultMod.id("generic/common_elite_spawners"), new PaletteBuilder(), builder -> {
            builder.leveled(leveledBuilder -> {
                leveledBuilder.list(0, "weighted_target", Blocks.DIAMOND_BLOCK.getRegistryName().toString(), entryMap -> {
                    entryMap.put(Blocks.AIR.getRegistryName().toString(), 1);
                });
                leveledBuilder.list(50, "weighted_target", Blocks.DIAMOND_BLOCK.getRegistryName().toString(), entryMap -> {
                    entryMap.put(ModBlocks.COMPANION_NEST.getRegistryName().toString(), 1);
                    entryMap.put(Blocks.AIR.getRegistryName().toString(), 19);
                });
            });
        });
    }
}
