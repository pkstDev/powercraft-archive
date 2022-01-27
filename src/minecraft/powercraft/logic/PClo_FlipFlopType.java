package powercraft.logic;


public class PClo_FlipFlopType
{
    public static final int TOTAL_FLIPFLOP_COUNT = 4;

    @SuppressWarnings("javadoc")
    public static final int D = 0, RS = 1, T = 2, RANDOM = 3;

    public static String[] names = new String[TOTAL_FLIPFLOP_COUNT];

    static
    {
        names[D] = "D";
        names[RS] = "RS";
        names[T] = "T";
        names[RANDOM] = "random";
    }

    public static int[] index = new int[TOTAL_FLIPFLOP_COUNT];

    static
    {
        index[D] = 80;
        index[RS] = 81;
        index[T] = 82;
        index[RANDOM] = 83;
    }
}
