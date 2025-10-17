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
        updateQIODrive();

        if (Config.mekanismExtrasInstalado) {
            updateExtraQIODrive();
        }
    }

    private static void updateQIODrive() {
        try {
            modifyField(QIODriveTier.BASE,
                    Config.QIODRIVE_BASE_QUANTITY.get(),
                    Config.QIODRIVE_BASE_SIZE.get(),
                    QIODriveTier.class
            );

            modifyField(QIODriveTier.HYPER_DENSE,
                    Config.QIODRIVE_HYPERDENSE_QUANTITY.get(),
                    Config.QIODRIVE_HYPERDENSE_SIZE.get(),
                    QIODriveTier.class
            );

            modifyField(QIODriveTier.TIME_DILATING,
                    Config.QIODRIVE_TIMEDILATING_QUANTITY.get(),
                    Config.QIODRIVE_TIMEDILATING_SIZE.get(),
                    QIODriveTier.class
            );

            modifyField(QIODriveTier.SUPERMASSIVE,
                    Config.QIODRIVE_SUPERMASSIVE_QUANTITY.get(),
                    Config.QIODRIVE_SUPERMASSIVE_SIZE.get(),
                    QIODriveTier.class
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateExtraQIODrive() {
        try {
            modifyField(ExtraQIODriverTier.COLLAPSE,
                    Config.QIODRIVE_COLLAPSE_QUANTITY.get(),
                    Config.QIODRIVE_COLLAPSE_SIZE.get(),
                    ExtraQIODriverTier.class
            );

            modifyField(ExtraQIODriverTier.GAMMA,
                    Config.QIODRIVE_GAMMA_QUANTITY.get(),
                    Config.QIODRIVE_GAMMA_SIZE.get(),
                    ExtraQIODriverTier.class
            );

            modifyField(ExtraQIODriverTier.BLACK_HOLE,
                    Config.QIODRIVE_BLACK_HOLE_QUANTITY.get(),
                    Config.QIODRIVE_BLACK_HOLE_SIZE.get(),
                    ExtraQIODriverTier.class
            );

            modifyField(ExtraQIODriverTier.SINGULARITY,
                    Config.QIODRIVE_SINGULARITY_QUANTITY.get(),
                    Config.QIODRIVE_SINGULARITY_SIZE.get(),
                    ExtraQIODriverTier.class
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Modifica los valores de los campos "count" y "types" en un objeto dado mediante reflexión.
     *
     * @param tier     Objeto cuya clase debe contener los campos "count" y "types".
     * @param newCount Nuevo valor para el campo "count".
     * @param newTypes Nuevo valor para el campo "types".
     * @param tierClass Clase de `tier` que contiene los campos.
     * @throws Exception Si los campos no existen o no se pueden modificar.
     */
    private static <T> void modifyField(T tier, long newCount, int newTypes, Class<T> tierClass) throws Exception {
        Field countField = tierClass.getDeclaredField("count");
        countField.setAccessible(true);
        countField.set(tier, newCount);

        Field typesField = tierClass.getDeclaredField("types");
        typesField.setAccessible(true);
        typesField.set(tier, newTypes);
    }
}