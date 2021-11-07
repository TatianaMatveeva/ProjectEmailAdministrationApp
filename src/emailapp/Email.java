package emailapp;


import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLenght = 10;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = "pnl.pl";

    // Constructor to receive the first name and last name.
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);

    //Call a method asking for the department - return the department
    this.department = setDepartment();
    System.out.println("Department; " + this.department);

    //Call a method that returns a random password
     this.password = randomPassword(defaultPasswordLenght);
        System.out.println("Your password is:" + this.password);

    //Combine elements to generate email
     email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department+ "." + companySuffix;
        System.out.println("Your email is: " + email);
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
    //Generate random password
    public String randomPassword(int lenght) {
        String passwordSet ="ABCDEFGHIKLMNOQRSTUWXYZ1234567890!@#$%";
        char[] password = new char[lenght];
        for (int i=0; i<lenght; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set the mail capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    //Set the alternate mail
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    //Change the password
    public void changePassword(String  password) {
        this.password = password;
    }

    public int getMailboxCapacity() {return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() {return password; }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "COMPANY EMAIL: " + email +
                "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
