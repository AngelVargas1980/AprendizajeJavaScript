/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javapackage;

/**
 *
 * @author Angel Vargas
 */
public class AlumnoController {
    
    Alumno[] tablaALumno;
    int indiceArray;

    /*es un metodo constructor*/
    public AlumnoController(){
        this.tablaALumno = new Alumno[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno(Alumno alumno){
        this.tablaALumno[this.indiceArray]=alumno;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public Alumno[] getAlumnos(){
        return this.tablaALumno;
    }
    
   
}

