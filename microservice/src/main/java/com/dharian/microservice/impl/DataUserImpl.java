package com.dharian.microservice.impl;

import com.dharian.microservice.entidades.bbdd.Datum;
import com.dharian.microservice.entidades.bbdd.Usuario;
import com.dharian.microservice.entidades.json.UserData;
import com.dharian.microservice.interfaces.IDataUser;
import com.dharian.microservice.interfaces.IDatum;
import com.dharian.microservice.interfaces.IUsuario;
import com.dharian.microservice.repository.DatumRepository;
import com.dharian.microservice.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class DataUserImpl implements IDataUser {
    private final static Logger LOGGER= Logger.getLogger("com.dharian.microservice.impl.DataUserImpl");
    private IDatum iDatum;
    private IUsuario iUsuario;
    @Autowired
    private DatumRepository datumRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserData> getAllData() {
        Datum datum = new Datum();
        List<Datum> datumList = new ArrayList<>();
        List<UserData> userDataList = new ArrayList<>();


        datumList.addAll(datumRepository.getAllDataDatum());


       for ( Datum datumFor: datumList) {
            UserData userData = new UserData();
            userData.setNumeroVeces(datumFor.getVeces());
            userData.setNombre((datumFor.getUser().getNombre()));
            userDataList.add(userData);
        }

        LOGGER.info(datumList.toString());


        return userDataList;
    }
}
