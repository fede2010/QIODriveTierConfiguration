package dev.fede2010.qiodrivetierconfiguration.network;

public class ClientData {

    private static long baseQuantity;
    private static int baseSize;
    private static long hyperDenseQuantity;
    private static int hyperDenseSize;
    private static long timeDilatingQuantity;
    private static int timeDilatingSize;
    private static long supermassiveQuantity;
    private static int supermassiveSize;

    private static long collapseQuantity;
    private static int collapseSize;
    private static long gammaQuantity;
    private static int gammaSize;
    private static long blackHoleQuantity;
    private static int blackHoleSize;
    private static long singularityQuantity;
    private static int singularitySize;

    public static void update(long baseQuantity, int baseSize, long hyperDenseQuantity, int hyperDenseSize, long timeDilatingQuantity, int timeDilatingSize, long supermassiveQuantity, int supermassiveSize, long collapseQuantity, int collapseSize, long gammaQuantity, int gammaSize, long blackHoleQuantity, int blackHoleSize, long singularityQuantity, int singularitySize){

        ClientData.baseQuantity = baseQuantity;
        ClientData.baseSize = baseSize;
        ClientData.hyperDenseQuantity = hyperDenseQuantity;
        ClientData.hyperDenseSize = hyperDenseSize;
        ClientData.timeDilatingQuantity = timeDilatingQuantity;
        ClientData.timeDilatingSize = timeDilatingSize;
        ClientData.supermassiveQuantity = supermassiveQuantity;
        ClientData.supermassiveSize = supermassiveSize;
        ClientData.collapseQuantity = collapseQuantity;
        ClientData.collapseSize = collapseSize;
        ClientData.gammaQuantity = gammaQuantity;
        ClientData.gammaSize = gammaSize;
        ClientData.blackHoleQuantity = blackHoleQuantity;
        ClientData.blackHoleSize = blackHoleSize;
        ClientData.singularityQuantity = singularityQuantity;
        ClientData.singularitySize = singularitySize;

    }

    public static long getBaseQuantity() {
        return baseQuantity;
    }

    public static int getBaseSize() {
        return baseSize;
    }

    public static long getHyperDenseQuantity() {
        return hyperDenseQuantity;
    }

    public static int getHyperDenseSize() {
        return hyperDenseSize;
    }

    public static long getTimeDilatingQuantity() {
        return timeDilatingQuantity;
    }

    public static int getTimeDilatingSize() {
        return timeDilatingSize;
    }

    public static long getSupermassiveQuantity() {
        return supermassiveQuantity;
    }

    public static int getSupermassiveSize() {
        return supermassiveSize;
    }

    public static long getCollapseQuantity() {
        return collapseQuantity;
    }

    public static int getCollapseSize() {
        return collapseSize;
    }

    public static long getGammaQuantity() {
        return gammaQuantity;
    }

    public static int getGammaSize() {
        return gammaSize;
    }

    public static long getBlackHoleQuantity() {
        return blackHoleQuantity;
    }

    public static int getBlackHoleSize() {
        return blackHoleSize;
    }

    public static long getSingularityQuantity() {
        return singularityQuantity;
    }

    public static int getSingularitySize() {
        return singularitySize;
    }
}
