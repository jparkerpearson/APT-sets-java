import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

 public class BigWord 
 {
      public String most(String[] sentences) 
      {
    	String temp= "";
    	for (int i=0; i<sentences.length;i++)
    	{
    		temp=temp+" " +sentences[i];
    	}
    	temp=temp.toLowerCase();
    	String[] combined= temp.split(" ");
    	HashMap<String,Integer> wordsOccured = new HashMap<String,Integer>();
    	for(int i=0;i<combined.length;i++)
          {
        	  if (wordsOccured.containsKey(combined[i]))
        	  {
        		  
        		  wordsOccured.put(combined[i], wordsOccured.get(combined[i]) + 1);	
        		  
        	  }
        	  else
        	  {
        		  wordsOccured.put(combined[i],0);	
        	  }
        }
    	int maxValue=0;
    	for (Integer value : wordsOccured.values()) {
    	  
    		if (value>maxValue){
    		   maxValue=value;
    	   }
    	}
    	
    	String output="";
    	  for (String key : wordsOccured.keySet()) {
    			if (wordsOccured.get(key) == maxValue) {
    			    output= key;
    			}
      }
  return output;
      }
      
      
      
  	public static void main(String [] args)
  	{
  		String[] tester = {"one fish two", "fish red fish blue", "fish this fish is black"};
  		BigWord test = new BigWord();
  		System.out.println(test.most(tester));
  		
  		
  	}
 }
  