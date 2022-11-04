package com.dharian.microservice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Data
@AllArgsConstructor
public class Usuario {
    @NotNull
    private Integer id;
   private String nombre,primerApellido,segundoApellido,ciudad;
   private Date fechaNacimiento;
   private Integer edad;

}
