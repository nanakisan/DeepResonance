package mcjty.deepresonance.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import mcjty.deepresonance.blocks.ModBlocks;
import mcjty.deepresonance.blocks.collector.EnergyCollectorSetup;
import mcjty.deepresonance.blocks.gencontroller.GeneratorControllerSetup;
import mcjty.deepresonance.blocks.generator.GeneratorSetup;
import mcjty.deepresonance.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class ModCrafting {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.deepResonanceManualItem), " o ", "rbr", " r ", 'r', Items.redstone, 'b', Items.book, 'o', ModBlocks.resonatingOreBlock);

        GeneratorSetup.setupCrafting();
        GeneratorControllerSetup.setupCrafting();
        EnergyCollectorSetup.setupCrafting();
    }
}
