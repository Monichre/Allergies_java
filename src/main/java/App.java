import java.util.ArrayList;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;



public class App {

  public static void main(String[] args){
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response)-> {
      HashMap model = new HashMap();
      CoinCombos coinOutput = new CoinCombos();
      Integer userOutput = Integer.parseInt(request.queryParams("money"));
      model.put("output", coinOutput.changeConverter(userOutput));
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }

}
