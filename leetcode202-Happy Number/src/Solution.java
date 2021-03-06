
public class Solution {
	//Cycle detection
	public boolean isHappy(int n){
		    int slow =n,  fast = n;
		    do {
		        slow = digitSquareSum(slow);
		        fast = digitSquareSum(fast);
		        fast = digitSquareSum(fast);
		    } while(slow != fast);
		    if (slow == 1) return true;
		    else return false;
		}
	//sum of the squares of its digits
	public int digitSquareSum(int n){
	    int sum = 0, tmp;
	    while (n!=0) {
	        tmp = n % 10;
	        sum += tmp * tmp;
	        n /= 10;
	    }
	    return sum;
	}
}
