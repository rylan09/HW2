import java.util.Scanner;
public class ExWK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create instance of scanner class for reading inputs from user
		Scanner reader = new Scanner(System.in);
		
		//prompt user for name
		System.out.println("Please enter your name.");
		
		
		//create variable to hold inputs
		String name = reader.nextLine();
		// get user input for selection
		int input = 0;
		
		while (input != 4) {
			//prompt user for selection
			System.out.println("Hello " +  name+"Select an option below:");
			System.out.println("(1) Door Number 1");
			System.out.println("(2) Door Number 2");
			System.out.println("(3) Door Number 3");
			System.out.println("(4) Exit Application");
			
			//get user selection
			input = reader.nextInt();
			
			//response string
			String res = "Congratz you have won";
			//check or validate user input print response
			switch(input) {
				case 1:
					System.out.println(res+"A Mini Van");
					break;
				case 2:
					System.out.println(res+"A Chevy Astro");
					break;
				case 3:
					System.out.println(res+"A Ford F-150 = Found Off Road DEAD");
					break;
				case 4:
					System.out.println(res+" nothing..... SUCK Camel Dick!!!");
					break;
			}
			
		}
		
	}

}
