/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Enterprise.KivaEnterprise;
import business.Organization.Organization;
import business.Person.Person;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TrusteeRole.TrusteeWorkAreaJPanel;

/**
 *
 * @author Nishant
 */
public class TrusteeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Employee employee = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                employee = (Employee) person ;
                break ;
            }
        }               
        return new TrusteeWorkAreaJPanel(userProcessContainer, (KivaEnterprise)enterprise, account, employee);
    }

    public TrusteeRole() {
        super(Role.RoleType.Trustee);
    }
    
}
