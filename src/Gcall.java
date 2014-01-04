
public class Gcall {
	
	public static void main(String[] args){
		
		Gingleton gt = Gingleton.getInstance();
		System.out.println("class" + gt.isConfusing());
		
		
		Gingleton gt1 = Gingleton.getInstance();
		System.out.println(gt.equals(gt1));
				
	}

}
