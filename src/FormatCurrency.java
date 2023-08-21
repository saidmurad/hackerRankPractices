import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatCurrency {
    public static void main(String[] args) {
        double number = 1234.56789;

        // Get the NumberFormat instance for the default Locale (you can also specify a specific Locale)
        NumberFormat chinaNumberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        // Set the maximum number of fraction digits to 2
        chinaNumberFormat.setMaximumFractionDigits(2);

        // Format the number
        String formattedNumber = chinaNumberFormat.format(number);

        // Print the formatted number
        System.out.println("Formatted Number: " + formattedNumber);

        String customFormatPattern = "Rs. ###,###.00";

        // Create a DecimalFormat object with the custom format pattern
        DecimalFormat decimalFormat = new DecimalFormat(customFormatPattern);

        // Format the number
        String formattedNumber2 = decimalFormat.format(number);

        // Print the formatted number
        System.out.println("Formatted Number: " + formattedNumber2);
    }
}
