package dev.fede2010.qiodrivetierconfiguration.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ConfigSyncPacket {

    private final long baseQuantity;
    private final int baseSize;
    private final long hyperDenseQuantity;
    private final int hyperDenseSize;
    private final long timeDilatingQuantity;
    private final int timeDilatingSize;
    private final long supermassiveQuantity;
    private final int supermassiveSize;

    private final long collapseQuantity;
    private final int collapseSize;
    private final long gammaQuantity;
    private final int gammaSize;
    private final long blackHoleQuantity;
    private final int blackHoleSize;
    private final long singularityQuantity;
    private final int singularitySize;

    public ConfigSyncPacket(long baseQuantity, int baseSize, long hyperDenseQuantity, int hyperDenseSize, long timeDilatingQuantity, int timeDilatingSize, long supermassiveQuantity, int supermassiveSize, long collapseQuantity, int collapseSize, long gammaQuantity, int gammaSize, long blackHoleQuantity, int blackHoleSize, long singularityQuantity, int singularitySize) {
        this.baseQuantity = baseQuantity;
        this.baseSize = baseSize;
        this.hyperDenseQuantity = hyperDenseQuantity;
        this.hyperDenseSize = hyperDenseSize;
        this.timeDilatingQuantity = timeDilatingQuantity;
        this.timeDilatingSize = timeDilatingSize;
        this.supermassiveQuantity = supermassiveQuantity;
        this.supermassiveSize = supermassiveSize;
        this.collapseQuantity = collapseQuantity;
        this.collapseSize = collapseSize;
        this.gammaQuantity = gammaQuantity;
        this.gammaSize = gammaSize;
        this.blackHoleQuantity = blackHoleQuantity;
        this.blackHoleSize = blackHoleSize;
        this.singularityQuantity = singularityQuantity;
        this.singularitySize = singularitySize;
    }

    // Constructor para reconstruir el paquete a partir del buffer
    public ConfigSyncPacket(FriendlyByteBuf buf) {
        this.baseQuantity = buf.readLong();
        this.baseSize = buf.readInt();
        this.hyperDenseQuantity = buf.readLong();
        this.hyperDenseSize = buf.readInt();
        this.timeDilatingQuantity = buf.readLong();
        this.timeDilatingSize = buf.readInt();
        this.supermassiveQuantity = buf.readLong();
        this.supermassiveSize = buf.readInt();

        this.collapseQuantity = buf.readLong();
        this.collapseSize = buf.readInt();
        this.gammaQuantity = buf.readLong();
        this.gammaSize = buf.readInt();
        this.blackHoleQuantity = buf.readLong();
        this.blackHoleSize = buf.readInt();
        this.singularityQuantity = buf.readLong();
        this.singularitySize = buf.readInt();
    }

    // Serializar los datos en el buffer
    public void toBytes(FriendlyByteBuf buf) {
        buf.writeLong(this.baseQuantity);
        buf.writeInt(this.baseSize);
        buf.writeLong(this.hyperDenseQuantity);
        buf.writeInt(this.hyperDenseSize);
        buf.writeLong(this.timeDilatingQuantity);
        buf.writeInt(this.timeDilatingSize);
        buf.writeLong(this.supermassiveQuantity);
        buf.writeInt(this.supermassiveSize);

        buf.writeLong(this.collapseQuantity);
        buf.writeInt(this.collapseSize);
        buf.writeLong(this.gammaQuantity);
        buf.writeInt(this.gammaSize);
        buf.writeLong(this.blackHoleQuantity);
        buf.writeInt(this.blackHoleSize);
        buf.writeLong(this.singularityQuantity);
        buf.writeInt(this.singularitySize);

    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            // Guardar los datos en el cliente
            ClientData.update(baseQuantity, baseSize, hyperDenseQuantity, hyperDenseSize, timeDilatingQuantity, timeDilatingSize, supermassiveQuantity, supermassiveSize,
            collapseQuantity, collapseSize, gammaQuantity, gammaSize, blackHoleQuantity, blackHoleSize, singularityQuantity, singularitySize);
        });
        ctx.get().setPacketHandled(true);
    }
}
