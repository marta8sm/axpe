import axios from "axios";

const PERSONA_BASE_REST_API_URL = "http://localhost:8080/axpe/personas";

class PersonaServicio
{
    getAllPersonas()
    {
        return axios.get(PERSONA_BASE_REST_API_URL);
    }
}

export default new PersonaServicio();