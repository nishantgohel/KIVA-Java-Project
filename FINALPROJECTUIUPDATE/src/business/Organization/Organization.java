/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Person.Person;
import business.Person.PersonDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author karan
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory ;
    private int organizationID;
    private static int counter;
    private Type type ;
    
    public enum Type{
        Trustee("Trustee Organization"), Analyst("Analyst Organization"), Lender("Lender Organization"),
        Borrower("Borrower Organization"), FieldPartner("Field Partner"), Admin("Admin Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }

    public Organization(String name, Type type) {
        this.name = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory() ;
        organizationID = counter;
        ++counter;
        this.type = type;
    }
    
    public Organization(){
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory() ;
        organizationID = counter;
        ++counter;        
    }
    
    public Organization(String name){
        this.name = name;        
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory() ;
        organizationID = counter;
        ++counter;         
    }
    
    public Organization(Type type){
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory() ;
        organizationID = counter;
        ++counter;           
        this.type = type ;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public boolean isMember(Person person){
        for(Person p : this.getPersonDirectory().getPersonList()){
            if(p == person){
                return true;
            }
        }
        return false;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
