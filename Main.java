import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner lala=new Scanner(System.in);

    String name;
    String age ;
    String city;
    String college;
    String profession;
    String animal;
    String petname;

    System.out.println("Enter your name");
    name = lala.nextLine();

    System.out.println("Enter your age");
     age = lala.nextLine();

     System.out.println("Enter the name of your city");
    city = lala.nextLine();

    System.out.println("Enter the name of the college you attended");
    college = lala.nextLine();

    System.out.println("Enter your profession");
    profession = lala.nextLine();

    System.out.println("Enter your type of animal");
    animal = lala.nextLine();

    System.out.println("Enter your pet name");
    petname = lala.nextLine();

    System.out.println("There once was a person named" + name + "who lived in" + city +"." +
    "At the age of" + age + "," + name + "went to college at" + college + "." + name + "graduated and went to work as a" + profession
    + "." + "Then," + name + "adopted a (n)" + animal + "named" + petname + "." + "They both lived happily, ever after!");

    }
}