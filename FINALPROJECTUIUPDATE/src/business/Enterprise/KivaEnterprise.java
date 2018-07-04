/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Loan.Loan;
import business.Loan.LoanCase;
import business.Loan.LoanDirectory;
import business.Organization.FieldPartnerOrganization;
import business.Person.FieldPartnerContact;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Nishant
 */
public class KivaEnterprise extends Enterprise{
    
    private LoanDirectory loanDirectory ;

    public KivaEnterprise(String name, EnterpriseType enterpriseType) {
        super(name, enterpriseType);
        loanDirectory = new LoanDirectory();        
    }
    
    public KivaEnterprise(){
        super();
        loanDirectory = new LoanDirectory();
    }

    public LoanDirectory getLoanDirectory() {
        return loanDirectory;
    }

    public void setLoanDirectory(LoanDirectory loanDirectory) {
        this.loanDirectory = loanDirectory;
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {    
       return null; 
    }

    public Loan getLoanFromLoanCase(LoanCase loanCase) {
        for(Loan loan : this.getLoanDirectory().getLoanList()){
            if(loan.getLoanCase().equals(loanCase)){
                return loan ;
            }
        }
        return null ;
    } 


    
}
