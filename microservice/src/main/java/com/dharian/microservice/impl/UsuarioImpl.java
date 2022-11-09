package com.dharian.microservice.impl;

import com.dharian.microservice.entidades.bbdd.Usuario;
import com.dharian.microservice.interfaces.IUsuario;
import com.dharian.microservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

@Service
public class UsuarioImpl implements IUsuario {
    private final static Logger LOGGER= Logger.getLogger("com.dharian.microservice.impl.UsuarioImpl");
    @Autowired
    private UserRepository userRepository;

    public Usuario getDataUser(int id) {
        Usuario user= new Usuario();
       /* if(){

        }*/
        return null;
    }

    /**
     * @return Devuelve los nombres de los usuarios y sus ids.
     */
    @Override
    public List<Usuario> getDataUsers() { return (List<Usuario>) userRepository.findAll();
    }

}
