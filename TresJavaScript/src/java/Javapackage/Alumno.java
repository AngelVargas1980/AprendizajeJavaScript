/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javapackage;

/**
 *
 * @author Angel Vargas
 */
public class Alumno {
    private String codigo;
    private String nombre;
    private String correo;
    private String direccion;
    private String telefono;

    /**Lo siguiente es el metodo constructor
     * Asigna los valores codigo, nombre,, correo, etc. a los atributos respectivamente
     */
    public Alumno(String codigo, String nombre, String correo, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }
   
    /*Esto lo agruegue porque nose porque, pero es un metodo constructor*/
    public Alumno(){
        this.nombre="Alumno de mi ejemplo";
    }

    /*get y set son métodos puúblico, pero el get se encarga de mostrar un 
    valor a una propiedad o atributo de un objeto, 
    el cual está encapsulado en la clase correspondiente, es decir, esta 
    declarado con la palabra reservada private o protected.
    */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

