/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.LenderRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class LenderOrganization extends ExternalOrganization{

    public LenderOrganization(String name, Type type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>() ;
        roleList.add(new LenderRole()) ;
        return roleList ;
    }
    
}
