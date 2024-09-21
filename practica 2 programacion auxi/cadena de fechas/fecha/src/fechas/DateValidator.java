package fechas;
import java.util.HashMap;
import java.util.Map;

public class DateValidator {
    private static final Map<String, Integer> daysInMonth = new HashMap<>();

    static {
        daysInMonth.put("enero", 31);
        daysInMonth.put("febrero", 28); 
        daysInMonth.put("marzo", 31);
        daysInMonth.put("abril", 30);
        daysInMonth.put("mayo", 31);
        daysInMonth.put("junio", 30);
        daysInMonth.put("julio", 31);
        daysInMonth.put("agosto", 31);
        daysInMonth.put("septiembre", 30);
        daysInMonth.put("octubre", 31);
        daysInMonth.put("noviembre", 30);
        daysInMonth.put("diciembre", 31);
    }

    public static boolean isValidDate(int day, String month, int year) {
        if (!daysInMonth.containsKey(month.toLowerCase())) {
            return false;
        }
        int maxDays = daysInMonth.get(month.toLowerCase());
        if (month.equalsIgnoreCase("febrero") && isLeapYear(year)) {
            maxDays = 29;
        }
        return day > 0 && day <= maxDays;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
