package pets;

import java.util.Scanner;

public class Phone {

    // variables
    private String model;
    private int age;
    private String location;
    private String type;
    private boolean business;

    // setup scanner to get input
    Scanner input = new Scanner(System.in);

    // empty constructor
    public Phone(){
    }

    // constructor for Phone - incomplete
    public Phone(String model, int age, String location){
        this.model = model;
        this.age = age;
        this.location = location;
    }

    // constructor for Phone - complete
    public Phone(String model, int age, String location, String type, boolean business){
        this.model = model;
        this.age = age;
        this.location = location;
        this.type = type;
        this.business = business;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBusiness() {
        return businssPhoneCheck();
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    // Print message and collect user string response
    private String getInputString() {
        String stringResult;
        System.out.println("What model is your phone? ");
        Scanner input = new Scanner(System.in);
        stringResult = input.nextLine();
        return stringResult;
    }


    //    Print message and Collect user decision and return boolean
    public boolean businssPhoneCheck() {
        boolean flag = false;
        String phoneUse = "no";
        System.out.println("Is this phone for business use? ");
        // Collect input
        Scanner input = new Scanner(System.in);
        phoneUse = input.nextLine();
        if ((phoneUse.equalsIgnoreCase("Y")) || (phoneUse.equalsIgnoreCase("Yes"))) {
            flag = true;
        } else if (((phoneUse.equalsIgnoreCase("N"))) || (phoneUse.equalsIgnoreCase("No"))) {
            flag = false;
        }
        return flag;
    }


}
