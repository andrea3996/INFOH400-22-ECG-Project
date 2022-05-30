/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 */


public class Patient {
     private Integer idpatient;     /* objet patient directement relié à la db (persistence)  */

     private Person idPerson;

    public Person getIdperson() {
        return idPerson;
    }

    public void setIdperson(Person idperson) {
        this.idPerson = idPerson;
    }

    public Integer getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(Integer idpatient) {
        this.idpatient = idpatient;
    }

    public void setStatus(String active) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
