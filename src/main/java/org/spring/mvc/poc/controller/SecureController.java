package org.spring.mvc.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author luis mora
 */
@Controller
public class SecureController {

    @RequestMapping(value = {"/secure", "/"})
    public String secure(ModelMap model) {
        return "secure/secure";
    }
}
