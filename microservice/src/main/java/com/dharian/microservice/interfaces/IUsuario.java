package com.dharian.microservice.interfaces;

import com.dharian.microservice.entidades.Usuario;


public interface IUsuario {
     /**
      * Se usa para obtener los datos de un usuario filtrado por ID.
      * @param id
      * @return Usuario
      */
     Usuario getDataUser(int id);

}
