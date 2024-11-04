package com.arquitecturajava.springweb;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 10/12/2024
 * @project springweb
 */
@Service
public class PersonaService {
    static List<Persona> listPersonas = new ArrayList<>();

    static {
        Persona p1 = new Persona("Pepe", "Perez", 30);
        Persona p2 = new Persona("Ana", "Sanchez", 25);
        listPersonas.add(p1);
        listPersonas.add(p2);
    }
    public List<Persona> getAllPersonas() {
        return listPersonas;
    }
}
