/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Finance;

import business.Loan.LendingInstance;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class Basket {
    
    private ArrayList<LendingInstance> lendingInstanceList ;
    private int totalLoan ;

    public Basket() {
        lendingInstanceList = new ArrayList<>() ;
    }

    public ArrayList<LendingInstance> getLendingInstanceList() {
        return lendingInstanceList;
    }

    public void setLendingInstanceList(ArrayList<LendingInstance> lendingInstanceList) {
        this.lendingInstanceList = lendingInstanceList;
    }

    public int getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(int totalLoan) {
        this.totalLoan = totalLoan;
    }
    
    public void clearBasket(){
        this.lendingInstanceList.clear();
        this.totalLoan = 0;
    }
    
    
}
