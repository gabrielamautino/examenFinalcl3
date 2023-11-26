package com.example.demo.servicios;

import java.util.List;

import com.example.demo.modelo.ClassProducto;

public interface InterfaceProductoServicio {

	public List<ClassProducto> ListarProducto();
	public void RegistrarProducto(ClassProducto claprod);
	public void EliminarProducto(Integer id);
	public ClassProducto BuscarPorId(Integer id);
	
}

