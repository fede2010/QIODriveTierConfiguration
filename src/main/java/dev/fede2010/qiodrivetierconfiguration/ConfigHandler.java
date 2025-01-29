package dev.fede2010.qiodrivetierconfiguration;

import com.jerry.mekanism_extras.common.tier.ExtraQIODriverTier;
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

        if(Config.mekanismExtrasInstalled){
            updateExtraQIODriveValues();
        }
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

    private static void updateExtraQIODriveValues() {
        try {
            modifyField(ExtraQIODriverTier.COLLAPSE, Config.QIODriveCollapseQuantity, Config.QIODriveCollapseSize);
            modifyField(ExtraQIODriverTier.GAMMA, Config.QIODriveGammaQuantity, Config.QIODriveGammaSize);
            modifyField(ExtraQIODriverTier.BLACK_HOLE, Config.QIODriveBlackHoleQuantity, Config.QIODriveBlackHoleSize);
            modifyField(ExtraQIODriverTier.SINGULARITY, Config.QIODriveSingularityQuantity, Config.QIODriveSingularitySize);
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

    private static void modifyField(ExtraQIODriverTier tier, long newCount, int newTypes) throws Exception {
        // Campo 'count'
        Field countField = ExtraQIODriverTier.class.getDeclaredField("count");
        countField.setAccessible(true); // Ignora los checks de acceso
        countField.set(tier, newCount);

        // Campo 'types'
        Field typesField = ExtraQIODriverTier.class.getDeclaredField("types");
        typesField.setAccessible(true); // Ignora los checks de acceso
        typesField.set(tier, newTypes);
    }
}