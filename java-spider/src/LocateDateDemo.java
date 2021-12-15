import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocateDateDemo {

	public static void main(String[] args) {
		LocalDate d1= LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2=LocalDate.of(2020, 04, 14);
		System.out.println(d2);
		
		LocalDate d3=LocalDate.parse("2017-02-19");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(10));
		System.out.println(d2.plus(2, ChronoUnit.WEEKS));
		System.out.println(d2.plus(2, ChronoUnit.MONTHS));
		System.out.println(d2.minus(1, ChronoUnit.YEARS));
		
		System.out.println(d2.getDayOfWeek());
		System.out.println(d1.isLeapYear());
		
		
		//Code for calculating Age
		
		Period period=Period.between(d3, d2);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		
	}

}
