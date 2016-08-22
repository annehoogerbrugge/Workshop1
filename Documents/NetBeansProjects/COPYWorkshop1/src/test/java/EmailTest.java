/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anne
 */
public class EmailTest {
    
    public boolean isAdresGoed(String email) {
        
        org.apache.commons.validator.routines.EmailValidator validator = org.apache.commons.validator.routines.EmailValidator.getInstance(); 
        validator = org.apache.commons.validator.routines.EmailValidator.getInstance();
        boolean isAddressValid = validator.isValid(email);
        return isAddressValid;
    }
}
