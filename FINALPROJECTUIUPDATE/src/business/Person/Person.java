/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import business.UserAccount.UserAccount;

/**
 *
 * @author karan
 */
public class Person {
    
    private String name;
    private int id;
    private static int count = 1;  
    private UserAccount userAccount ;

    public Person() {
        id = count;
        count++;        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return name ;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
    
}
