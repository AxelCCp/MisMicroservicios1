package com.micro.springboot.app.base.model.service;

import com.micro.springboot.app.base.model.dao.IProductosDao;
import com.micro.springboot.app.base.model.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProductosImpl implements IServiceProductos {

    @Override
    public List<Productos> findAll() {
        return productosDao.findAll();
    }

    @Override
    public Productos findById(Long id) {
        return productosDao.findById(id).orElse(null);
    }

    @Autowired
    private IProductosDao productosDao;
}
