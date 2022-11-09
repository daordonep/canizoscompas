package com.dharian.microservice.interfaces;

import com.dharian.microservice.entidades.json.UserData;

import java.util.List;

public interface IDataUser {
    /**
     * Devuelve los nombres y las veces que han cagado.
     *
     * @return UserData
     */
    List<UserData> getAllData();
}
