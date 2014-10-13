package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    // max vacation days should not be rigid
    private int maxVacationDays = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setHireDate(hireDate);
        setDaysVacation(daysVacation);
       // this.hireDate = hireDate;
       // this.daysVacation = daysVacation;
    }
    
    //  make all methods final 
    public final int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) {
       if (daysVacation > maxVacationDays){
           throw new IllegalArgumentException("too many days vacation");
       }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
    //   if (firstName == null || firstName.equals("") || firstName.length()<0)
        //   if (firstName == null || firstName.length()=0);
           if (firstName == null || firstName.isEmpty())
       { throw new IllegalArgumentException("invalid entry for first name");
               
       }
        this.firstName = firstName;
    }

    public final Date getHireDate() {
        return hireDate;
    }

    public final void setHireDate(Date hireDate) {
        
        this.hireDate = hireDate;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        
        do this
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public final void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
