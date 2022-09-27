class CCircle
{
   private static double pi=3.14;
   private double radius;
   public CCircle(double r)
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("input=" + radius + ", area="+pi*radius*radius);
   }
}
public class Class16
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[6];
      for (double i=0.0; i <= 5; i += 1.0) {
    	  cir[(int)i]=new CCircle(i);
          cir[(int)i].show();
      }
   }
}