/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author Nishant
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList ;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }
    
    
    
    // Add enterprise
    public Enterprise createAndAddEnterprise(String name){
        KivaEnterprise kivaEnterprise = new KivaEnterprise(name, Enterprise.EnterpriseType.KIVA);
        enterpriseList.add(kivaEnterprise);
        return kivaEnterprise;
    }
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
}
