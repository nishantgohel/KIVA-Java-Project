/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Employee.Employee;
import business.FieldPartner.GeneralDetails;
import business.FieldPartner.PerformanceDetails;
import business.Person.FieldPartnerContact;
import business.Person.Person;

/**
 *
 * @author kunal
 */
public class NewFieldPartnerWorkRequest extends WorkRequest{
    
    private GeneralDetails generalDetails ;
    private PerformanceDetails performanceDetails ;
    private FieldPartnerContact fieldPartnerContact ;
    private Status status ;

    @Override
    public String getNameOfRelevantOrg() {
        return generalDetails.getOrgName();
    }
    
    public enum Status{
        NewFieldPartner("New Field Partner"),
        AnalystRated("Analyst Rated"),
        TrusteeApproved("Trustee Approved"),
        TrusteeRejected("Trustee Rejected"),
        Complete("Complete") ;
        
        private String value ;
        
        Status(String value){
            this.value = value ;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString(){
            return this.getValue();
        }
        
        
    }

    public NewFieldPartnerWorkRequest(GeneralDetails generalDetails, PerformanceDetails performanceDetails, FieldPartnerContact fieldPartnerContact) {
        super();
        this.generalDetails = generalDetails;
        this.performanceDetails = performanceDetails;
        this.fieldPartnerContact = fieldPartnerContact;
        status = NewFieldPartnerWorkRequest.Status.NewFieldPartner ;
    }

    public NewFieldPartnerWorkRequest() {
        super();
        status = NewFieldPartnerWorkRequest.Status.NewFieldPartner ;        
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

    public FieldPartnerContact getFieldPartnerContact() {
        return fieldPartnerContact;
    }

    public void setFieldPartnerContact(FieldPartnerContact fieldPartnerContact) {
        this.fieldPartnerContact = fieldPartnerContact;
    }


    @Override
    public String getStatus() {
        return status.getValue();
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    @Override
    public String toString()
    {
        return generalDetails.getOrgName();
    }
            
            
    
}
