package refactoring;

public class Birthday {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Birthday(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getBirthDate() {

		return getDay() + " / " + getMonth() + " / " + getYear();

	}

	public String toString() {

		return getDay() + " / " + getMonth() + " / " + getYear();

	}

}
