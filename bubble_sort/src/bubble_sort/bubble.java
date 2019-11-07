package bubble_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bubble {

	
	private int random, size;
	private double temp_rand;
	boolean check; 				//to check if values are swapped
	
	
	
	
	public bubble() {
		System.out.println("Please enter the size you would like: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
	}
	
	public void sort_array(ArrayList<Integer> list) {
		long startTime = System.currentTimeMillis(); // Get the start Time
        long endTime = 0;
		
		//Populate list with random numbers
		for(int i = 0; i<size; i++) {
			generate_random_number();
			list.add(random);
		}
		//iterate through list
		for(int i = 0; i<list.size(); i++) {
			//Set check to false at every loop
			check = false;
			
			for(int j = 0; j<list.size()-1; j++) {		//Iterate through the list linearly, whilst implementing swap below.
				
				if((list.size()-1)-i < j) {				//tweaks up the efficiency.
					continue;							//starts checking from end of list, if swapped then skip iteration.
				}
				if(list.get(j)>list.get(j+1)) {			//checks if the current position is > than next position
					Collections.swap(list, j, j+1);		//Swaps the position of the values
					System.out.println(list);
					check = true;						//not all values have been checked
				}
			}
			//if check is false, no values have changes since sorting is correct. Exit loop.
			if(check == false){break;}
		}
		
		endTime = System.currentTimeMillis(); //Get the end Time
        System.out.println("Difference in mili seconds: "+ (endTime-startTime)); //Print the difference in mili seconds
	}
	
	//Generate Random number
	private int generate_random_number() {
		temp_rand = (Math.random() * (999-1)+1);
		random = (int) Math.round(temp_rand);
		return random;
	}
}
