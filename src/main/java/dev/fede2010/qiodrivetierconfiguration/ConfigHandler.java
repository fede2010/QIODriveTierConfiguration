package dev.fede2010.qiodrivetierconfiguration;

import mekanism.common.tier.QIODriveTier;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

import java.lang.reflect.Field;

@Mod.EventBusSubscriber(modid = QIODriveTierConfiguration.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigHandler {

    @SubscribeEvent
    public static void onConfigLoaded(ModConfigEvent.Loading event) {
        updateQIODriveValues();
    }

    private static void updateQIODriveValues() {
        try {
            modifyField(QIODriveTier.BASE, Config.QIODriveBaseQuantity, Config.QIODriveBaseSize);
            modifyField(QIODriveTier.HYPER_DENSE, Config.QIODriveHyperDenseQuantity, Config.QIODriveHyperDenseSize);
            modifyField(QIODriveTier.TIME_DILATING, Config.QIODriveTimeDilatingQuantity, Config.QIODriveTimeDilatingSize);
            modifyField(QIODriveTier.SUPERMASSIVE, Config.QIODriveSupermassiveQuantity, Config.QIODriveSupermassiveSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void modifyField(QIODriveTier tier, long newCount, int newTypes) throws Exception {
        // Campo 'count'
        Field countField = QIODriveTier.class.getDeclaredField("count");
        countField.setAccessible(true); // Ignora los checks de acceso
        countField.set(tier, newCount);

        // Campo 'types'
        Field typesField = QIODriveTier.class.getDeclaredField("types");
        typesField.setAccessible(true); // Ignora los checks de acceso
        typesField.set(tier, newTypes);
    }
}