/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abmc;

import java.util.List;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.component.UINamingContainer;
import javax.faces.component.UIPanel;
import javax.persistence.Entity;

/**
 *
 * @author usuario
 */
@FacesComponent(value = "miComponenteABMC")
public class Componente extends UINamingContainer {

    private enum Estado {

        LISTADO, EDICION, INSERCION, BORRADO
    };
    private Estado estado = Estado.LISTADO;

    public Boolean getEnEdicion() {
        return estado == Estado.EDICION;
    }

    public Boolean getEnListado() {
        return estado == Estado.LISTADO;
    }

    public Boolean getEnInsercion() {
        return estado == Estado.INSERCION;
    }

    public Boolean getEnBorrado() {
        return estado == Estado.BORRADO;
    }
    
    private Entity actual;

    public Entity getActual() {
        return actual;
    }

    @Override
    public void markInitialState() {
        super.markInitialState();
        //To change body of generated methods, choose Tools | Templates.
        UIComponent facetaListado = this.getFacet("listado");
        if(facetaListado instanceof UIPanel){
            List<UIComponent> children = facetaListado.getChildren();
            findComponent("dt").getChildren().addAll(0,children);
         } else {
            findComponent("dt").getChildren().add(0,facetaListado);
        }
        
    }
    
    
}
