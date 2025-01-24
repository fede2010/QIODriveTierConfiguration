package dev.fede2010.qiodrivetierconfiguration.mixin;


import dev.fede2010.qiodrivetierconfiguration.Config;
import mekanism.common.tier.QIODriveTier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(QIODriveTier.class)
public class QIODriveTierMixin {

    @ModifyConstant(method = "<clinit>", constant = @Constant(longValue = 16000L))
    private static long modifyBaseCount(long original) {
        return 32_000_000L;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(longValue = 128000L))
    private static long modifyHyperDenseCount(long original) {
        return 64_000_000L;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(longValue = 1048000L))
    private static long modifyTimeDilatingCount(long original) {
        return 128_000_000L;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(longValue = 16000000000L))
    private static long modifySupermassiveCount(long original) {
        return 256_000_000L;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 128))
    private static int modifyBaseTypes(int original) {
        return 1024;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 256))
    private static int modifyHyperDenseTypes(int original) {
        return 2048;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 1024))
    private static int modifyTimeDilatingTypes(int original) {
        return 4096;
    }

    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8192))
    private static int modifySupermassiveTypes(int original) {
        return 8192;
    }
}
