/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Loan;

import business.Person.Borrower;
import business.Person.FieldPartnerContact;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class LoanDirectory {
    
    private ArrayList<Loan> loanList ;

    public LoanDirectory() {
        loanList = new ArrayList<>();
    }

    public ArrayList<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(ArrayList<Loan> loanList) {
        this.loanList = loanList;
    }
    
    public void addLoan(Loan loan)
    {
        loanList.add(loan);
    }
    
    public Loan getBorrowerCurrentLoan(Borrower borrower){
        for(Loan loan : loanList){
            if(loan.getBorrower() == borrower){
                if(!(loan.getLoanStatus().equals(Loan.LoanStatus.FullyRepayed))){
                    return loan ;
                }
            }
        }
        return null ;
    }
    
    public ArrayList<Loan> getBorrowerHistory(Borrower borrower){
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        for(Loan loan : this.getLoanList()){
            if(loan.getBorrower() == borrower){
                if(loan.getLoanStatus() == Loan.LoanStatus.FullyRepayed){
                loanList.add(loan);
                }
            }
        }
        return loanList;
    }

    public ArrayList<Loan> getLoanByFieldPartnerContact(FieldPartnerContact fieldPartnerContact) {
        
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        for(Loan loan : this.getLoanList()){
            if(loan.getLoanStatus() != Loan.LoanStatus.FullyRepayed &&
               loan.getFieldPartnerContact() == fieldPartnerContact){
                loanList.add(loan);
            }
        }
        
        return loanList;
    }
    
    
}
