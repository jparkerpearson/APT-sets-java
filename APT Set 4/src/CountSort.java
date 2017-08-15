 import java.util.*;

public class CountSort {
      public  String[] countSorter(String[] wordList) {
          // fill in code here
    	 
    	  Map<String, Integer> frequencies =new HashMap<String, Integer>();
    	  
    	  for (String s:wordList) {
    		  if (frequencies.containsKey(s)) {
    			  frequencies.put(s, frequencies.get(s)+1);
    		  }
    		  else {
    			  frequencies.put(s,1);
    		  }
    	  }
    	  
    	 
    	  int size= frequencies.size();
    	  String[] sorted= new String[size];
    	  int maxValue=0;
    	  String max="";
    	  int i=0;
    	  while (i<size) {
    		 
    	  for (String s:frequencies.keySet()) {
    		
    		  if (frequencies.get(s)>maxValue) {
    			  max=s;
    			  maxValue=frequencies.get(s);
    			  
    		  }
    		
    		  else  if (frequencies.get(s)==maxValue) {
    			 if (s.compareTo(max)<0) {
    				
    				 max=s;
    				 maxValue=frequencies.get(s);
    				
    			 }
    		  }
    		 
    		  
    	  }
    	  
    	 maxValue=0;
    	  sorted[i]=max;
    	  frequencies.remove(max);
    	  
    	  i++;
    	  }
    	  
    	  
    	 return sorted; 
      }
      
      
      
    
      
      
      
   }