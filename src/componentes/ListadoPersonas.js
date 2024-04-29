import React, { useState, useEffect, error } from "react";
import PersonaServicio from "../servicios/PersonaServicio";

export const ListadoPersonas = () => {

    const [personas, setPersonas] = useState([]);

    useEffect(() => {
        PersonaServicio.getAllPersonas().then(response => {
            setPersonas(response.data);
            console.log(response.data);
        }).catch(arror => {
            console.log(error);
        })
    }, []);

    return (
        <div className="container">
            <h2 className="text-center">Listado de personas</h2>
            <table className="table table-bordered table striped">
                <thead>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Primer apellido</th>
                    <th>Segundo apellido</th>
                    <th>Fecha de nacimiento</th>
                    <th>Teléfono</th>
                    <th>Correo electrónico</th>
                </thead>
                <tbody>
                    {
                        personas.map(persona =>
                            <tr key={persona.id}>
                                <td>{persona.id}</td>
                                <td>{persona.nombre}</td>
                                <td>{persona.apellido1}</td>
                                <td>{persona.apellido2}</td>
                                <td>{persona.fecha_nacimiento}</td>
                                <td>{persona.telefono}</td>
                                <td>{persona.correo}</td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListadoPersonas;