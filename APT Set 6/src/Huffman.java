
   public class Huffman {
	   
      public String translate(String encoded, String[] dictionary) {
    	String tracker="";  
    	StringBuilder output=new StringBuilder();
  
    	
    	
    	
       char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    	for (int i=0; i<encoded.length();i++ ) {
    		tracker=tracker+encoded.charAt(i);
    		
    		
    	for (int j=0; j<dictionary.length; j++)
    	{
    		if(tracker.equals(dictionary[j])) {
    			tracker="";
    			
    			
    			output.append(alphabet[j]);
    			
    		}
    	}
    	
    	
    	}  
    	  return output.toString();
      }
   }