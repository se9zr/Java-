import java.util.Scanner;

public class ComputeAndInterpretBMI
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);

      System.out.println ("Enter Your Weight in Pounds: ");
    double WeightInPound = input.nextDouble ();

      System.out.println ("Enter your height in Inches: ");
    double HeightInInches = input.nextDouble ();

    final double KilogramPerPound = 0.45359237;
    final double MeterPerInches = 0.0254;

    double WeightInKilogram = WeightInPound * KilogramPerPound;
    double HeightInMeters = HeightInInches * MeterPerInches;
    double bmi = WeightInKilogram / (HeightInMeters * HeightInMeters);

      System.out.println ("BMI is = " + bmi);

    if (bmi < 18.5)
        System.out.println ("Underweight");
    else if (bmi < 25)
        System.out.println ("Normal");
    else if (bmi < 30)
        System.out.println ("Overweight");
    else
        System.out.println ("Obese");
  }
}
