package com.taller5.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping

public class ControllerIndex {
    @GetMapping("/index")
    public String vistaIndex (Model model){
        return "index";
    }
    @GetMapping("/libroView")
    public String vistalibrosView(Model model){
        return "libroView";
    }
    @GetMapping("/libroAdd")
    public String vistalibrosAdd(Model model){
        return "libroAdd";
    }
    

}
