/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Organization.Organization;
import business.Person.Person;
import business.UserAccount.UserAccount;
import java.util.Date;
import business.Employee.Employee;

/**
 *
 * @author Nishant
 */
public abstract class WorkRequest {

    private String message;
    private String messageHistory;
    private Employee analyst;
    private Employee trustee;

    public WorkRequest() {

        analyst = null;
        trustee = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageHistory() {
        return messageHistory;
    }

    public void setMessageHistory(String messageHistory) {
        this.messageHistory = messageHistory;
    }

    public void pushToOrganizationWorkQueue(Organization organization) {
        organization.getWorkQueue().addWorkRequest(this);
    }

    public Employee getAnalyst() {
        return analyst;
    }

    public void setAnalyst(Employee analyst) {
        this.analyst = analyst;
    }

    public Employee getTrustee() {
        return trustee;
    }

    public void setTrustee(Employee trustee) {
        this.trustee = trustee;
    }

    public abstract String getNameOfRelevantOrg();

    public abstract String getStatus();

    @Override
    public String toString() {
        return this.getNameOfRelevantOrg();
    }

}
