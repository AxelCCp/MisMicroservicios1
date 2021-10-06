package com.micro.springboot.app.base.controller;


import com.micro.springboot.app.base.model.entity.Productos;
import com.micro.springboot.app.base.model.service.IServiceProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controller1 {

    @GetMapping("/lista")
    public List<Productos> lista(){
        return serviceProductos.findAll().stream().map(producto -> {
        	producto.setPort(port);
        	return producto;
        }).collect(Collectors.toList());
    }

    @GetMapping("/re/{id}")
    public Productos detalles(@PathVariable(value="id")Long id){
        Productos producto = serviceProductos.findById(id);
        producto.setPort(port);
        return producto;
    }

    @Autowired
    private IServiceProductos serviceProductos;

    @Value("${server.port}")
    private Integer port;
}
