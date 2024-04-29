/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
https://www.arquitecturajava.com/el-principio-de-substitucion-de-liskov/
 */

package com.mycompany.ejemplossolid;

/**
 *
 * @author jhenriquez
 */
public class Ejemplossolid {

    public static void main(String[] args) {
       Adulto adulto= new Adulto("Edgardo","Henríquez","03142253-9","2515-6541...");
        Niño niño= new Niño("Susan","Henríquez",adulto);
 
        niño.getTutor().pagar();
    }
}
