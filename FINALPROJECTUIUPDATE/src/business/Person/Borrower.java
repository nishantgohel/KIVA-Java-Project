/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import business.Finance.AccountManagement;
import business.Loan.Loan;
import business.Loan.LoanCase;

/**
 *
 * @author karan
 */
public class Borrower extends ExternalPlayer{
    
    private String occupation ;
    private int yearlyIncome ;
    private int dateOfBirth ;
    private String emailId ;
    private String phoneNo ;
    private AccountManagement accountManagement ;

    public Borrower() {
    //no need to instantiate accountManagement or loan here    
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(int yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public AccountManagement getAccountManagement() {
        return accountManagement;
    }

    public void setAccountManagement(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
    
    
    
}
