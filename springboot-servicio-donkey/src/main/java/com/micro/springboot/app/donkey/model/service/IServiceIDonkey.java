package com.micro.springboot.app.donkey.model.service;


import com.micro.springboot.app.donkey.model.item;

import java.util.List;

public interface IServiceIDonkey {

    public List<item> findAll();
    public item findById(Long id, Integer cantidad);


}
