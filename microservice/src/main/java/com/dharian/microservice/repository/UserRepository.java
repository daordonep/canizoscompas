package com.dharian.microservice.repository;

import com.dharian.microservice.entidades.bbdd.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usuario,Integer> {
}
