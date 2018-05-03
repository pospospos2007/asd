package lab3;

import java.io.Serializable;

/**
 * Created by Wenqiang on 5/2/18.
 *
 * lab 4-2
 */
public class Employee implements  Prototype,Cloneable, Serializable {

    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    @Override
    public Prototype clone() {
        Employee e = new Employee();
        e.setId(this.getId());
        e.setCity(new String(this.getCity()));
        e.setFirstname(new String(this.getFirstname()));
        e.setLastname(new String(this.getLastname()));
        e.setState(new String(this.getState()));
        if(e.getSupervisor()!=null){
            e.setSupervisor((Employee)this.getSupervisor().clone());
        }
        if(e.getStaff()!=null){
            Employee[] s = new Employee[e.getStaff().length];
            for(int i=0;i<e.getStaff().length;i++){
                s[i] = (Employee)this.getStaff()[i].clone();
            }
            e.setStaff(s);
        }

        return e;
    }

    public static void main(String[] args) {
    }
}
interface Prototype {
    public Prototype clone();
}
