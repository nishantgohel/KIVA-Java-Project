/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import business.Finance.AccountManagement;
import business.Finance.Basket;

/**
 *
 * @author karan
 */
public class Lender extends ExternalPlayer{
    
    private String email ;
    private String phone ;
    private AccountManagement accountManagement ;
    private Basket basket ;

    public Lender() {
     //no need to instantiate accountManagement or basket here
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AccountManagement getAccountManagement() {
        return accountManagement;
    }

    public void setAccountManagement(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }
    
    public Basket getCurrentBasket(){
        if (basket == null){
            this.basket = new Basket();
            return basket;
        }else{
            return basket ;
        }
    }

    public void subtractCredit(int amount) {
        this.getAccountManagement().setAvailableCredit(this.getAccountManagement().getAvailableCredit() - amount);
    }
    
    public void addCredit(int amount) {
        this.getAccountManagement().setAvailableCredit(this.getAccountManagement().getAvailableCredit() + amount);
    }    
    
    
}
