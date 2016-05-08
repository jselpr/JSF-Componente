/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abmc;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UINamingContainer;
import javax.faces.component.UIPanel;
import org.jboss.logging.Logger;

/**
 *
 * @author joselopezruiz
 */
@FacesComponent(value = "cajaDoble")
public class CajaDoble extends UINamingContainer{
 
    
    /**
     * Creates a new instance of CajaDoble
     */
    public CajaDoble() {
        //Muestra WARN: javax.faces.NamingContainer
        //Logger.getLogger("CajaDoble").log(Logger.Level.WARN, super.getFamily());
    }

    
    //El componente no funciona si agregamos la funcion getFamily a esta clase
    //No muestra nada en la página
    /*@Override
    public String getFamily() {
        return "abmc";
    }*/
    
    
}
