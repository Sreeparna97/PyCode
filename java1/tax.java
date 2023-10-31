import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Tax {
 public static void main(String args[]) {
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the values ");
 String input = s.nextLine();
 String[] inputArray = input.split(",");
 List<Integer> inputValues = Arrays.stream(inputArray)
 .map(Integer::parseInt)
 .collect(Collectors.toList());
 int basic = inputValues.get(0);
 int transport = inputValues.get(1);
 int house = inputValues.get(2);
 int grossSalary = basic + transport + house;
 float netSalary = grossSalary;
 if (grossSalary > 55000) {
 netSalary = grossSalary - (grossSalary * 8.2f / 100.0f);
 }
 System.out.println("Net Salary: " + netSalary);
 s.close();
 }
}