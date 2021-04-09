package com.ejemplo.ejemplo_trazas.service.imp;

import com.ejemplo.ejemplo_trazas.model.Persona;
import com.ejemplo.ejemplo_trazas.service.IPersonaSevice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("personaService")
public class PersonaServiceImp implements IPersonaSevice {

    private static final Log LOGGER = LogFactory.getLog(PersonaServiceImp.class);

    @Autowired
    @Qualifier("unaPersona")
    private Persona persona;

    @Override
    public Persona getPersona() {
        LOGGER.info("SERVICE: IPersonaService -> PersonaServiceImp");
        LOGGER.info("METHOD: getPersona()");
        LOGGER.info("RESULT: a object Persona");
        return persona;
    }
    
    
}
