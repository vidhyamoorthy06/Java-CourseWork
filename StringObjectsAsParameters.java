import java.lang.StringBuilder;
// This program illustrates how String objects as parameters work.

public class StringObjectsAsParameters                 //Line 1
{                                                      //Line 2
    public static void main(String[] args)             //Line 3
    {                                                  //Line 4
        String str = "Hello";                          //Line 5
        StringBuilder str2=new StringBuilder("Hello");
        System.out.println("Line 6: str before "
                         + "calling the method "
                         + "stringParameter: "+ str);  //Line 6

        stringParameter(str);                          //Line 7
        changeParameter(str2);
        System.out.println("Line 8: str after "
                         + "calling the method "
                         + "stringParameter: " + str + "  "+str2); //Line 8
    } //end main                                       //Line 9
    public static void changeParameter(StringBuilder pStr2)
    {
    	  pStr2.delete(0,pStr2.length()).append("Sunnday");
    	  System.out.println(pStr2);
    }
    public static void stringParameter(String pStr)    //Line 10
    {                                                  //Line 11
        System.out.println("Line 12: In the method "
                         + "stringParameter");         //Line 12
        System.out.println("Line 13: pStr before "
                         + "changing its value: "
                         + pStr);                      //Line 13

       pStr = "Sunny Day";                            //Line 14
        // pStr.delete(0,pStr.length()).append("HH");
        System.out.println("Line 15: pStr after "
                         + "changing its value: "
                         + pStr);                      //Line 15
    } //end stringParameter                            //Line 16
}                                                      //Line 17

