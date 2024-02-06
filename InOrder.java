public class InOrder {
	
	public static void main (String[] args) {
		
    	int r1= (int)(Math.random()*10);
		System.out.print(r1);
		
		int r2 = (int)(Math.random()*10);
		while (r2 >= r1){
			
			System.out.print(" " + r2);
			r1 = r2;
			r2 = (int)( Math.random()*10);
			
			
		}
		
	}
}
