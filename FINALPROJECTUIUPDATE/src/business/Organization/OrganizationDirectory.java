/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Trustee.getValue())){
            organization = new TrusteeOrganization("Trustee Organization", Type.Trustee);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Analyst.getValue())){
            organization = new AnalystOrganization("Analyst Organization", Type.Analyst);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lender.getValue())){
            organization = new LenderOrganization("Lender Organization", Type.Lender);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Borrower.getValue())){
            organization = new BorrowerOrganization("Borrower Organization", Type.Borrower);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FieldPartner.getValue())){
            organization = new FieldPartnerOrganization("FieldPartner Organization", Type.FieldPartner);
            organizationList.add(organization);
        }        
        return organization;
    }
}