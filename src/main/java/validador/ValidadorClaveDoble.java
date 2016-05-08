/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador;

import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author joselopezruiz
 */
@FacesValidator(value = "validadorClaveDoble")
public class ValidadorClaveDoble implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(value == null || "".equals(value)){
            return;
        }
        UIInput caja1 = ((UIInput) component);
        Map<String,Object> atributos = caja1.getAttributes();
        String otroCampo = (String) atributos.get("otroCampo");
        UIInput caja2 = (UIInput) component.getParent().findComponent(otroCampo);
        Object resultado = caja2.getSubmittedValue();
        
        if(resultado != null && !resultado.equals("") && !resultado.equals(value)){
            String mensaje = "Los dos campos no son iguales";
            FacesMessage facesMessage = new FacesMessage(mensaje);
            facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(facesMessage);
        }
    }
    
}
