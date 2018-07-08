import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;


//Clock base class
class Clock
{
	
	
   /**
    * gets hours
    * @return hours of current time in string
   */
   public String getHours()
   {
     int h =new Date().getHours();
     return Integer.toString(h);
   }

   /**
    * gets minutes
    * @return minutes of current time in string
   */
   public String getMinutes()
   {
	   int m =new Date().getMinutes();
	     return Integer.toString(m);
   }
 /**
    * gets Seconds
    * @return seconds of current time in string
   */
   public String getSeconds()
   {
	   int s =new Date().getSeconds();
	     return Integer.toString(s);
   }
   /**
    * gets current time composed of hours and minutes
    * @return time in string;
    */
   public String getTime()
   {
        return getHours() + ":" + getMinutes() + ":"+ getSeconds();
   }

   /**
      Returns the current Date and Time as a String.
   */
   private String currentTime()
   {
      return LocalDateTime.ofInstant(Instant.now(),
         ZoneId.systemDefault()).toString();
   }
}

//WorldClock inherits Clock

class WorldClock extends Clock {

	private int timeZoneDiff;
	/**
	 * @return the timeZoneDiff
	 */
	public int getTimeZoneDiff() {
		return timeZoneDiff;
	}
	/**
	 * @param timeZoneDiff the timeZoneDiff to set
	 */
	public void setTimeZoneDiff(int timeZoneDiff) {
		this.timeZoneDiff = timeZoneDiff;
	}
	public WorldClock(int timeDiff) {
		timeZoneDiff=timeDiff;
	}
	
	 public String getHours()
	   {
	      //get current hours at home
	      int home_hours = Integer.parseInt(super.getHours());
	      //apply the time difference to get time at new zone
	      int new_hours = home_hours + timeZoneDiff;
	      if (new_hours > 24)
	      {
	         new_hours = new_hours - 24;
	      }
	      else if (new_hours < 0)
	      {
	         new_hours = new_hours + 24;
	      }

	      //convert to String
	      return Integer.toString(new_hours);
	   }

}


//AlarmClock inherits Clock

class AlarmClock extends Clock {

	private int hour;
	private int min;
	private int sec;
	
	public AlarmClock( int h,int m,int s) {
		// TODO Auto-generated constructor stub
		hour=h;
		min=m;
		sec=s;
	}
	
	   // Your work goes here
	   

	 /**
	    * Sets the alarm.
	    * @param hours hours for alarm
	    * @param minutes minutes for alarm
	    */
	   public void setAlarm(int hours, int minutes, int seconds)
	   {
		   new AlarmClock(hours,minutes,seconds);
		  Clock c = new Clock();
	   int h = Integer.parseInt(c.getHours());
	   int m = Integer.parseInt(c.getMinutes());
	   int s = Integer.parseInt(c.getSeconds());
	   if(h==hours && m==minutes && s==seconds)
	   {
		   //alarm fires
		   System.out.println(c.getTime());
		   System.out.println("Alarm");
	   }	  

}

}

// Derived class that initiates the execution - Driver class
public class ClockDemo
{
   public static void main(String[] args)
   {
      //test WorldClock
      System.out.println("");
      System.out.println("Testing WorldClock class");
      int offset = 3;
      System.out.println("Offset: " + offset);
     WorldClock wclock = new WorldClock(offset);
      System.out.println("Hours: " + wclock.getHours());
      System.out.println("Minutes: " + wclock.getMinutes());
	  System.out.println("Seconds: " + wclock.getSeconds());
      System.out.println("Time: " + wclock.getTime());
      
     // System.out.println("Alarm Clock");
    //  AlarmClock ac = new AlarmClock(03,33,15);
     // ac.setAlarm(3, 35, 15);
   }
}
