 public class DNAMutate
 {
      public String mutate(String dna) 
      {
    	  String reverse="";
    	  for (int i=dna.length()-1; i>=0; i--)
    	  {
    		  reverse=reverse+ dna.charAt(i);
    	  }
    	  
    	  
    	  return reverse;
      }
   }