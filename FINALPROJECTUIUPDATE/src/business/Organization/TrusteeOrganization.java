/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.Role;
import business.Role.TrusteeRole;
import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class TrusteeOrganization extends InternalOrganization{

    public TrusteeOrganization(String name, Type type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>() ;
        roleList.add(new TrusteeRole()) ;
        return roleList ;
    }
    
}
