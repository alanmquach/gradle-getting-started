import static spark.Spark.*;
 
public class Main {
    public static void main(String[] args) {
        // Heroku's convention is to define the port that you should listen on under the environment variable PORT
        // Here, we read that port, then tell Spark to bind to that port.
        port(Integer.valueOf(System.getenv("PORT")));

        // Default route
        get("/", (request, response) -> "Hello, World!");

        // Parameterized route
        get("/:name", (request, response) -> {
            String name = request.params(":name");
            return "Hello: " + request.params(":name"); 
        });
    }
}