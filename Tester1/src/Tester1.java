

public class Tester1
{
   public static void main(String[] args)
   {
      char[] cArray =
      { 'A', 'B', 'C', 'D' };
      System.out.println(cArray);
      double[] dArray =
      { 2.3, 3.4, 5.67 };
      System.out.println(dArray);
      String[] sArray =
      { "abc", "def", "ghij" };
      System.out.println(sArray);
      testDecimalFormat dFormat = new testDecimalFormat();
      //dFormat.showDouble();
      dFormat.showRandom();
      System.out.println("Github testing");
      System.out.println("Done!");
   }
}
