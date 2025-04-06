// Custom exception class for invalid time format
class TimeFormatException extends Exception {
    public TimeFormatException(String message) {
        super(message);
    }
}

// Class to validate time format
class TimeValidator {
    static void validateTime(String time) throws TimeFormatException {
        if (!time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
            throw new TimeFormatException("Invalid time format. Use HH:mm (24-hour format).");
        }
        System.out.println("Valid time: " + time);
    }
}

public class TimeValidationTest {
    public static void main(String[] args) {
        String[] testTimes = {"23:59", "12:30", "24:00", "10:60", "09:15", "25:99"};
        for (String time : testTimes) {
            try {
                TimeValidator.validateTime(time);
            } catch (TimeFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}