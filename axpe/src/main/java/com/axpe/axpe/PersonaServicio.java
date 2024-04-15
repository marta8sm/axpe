package com.axpe.axpe;

import com.axpe.axpe.modelo.Persona;
import com.axpe.axpe.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {

    @Autowired
    private PersonaRepositorio personaRepositorio;

    public Persona crearPersona(Persona persona)
    {
        return personaRepositorio.save(persona);
    }

    public Persona buscarPersonaPorID(Long id)
    {
        Optional<Persona> personaOpcional = personaRepositorio.findById(id);

        return personaOpcional.get();
    }

    public List<Persona> verListaPersonas()
    {
        return personaRepositorio.findAll();
    }

    public void modificarPersona(Persona persona)
    {
        personaRepositorio.save(persona);
    }

    public void eliminarPersonaPorID(Long id)
    {
        personaRepositorio.deleteById(id);
    }
}
