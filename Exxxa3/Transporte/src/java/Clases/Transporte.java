/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Transporte {
    private int codigo_piloto;
    private String nombre_piloto;
    private int telefono_piloto;
    private int fecha_egreso;
    private int hora_egreso;
    private String destino;
    private String tipo_carga;
    private int tipo;
    private int opcion;
    

    public Transporte(int codigo_piloto, String nombre_piloto,  int telefono_piloto, int fecha_egreso, int hora_egreso, String destino, String tipo_carga, int tipo, int opcion) {       
        this.codigo_piloto= codigo_piloto;
        this.nombre_piloto = nombre_piloto; 
        this.telefono_piloto = telefono_piloto;
        this.fecha_egreso = fecha_egreso;
        this.hora_egreso = hora_egreso;  
        this.destino = destino;
        this.tipo_carga = tipo_carga;
        this.tipo=tipo;
        this.opcion=opcion;   
    }

    public int getCodigo_piloto() {
        return codigo_piloto;
    }

    public void setCodigo_piloto(int codigo_piloto) {
        this.codigo_piloto = codigo_piloto;
    }
    
    public String getNombre_piloto() {
        return nombre_piloto;
    }

    public void setNombre_piloto(String nombre_piloto) {
        this.nombre_piloto = nombre_piloto;
    }

    

    public int getTelefono_piloto() {
        return telefono_piloto;
    }

    public void setTelefono_piloto(int telefono_piloto) {
        this.telefono_piloto = telefono_piloto;
    }

    
    public int getFecha_egreso() {
        return fecha_egreso;
    }

    public void setFecha_egreso(int fecha_egreso) {
        this.fecha_egreso = fecha_egreso;
    }

    public int getHora_egreso() {
        return hora_egreso;
    }

    public void setHora_egreso(int hora_egreso) {
        this.hora_egreso = hora_egreso;
    }

    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipo_carga() {
        return tipo_carga;
    }

    public void setTipo_carga(String tipo_carga) {
        this.tipo_carga = tipo_carga;
    }


    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
     public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
}