package leetcode;

import java.math.BigInteger;

public class SumOfTwoInteger {
	int a[]={1,2,3,4,5,6,9999},b[]={9,10,11,12,13,14,1};
	private TimeCount timeCount;
	public SumOfTwoInteger(){
		timeCount=new TimeCount();
	}
	public void run(){
		for(int i=0;i<a.length;i++){
			timeCount.start();
			
			//timeCount.next();
			System.out.println(II(a[i], b[i]));
			timeCount.stop();
		}
	}
	public int I(int a,int b) {
		int index[][][]=new int[2][2][2];
		index[0][0][0]=0;
		index[0][0][1]=1;
		index[0][1][0]=1;
		index[0][1][1]=2;
		index[1][0][0]=1;
		index[1][0][1]=2;
		index[1][1][0]=2;
		index[1][1][1]=3;
		String main,add;
		if (a>=b) {
			main=Integer.toBinaryString(a);
			add=Integer.toBinaryString(b);
		}else {
			main=Integer.toBinaryString(b);
			add=Integer.toBinaryString(a);
		}
		StringBuffer ans;
		boolean carry=false;
		
		return 0;
	}
	public int II(int a,int b) {
		BigInteger first  = new BigInteger(String.valueOf(a));
	    BigInteger second = new BigInteger(String.valueOf(b));
	    
		return Integer.valueOf(first.add(second).toString());
	}
}
