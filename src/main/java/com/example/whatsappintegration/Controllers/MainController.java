package com.example.whatsappintegration.Controllers;


import com.example.whatsappintegration.Models.WhatsappData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;

@Controller
public class MainController {

    @RequestMapping("/")
    public String wpForm(){
        return "wp";
    }


    @RequestMapping("/whatsapp")
    public String wpData(@ModelAttribute WhatsappData whatsappData) throws UnsupportedEncodingException {

        return "wpData";
    }
}
