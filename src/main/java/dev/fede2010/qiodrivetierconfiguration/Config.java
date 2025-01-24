package dev.fede2010.qiodrivetierconfiguration;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = QIODriveTierConfiguration.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    /*private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.LongValue QIODRIVE_BASE_QUANTITY = BUILDER
            .comment("Define the quantity for QIO Drive.")
            .comment("Default: 32.000.000")
            .defineInRange(
                    "QIODriveBaseQuantity", // Nombre de la configuración.
                    32_000_000L,        // default
                    0L,                 // mínimo
                    Long.MAX_VALUE      // máximo
            );

    private static final ForgeConfigSpec.IntValue QIODRIVE_BASE_SIZE = BUILDER
            .comment("Define the size for QIO Drive.")
            .comment("Default: 1.024")
            .defineInRange("QIODriveBaseSize", 1024, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.LongValue QIODRIVE_HYPERDENSE_QUANTITY = BUILDER
            .comment("Define the quantity for QIO Drive.")
            .comment("Default: 64.000.000")
            .defineInRange(
                    "QIODriveHyperDenseQuantity", // Nombre de la configuración.
                    64_000_000L,        // default
                    0L,                 // mínimo
                    Long.MAX_VALUE      // máximo
            );

    private static final ForgeConfigSpec.IntValue QIODRIVE_HYPERDENSE_SIZE = BUILDER
            .comment("Define the size for QIO Drive.")
            .comment("Default: 2.048")
            .defineInRange("QIODriveHyperDenseSize", 2048, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.LongValue QIODRIVE_TIMEDILATING_QUANTITY = BUILDER
            .comment("Define the quantity for QIO Drive.")
            .comment("Default: 128.000.000")
            .defineInRange(
                    "QIODriveTimeDilatingQuantity", // Nombre de la configuración.
                    128_000_000L,        // default
                    0L,                 // mínimo
                    Long.MAX_VALUE      // máximo
            );

    private static final ForgeConfigSpec.IntValue QIODRIVE_TIMEDILATING_SIZE = BUILDER
            .comment("Define the size for QIO Drive.")
            .comment("Default: 4.096")
            .defineInRange("QIODriveTimeDilatingSize", 4096, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.LongValue QIODRIVE_SUPERMASSIVE_QUANTITY = BUILDER
            .comment("Define the quantity for QIO Drive.")
            .comment("Default: 256.000.000")
            .defineInRange(
                    "QIODriveSupermassiveQuantity", // Nombre de la configuración.
                    256_000_000L,        // default
                    0L,                 // mínimo
                    Long.MAX_VALUE      // máximo
            );

    private static final ForgeConfigSpec.IntValue QIODRIVE_SUPERMASSIVE_SIZE = BUILDER
            .comment("Define the size for QIO Drive.")
            .comment("Default: 8.192")
            .defineInRange("QIODriveSupermassiveSize", 8192, 0, Integer.MAX_VALUE);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static long QIODriveBaseQuantity;
    public static int QIODriveBaseSize;

    public static long QIODriveHyperDenseQuantity;
    public static int QIODriveHyperDenseSize;

    public static long QIODriveTimeDilatingQuantity;
    public static int QIODriveTimeDilatingSize;

    public static long QIODriveSupermassiveQuantity;
    public static int QIODriveSupermassiveSize;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        QIODriveBaseQuantity = QIODRIVE_BASE_QUANTITY.get();
        QIODriveBaseSize = QIODRIVE_BASE_SIZE.get();

        QIODriveHyperDenseQuantity = QIODRIVE_HYPERDENSE_QUANTITY.get();
        QIODriveHyperDenseSize = QIODRIVE_HYPERDENSE_SIZE.get();

        QIODriveTimeDilatingQuantity = QIODRIVE_TIMEDILATING_QUANTITY.get();
        QIODriveTimeDilatingSize = QIODRIVE_TIMEDILATING_SIZE.get();

        QIODriveSupermassiveQuantity = QIODRIVE_SUPERMASSIVE_QUANTITY.get();
        QIODriveSupermassiveSize = QIODRIVE_SUPERMASSIVE_SIZE.get();

    }*/
}
