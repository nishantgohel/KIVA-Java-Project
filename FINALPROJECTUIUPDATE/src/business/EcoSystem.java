/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.InternalOrganization;
import business.Organization.Organization;
import business.Role.Role;
import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nishant
 */
public class EcoSystem extends Organization{
    private static EcoSystem system ;


    private ArrayList<Network> networkList ;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network) ;
        return network;
    }

    private EcoSystem(){
        super();
        networkList = new ArrayList<Network>() ;
    } 
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>() ;
        roleList.add(new SystemAdminRole());
        return roleList ;
    }
    
    public static EcoSystem getInstance(){
        if (system == null){
            system = new EcoSystem();
        }
        return system ;
    }
    
    public static boolean checkIfUserNameIsUnique(String username){
        
        if(!(system.getUserAccountDirectory().checkIfUsernameIsUnique(username))){
            return false;
        }
            
            for(Network network : system.getNetworkList()){
                
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    
                    if(!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
                        return false ;
                    }
                    
                        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                            
                            if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
                                return false ;}
                            
                        }
                        
                    } 
                    
                }
            return true ;
                
                
                }    

    public static void setSystem(EcoSystem system) {
        EcoSystem.system = system;
    }
    
    
            
    

    
}
