package com.micro.springboot.app.base.model.dao;

import com.micro.springboot.app.base.model.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductosDao extends JpaRepository <Productos,Long> {
}
