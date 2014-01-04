public class Gingleton {
    private static Gingleton INSTANCE = null;

    public static Gingleton getInstance()
    {
        if ( INSTANCE == null )
        {
            INSTANCE = new Gingleton();
        }
        return INSTANCE;
    }

    private Gingleton() {
    }
    
    public boolean isConfusing() {
    	   try {
    	     return true;
    	   } finally {
    	     return false;
    	   }
    	}
}