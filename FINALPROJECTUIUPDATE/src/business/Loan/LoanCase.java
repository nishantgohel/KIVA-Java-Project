/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Loan;

import business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class LoanCase {
    
    private String caseDescripton ;
    private String speciality ;
    private Employee specialityAdder ;
    private int loanAmount ;
    private int loanLength ;
    private int installment ;
    private String repaymentStartMonth ;
    private String repaymentStartYear;
    private Category category ;
    
    
    public enum Category {
        Women("Women"), Agriculture("Agriculture"), Education("Education"), Health("Health"),
        SingleParent("Single Parent"), SocialEnterprise("Social Enterprise"), RetailBusiness("Retail Business"),
        Food("Food"), Arts("Arts"), WaterAndSanitation("Water & Sanitation"), ConflictZone("Conflict Zones"), Men("Men");
        
        private String value ;
        
        private Category(String value){
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
            return value ;
        }
        
    }    

    public String getRepaymentStartYear() {
        return repaymentStartYear;
    }

    public void setRepaymentStartYear(String repaymentStartYear) {
        this.repaymentStartYear = repaymentStartYear;
    }

    public LoanCase() {
     
    }

    public String getCaseDescripton() {
        return caseDescripton;
    }

    public void setCaseDescripton(String caseDescripton) {
        this.caseDescripton = caseDescripton;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Employee getSpecialityAdder() {
        return specialityAdder;
    }

    public void setSpecialityAdder(Employee specialityAdder) {
        this.specialityAdder = specialityAdder;
    }

    public int getLoanLength() {
        return loanLength;
    }

    public void setLoanLength(int loanLength) {
        this.loanLength = loanLength;
    }

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    public String getRepaymentStartMonth() {
        return repaymentStartMonth;
    }

    public void setRepaymentStartMonth(String repaymentStartMonth) {
        this.repaymentStartMonth = repaymentStartMonth;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }



    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    
    
    
}
