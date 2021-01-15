package pets;
import java.util.Scanner;

public class Pet {
    /** place variables at the top
     *
     */
    private String name;
    private int age;
    private String location;
    private String type;
    // setup scanner to get input
    Scanner input = new Scanner(System.in);

    // empty constructor
    public Pet(){
    }

    // constructor for Pet
    public Pet(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String userMessage = "What is your pet's name? ";
        this.name = getInputString(userMessage);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int petAge;
        String messageRequest = "Please enter your pet's age: ";
        petAge = getInputNumber(messageRequest);
        this.age = petAge;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String userMessage = "What is the location of your pet? ";
        this.location = getInputString(userMessage);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Print message and collect user string response
    private String getInputString(String commPrompt) {
        String stringResult = "test 2";
        System.out.println(commPrompt);
        stringResult = input.nextLine();
//        System.out.printf("Input is %s.\n", stringResult);
        return stringResult;
    }

    // Print message and collect user numerical response
    private static Integer getInputNumber(String commPrompt) {
        int numResult = 0;
        boolean flag;
        String n;
        Scanner input = new Scanner(System.in);
        System.out.println(commPrompt);
        do {

            n = input.next();
            try {
                Integer.parseInt(n);
                numResult = Integer.parseInt(n);
                flag = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println(commPrompt);
                flag=true;
            }
        }while (flag);
        // printing out just to check assignment is successful
//        System.out.println(numResult);
        return numResult;
    }

}
