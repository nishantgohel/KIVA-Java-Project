/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.FieldPartner;

import business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Nishant
 */
public class GeneralDetails {
    
    private String orgName ;
    private String website ;
    private String address ;
    private String countryOfOperation ;
    private String legalStatus ;
    private Employee refPerson ;
    private String missionStatement ;
    private String impactArea ;
    


    public GeneralDetails() {
    }

    public GeneralDetails(String orgName, String website, String address, String countryOfOperation, String legalStatus, Employee refPerson, String missionStatement, String impactArea) {
        this.orgName = orgName;
        this.website = website;
        this.address = address;
        this.countryOfOperation = countryOfOperation;
        this.legalStatus = legalStatus;
        this.refPerson = refPerson;
        this.missionStatement = missionStatement;
        this.impactArea = impactArea;
    }
    
    

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryOfOperation() {
        return countryOfOperation;
    }

    public void setCountryOfOperation(String countryOfOperation) {
        this.countryOfOperation = countryOfOperation;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public Employee getRefPerson() {
        return refPerson;
    }

    public void setRefPerson(Employee refPerson) {
        this.refPerson = refPerson;
    }

    public String getMissionStatement() {
        return missionStatement;
    }

    public void setMissionStatement(String missionStatement) {
        this.missionStatement = missionStatement;
    }

    public String getImpactArea() {
        return impactArea;
    }

    public void setImpactArea(String impactArea) {
        this.impactArea = impactArea;
    }


    
    
}
