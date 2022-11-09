package com.dharian.microservice.entidades.json;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserData {


    private int numeroVeces;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinal;


}
