package com.dharian.microservice.impl;

import com.dharian.microservice.entidades.bbdd.Datum;
import com.dharian.microservice.interfaces.IDatum;
import com.dharian.microservice.repository.DatumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DatumImpl implements IDatum {

    @Autowired
    private DatumRepository datumRepository;
    /**
     * @return null
     */
    @Override
    public List<Datum> getData() {
       return (List<Datum>) datumRepository.findAll();
    }

    /**
     * @return null
     */
    @Override
    public Datum getDataByUser() {
        return null;
    }
}
