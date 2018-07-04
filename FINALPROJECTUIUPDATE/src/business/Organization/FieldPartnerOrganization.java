/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.FieldPartner.GeneralDetails;
import business.FieldPartner.PerformanceDetails;
import business.Finance.AccountManagement;
import business.Role.FieldPartnerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class FieldPartnerOrganization extends ExternalOrganization{
    
    private GeneralDetails generalDetails ;
    private PerformanceDetails performanceDetails ;
    private AccountManagement accountManagement ;

    public FieldPartnerOrganization(String name, Type type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>() ;
        roleList.add(new FieldPartnerRole()) ;
        return roleList ;
    }

    public GeneralDetails getGeneralDetails() {
        return generalDetails;
    }

    public void setGeneralDetails(GeneralDetails generalDetails) {
        this.generalDetails = generalDetails;
    }

    public PerformanceDetails getPerformanceDetails() {
        return performanceDetails;
    }

    public void setPerformanceDetails(PerformanceDetails performanceDetails) {
        this.performanceDetails = performanceDetails;
    }

    public AccountManagement getAccountManagement() {
        return accountManagement;
    }

    public void setAccountManagement(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }
    
    @Override
    public String toString(){
        return this.getGeneralDetails().getOrgName() ;
    }
    
    public AccountManagement createAccountManagement() {
        AccountManagement accountManagement = new AccountManagement();
        this.setAccountManagement(accountManagement);
        return accountManagement ;
    }
    
}
