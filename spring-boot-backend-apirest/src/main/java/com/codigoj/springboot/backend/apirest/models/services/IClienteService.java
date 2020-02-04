package com.codigoj.springboot.backend.apirest.models.services;

import java.util.List;

import com.codigoj.springboot.backend.apirest.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById (Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete (Long id);

}
