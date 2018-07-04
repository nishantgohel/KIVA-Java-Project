/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class FieldPartnerContact extends ExternalPlayer{
    
    private String jobTitle ;
    private String email ;
    private String phone ;
    private ArrayList<Borrower> borrowerList ;

    public FieldPartnerContact() {
        borrowerList = new ArrayList<>();
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public ArrayList<Borrower> getBorrowerList() {
        return borrowerList;
    }

    public void setBorrowerList(ArrayList<Borrower> borrowerList) {
        this.borrowerList = borrowerList;
    }
    
    
}
