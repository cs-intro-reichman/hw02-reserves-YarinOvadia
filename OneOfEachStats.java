import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		
		
		
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
				double a = generator.nextDouble();
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
