/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Loan;

import java.util.Date;

/**
 *
 * @author Nishant
 */
public class RepaymentInstance {
    
    private int repaymentAmount ;
    private Date date ;

    public RepaymentInstance() {
    }

    public int getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(int repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDateAsCurrentDate() {
        this.date = new Date();
    }
    
    
    
}
