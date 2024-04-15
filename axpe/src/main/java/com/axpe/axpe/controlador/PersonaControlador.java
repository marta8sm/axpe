package com.axpe.axpe.controlador;

import com.axpe.axpe.PersonaServicio;
import com.axpe.axpe.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("axpe/personas")
public class PersonaControlador {

    @Autowired
    private PersonaServicio personaServicio;

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona)
    {
        return personaServicio.crearPersona(persona);
    }

    @GetMapping("{id}")
    public Persona buscarPersonaPorID(@PathVariable("id") Long id)
    {
        return personaServicio.buscarPersonaPorID(id);
    }

    /*@GetMapping("{nombre}/{apellido1}/{apellido2}")
    public Persona buscarPersonaPorNombreApellidos(@PathVariable("nombre") String nombre, @PathVariable("apellido1") String apellido1, @PathVariable("apellido2") String apellido2)
    {
        //String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;

        return personaServicio.buscarPersonaPorNombreApellidos(nombre, apellido1, apellido2);
    }*/

    @PutMapping
    public ResponseEntity<Object> modificarPersona(@RequestBody Persona persona) {

        personaServicio.modificarPersona(persona);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public List<Persona> verListaPersonas()
    {
        return personaServicio.verListaPersonas();
    }

    @DeleteMapping("{id}")
    public void eliminarPersonaPorID(@PathVariable("id") Long id)
    {
        personaServicio.eliminarPersonaPorID(id);
    }
}
