/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


/**
 *
 * @author joselopezruiz
 */
@Named(value = "formBean")
@SessionScoped
public class Clave implements Serializable{

    private String clave;
    /**
     * Creates a new instance of Clave
     */
    public Clave() {
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
