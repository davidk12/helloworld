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

   }

}