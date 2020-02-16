import java.util.Scanner;
public class MovieDriver {

	public MovieDriver() {
		
	}

	public static void main(String[] args) 
	{
		//Create a new object of type Scanner that reads from the keyboard
				Scanner keyboard = new Scanner(System.in); 
		
		//Create a new movie object 
				Movie movieObject = new Movie();
		
		//List of variables 
				String title; 
				String rating; 
				int soldTickets; 
				String answer; 
				
	 do 
	 {
					
		//Prompt the user to enter the title of a movie 
					System.out.println("\nPlease, Enter the title of a movie: ");
					title = keyboard.nextLine(); // Read in the line that the user types
					movieObject.setTitle(title); // Set the title in the movie object
					
		//Prompt the user to enter the movie’s rating
					System.out.println("Please, Enter the rating of the movie:");
					rating = keyboard.nextLine(); //Read in the line that the user types
					movieObject.setRating(rating); //Set the rating in the movie object
					
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
					System.out.print("\nHow many tickets did this movie sell? Please Enter:  ");
					soldTickets = keyboard.nextInt(); 
					movieObject.setSoldTickets(soldTickets); //Set the number of tickets sold in the movie object
					System.out.println(); 

		//Print out the information using the movie’s toString method
					System.out.println(movieObject.toString());
					System.out.println();
		// In order for it to loop ask the user to enter another movie
					System.out.print("\nDo you want to enter another Movie(y or n)?: ");
					answer = keyboard.next(); 
					keyboard.nextLine();
					System.out.println();
	 } 
	 	// Add to your driver class a loop that reads input for multiple movies.
	 				while (answer.equalsIgnoreCase("y")); 
	 	
	 	//Respond with a goodbye to show that the program has ended: 
	 				System.out.print("\nGoodbye!!");

	}

}
