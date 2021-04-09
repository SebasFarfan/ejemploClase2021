package com.ejemplo.ejemplo_trazas.controller;

import com.ejemplo.ejemplo_trazas.model.Persona;
import com.ejemplo.ejemplo_trazas.service.IPersonaSevice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @Autowired
    @Qualifier("personaService")
    private IPersonaSevice personaService;
    private static final Log LOGGER = LogFactory.getLog(IndexController.class);

    @GetMapping("/index")
    public String getIndexPage(Model model){
        LOGGER.info("CONTROLLER: IndexController with /index get method");
        LOGGER.info("METHOD: getIndexPage()");
        LOGGER.info("RESULT: visualiza la página index.html");
        model.addAttribute(personaService.getPersona());
        return "index";
    }

    @PostMapping("/processForm")
    public ModelAndView processForm(@ModelAttribute("persona") Persona unaPersona){
        LOGGER.info("CONTROLLER: IndexController with /processForm post method");
        LOGGER.info("METHOD: processForm() ---- PARAMS: persona  '" + personaService.getPersona() + "'");
        ModelAndView model = new ModelAndView("resultado");
        personaService.getPersona().setNombre(unaPersona.getNombre());
        model.addObject("person", personaService.getPersona());
        
        LOGGER.info("RESULT: visualiza la página resultado.html --- PARAMS:'" + this.personaService.getPersona() + "'");
        return model;
    }


}
