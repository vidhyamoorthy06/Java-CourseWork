public abstract class Person
{
   public abstract void foo();

   public static void main(String[] ar)
   {
       C x = new D();
x.saySomthing(); 
   }
}
class B extends Person
{
   @Override
   public void foo() { System.out.println("Class B"); }
}
 class C extends B
{
   @Override
   public void foo() { System.out.println("Class C"); }
   public void saySomething() {System.out.println("Something");}
}

 final class D extends C
{
   @Override
   public void foo() { System.out.println("Class D"); }
}