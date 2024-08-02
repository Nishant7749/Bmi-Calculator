import java.util.*;
public class bmi {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Hello ! "+ name+ ", Please fill the details.");

        System.out.print("Age : ");
        int age = sc.nextInt();

        System.out.print("Weight (kg) : ");
        double weight = sc.nextDouble();

        System.out.print("Height (cm) : ");
        double height = sc.nextDouble();

        double bmi = calcbmi(weight, height);

        System.out.printf("BMI = %.2f\n", bmi);
        System.out.println("BMI category = "+ bmicateg(bmi));
 }

 public static double calcbmi(double weight, double height) {
    return weight / (height * height * 10000);
 }                                                                               //gives wrong bmi, bmi = 0.00

 public static String bmicateg(double bmi) {
    if(bmi < 18.5) {  return "Underweight";}

    else if(bmi >= 18.5 && bmi <= 24.9)  {   return "Healthy"; }

    else if(bmi >= 24.9 && bmi <= 29.9)  { return "Overweight"; }

    else { return "Obese";}
 }
    
}
