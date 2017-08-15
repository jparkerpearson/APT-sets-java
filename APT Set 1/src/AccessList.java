public class AccessList {
     public String mayAccess(int[] rights, int minPermission) 
     {
          String access = "";
          for (int i=0; i<rights.length; i++)
          {
        	  if (rights[i]>=minPermission)
        	  {
        		  access=access+"A";
        	  }
        	  else
        	  {
        		  access=access+"D";
        	  }
        		  
          }
          
          return access;
     }
  }