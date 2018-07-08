public class Car{
private String make;
private int speed;
private static int numofWheels;
public static int count;
public Car(String make,int speed)
{
    this.make=make;
    this.speed=speed;
}
public static void incrementNumofWheels(){
numofWheels++;
}
public String toString(){
return " make = "+ make+ ",speed = "+ speed + ", numofWheels = "+ numofWheels +", count ="+count;
}
public static void main(String[] ar)
{
Car myCar = new Car("GM",20);
Car yourCar = new Car("Ford",40);
myCar.incrementNumofWheels();
yourCar.count++;
System.out.println(myCar);
System.out.println(yourCar);
}
}