
/**
 * This class creates a stockapp and runs the stockapp.
 *
 * @author (Hashir Iqbal)
 * @version (1/12/20)
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
