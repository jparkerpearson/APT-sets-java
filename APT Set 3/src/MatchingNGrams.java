

   public class MatchingNGrams {
      public boolean isAnagram(String string1, String string2) {
    	  String temp1=string2;
    	  String temp2=string1;
    	  if(temp1.length()!=temp2.length())
    		  return false;
    	  for(int i=0;i<string1.length();i++)
    	  {
    		 if (Character.isDigit(temp1.charAt(i)));
    			 
    		 else
    		  temp1=temp1.replace(temp1.charAt(i),(char) i);
    		 
    	  }
    	  for(int i=0;i<string1.length();i++)
    	  {
    		  if (Character.isDigit(temp2.charAt(i)));
 			 
     		 else
     		  temp2=temp2.replace(temp2.charAt(i),(char) i);
     		 
    	  }
    	  if(temp2.equals(temp1))
    		  return true;
    	  return false;
    	 }
    	  
      
      
      public int totalMatches(String[] ngrams) {
         int count=0;
         for(int i=0; i<ngrams.length-1;i++)
         {
        	 for(int j=i+1;j<ngrams.length;j++)
        	 {
        		
        		 if(this.isAnagram(ngrams[i], ngrams[j]))
        				 {
        			 count++;
        				 }
        	 }
         }
         return count;
       }  
    	
      
   
     
      
      public static void main(String [] args)
	  	{
    	  	String[] tester = {"abca", "zbxz", "opqr"};
	  		MatchingNGrams test = new MatchingNGrams();
	  		System.out.println(test.totalMatches(tester));
	  		System.out.println(test.isAnagram("abca", "opqr"));
	  		
	  	} 
      
   }