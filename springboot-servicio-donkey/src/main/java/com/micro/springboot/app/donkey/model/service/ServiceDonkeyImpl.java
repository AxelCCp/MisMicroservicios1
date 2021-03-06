package com.micro.springboot.app.donkey.model.service;

import com.micro.springboot.app.donkey.model.Productos;
import com.micro.springboot.app.donkey.model.item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceDonkeyImpl implements IServiceIDonkey {

    @Override
    public List<item> findAll() {
    	List<Productos>productos = Arrays.asList(clienteRest.getForObject("http://localhost:8001/lista", Productos[].class));
        return productos.stream().map(p -> new item(p,1)).collect(Collectors.toList());
    }

  
    @Override
	public item findById(Long id, Integer cantidad) {
    	Map <String,String> pathVariables = new HashMap <String,String>();
    	pathVariables.put("id", id.toString());
    	Productos producto = clienteRest.getForObject("http://localhost:8001/re/{id}", Productos.class, pathVariables);
		return new item(producto, cantidad);
	}
    
    @Autowired
    private RestTemplate clienteRest;




	
    
}
