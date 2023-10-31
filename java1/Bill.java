import java.util.Scanner;
public class Bill{
public static void main(String[] args) {
System.out.println("enter the string ");
Scanner s1 = new Scanner(System.in);
String data = s1.nextLine();
String[] s2= data.split(",");
String Name = s2[0].trim();
String mobileNumber =s2[1].trim();
String address = s2[2].trim();
int Items = Integer.parseInt(s2[3].trim());
double cost = Double.parseDouble(s2[4].trim());
double Amount = Items * cost;
System.out.println("Name : " + Name + ", Mobile : " + mobileNumber + ", Address : " +
address + ", Items : " + Items + ", Bill Amount : $" + Amount);
}
}