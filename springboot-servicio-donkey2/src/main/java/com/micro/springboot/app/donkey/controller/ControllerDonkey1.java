package com.micro.springboot.app.donkey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.springboot.app.donkey.model.item;
import com.micro.springboot.app.donkey.model.service.IServiceIDonkey;

@RestController
public class ControllerDonkey1 {
	
	
	 @GetMapping("/lista")
	 public List<item> lista() {
		 return serviceDonkey.findAll();
	 }
	 
	 
	 @GetMapping("/re/{id}/cantidad/{cantidad}")
	 public item detalles(@PathVariable(value="id")Long id, @PathVariable(value="cantidad")Integer cantidad) {
		 return serviceDonkey.findById(id, cantidad);
	 }

	 
	 @Autowired
	 @Qualifier("ServiceDonkeyFeign")
	 //@Qualifier("ServiceDonkeyRestTemp")
	 private IServiceIDonkey serviceDonkey;
}
