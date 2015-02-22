package org.spring.mvc.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author luis mora
 */
@Controller
public class HelloController {

    @RequestMapping(value = {"/hello", "/"})
    public String doHello(ModelMap model) {
        model.addAttribute("name", "luismoramedina");
        System.out.println("model = " + model);
        return "hello";
    }
}
