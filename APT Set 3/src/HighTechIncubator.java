import java.util.ArrayList;
import java.util.Arrays;

public class HighTechIncubator {
      public String[] shameList(String[] location1, 
                                    String[] location2, 
                                    String[] location3) {
    	  ArrayList<String> orderedList1 = new ArrayList();
    	  ArrayList<String> orderedList2 = new ArrayList();
    	  ArrayList<String> orderedList3 = new ArrayList();
    	  ArrayList<String> shameList1= new ArrayList();
    	  ArrayList<String> shameList2= new ArrayList();
    	  ArrayList<String> shameList3= new ArrayList();
    	  ArrayList<String> orderedList = new ArrayList();
    	  ArrayList<String> shameList= new ArrayList();
    	  for(int i=0; i<location1.length;i++)
    	  {
    		  if(orderedList1.contains(location1[i]));
    			  
    		  else 
    			  orderedList1.add(location1[i]);
    	  }
    	  for(int i=0; i<location2.length;i++)
    	  {
    		  if(orderedList2.contains(location2[i]));
    			 
    		  else 
    			  orderedList2.add(location2[i]);
    	  }
    	  for(int i=0; i<location3.length;i++)
    	  {
    		  if(orderedList3.contains(location3[i]));
    			 
    		  else 
    			  orderedList3.add(location3[i]);
    	  }
    	  
    	  
    	  
    	  
    	  
    	  for(int i=0; i<orderedList1.size();i++)
    	  {
    		  if(orderedList.contains(orderedList1.get(i)))
    			  shameList.add(orderedList1.get(i));
    		  else
    			  orderedList.add(orderedList1.get(i));
    	  }
    	 
    	  for(int i=0; i<orderedList2.size();i++)
    	  {
    		  if(orderedList.contains(orderedList2.get(i)))
    			  shameList.add(orderedList2.get(i));
    		  else
    			  orderedList.add(orderedList2.get(i));
    	  }
    	 
    	  for(int i=0; i<orderedList3.size();i++)
    	  {
    		  if(orderedList.contains(orderedList3.get(i)))
    			  {
    			  if (shameList.contains(orderedList3.get(i)));
    			  else
    				  shameList.add(orderedList3.get(i));
    			  }
    		  else
    			  orderedList.add(orderedList3.get(i));
    	  }
    	  String[] shame= new String[shameList.size()];
    	  for (int i=0;i<shameList.size();i++)
    		  shame[i]= shameList.get(i);
    	  Arrays.sort(shame);
    	  return shame;
      }
      
      
      
      public static void main(String [] args)
	  	{
	  		String[] tester = {"JOHN", "JOHN", "FRED", "PEG"};
	  		String[] tester2= {"PEG", "GEORGE"};
	  		String[] tester3= {"GEORGE", "DAVID"};
	  		HighTechIncubator test = new HighTechIncubator();
	  		System.out.println(test.shameList(tester, tester2,tester3));
	  		
	  		
	  	}
   }