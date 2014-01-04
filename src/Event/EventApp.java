package Event;

public class EventApp {
	
	public static void main(String[] args){
		final EventSource es = new EventSource();
		
		final EventHandler eh = new EventHandler();
		
		es.addObserver(eh);
		
		Thread tr = new Thread(es);
		tr.start();
	}

}
