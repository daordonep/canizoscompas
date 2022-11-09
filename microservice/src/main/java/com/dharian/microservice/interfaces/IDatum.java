package com.dharian.microservice.interfaces;

import com.dharian.microservice.entidades.bbdd.Datum;

import java.util.List;

public interface IDatum {
    List<Datum> getData();
    Datum getDataByUser();
}
