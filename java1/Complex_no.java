import java.util.Scanner;
public class Complex {
 public static void main(String args[]){
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the numbers ");
 
 String input = s.nextLine();
 String[] values = input.split(" ");
 
 if (values.length == 4) {
 double r1 = Double.parseDouble(values[0]);
 double i1 = Double.parseDouble(values[1]);
 double r2 = Double.parseDouble(values[2]);
 double i2 = Double.parseDouble(values[3]);
 double real = r1 + r2;
 double img = i1 + i2;
 System.out.println(real + "+" + img + "i");
 } 
 s.close();
 }
}
