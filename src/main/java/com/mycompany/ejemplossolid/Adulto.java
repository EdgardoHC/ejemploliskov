/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplossolid;

/**
 *
 * @author jhenriquez
 */
public class Adulto extends Persona {
 
     
    public Adulto(String nombre, String apellidos, String dni, String tarjeta) {
        super(nombre, apellidos);
        this.dni = dni;
        this.tarjeta = tarjeta;
    }
 
    private String dni;
    private String tarjeta;
 
     
    public String getDni() {
        return dni;
    }
 
    public void setDni(String dni) {
        this.dni = dni;
    }
 
    public String getTarjeta() {
        return tarjeta;
    }
 
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
 
    public void pagar() {
 
        System.out.println("Mi DUI es " + getDni() + ", pago con la tarjeta: " + tarjeta);
    }
}
