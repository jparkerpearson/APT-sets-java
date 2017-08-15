 public class RoundCountry {
    public int minBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) 
    {
    	int borders=0;
    	for (int i=0;i<=x.length-1;i++)
    	{
    		if (Math.sqrt(     Math.pow((Math.abs(x[i]-x1)),2)+ Math.pow((Math.abs(y[i]-y1)),2)) <r[i] 
    				&& Math.sqrt(Math.pow((Math.abs(x[i]-x2)),2) + Math.pow((Math.abs(y[i]-y2)),2)) >r[i]   )
    			{
    				borders++;
    			}
    		else if (Math.sqrt(     Math.pow((Math.abs(x[i]-x1)),2)+ Math.pow((Math.abs(y[i]-y1)),2)) >r[i] 
    				&& Math.sqrt(Math.pow((Math.abs(x[i]-x2)),2) + Math.pow((Math.abs(y[i]-y2)),2)) <r[i]   )
    			{
    				borders++;
    			}
    	}
    	return borders;
    }
    
 
 public static void main(String [] args)
	{
	
		int[] input1 = {0 };
		int[] input2 = {0 };
		int[] input3 = {100 };
		int input4 = 1;
		int input5 = 1;
		int input6 = 0;
		int input7 = 0;
		RoundCountry test = new RoundCountry();
		System.out.println(test.minBorders(input1,input2,input3,input4,input5,input6,input7));
		
		
	}
 
 }