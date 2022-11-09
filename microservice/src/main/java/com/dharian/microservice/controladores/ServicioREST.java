package com.dharian.microservice.controladores;

import com.dharian.microservice.entidades.bbdd.Datum;
import com.dharian.microservice.entidades.bbdd.Usuario;
import com.dharian.microservice.entidades.json.UserData;
import com.dharian.microservice.interfaces.IDataUser;
import com.dharian.microservice.interfaces.IDatum;
import com.dharian.microservice.interfaces.IUsuario;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

@RestController
public class ServicioREST {
    //TODO("Filtros por fecha, datos por usuario, datos totales")
    private final static Logger LOGGER= Logger.getLogger("com.dharian.microservice.controladores.ServicioRest");
    @Autowired
    IUsuario iUsuario;
    @Autowired
    IDataUser iDataUser;
    @Autowired
    IDatum iDatum;

    /**
     * Obtienes un usuario por ID
     * @param id
     * @return
     */
    @RequestMapping(value="/getUserById", method = RequestMethod.GET)
    ResponseEntity<Usuario> getUserById(
            @RequestParam("id") int id){

        return new ResponseEntity<Usuario>(iUsuario.getDataUser(id), HttpStatus.OK);
    }

    /**
     * Obtiene nombre, veces y fechas de las deposiciones.
     *
     * @return
     */
    @RequestMapping(value="/getAllData", method= RequestMethod.GET)
    ResponseEntity<List<UserData>> getData (){
        return new ResponseEntity<List<UserData>>(iDataUser.getAllData(), HttpStatus.OK);
    }

    /**
     * Devuelve los nombres y los ids de los usuarios.
     * @return
     */
    @RequestMapping(value="/getDataUsers", method= RequestMethod.GET)
    ResponseEntity<List<Usuario>> getDataUsers(){

        return new ResponseEntity<List<Usuario>>(iUsuario.getDataUsers(),HttpStatus.OK);
    }

    @RequestMapping(value="/getDataDatum", method=RequestMethod.GET)
    ResponseEntity<List<Datum>> getDataDatum(){
        return new ResponseEntity<List<Datum>>(iDatum.getData(),HttpStatus.OK);
    }





}
