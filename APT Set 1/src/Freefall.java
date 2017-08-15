public class Freefall
{
      public double fallingDistance(double time, double velo)
      {
       double distance=velo*time+.5*(9.8*time*time);
       return distance;   
      }
  }