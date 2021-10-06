package com.micro.springboot.app.donkey.model.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.micro.springboot.app.donkey.clients.ProductosDonkeyClientRest;
import com.micro.springboot.app.donkey.model.item;

@Service("ServiceDonkeyFeign")
@Primary
public class ServiceDonkeyFeign implements IServiceIDonkey  {

	@Override
	public List<item> findAll() {
		// TODO Auto-generated method stub
		return donkyClientFeign.lista().stream().map(p -> new item(p,1)).collect(Collectors.toList());
	}

	@Override
	public item findById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return new item(donkyClientFeign.detalles(id),cantidad);
	}
	
	@Autowired
	private ProductosDonkeyClientRest donkyClientFeign;

}
