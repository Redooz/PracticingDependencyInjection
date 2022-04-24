package com.rd.co.class2di.controllers;

import com.rd.co.class2di.domain.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    Invoice invoice;

    @GetMapping({"/","/index"})
    public String index(Model model){
        model.addAttribute("invoice",invoice);
        return "index";
    }

}
