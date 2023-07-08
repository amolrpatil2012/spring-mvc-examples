package example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
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
        String str = null;
        System.out.println(str.length());
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

    /*
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NullPointerException.class)
    public String exceptionHandlerNull(Model model)
    {
        model.addAttribute("msg","Null Pointer Exception Occurs");
        return "error_page";
    }

     */

}
