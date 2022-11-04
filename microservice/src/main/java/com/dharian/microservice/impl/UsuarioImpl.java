package com.dharian.microservice.impl;

import com.dharian.microservice.entidades.Usuario;
import com.dharian.microservice.interfaces.IUsuario;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UsuarioImpl implements IUsuario {

    public Usuario getDataUser(int id) {
    Usuario pepe = new Usuario(id,"Javi","Resu","dharian","Murcia",new Date(),22);
        return pepe;
    }
}
