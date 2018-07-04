/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.FieldPartner;

import business.Finance.AccountManagement;

/**
 *
 * @author Nishant
 */
public class PerformanceDetails {
    
    private String riskRating ;
    private int tieUpDate ;
    private int totalLoans ;
    private float delinquencyRate ;

    public PerformanceDetails() {
    }

    public String getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(String riskRating) {
        this.riskRating = riskRating;
    }

    public int getTieUpDate() {
        return tieUpDate;
    }

    public void setTieUpDate(int tieUpDate) {
        this.tieUpDate = tieUpDate;
    }

    public int getTotalLoans() {
        return totalLoans;
    }

    public void setTotalLoans(int totalLoans) {
        this.totalLoans = totalLoans;
    }

    public float getDelinquencyRate() {
        return delinquencyRate;
    }

    public void setDelinquencyRate(float delinquencyRate) {
        this.delinquencyRate = delinquencyRate;
    }
    
    
    
}
