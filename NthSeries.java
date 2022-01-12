import java.util.stream.IntStream;

public class NthSeries {
	
	public static String seriesSum(int n) {
		Float result = 0.00f;
		if(n == 0){
			return result.toString();
		}
		result++;
		int i = 1;
		while(i < n){
			result = result + (1f/(1+3*i));
			i++;
		}
		
		return String.format("%.2f", result);
	}
	

	public static void main(String k[]) {
		System.out.println("Out: "+seriesSum(5)+" Exp Out: 1.57");
		System.out.println("Out: "+seriesSum(9)+" Exp Out: 1.77");
		System.out.println("Out: "+seriesSum(15)+" Exp Out: 1.94");
		System.out.println("Out: "+seriesSum(0)+" Exp Out: 0.00");
		System.out.println("Out: "+seriesSum(1)+" Exp Out: 1.00");
		System.out.println("Out: "+seriesSum(59)+" Exp Out: 2.40");
		
		//practice
		//int x[] = new int[4];
		int val = 179;
		//Arrays.fill(x, ++val);
		int x[] = IntStream.range(177, val+1).toArray();
		for(int i =0; i < x.length; i++)
		System.out.print(x[i]+" ");

		//System.out.println(x.length+"len"+x[0]+" "+x[1]+" "+x[4]);
	}

}