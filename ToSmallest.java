public class ToSmallest {
    
    public static long[] smallest(long n) {
    	long[] result = {n,0L,0L};
    	int min = 10, max = 0, iMin = 0, iMax = 0, offset = 0, insPos = 0;
    	String num = n+"";
 
    	int k = num.length();
    	while(n > 0){
    		System.out.println(n);
    		k--;
    		int temp = (int) (n % 10);
    		if(temp <= min){
    			System.out.println(k+" "+temp);
    			if(min ==  temp){
    				if((k+1)==iMin){
    					min = temp;
            			iMin = k;
    				}
    				
    			}else{
    				min = temp;
        			iMin = k;
    			}
    			
    		}
    		if(offset == 0){
    			if(temp >= max){
        			max = temp;
        			iMax = k;
        		}
    		}
    		
    		
    		n = n / 10;
    		
    		if(offset == num.length()){
    			return result;
    		}
    		if((n == 0) && (iMin == 0)){
    			offset++;
    			String tempN = num.substring(offset);
    			
    			k = tempN.length();
    			n = Long.parseLong(tempN);
    			min  = 10;
    		}
    	}
    	long num1, num2;
    	
    	//taking max digit to last
    	StringBuilder temp = new StringBuilder(num);
    	temp.deleteCharAt(iMax);
    	temp.append(max);
    	num1 = Long.parseLong(temp.toString());
    	
    	//taking min digit to first
    	temp = new StringBuilder(num);
    	insPos = offset;
    	
    	temp.deleteCharAt(offset+iMin);
    	temp.insert(offset, min);
    	while(insPos > 0){
    		if(temp.charAt(insPos-1) == temp.charAt(insPos)){
    			insPos--;
    		}else{
    			break;
    		}
    	}
    	num2 = Long.parseLong(temp.toString());
    	
    	if(num2 <= num1){
    		result[0] = num2;
    		if(iMin == 1){
    			result[1] = offset;
        		result[2] = offset + 1;
    		}else{
    			result[1] = iMin+offset;
        		result[2] = insPos;
    		}
    		
    	}else if(num1 < num2){
    		result[0] = num1;
    		result[1] = iMax;
    		result[2] = num.length()-1;
    	}
    	
    	
    	
    	System.out.println(num+" "+num2+" "+num1);
    	System.out.println("offset= "+offset+" min Pos:"+iMin+"=>"+min+" "+" max Pos:"+iMax+"=>"+max);
		return result;
    }
    
    public static void main(String[] args) {
    	//Long n = 255741992990667008L;
    	Long n = 273837147548591264L;
    	long[] l = smallest(n);
		System.out.println(l[0]+" "+l[1]+" "+l[2]);
		//expected:<[25574199299[066708, 15], 0]> but was:<[25574199299[667008, 11], 0]>
		//255741992990667008L
		//25574199299667008
		//25574199299066708
		//expected:<[1878630[0289, 10], 0]> but was:<[1878630[2809, 6], 0]>
		//187863002809
		//18786300289
		//18786302809
		//expected:<[119989884756, 4, [0]]> but was:<[119989884756, 4, [1]]>
		//199819884756 
		//expected:<[14[1659282137356336, 15, 0]]> but was:<[14[6592821373563136, 0, 1]]>
		//416592821373563136 
		//141659282137356336
		//146592821373563136
		//expected:<[1273837[14754859264, 14], 0]> but was:<[1273837[47548591264, 6], 0]>
		//273837147548591264 
		//127383714754859264
		//127383747548591264
		//expected:<[11[1773689266186272, 1, 7]]> but was:<[11[8117736926686272, 12, 0]]>
		//181177369266186272 
		//11[1773689266186272
		//11[8117736926686272
	}
}