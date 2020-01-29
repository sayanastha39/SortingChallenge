//Bubble Sort
public class sortingAlgorithm {

	public static void main(String[] args) {
		
		String[] lastNames = {"Adams", "Quincy", "Washington", "Allison", "Jones", "Ward", "Johnson", "Barnes", "Calvin", "Zigler", "Ball"};
		 
		String sorted;
        int len = lastNames.length;
        
        for (int i = 0; i < len; i++) 
        {
        	for (i = 0; i < len-1; i++) {
        		
	            for (int j = 0; j < len-i-1; j++) 
	            {
	                if (lastNames[j].compareTo(lastNames[j+1])>0) 
	                {
	                	sorted = lastNames[j];
	                    lastNames[j] = lastNames[j+1];
	                    lastNames[j+1] = sorted;
	                }
	            }
	        }
        }
        
        System.out.println("Last names sorted in ascending order :");
	        
        for (int i = 0; i < len; i++){
        	System.out.print(lastNames[i] + ", ");
	    }
        
        System. out. println();
        
        for (int i = 0; i < len; i++){
        	if (lastNames[i].charAt(0) == 'W') {
        		System.out.println("Index of first occurence of last name that starts with letter 'W' is: " + i);
        		break;
        	}
        }
    }
}



