package core;

/**
 * Created by ERKIN on 20/09/2014.
 */
public class TrainsException extends Exception {

    public static final String NO_SUCH_ROUTE = "NO SUCH ROUTE";
    public static final String NO_CYCLE_ROUTE = "NO CYCLE ROUTE";

    private final String message;

    public TrainsException(String message) {
        super(message);
        this.message = message;
    }
}
