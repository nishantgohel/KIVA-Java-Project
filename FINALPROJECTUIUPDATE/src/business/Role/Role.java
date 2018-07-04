/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Karan
 */
public abstract class Role {
    
    private RoleType roleType ;
    
    public enum RoleType{
        Analyst("Analyst"),
        Trustee("Trustee"),
        Lender("Lender"),
        Borrower("Borrower"),
        FieldPartner("FieldPartner"),
        Admin("Admin"),
        SystemAdmin("SystemAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }
    
    
}