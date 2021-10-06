package g1.Exercise;

public class TimeZone {

	int hrs,mins;
	public TimeZone() {} 
	
	public TimeZone(int hrs, int mins) {
		this.hrs=hrs;
		this.mins=mins;
	}
	
	public TimeZone addTime(TimeZone t1, TimeZone t2) {
		TimeZone t3 = new TimeZone();
		t3.hrs=t1.hrs+t2.hrs;
		t3.mins=t1.mins+t2.mins;
		if (t3.mins >= 60) {
			t3.hrs++;
			t3.mins=t3.mins%60;
		}
		return t3;
	}
	
	
	@Override
	public String toString() {
		return "TimeZone [hrs=" + hrs + ", mins=" + mins + "]";
	}

	public static void main(String[] args) {
		TimeZone t1 = new TimeZone(1,56);
		TimeZone t2 = new TimeZone(2,32);
		TimeZone t3 = new TimeZone().addTime(t1, t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
