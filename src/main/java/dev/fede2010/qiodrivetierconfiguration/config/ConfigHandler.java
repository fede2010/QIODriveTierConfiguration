package dev.fede2010.qiodrivetierconfiguration.config;

import com.jerry.mekanism_extras.common.tier.ExtraQIODriverTier;
import dev.fede2010.qiodrivetierconfiguration.QIODriveTierConfiguration;
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

        if (Config.mekanismExtrasInstalled) {
            updateExtraQIODriveValues();
        }
    }

    private static void updateQIODriveValues() {
        try {
            modifyField(QIODriveTier.BASE,
                    Config.QIODRIVE_BASE_QUANTITY.get(),
                    Config.QIODRIVE_BASE_SIZE.get()
            );

            modifyField(QIODriveTier.HYPER_DENSE,
                    Config.QIODRIVE_HYPERDENSE_QUANTITY.get(),
                    Config.QIODRIVE_HYPERDENSE_SIZE.get()
            );

            modifyField(QIODriveTier.TIME_DILATING,
                    Config.QIODRIVE_TIMEDILATING_QUANTITY.get(),
                    Config.QIODRIVE_TIMEDILATING_SIZE.get()
            );

            modifyField(QIODriveTier.SUPERMASSIVE,
                    Config.QIODRIVE_SUPERMASSIVE_QUANTITY.get(),
                    Config.QIODRIVE_SUPERMASSIVE_SIZE.get()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateExtraQIODriveValues() {
        try {
            modifyField2(ExtraQIODriverTier.COLLAPSE,
                    Config.QIODRIVE_COLLAPSE_QUANTITY.get(),
                    Config.QIODRIVE_COLLAPSE_SIZE.get()
            );

            modifyField2(ExtraQIODriverTier.GAMMA,
                    Config.QIODRIVE_GAMMA_QUANTITY.get(),
                    Config.QIODRIVE_GAMMA_SIZE.get()
            );

            modifyField2(ExtraQIODriverTier.BLACK_HOLE,
                    Config.QIODRIVE_BLACK_HOLE_QUANTITY.get(),
                    Config.QIODRIVE_BLACK_HOLE_SIZE.get()
            );

            modifyField2(ExtraQIODriverTier.SINGULARITY,
                    Config.QIODRIVE_SINGULARITY_QUANTITY.get(),
                    Config.QIODRIVE_SINGULARITY_SIZE.get()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void modifyField(QIODriveTier tier, long newCount, int newTypes) throws Exception {
        Field countField = QIODriveTier.class.getDeclaredField("count");
        countField.setAccessible(true);
        countField.set(tier, newCount);

        Field typesField = QIODriveTier.class.getDeclaredField("types");
        typesField.setAccessible(true);
        typesField.set(tier, newTypes);
    }

    private static void modifyField2(ExtraQIODriverTier tier, long newCount, int newTypes) throws Exception {
        Field countField = ExtraQIODriverTier.class.getDeclaredField("count");
        countField.setAccessible(true);
        countField.set(tier, newCount);

        Field typesField = ExtraQIODriverTier.class.getDeclaredField("types");
        typesField.setAccessible(true);
        typesField.set(tier, newTypes);
    }
}