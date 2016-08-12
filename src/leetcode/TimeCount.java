package leetcode;

public class TimeCount {
	long start;
	public TimeCount() {
		
	}
	public void start(){
		start = System.currentTimeMillis();
	}
	public void next() {
		stop();
		start();
	}
	public void stop(){
		System.out.println(System.currentTimeMillis()-start+" millisecond.");
	}
}
