public class CountOccurrences
{
     public int numberOccurrences(int number, int digit) 
     {
    	 	int occurences=0;
    	 	String numberAsString=Integer.toString(number);
    	 	for (int i=0; i<numberAsString.length(); i++)
    	 	{
    	 
    	 	if (numberAsString.substring(i,i+1).equals(Integer.toString(digit)))
    	 	{
    	 		occurences=occurences+1;
    	 	}
    	 	
    	 	
    	 	}
            return occurences;
     }
 }