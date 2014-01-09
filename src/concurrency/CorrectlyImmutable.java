package concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class CorrectlyImmutable {
    private final Date date;
    private final SimpleDateFormat dateFormat;
    
    public CorrectlyImmutable(Date date){
    	// date parameter should be clone and then assign into this.date
    	// otherwise it will break immutability
        this.date = (Date)date.clone();        
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
    public String getMessage(){
        return dateFormat.format(date);
    }
    
    public String getDate(){
    	return date.toString();
    }
    
    
    public static void main(String[] args) {
        Date testDate = new Date();
        CorrectlyImmutable immutable = new CorrectlyImmutable(testDate);
        
        // Changing the testDate object dosn't affect immutable object
        // which is correctly immutable  
        testDate.setTime(testDate.getTime() + 10000000);
        System.out.println("should be different if it's immutable \n " 
        		+ immutable.getDate() + "\n"
        		+ testDate.toString() );
    }
    
    
}