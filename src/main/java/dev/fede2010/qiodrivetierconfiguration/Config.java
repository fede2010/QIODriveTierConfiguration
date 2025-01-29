package dev.fede2010.qiodrivetierconfiguration;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = QIODriveTierConfiguration.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    // Configuración para el QIO Drive Base
    public static final ForgeConfigSpec.LongValue QIODRIVE_BASE_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive Base (Default: 32,000,000)")
            .defineInRange("baseQuantity", 32_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_BASE_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive Base (Default: 1024)")
            .defineInRange("baseSize", 1024, 0, Integer.MAX_VALUE);

    // Configuración para el QIO Drive HyperDense
    public static final ForgeConfigSpec.LongValue QIODRIVE_HYPERDENSE_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive HyperDense (Default: 64,000,000)")
            .defineInRange("hyperDenseQuantity", 64_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_HYPERDENSE_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive HyperDense (Default: 2048)")
            .defineInRange("hyperDenseSize", 2048, 0, Integer.MAX_VALUE);

    // Configuración para el QIO Drive TimeDilating
    public static final ForgeConfigSpec.LongValue QIODRIVE_TIMEDILATING_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive TimeDilating (Default: 128,000,000)")
            .defineInRange("timeDilatingQuantity", 128_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_TIMEDILATING_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive TimeDilating (Default: 4096)")
            .defineInRange("timeDilatingSize", 4096, 0, Integer.MAX_VALUE);

    // Configuración para el QIO Drive Supermassive
    public static final ForgeConfigSpec.LongValue QIODRIVE_SUPERMASSIVE_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive Supermassive (Default: 256,000,000)")
            .defineInRange("supermassiveQuantity", 256_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_SUPERMASSIVE_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive Supermassive (Default: 8192)")
            .defineInRange("supermassiveSize", 8192, 0, Integer.MAX_VALUE);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    // Variables estáticas para acceder a los valores
    public static long QIODriveBaseQuantity;
    public static int QIODriveBaseSize;
    public static long QIODriveHyperDenseQuantity;
    public static int QIODriveHyperDenseSize;
    public static long QIODriveTimeDilatingQuantity;
    public static int QIODriveTimeDilatingSize;
    public static long QIODriveSupermassiveQuantity;
    public static int QIODriveSupermassiveSize;

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading event) {
        // Carga los valores desde el archivo de configuración
        QIODriveBaseQuantity = QIODRIVE_BASE_QUANTITY.get();
        QIODriveBaseSize = QIODRIVE_BASE_SIZE.get();
        QIODriveHyperDenseQuantity = QIODRIVE_HYPERDENSE_QUANTITY.get();
        QIODriveHyperDenseSize = QIODRIVE_HYPERDENSE_SIZE.get();
        QIODriveTimeDilatingQuantity = QIODRIVE_TIMEDILATING_QUANTITY.get();
        QIODriveTimeDilatingSize = QIODRIVE_TIMEDILATING_SIZE.get();
        QIODriveSupermassiveQuantity = QIODRIVE_SUPERMASSIVE_QUANTITY.get();
        QIODriveSupermassiveSize = QIODRIVE_SUPERMASSIVE_SIZE.get();
    }
}