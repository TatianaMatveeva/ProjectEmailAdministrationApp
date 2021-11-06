package emailapp;


import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password; //Generate random password
    private String department;
    private int mailboxCapacity; //Set the mailbox capacity
    private String alternateEmail;

    // Constructor to receive the first name and last name.
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);

    //Call a method asking for the department - return the department

    this.department = setDepartment();
    System.out.println("Department; " + this.department);
}
    // Ask for the department
    private String setDepartment(){
        System.out.print("Department codes\n1 for Sales\n2 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){return "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "acct";}
        else {return"";}

    }





    //Change the password
}
