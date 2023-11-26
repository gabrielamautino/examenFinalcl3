package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_productocl3")
public class ClassProducto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//declaramos sus atributos
	private int idproductocl3;
	private String nombrecl3;
	private double preciocl3;
	private double precioVentacl3;
	private String estadocl3;
	private String descripcl3;
	private String stockcl3;
	
	//metodo to string
	@Override
	public String toString() {
		return "ClassProducto [idproductocl3=" + idproductocl3 + ", nombrecl3=" + nombrecl3 + ", preciocl3=" + preciocl3
				+ ", precioVentacl3=" + precioVentacl3 + ", estadocl3=" + estadocl3 + ", descripcl3=" + descripcl3 + ", stockcl3=" + stockcl3
				+ "]";
	}//fin del metodo tostring..


	//constructores
	public ClassProducto() {
		
	}//final del constructor vacio
	
	
	public ClassProducto(int idproductocl3, String nombrecl3, double preciocl3, double precioVentacl3, String estadocl3,
			String descripcl3, String stockcl3) {
		//super();
		this.idproductocl3 = idproductocl3;
		this.nombrecl3 = nombrecl3;
		this.preciocl3 = preciocl3;
		this.precioVentacl3 = precioVentacl3;
		this.estadocl3 = estadocl3;
		this.descripcl3 = descripcl3;
		this.stockcl3 = stockcl3;
	}//fin del metodo constructor con parametros
	
	//setters y getters
	public int getIdproductocl3() {
		return idproductocl3;
	}
	public void setIdproductocl3(int idproductocl3) {
		this.idproductocl3 = idproductocl3;
	}
	public String getNombrecl3() {
		return nombrecl3;
	}
	public void setNombre(String nombrecl3) {
		this.nombrecl3 = nombrecl3;
	}
	public double getPreciocl3() {
		return preciocl3;
	}
	public void setPreciocl3(double preciocl3) {
		this.preciocl3 = preciocl3;
	}
	public double getPrecioVentacl3() {
		return precioVentacl3;
	}
	public void setPrecioVentacl3(double precioVentacl3) {
		this.precioVentacl3 = precioVentacl3;
	}
	public String getEstadocl3() {
		return estadocl3;
	}
	public void setEstadocl3(String estadocl3) {
		this.estadocl3 = estadocl3;
	}
	public String getDescripcl3() {
		return descripcl3;
	}
	public void setDescripcl3(String descripcl3) {
		this.descripcl3 = descripcl3;
	}
	public String getStock() {
		return stockcl3;
	}
	public void setStockcl3(String stockcl3) {
		this.stockcl3 = stockcl3;
	}
	
}//fin de la clase

