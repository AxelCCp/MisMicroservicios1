package com.micro.springboot.app.donkey.model;

public class item {

    public item() {
    }

    public item(Productos productos, Integer cantidad) {
        this.productos = productos;
        this.cantidad = cantidad;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal(){
        return  productos.getPrecio() * cantidad.doubleValue();
    }

    private Productos productos;
    private Integer cantidad;
}
