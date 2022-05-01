import java.util.Locale;
import java.util.Scanner;

public class temperatureConversion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String degree = "";
        boolean isDegreeType = false;
        int temp;

        System.out.println("Please enter the temperature");
        temp = keyboard.nextInt();

        while (!isDegreeType) {
            System.out.println("Please enter F for Fahrenheit or C for Celsius");
            degree = keyboard.next();
            degree = degree.toUpperCase(Locale.ROOT);
            if (degree.equals("F") || degree.equals("C")) {
                isDegreeType = true;
            }
        }

        tempConversion(degree, temp);
    }

    public static void tempConversion(String d, int t) {
        int convertedTemp;

        if (d.equals("F")) {
            convertedTemp = (t - 32) * 5 / 9;
            System.out.println(t + d + " is " + convertedTemp + "C");
        } else {
            convertedTemp = (t * 5 / 9) + 32;
            System.out.println(t + d + " is " + convertedTemp + "F");
        }
    }
}
