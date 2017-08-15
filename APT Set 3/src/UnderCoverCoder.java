import java.util.HashMap;
public class UnderCoverCoder {



 
	 public int totalNotes(String[] clips, String[] notes) {
      
    // make all lowercase 
    // loop through .charat add everything in to map
     // }
	for ( int i=0; i<clips.length;i++)
	{
		clips[i]=clips[i].replaceAll("\\s","");
		clips[i]=clips[i].toLowerCase();
	}
	for ( int i=0; i<notes.length;i++)
	{
		notes[i]=notes[i].replaceAll("\\s","");
		notes[i]=notes[i].toLowerCase();
	}
    	 
	HashMap<Character,Integer> lettersOccured = new HashMap<Character,Integer>();
	
	
	int counter=0;
	
	for (String s:clips)
	{
		for (int i=0; i<s.length();i++)
    	{
    		if(lettersOccured.containsKey(s.charAt(i)))
    		{
    			 lettersOccured.put(s.charAt(i), lettersOccured.get(s.charAt(i)) + 1);	
    		}
    		else
    		{
    			lettersOccured.put(s.charAt(i),1);
    		}
    	}
	}
	
    
	for (String s:notes)
	{
		boolean decider=true;
		HashMap<Character,Integer> lettersNeeded = new HashMap<Character,Integer>();
		for (int i=0; i<s.length();i++)
    	{
		
    	
			if(lettersNeeded.containsKey(s.charAt(i)))
    		{
    			 lettersNeeded.put(s.charAt(i), lettersNeeded.get(s.charAt(i)) + 1);	
    		}
    		else
    		{
    			lettersNeeded.put(s.charAt(i),1);
    		}
    	}
		
		for(Character letter:lettersNeeded.keySet())
		{
		
		if(lettersOccured.get(letter)==null || lettersNeeded.get(letter)>lettersOccured.get(letter))	
		{
		
			decider=false;
		}
		
		}
		if (decider)
			counter++;
	}
	
	return counter;
	
	 }
	 public static void main(String [] args)
	  	{
	  		String[] tester = {"Programming is fun " };
	  		String[] tester2= {"program ", " programmer ", " gaming ", " sing ", " NO FUN "};
	  		UnderCoverCoder test = new UnderCoverCoder();
	  		System.out.println(test.totalNotes(tester, tester2));
	  		
	  		
	  	}
}
	
	
	
	
	
    
      