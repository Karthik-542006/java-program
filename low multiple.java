public class Main
{
  public static void main (String[]args)
  {
    int num1 = 16, num2 = 24, hcf = 1;

    // calculating HCF here
    for (int i = 1; i <= num1 || i <= num2; i++)
      {
     if (num1 % i == 0 && num2 % i == 0)
        hcf = i;
      }

    // LCM formula
    int lcm = (num1 * num2) / hcf;
    System.out.println ("The LCM: " + lcm);
  }
}
