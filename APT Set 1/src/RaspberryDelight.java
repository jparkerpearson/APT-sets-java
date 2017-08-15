public class RaspberryDelight
{
      public int toasts(int upper_limit, int layer_count)
      {
    	int applications=0;
		while (layer_count>0)
		{
		if (upper_limit<layer_count)
		{
			layer_count=layer_count-upper_limit;
		}
		else
		{
			layer_count=0;
		}
		applications=applications+1;
		}
       return applications;
      }
  }