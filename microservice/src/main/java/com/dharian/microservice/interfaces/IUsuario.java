package com.dharian.microservice.interfaces;


import com.dharian.microservice.entidades.bbdd.Usuario;

import java.util.List;

public interface IUsuario {
     /**
      * Se usa para obtener los datos de un usuario filtrado por ID.
      * @return Usuario
      */
     Usuario getDataUser(int id);
     List<Usuario> getDataUsers();

}
