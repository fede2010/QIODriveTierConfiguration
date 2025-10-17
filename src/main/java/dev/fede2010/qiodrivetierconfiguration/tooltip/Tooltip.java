package dev.fede2010.qiodrivetierconfiguration.tooltip;

import dev.fede2010.qiodrivetierconfiguration.config.Config;
import dev.fede2010.qiodrivetierconfiguration.network.ClientData;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Tooltip {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        ResourceLocation itemId = ForgeRegistries.ITEMS.getKey(stack.getItem());


        //Items Mekanism
        modificarTooltip(event, itemId, new ResourceLocation("mekanism", "qio_drive_base"), "Items:", ClientData.getBaseQuantity());
        modificarTooltip(event, itemId, new ResourceLocation("mekanism", "qio_drive_base"), "Types:", ClientData.getBaseSize());

        modificarTooltip(event, itemId, new ResourceLocation("mekanism", "qio_drive_hyper_dense"), "Items:", ClientData.getHyperDenseQuantity());
        modificarTooltip(event, itemId, new ResourceLocation("mekanism", "qio_drive_hyper_dense"), "Types:", ClientData.getHyperDenseSize());

        modificarTooltip(event, itemId, new ResourceLocation("mekanism", "qio_drive_time_dilating"), "Items:", ClientData.getTimeDilatingQuantity());
        modificarTooltip(event, itemId, new ResourceLocation("mekanism", "qio_drive_time_dilating"), "Types:", ClientData.getTimeDilatingSize());

        modificarTooltip(event, itemId, new ResourceLocation("mekanism", "qio_drive_supermassive"), "Items:", ClientData.getSupermassiveQuantity());
        modificarTooltip(event, itemId, new ResourceLocation("mekanism", "qio_drive_supermassive"), "Types:", ClientData.getSupermassiveSize());

        if (Config.mekanismExtrasInstalado) {
            //Items Mekanism Extras
            modificarTooltip(event, itemId, new ResourceLocation("mekanism_extras", "qio_drive_collapse"), "Items:", ClientData.getCollapseQuantity());
            modificarTooltip(event, itemId, new ResourceLocation("mekanism_extras", "qio_drive_collapse"), "Types:", ClientData.getCollapseSize());

            modificarTooltip(event, itemId, new ResourceLocation("mekanism_extras", "qio_drive_gamma"), "Items:", ClientData.getGammaQuantity());
            modificarTooltip(event, itemId, new ResourceLocation("mekanism_extras", "qio_drive_gamma"), "Types:", ClientData.getGammaSize());

            modificarTooltip(event, itemId, new ResourceLocation("mekanism_extras", "qio_drive_black_hole"), "Items:", ClientData.getBlackHoleQuantity());
            modificarTooltip(event, itemId, new ResourceLocation("mekanism_extras", "qio_drive_black_hole"), "Types:", ClientData.getBlackHoleSize());

            modificarTooltip(event, itemId, new ResourceLocation("mekanism_extras", "qio_drive_singularity"), "Items:", ClientData.getSingularityQuantity());
            modificarTooltip(event, itemId, new ResourceLocation("mekanism_extras", "qio_drive_singularity"), "Types:", ClientData.getSingularitySize());
        }
    }

    /**
     * Modifica el tooltip de un ítem en función del prefijo y el valor personalizado.
     *
     * @param event          El evento ItemTooltipEvent.
     * @param itemId         ResourceLocation del ítem actual.
     * @param targetResource ResourceLocation objetivo.
     * @param prefijo         Prefijo a buscar y colocar en el tooltip (por ejemplo, "Items:" o "Types:").
     * @param valor    Valor personalizado (Number) que se inyectará en el tooltip.
     */
    private static void modificarTooltip(ItemTooltipEvent event, ResourceLocation itemId, ResourceLocation targetResource, String prefijo, Number valor) {
        if (itemId != null && itemId.equals(targetResource)) {
            List<Component> tooltips = event.getToolTip();
            for (int i = 0; i < tooltips.size(); i++) {
                Component tooltip = tooltips.get(i);
                String rawText = tooltip.getString();
                if (rawText.contains("/") && rawText.startsWith(prefijo)) {
                    String[] parts = rawText.split("/");
                    String firstValue = parts[0].replace(prefijo, "").trim();
                    Component formattedTooltip = Component.literal(prefijo + " ")
                            .append(Component.literal(firstValue).withStyle(ChatFormatting.BLUE))
                            .append(" / " + NumberFormat.getInstance(Locale.ITALIAN).format(valor))
                            .withStyle(ChatFormatting.GRAY);
                    tooltips.set(i, formattedTooltip);
                    return;
                }
            }
        }
    }
}







