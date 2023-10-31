import java.util.Scanner;
class Utility {
 public static String eligibleVoter(int a) {
 String result = "Not eligible";
 if (a>=18)
 result="Elgible";
 return result;
 }
}
class Tester {
 private static Scanner in;
 public static void main(String[] args) {
 in = new Scanner(System.in); 
 int a = in.nextInt();
 String voter = Utility.eligibleVoter(a);
 System.out.println(voter);
 }
}