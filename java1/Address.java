import java.util.Scanner;
public class Pgm3{
public static void main(String[] args){
System.out.println("Enter the string");
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String[] items=s1.split(",");
String houseNumber = items[0].trim();
String streetName = items[1].trim();
String city = items[2].trim();
System.out.println("House Number : " + houseNumber);
System.out.println("Street Name : " + streetName);
System.out.println("City : " + city);;
}
}
