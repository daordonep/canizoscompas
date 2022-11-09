package com.dharian.microservice.repository;

import com.dharian.microservice.entidades.bbdd.Datum;

import com.dharian.microservice.entidades.json.UserData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DatumRepository extends CrudRepository<Datum,Integer> {

    @Query(value = "Select count(veces)  from data  group by user", nativeQuery = true)
    List<Datum> getAllDataDatum();

}
