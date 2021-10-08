package com.micro.springboot.app.base.model.service;

import com.micro.springboot.app.base.model.entity.Productos;

import java.util.List;

public interface IServiceProductos {
    public List<Productos> findAll();
    public Productos findById(Long id);
}
