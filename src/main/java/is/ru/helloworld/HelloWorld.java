package is.ru.HelloWorld;

import static spark.Spark.*;
import spark.*;

class HelloWorld {

   public static void main(String[] args) {
      setPort(Integer.valueOf(System.getenv("PORT")));
      get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
      });

       post(new Route("/add") {
            @Override
            public Object handle(Request request, Response response) {
                Integer a = Integer.valueOf(request.queryParams("a"));
                Integer b = Integer.valueOf(request.queryParams("b"));
                return a + b;
            }
        });

   }

}