/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.AnalystRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Nishant
 */
public class AnalystOrganization extends InternalOrganization{

    public AnalystOrganization(String name, Type type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>() ;
        roleList.add(new AnalystRole()) ;
        return roleList ;
    }
    
}
