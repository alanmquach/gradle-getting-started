import static spark.Spark.*;
 
public class Main {
    public static void main(String[] args) {
        get("/", (request, response) -> "Hello, World!");
        get("/:name", (request, response) -> {
            String name = request.params(":name");
            return "Hello: " + request.params(":name"); 
        });
    }
}