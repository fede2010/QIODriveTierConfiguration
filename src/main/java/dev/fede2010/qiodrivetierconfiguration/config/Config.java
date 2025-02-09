package dev.fede2010.qiodrivetierconfiguration.config;

import dev.fede2010.qiodrivetierconfiguration.QIODriveTierConfiguration;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = QIODriveTierConfiguration.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static boolean mekanismExtrasInstalled = ModList.get().isLoaded("mekanism_extras");

    // QIO Drive Base
    public static final ForgeConfigSpec.LongValue QIODRIVE_BASE_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive Base (Default: 16,000)")
            .defineInRange("baseQuantity", 16_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_BASE_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive Base (Default: 128)")
            .defineInRange("baseSize", 128, 0, Integer.MAX_VALUE);

    // QIO Drive HyperDense
    public static final ForgeConfigSpec.LongValue QIODRIVE_HYPERDENSE_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive HyperDense (Default: 128,000)")
            .defineInRange("hyperDenseQuantity", 128_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_HYPERDENSE_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive HyperDense (Default: 256)")
            .defineInRange("hyperDenseSize", 256, 0, Integer.MAX_VALUE);

    // QIO Drive TimeDilating
    public static final ForgeConfigSpec.LongValue QIODRIVE_TIMEDILATING_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive TimeDilating (Default: 1,048,000)")
            .defineInRange("timeDilatingQuantity", 1_048_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_TIMEDILATING_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive TimeDilating (Default: 1024)")
            .defineInRange("timeDilatingSize", 1024, 0, Integer.MAX_VALUE);

    // QIO Drive Supermassive
    public static final ForgeConfigSpec.LongValue QIODRIVE_SUPERMASSIVE_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive Supermassive (Default: 16,000,000,000)")
            .defineInRange("supermassiveQuantity", 16_000_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_SUPERMASSIVE_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive Supermassive (Default: 8192)")
            .defineInRange("supermassiveSize", 8192, 0, Integer.MAX_VALUE);

    // Mekanism Extras
    public static final ForgeConfigSpec.LongValue QIODRIVE_COLLAPSE_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive Collapse (Default: 128,000,000,000)")
            .defineInRange("collapseQuantity", 128_000_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_COLLAPSE_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive Collapse (Default: 16,384)")
            .defineInRange("collapseSize", 16384, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.LongValue QIODRIVE_GAMMA_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive Gamma (Default: 1,048,000,000,000)")
            .defineInRange("gammaQuantity", 1_048_000_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_GAMMA_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive Gamma (Default: 65,536)")
            .defineInRange("gammaSize", 65536, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.LongValue QIODRIVE_BLACK_HOLE_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive BlackHole (Default: 8,000,000,000,000)")
            .defineInRange("blackHoleQuantity", 8_000_000_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_BLACK_HOLE_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive BlackHole (Default: 262,144)")
            .defineInRange("blackHoleSize", 262144, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec.LongValue QIODRIVE_SINGULARITY_QUANTITY = BUILDER
            .comment("Cantidad máxima para QIO Drive Singularity (Default: 16,000,000,000,000)")
            .defineInRange("singularityQuantity", 16_000_000_000_000L, 0L, Long.MAX_VALUE);

    public static final ForgeConfigSpec.IntValue QIODRIVE_SINGULARITY_SIZE = BUILDER
            .comment("Tipos máximos para QIO Drive Singularity (Default: 1,048,576)")
            .defineInRange("singularitySize", 1048576, 0, Integer.MAX_VALUE);

    public static final ForgeConfigSpec SPEC = BUILDER.build();
}