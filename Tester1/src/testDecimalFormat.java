import java.util.Scanner;
import java.text.DecimalFormat;


public class testDecimalFormat
{
   public void showDouble()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a double number: ");
      double dNumber = keyboard.nextDouble();
      DecimalFormat pattern00dot000 = new DecimalFormat("00.000");
      DecimalFormat patternp0dot000 = new DecimalFormat("#0.000");    
      DecimalFormat pattern0dot00 = new DecimalFormat("0.00");
      DecimalFormat percent = new DecimalFormat("0.00%");

      System.out.println("pattern00dot000: " + pattern00dot000.format(dNumber));
      System.out.println("pattern#0dot000: " + patternp0dot000.format(dNumber));
      System.out.println("pattern0dot00: " + pattern0dot00.format(dNumber));
      System.out.println("perecent: " + percent.format(dNumber));
   }
   
   public void showRandom()
   {
      int randNum;
      double randDouble;
      for (int n=0; n< 10; n++)
      {
         randDouble = Math.random();
         randNum = (int)(randDouble * 1000 + 1);
         DecimalFormat randPattern = new DecimalFormat("0.000000");
         System.out.println("Random in Double" + randPattern.format(
            randDouble));
         System.out.println("Random between (1 - 1000): " + randNum);
      }
   }
}
