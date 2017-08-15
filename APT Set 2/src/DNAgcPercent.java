public class DNAgcPercent
{
    public double percentage(String dnaStrand)
    {
            
            
            double occurences=0;
         
        
                	 	for (int i=0; i<dnaStrand.length(); i++)
                	 	{
                	 
                	 	if (dnaStrand.substring(i,i+1).equals("c") || dnaStrand.substring(i,i+1).equals("g"))
                	 	{
                	 		occurences=occurences+1;
                	 	}
                	 	
                	 	
                	 	}
                       
                 
           
                	 	if (dnaStrand.length()==0)
                        {
                        	
                        	return 0.0;
                        }
            return occurences/dnaStrand.length();
            
          }
    
}