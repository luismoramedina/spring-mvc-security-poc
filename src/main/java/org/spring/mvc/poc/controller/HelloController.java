package org.spring.mvc.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author krubio
 *
 */
@Controller
public class HelloController {

    @RequestMapping(value = {"/hello", "/" , "/login"})
    public String doHello(ModelMap model) {
        model.addAttribute("title", "Access Spring Security....");
        model.addAttribute("message","Welcome page!");
        System.out.println("model = " + model);
        return "hello";
    }
}
