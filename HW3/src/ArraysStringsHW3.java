import java.util.Scanner;

public class ArraysStringsHW3 {
	
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;
	
	
	public static void main(String[] args) {
		
		
		String[] Workout = new String[5];
		int decision = 0;
		

		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
			
				
			
			if (decision <-1 || decision > 5) {
				System.out.println("Pick a valid option.");
			} else if (decision == 1) {
				showWorkout(Workout);
			} else if(decision == 2) {
				showAllWorkouts(Workout);
			} else if(decision == 3) {
				addWorkout(Workout);
			} else if(decision == 4) {
				deleteWorkout(Workout);
			} else {
				deleteAllWorkouts(Workout);					
			}
		}
	}


	public static void deleteAllWorkouts(String[] Workout) {
		for (int i = 0; i< Workout.length; i++) {
			Workout[i] = null;
			
		}
	}
	
	public static void deleteWorkout(String[] Workout) {
		System.out.println("which workout would you like to delete?");
		int workoutToDelete = s.nextInt();
		if (isValid(workoutToDelete)) {
			Workout[workoutToDelete] = null;
			
		}
	}
	
	
	private static void showWorkout(String[] Workout) {
		System.out.println("Workout:");
		for (int i = 0; i < Workout.length; i++) {
			System.out.println(i + ": " + Workout[i]);
		}
	}
	
	public static void showAllWorkouts(String[] Workout) {
		System.out.println("Which workout would you like to see?");
		int workoutNumber = s.nextInt();
		if (isValid(workoutNumber)) {
			System.out.println(workoutNumber + ": " + Workout[workoutNumber]);
		}
	}
	
	public static void addWorkout(String[] Workout) {
		System.out.println("Enter new workout:");
		String newWorkout = s.next();
		Workout[addingIndex++] = newWorkout;
		}
			
	
	public static boolean isValid(int input) {
		if (input >= 0 && input < 5) {
			return true;
		} else {
			System.out.println("Invalid entry.");
			return false; 
		}
	}

	public static void showMenu() {
			System.out.println("Please choice an option or enter -1 to exit");
			System.out.println("1) View All Workouts");
			System.out.println("2) View Workout");
			System.out.println("3) Add Workouts");
			System.out.println ("4) Delete Workout");
			System.out.println("5) Delete All Workouts");
	}
	
}
	
	
	

