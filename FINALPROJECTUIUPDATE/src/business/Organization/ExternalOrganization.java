/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

/**
 *
 * @author kunal
 */
public abstract class ExternalOrganization extends Organization{
    

    
    public ExternalOrganization(String name, Type type) {
        super(name, type);
    } 
}
