public class ChessChampionship 
{
     public int[] points(String[] games) 
     {
    	int[] points=new int[games.length];
    	for (int i=0; i<games.length;i++)
    	{
    		for (int j=0; j<games[i].length(); j++)
    		{
    			if (games[i].substring(j,j+1).equals("W"))
    			{
    				points[i]=points[i]+3;
    			}
    			else if(games[i].substring(j,j+1).equals("D"))
    			{
    				points[i]=points[i]+1;
    				points[j]=points[j]+1;
    			}
    			else if(games[i].substring(j,j+1).equals("L"))
    			{
    				points[j]=points[j]+3;
    			}
    		}
    	}
     
       
        return points;
     }
 }