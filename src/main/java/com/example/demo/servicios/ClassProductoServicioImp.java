package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.ClassProducto;
import com.example.demo.repositorio.InterfaceProducto;



@Service
public class ClassProductoServicioImp implements InterfaceProductoServicio{
	
	@Autowired
	private InterfaceProducto iproductorepository;
	
	@Override
	public List<ClassProducto> ListarProducto() {
		// TODO Auto-generated method stub
		return iproductorepository.findAll();
	}

	@Override
	public void RegistrarProducto(ClassProducto claprod) {
		// TODO Auto-generated method stub
		iproductorepository.save(claprod);
	}

	@Override
	public void EliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		iproductorepository.deleteById(id);
	
	}
	
	@Override
	public ClassProducto BuscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return iproductorepository.findById(id).get();
	}	
	
}

