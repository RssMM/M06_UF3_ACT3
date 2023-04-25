package com.act3uf3m6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HolaMonController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showview()
    {

        ModelAndView mv = new ModelAndView();
        mv.addObject("salutacio", "Hola Mon Spring amb Java configuration");
        mv.setViewName("benvinguda.jsp");
        return mv;
    }

    @RequestMapping(value = "/holadenou", method = RequestMethod.GET)
    public ModelAndView showviewB()
    {
        System.out.println("holadenou");
        ModelAndView mv = new ModelAndView();
        mv.addObject("salutacio", "Hola Mon de nou Spring amb Java configuration");
        mv.setViewName("benvinguda.jsp");
        return mv;
    }
}
