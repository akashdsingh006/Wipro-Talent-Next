public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
}  
 public int solve(int n)
    {
        // count of prime numbers
        int count = 0, num = 1;
       
        // sum of prime numbers
        long sum = 0;
       
        while (count < n) {
       
            // if the number is prime add it
            if (isPrime(num)) {
                sum += num;
       
                // increase the count
                count++;
            }
       
            // get to next number
            num++;
        }
        return (int) sum;
    }

public int find_tvalue(int input1, int input2, int input3)
{
	int a=input1;
	int b=input2;
	int c=input3;
	int t=0;
	if(isPrime(b) && b%2==0)
		{
			t=a*a*solve(b);
		}
	else if(isPrime(b) && b%2!=0)
		{
			t=b*b*solve(c);
		}
	else if(isPrime(b)==false && b%2==0)
		{
			t=c*c*solve(b+c);
		}
	else
		{
			t=solve(a+b+c);
		}
	
	if(isPrime(t))
		return t+c;
	else
		return t-c;
}
