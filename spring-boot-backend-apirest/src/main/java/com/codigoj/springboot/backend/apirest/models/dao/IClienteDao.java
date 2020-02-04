package com.codigoj.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.codigoj.springboot.backend.apirest.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
