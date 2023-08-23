package strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "2017-07-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
        String string1 = "July 25, 2017";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date1 = LocalDate.parse(string1, formatter);

        System.out.println(date1);
	}

}
