import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {
    public static void main(String[] args) {
        String inputString = "The price is $5.99";
        Pattern integerPattern = Pattern.compile("\\d+");
        Pattern floatPattern = Pattern.compile("\\d+\\.\\d+");
        Pattern doublePattern = Pattern.compile("\\d+\\.\\d+(?:E-?\\d+)?");

        Matcher integerMatcher = integerPattern.matcher(inputString);
        Matcher floatMatcher = floatPattern.matcher(inputString);
        Matcher doubleMatcher = doublePattern.matcher(inputString);

        if (integerMatcher.find()) {
            int intValue = Integer.parseInt(integerMatcher.group());
            System.out.println("Integer value: " + intValue);
        }

        if (floatMatcher.find()) {
            float floatValue = Float.parseFloat(floatMatcher.group());
            System.out.println("Float value: " + floatValue);
        }

        if (doubleMatcher.find()) {
            double doubleValue = Double.parseDouble(doubleMatcher.group());
            System.out.println("Double value: " + doubleValue);
        }
    }
}