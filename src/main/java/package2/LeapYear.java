package package2;

public class LeapYear {

	public boolean isLeapYear(int year) {
		return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
	}

}
