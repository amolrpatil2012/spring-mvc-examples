package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class DemoController {

    @RequestMapping("/first")
    public String first()
    {
        System.out.println("Called First Handler");
        return "redirect:/second";
    }

    @RequestMapping("/second")
    public String second()
    {
        System.out.println("Called second Handler");
        return "second";
    }

    @RequestMapping("/search")
    public RedirectView search(@RequestParam("querybox") String query )
    {
        String url = "https://www.google.com/search?q="+query;
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url);
        return redirectView;
    }


}
