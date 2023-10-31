import java.util.Scanner;
public class Pgm2{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter first number");
int N1=s.nextInt();
System.out.println("Enter second number");
int N2=s.nextInt();
int Sum= N1+N2;
int Difference= N1-N2;
int Product= N1*N2;
int Quotient= N1/N2;
System.out.println("Sum="+Sum);
System.out.println("Difference="+Difference);
System.out.println("Product="+Product);
System.out.println("Quotient="+Quotient);
}
}