/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contactos;


/**
 *
 * @author Admin
 */
public class Contactos {
   private int indice;
   private String nombres ;
   private String dni ;
   private String apellido ;
   private String direccion ;
   private String telefono ;
   private String fechaN ;

   public Contactos() {
       
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public int getIndice() {
        return indice;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaN() {
        return fechaN;
    }

 
    
}