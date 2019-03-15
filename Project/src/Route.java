import java.util.Scanner;
import java.util.regex.Pattern;

public class Route {

	public Airplane Incheon_Tokyo_Large(String date, String time) {
		
		return new Airplane_Large(50,30,date,time, "도쿄");
	}

	public Airplane Incheon_Tokyo_Medium(String date , String time) {
		return  new Airplane_Medium(40, 20,date, time,"도쿄");
	}

	public Airplane Incheon_Tokyo_Small(String date , String time) {
		return new Airplane_Small(30, 10, date, time,"도쿄");
	}

	public Airplane Incheon_Paris_Large(String date , String time) {
		return new Airplane_Large(100, 80,date, time,"파리");
	}

	public Airplane Incheon_Paris_Medium(String date , String time) {
		return new Airplane_Medium(90, 70,date, time,"파리");
	}

	public Airplane Incheon_Paris_Small(String date , String time) {
		return new Airplane_Small(80, 60,date, time,"파리");
	}

	public Airplane Incheon_Toronto_Large(String date , String time) {
		return new Airplane_Large(120, 100,date, time,"토론토");
	}

	public Airplane Incheon_Toronto_Medium(String date , String time) {
		return new Airplane_Medium(110, 90,date, time,"토론토");
	}

	public Airplane Incheon_Toronto_Small(String date , String time) {
		return new Airplane_Small(100, 80,date, time,"토론토");
	}

	public Airplane Incheon_London_Large(String date , String time) {
		return new Airplane_Large(100, 80,date, time,"런던");
	}

	public Airplane Incheon_London_Medium(String date , String time) {
		return new Airplane_Medium(90, 70,date, time,"런던");
	}

	public Airplane Incheon_London_Small(String date , String time) {
		return new Airplane_Small(80, 60,date, time,"런던");
	}

	public Airplane Tokyo_Incheon_Large(String date , String time) {
		return new Airplane_Large(50, 30,date, time,"도쿄에서");
	}

	public Airplane Tokyo_Incheon_Medium(String date , String time) {
		return new Airplane_Medium(40, 20,date, time,"도쿄에서");
	}

	public Airplane Tokyo_Incheon_Small(String date , String time) {
		return new Airplane_Small(30, 10,date, time,"도쿄에서");
	}

	public Airplane Paris_Incheon_Large(String date , String time) {
		return new Airplane_Large(100, 80,date, time,"파리에서");
	}

	public Airplane Paris_Incheon_Medium(String date , String time) {
		return new Airplane_Medium(90, 70,date, time,"파리에서");
	}

	public Airplane Paris_Incheon_Small(String date , String time) {
		return new Airplane_Small(80, 60,date, time,"파리에서");
	}

	public Airplane Toronto_Incheon_Large(String date , String time) {
		return new Airplane_Large(120, 100,date, time,"토론토에서");
	}

	public Airplane Toronto_Incheon_Medium(String date , String time) {
		return new Airplane_Medium(110, 90,date, time,"토론토에서");
	}

	public Airplane Toronto_Incheon_Small(String date , String time) {
		return new Airplane_Small(100, 80,date, time,"토론토에서");
	}

	public Airplane London_Incheon_Large(String date , String time) {
		return new Airplane_Large(100, 80,date, time,"런던에서");
	}

	public Airplane London_Incheon_Medium(String date , String time) {
		return new Airplane_Medium(90, 70,date, time,"런던에서");
	}

	public Airplane London_Incheon_Small(String date , String time) {
		return new Airplane_Small(80, 60,date, time,"런던에서");
	}

}