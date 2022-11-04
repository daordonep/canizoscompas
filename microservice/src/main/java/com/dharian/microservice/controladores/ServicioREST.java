package com.dharian.microservice.controladores;

import com.dharian.microservice.entidades.Usuario;
import com.dharian.microservice.interfaces.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicioREST {
    @Autowired
    IUsuario iUsuario;

    @RequestMapping(value="/getUserById", method = RequestMethod.GET)
    ResponseEntity<Usuario> getUserById(
            @RequestParam("id") int id){

        return new ResponseEntity<Usuario>(iUsuario.getDataUser(id), HttpStatus.OK);
    }
}
