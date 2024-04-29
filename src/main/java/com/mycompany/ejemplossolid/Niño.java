/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplossolid;

/**
 *
 * @author jhenriquez
 */

public class Niño  extends Persona{
 
    private Adulto tutor;
     
    public Niño(String nombre, String apellidos,Adulto tutor) {
        super( nombre, apellidos);
        this.tutor=tutor;
    }
 
    public Adulto getTutor() {
        return tutor;
    }
 
    public void setTutor(Adulto tutor) {
        this.tutor = tutor;
    }
 

     
     
 

}
