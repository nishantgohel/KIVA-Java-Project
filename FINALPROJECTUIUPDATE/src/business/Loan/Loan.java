/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Loan;

import business.Person.Borrower;
import business.Person.FieldPartnerContact;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kunal
 */
public class Loan {
    
    private ArrayList<LendingInstance> lendingInstanceList ;
    private ArrayList<RepaymentInstance> repaymentInstanceList ;
    private LoanCase loanCase ;
    private Borrower borrower ;
    private FieldPartnerContact fieldPartnerContact ;
    private LoanStatus loanStatus ;


    
    public enum LoanStatus {
        FundingRequired("Funding Required"),
        PartiallyFunded("PartiallyFunded"),
        FullyFunded("FullyFunded. Awaiting Repayment"),
        PartiallyRepayed("Partially Repayed"),
        FullyRepayed("FullyRepayed");
        
        private String value ;
        
        LoanStatus(String value){
            this.value = value ;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
    } 

    public Loan() {
        lendingInstanceList = new ArrayList<>() ;
        repaymentInstanceList = new ArrayList<>();
        loanStatus = LoanStatus.FundingRequired ;
    }

    public ArrayList<LendingInstance> getLendingInstanceList() {
        return lendingInstanceList;
    }

    public void setLendingInstanceList(ArrayList<LendingInstance> lendingInstanceList) {
        this.lendingInstanceList = lendingInstanceList;
    }

    public LoanCase getLoanCase() {
        return loanCase;
    }

    public void setLoanCase(LoanCase loanCase) {
        this.loanCase = loanCase;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public FieldPartnerContact getFieldPartnerContact() {
        return fieldPartnerContact;
    }

    public void setFieldPartnerContact(FieldPartnerContact fieldPartnerContact) {
        this.fieldPartnerContact = fieldPartnerContact;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public ArrayList<RepaymentInstance> getRepaymentInstanceList() {
        return repaymentInstanceList;
    }

    public void setRepaymentInstanceList(ArrayList<RepaymentInstance> repaymentInstanceList) {
        this.repaymentInstanceList = repaymentInstanceList;
    }
    
    public void addLendingInstance(LendingInstance lendingInstance) {
        this.getLendingInstanceList().add(lendingInstance) ;
        if(this.totalLentAmount() == this.getLoanCase().getLoanAmount()){
            this.setLoanStatus(LoanStatus.FullyFunded);
        }else if(this.totalLentAmount() == 0){
            this.setLoanStatus(LoanStatus.FundingRequired);
        }else if(this.totalLentAmount() < this.getLoanCase().getLoanAmount()){
            this.setLoanStatus(LoanStatus.PartiallyFunded);
        }
    }  
    
    public void addRepaymentInstance(RepaymentInstance repaymentInstance) {
        // Add the repayment instance
        this.getRepaymentInstanceList().add(repaymentInstance) ;
        //Send amount and notification to lenders
        this.sendAmountAndNotification(repaymentInstance.getRepaymentAmount(), repaymentInstance.getDate());
        // Update loan status
        if(this.totalLentAmount() == this.totalRepayedAmount()){
            this.setLoanStatus(LoanStatus.FullyRepayed);
        }else if(this.totalLentAmount() > this.totalRepayedAmount()){
            this.setLoanStatus(LoanStatus.PartiallyRepayed);
        }
    }    
    
    public void sendAmountAndNotification(int amt, Date date){
        
        for(LendingInstance lendingInstance : this.getLendingInstanceList()){
            if(lendingInstance.getBalance() != 0){
                int balance = lendingInstance.getBalance();
                if(balance > amt){
                    lendingInstance.repay(amt, date, borrower);
                    amt = 0;
                }else if(balance < amt){
                    lendingInstance.repay(balance, date, borrower);
                    amt = amt - balance;
                }else if(balance == amt){
                    lendingInstance.repay(amt, date, borrower);
                    amt = 0;
                }
            }
            if(amt == 0){
                return ;
            }
        }
        
    }
    
    @Override
    public String toString(){
        return borrower.getName();
    }
    
    public int totalLentAmount(){
        int total = 0;
        for(LendingInstance lendingInstance : lendingInstanceList){
            total = total + lendingInstance.getAmount();
        }
        return total ;
    }
    
    public int totalRepayedAmount(){
        int total = 0;
        for(RepaymentInstance repaymentInstance : repaymentInstanceList){
            total = total + repaymentInstance.getRepaymentAmount();
        }
        return total ;
    }    
    
    
    
}
