//Alternative sorting
import java.util.*;

public class challenge2 {

	public static void main(String[] args) {
		
		List<String> lastNames = Arrays.asList("Adams", "Quincy", "Washington", "Allison", "Jones", "Ward", "Johnson", "Barnes", "Calvin", "Zigler", "Ball");
		
		Collections.sort(lastNames);
		System.out.println("Array of last names sorted in ascending order :" + lastNames);
		
		for (String sorted: lastNames) {
			
			if(sorted.startsWith("W")) {
				
				int index = lastNames.indexOf(sorted);
				
				System.out.println(index + "  is the index of  " + sorted + ",   which is the first last name that starts with letter 'W' ");
				
				break;
			}
		}
		
	}
}
