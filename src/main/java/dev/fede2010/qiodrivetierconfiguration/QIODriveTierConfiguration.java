package dev.fede2010.qiodrivetierconfiguration;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(QIODriveTierConfiguration.MODID)
public class QIODriveTierConfiguration {
    public static final String MODID = "qiodrivetierconfiguration";

    public QIODriveTierConfiguration() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        // Registra la configuración
        ModLoadingContext.get().registerConfig(
                ModConfig.Type.COMMON,
                Config.SPEC,
                "qiodrivetierconfiguration.toml"
        );
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Setup común (opcional)
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Evento de inicio del servidor (opcional)
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Setup del cliente (opcional)
        }
    }
}