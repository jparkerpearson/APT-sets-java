import java.util.HashMap;
import java.util.Map;

public class PathSort {
     public String[] sortPath(String[] dire) {
    	
  Map<String, Integer> frequencies =new HashMap<String, Integer>();
    	  
    	  for (String s:dire) {
    		  int count=0;
    		  for(int i=0; i<s.length();i++) {
    		  if (s.charAt(i)==('/')) {
    			 count++;
    		  }
    		  
    		 }
    		 
    		  frequencies.put(s, count);
    	  }
    	
    	  int size= frequencies.size();
    	  String[] sorted= new String[size];
    	  int minValue=100;
    	  String min="";
    	  int i=0;
    	  while (i<size) {
    		 
    	  for (String s:frequencies.keySet()) {
    		
    		  if (frequencies.get(s)<minValue) {
    			  min=s;
    			  minValue=frequencies.get(s);
    			  
    		  }
    		
    		  else  if (frequencies.get(s)==minValue) {
    			 if (s.compareTo(min)<0) {
    				
    				 min=s;
    				 minValue=frequencies.get(s);
    				
    			 }
    		  }
    		 
    		  
    	  }
    	  
    	 minValue=100;
    	  sorted[i]=min;
    	 
    	  frequencies.remove(min);
    	  
    	  i++;
    	  }
    	  
    	  
    	 return sorted; 
      }
  }