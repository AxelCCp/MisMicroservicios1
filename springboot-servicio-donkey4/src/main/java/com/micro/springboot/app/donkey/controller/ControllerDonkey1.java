package com.micro.springboot.app.donkey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.springboot.app.donkey.model.Productos;
import com.micro.springboot.app.donkey.model.item;
import com.micro.springboot.app.donkey.model.service.IServiceIDonkey;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ControllerDonkey1 {
	
	
	 @GetMapping("/lista")
	 public List<item> lista() {
		 return serviceDonkey.findAll();
	 }
	 
	 @HystrixCommand(fallbackMethod="metodoAlternativo")
	 @GetMapping("/re/{id}/cantidad/{cantidad}")
	 public item detalles(@PathVariable(value="id")Long id, @PathVariable(value="cantidad")Integer cantidad) {
		 return serviceDonkey.findById(id, cantidad);
	 }
	 
	 //POR ALGUNA RAZÓN NO ME TOMÓ EL MÉTODO ALTERNATIVO.
	 public item metodoAlternativo(Long id, Integer cantidad) {
		 item item = new item();
		 Productos producto = new Productos();
		 item.setCantidad(cantidad);
		 producto.setId(id);
		 producto.setNombre("Producto no encontrado por falla de conexión.");
		 producto.setSeccion("Sin sección.");
		 producto.setDescripcion("Sin descripción.");
		 producto.setPrecio(0.00);
		 item.setProductos(producto);
		 return item;
	 }

	 
	 @Autowired
	 @Qualifier("ServiceDonkeyFeign")
	 //@Qualifier("ServiceDonkeyRestTemp")
	 private IServiceIDonkey serviceDonkey;
}
