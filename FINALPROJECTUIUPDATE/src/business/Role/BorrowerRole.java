/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Person.Borrower;
import business.Person.Person;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BorrowerRole.BorrowerWorkAreaJPanel;

/**
 *
 * @author karan
 */
public class BorrowerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Person p = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                p = person;
                break ;
            }
        }                    
        return new BorrowerWorkAreaJPanel(userProcessContainer, enterprise, account, (Borrower) p);
    }

    public BorrowerRole() {
        super(Role.RoleType.Borrower);
    }
    
}
