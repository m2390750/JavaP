package Chapter1;

public class Counter {
	private int count;//a simple integer instance variable
	public Counter() {}
	public Counter(int initial) {count=initial;}
	public int getCount() {return count;}
	public void increment() {count++;}
	public void increment(int delta) {count+=delta;}
	public void reset() {count=0;}
}
