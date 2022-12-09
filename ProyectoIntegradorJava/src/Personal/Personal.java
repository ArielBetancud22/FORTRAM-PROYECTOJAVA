package Personal;

import java.util.*;

public class Personal {

    String nombre, apellido, categoria;
    String dni, cuit;
    Date fechaIngreso;
    double sueldo;
    String sexo = "";

    public Personal(String nombre, String apellido, String categoria, String dni, String cuit, Date fechaIngreso, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.dni = dni;
        this.cuit = cuit;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }

    public Personal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
