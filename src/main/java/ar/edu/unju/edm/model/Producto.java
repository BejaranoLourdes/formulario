package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;
@Component
public class Producto {
 private int codigo;
 private String nombre;
 private String descripcion;
 private int stock;
 private int precioUnitario;
 private String estado;
 
 public Producto() {
	// TODO Auto-generated constructor stub
}
public Producto(int codigo, String nombre, String descripcion, int stock, int precioUnitario, String estado) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.stock = stock;
	this.precioUnitario = precioUnitario;
	this.estado= estado;
}

public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getPrecioUnitario() {
	return precioUnitario;
}
public void setPrecioUnitario(int precioUnitario) {
	this.precioUnitario = precioUnitario;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
 
 
}
