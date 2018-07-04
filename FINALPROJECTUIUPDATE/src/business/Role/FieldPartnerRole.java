/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.KivaEnterprise;
import business.Organization.Organization;
import business.Person.FieldPartnerContact;
import business.Person.Person;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FieldPartnerRole.FieldPartnerWorkAreaJPanel;

/**
 *
 * @author kunal
 */
public class FieldPartnerRole extends Role{

     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        FieldPartnerContact fieldPartnerContact = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                fieldPartnerContact = (FieldPartnerContact) person ;
                break ;
            }
        }                
        return new FieldPartnerWorkAreaJPanel(userProcessContainer, (KivaEnterprise)enterprise, fieldPartnerContact);
    }

    public FieldPartnerRole() {
        super(Role.RoleType.FieldPartner);
    }
    
}
