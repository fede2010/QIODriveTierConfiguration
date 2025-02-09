package dev.fede2010.qiodrivetierconfiguration.network;

import dev.fede2010.qiodrivetierconfiguration.QIODriveTierConfiguration;
import dev.fede2010.qiodrivetierconfiguration.config.Config;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.network.PacketDistributor;


public class PacketLoaderEvent {

    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity() instanceof ServerPlayer serverPlayer) {

            long baseQuantity = Config.QIODRIVE_BASE_QUANTITY.get();
            int baseSize = Config.QIODRIVE_BASE_SIZE.get();
            long hyperDenseQuantity = Config.QIODRIVE_HYPERDENSE_QUANTITY.get();
            int hyperDenseSize = Config.QIODRIVE_HYPERDENSE_SIZE.get();
            long timeDilatingQuantity = Config.QIODRIVE_TIMEDILATING_QUANTITY.get();
            int timeDilatingSize = Config.QIODRIVE_TIMEDILATING_SIZE.get();
            long supermassiveQuantity = Config.QIODRIVE_SUPERMASSIVE_QUANTITY.get();
            int supermassiveSize = Config.QIODRIVE_SUPERMASSIVE_SIZE.get();

            long collapseQuantity = Config.QIODRIVE_COLLAPSE_QUANTITY.get();
            int collapseSize = Config.QIODRIVE_COLLAPSE_SIZE.get();
            long gammaQuantity = Config.QIODRIVE_GAMMA_QUANTITY.get();
            int gammaSize = Config.QIODRIVE_GAMMA_SIZE.get();
            long blackHoleQuantity = Config.QIODRIVE_BLACK_HOLE_QUANTITY.get();
            int blackHoleSize = Config.QIODRIVE_BLACK_HOLE_SIZE.get();
            long singularityQuantity = Config.QIODRIVE_SINGULARITY_QUANTITY.get();
            int singularitySize = Config.QIODRIVE_SINGULARITY_SIZE.get();

            ConfigSyncPacket packet = new ConfigSyncPacket(baseQuantity, baseSize, hyperDenseQuantity, hyperDenseSize, timeDilatingQuantity, timeDilatingSize, supermassiveQuantity, supermassiveSize,
                    collapseQuantity, collapseSize, gammaQuantity, gammaSize, blackHoleQuantity, blackHoleSize, singularityQuantity, singularitySize);

            // Enviar el paquete al jugador que acaba de conectarse
            QIODriveTierConfiguration.CHANNEL.send(PacketDistributor.PLAYER.with(() -> serverPlayer), packet);
        }
    }
}
