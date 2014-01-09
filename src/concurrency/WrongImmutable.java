package concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class WrongImmutable {
    private final Date date;
    private final SimpleDateFormat dateFormat;
    
    public WrongImmutable(Date date){
        this.date = date;
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
        WrongImmutable wrongImmutable = new WrongImmutable(testDate);
        
        // Changing the testDate object means you change wrongImmutable object
        // which is not actually immutable  
        testDate.setTime(testDate.getTime() + 10000000);
        System.out.println("should be different if it's immutable but same \n " 
        		+ wrongImmutable.getDate() + "\n"
        		+ testDate.toString() );
    }
    
    
}