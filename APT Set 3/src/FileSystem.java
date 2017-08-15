public class FileSystem {
      public long findUsed(int[] fileBytes, int blockBytes) {
         long tracker=0;
    	  for (int fileSize:fileBytes)
         {
    	if (fileSize%blockBytes==0)
    	{
    		tracker+=(fileSize/blockBytes)*blockBytes;
    	}
    	else
    	{
    	
    		tracker+=(fileSize/blockBytes)*blockBytes+blockBytes;
    	}
    	  
         }
    	  return tracker;
      }
   

public static void main(String [] args)
	{
		int[] tester = {4096, 33792, 76800};
		int tester2=1024;
		FileSystem test = new FileSystem();
		System.out.println(test.findUsed(tester,tester2));
		
		
	}
}