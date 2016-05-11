import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        int maxThreads = 50;
        int minThreads = 2;
        int timeOutMillis = 30000;
        threadPool(maxThreads, minThreads, timeOutMillis);
        get("/hello", (req, res) -> "Hello world");
    }
}
