package xyz.iwolfking.vh_misc_additions.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import xyz.iwolfking.vh_misc_additions.VHMiscAdditions;

@Mod.EventBusSubscriber(modid = VHMiscAdditions.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper efh = event.getExistingFileHelper();

        if (event.includeServer()) {
            gen.addProvider(new ModPaletteProvider(gen));
        }
    }


}