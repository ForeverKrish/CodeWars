public class Solution {

  public int solution(int number) {
    int result = 0;
    int mul3 = (number-1) / 3;
    int mul5 = (number-1) / 5;
    int mul15 = (number-1) / 15;
    System.out.println(mul3+" "+mul5+" "+mul15);
    //A.P. : S = n/2(2a+(n-1)d)
    int sum3 = (mul3 * (2 * 3 + (mul3 - 1) * 3)) / 2; 
    int sum5 = (mul5 * (2 * 5 + (mul5 - 1) * 5)) / 2; 
    int sum15 = (mul15 * (2 * 15 + (mul15 - 1) * 15)) / 2; 
    result = sum3 + sum5 - sum15;
	return result;
  }
  
  public static void main(String[] args) {
	int x = new Solution().solution(20);
	System.out.println(x);
}
}