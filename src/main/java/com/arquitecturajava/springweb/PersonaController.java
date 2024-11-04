package com.arquitecturajava.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 10/12/2024
 * @project springweb
 */
@Controller
@RequestMapping("/persons")
public class PersonaController {

    final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @RequestMapping("/list")
    public String mostrarPersonas(Model model) {
        model.addAttribute("list", personaService.getAllPersonas());
        return "personas/lista";
    }
}
