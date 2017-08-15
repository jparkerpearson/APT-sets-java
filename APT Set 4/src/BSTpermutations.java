public class BSTpermutations {
     public long howMany(int[] values) {
           long n = values.length;
           return count(n); //since only n matters
     }
public long count(long n){ 
	if (n == 0) return 0; long[] F = new long[n+1]; F[0] = 0;
	F[1] = 1;
	for (int i = 2; i <= n; i++)
	F[i] = F[i-1] + F[i-2]; return F[n];
}
}
	