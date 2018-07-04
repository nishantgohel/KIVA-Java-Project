 package business;

import business.Employee.Employee;
import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author Nishant
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getPersonDirectory().createEmployee("System Admin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        employee.setUserAccount(ua);
        
        return system;
    }
    
}
