/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList ;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee() ;
        employee.setName(name);
        personList.add(employee) ;
        return employee ;
    }
    
    public void addPerson(Person person){
        personList.add(person);
    }
    
}
