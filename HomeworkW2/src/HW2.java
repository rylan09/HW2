import java.util.Scanner;
public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Pick a day out of the week");
		
		String Day = reader.nextLine();
		
		int input = 0;
		
		while (input != 5) {
			System.out.println("Sweet!!! " + Day + " Select a Workout Plan below:");
			System.out.println("(1) Workout Plan 1");
			System.out.println("(2) Workout Plan 2");
			System.out.println("(3) Workout Plan 3");
			System.out.println("(4) Workout Pann 4");
			System.out.println ("(5) Exit Application");
			
			input = reader.nextInt();
			
			String res = "Nice get to the gym and workout ";
			
			switch(input) {
				case 1:
				System.out.println(res+ "Abs and Shoulders Day" );
					break;
				case 2:
				System.out.println(res+ "Chest and Biceps Day" );
					break;
				case 3:
				System.out.println(res+ "Leg Day" );
					break;
				case 4:
				System.out.println(res+"Run them miles" );
					break;
				case 5:
				System.out.println(res+"Rest Day. Go home!!!" );
					break;	
			       }
					
			}
		}

}

