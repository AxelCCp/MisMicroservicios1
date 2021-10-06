package com.micro.springboot.app.donkey.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.micro.springboot.app.donkey.model.Productos;



@FeignClient(name="microservicio-base")
public interface ProductosDonkeyClientRest {

	
	 @GetMapping("/lista")
	    public List<Productos> lista();
	 
	  @GetMapping("/re/{id}")
	    public Productos detalles(@PathVariable(value="id")Long id);
	
	
}
