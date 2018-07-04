/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Loan;

import business.Person.Borrower;
import business.Person.Lender ;
import business.WorkQueue.RepaymentNotificationWorkRequest;
import java.util.Date;

/**
 *
 * @author kunal
 */
public class LendingInstance {
    
    private Lender lender ;
    private int amount ;
    private String date ;
    private LoanCase loanCase ;
    private int balance ;

    public LendingInstance() {
    }

    public Lender getLender() {
        return lender;
    }

    public void setLender(Lender lender) {
        this.lender = lender;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public LoanCase getLoanCase() {
        return loanCase;
    }

    public void setLoanCase(LoanCase loanCase) {
        this.loanCase = loanCase;
    }
    
    @Override
    public String toString(){
        return this.getLoanCase().getCategory().getValue();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void repay(int amt, Date date, Borrower borrower){
        // Add credit to lender account
        lender.addCredit(amt);
        // Send notification to lender with amount and date
        RepaymentNotificationWorkRequest rnwr = new RepaymentNotificationWorkRequest();
        rnwr.setMessage(borrower.getName() + " repayed you $" + amt + " on " + date.toString());
        lender.getUserAccount().getWorkQueue().addWorkRequest(rnwr);
        // Update balance
        balance = balance - amt;
    }
    
    
    
}
