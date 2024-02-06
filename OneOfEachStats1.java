public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		int twochild = 0;
		int threechild = 0; 
		int fourchild = 0; 
		double sumtot = 0.0;
		double avg = 0.0;
		String common ;

		for ( int i = 0; i < t ; i++) {

			boolean boy = false; 
			boolean girl = false; 
			int sum = 0;

			while (boy == false || girl == false){
				double a = (Math.random() );
				if (a >= 0.5){
					boy = true;

				}

				else {
					girl = true;

				}
				sum ++;
			}
			sumtot += sum;
			if (sum == 2) {
				twochild ++;
			}
			else if (sum == 3){
				threechild ++;
			}
			else if (sum >= 4) {
				fourchild ++;
			}
		

		}
	 
	avg = sumtot / t;

	if (twochild >= threechild && twochild >= fourchild){
		common = "2.";
	}
	else if (threechild >= twochild && threechild >= fourchild){
		common = "3.";
	}
	else{
		common = "4 or more.";
	}



	System.out.println("Average: " +avg+ " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " +twochild);
	System.out.println("Number of families with 3 children: " +threechild);
	System.out.println("Number of families with 4 or more children: " +fourchild);
	System.out.println("The most common number of children is " +common);

 	}
 		
}