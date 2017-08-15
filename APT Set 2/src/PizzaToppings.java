import java.awt.List;
import java.util.ArrayList;

public class PizzaToppings
   {
      public int whichToppings(String[] favorites, String[] menu){
    	
    	for (int j=0;j<menu.length;j++)
    	{
    		String[] splitMenu= menu[j].split(" ");
    		int count=0;
    	for (int i=0; i<splitMenu.length;i++)
    	{
    		
    		for (int k=0; k<favorites.length;k++)
    		{
    			
    			if (favorites[k].equals(splitMenu[i]))
    			{
    				
    				count=count+1;
    				break;
    				
    			}
    		}
    	}
    	if (count==splitMenu.length)
    	{
    		return j;
    	}
    	}
    	return -1;
     }  
      
      
      
      
public static void main(String[] args) {
    PizzaToppings t = new PizzaToppings();
    String[] input = { "ham", "cheese", "mustard"};
    String[] input2= { "ham cheese"};
    System.out.println(t.whichToppings(input2,input));
    /*
     * TODO: add more tests below for the methods you wrote (Note: later you learn a better way to
     * test through JUnit)
     */
  }
}
