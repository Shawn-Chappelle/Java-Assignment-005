import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

    public static double convertC2F(double celsius) {
        return (celsius * (9.0/5)) + 32.0;
    }

    public static double convertC2K(double celsius) {
        return celsius + 273.15;
    }

    public static double convertF2C(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    public static double convertF2K(double fahrenheit) {
        return convertC2K(convertF2C(fahrenheit));
    }
    /**
     *
     * convertF2K has an access modifier of public
     * convert F2K is an object as it is an instance of class TempConversion and does not state as a class
     * The return type is a double
     * The parameter requires a double
     * It returns using convertC2K by converting the fahrenheit to celsius with convertF2C
     *
     **/

    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }

    public static double convertK2F(double kelvin) {
        return convertC2F(convertK2C(kelvin));
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        /**
         *
         * The access modifier for getUnitChoice is public
         * getUnitChoice is an object as it does not declare as a class and is an instance of a class
         * The return type is String
         * It requires no parameter
         * It prints on several lines using four System.out.printf commands and returns the input in the next line
         * The format specifiers I believe are differentiated from others I have seen by the use of "s" and a "-"
         *
         *
         **/
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("Insert the desired temperature unit input and output using uppercase letters");

            switch (getUnitChoice()) {
                case "Q": System.exit(0);
                            break;
                case "CC":
                System.out.println(getTemp("Celsius") + "°C");
                break;

                case "FF":
                System.out.println(getTemp("Fahrenheit") + "°F");
                break;

                case "KK":
                    System.out.println(getTemp("Kelvin") + "K");
                    break;

                case "CF":
                    double userInputCF = getTemp("Celsius");
                    double systemOutputCF = convertC2F(userInputCF);
                    String inputUnitCF = "°C";
                    String outputUnitCF ="°F";
                    System.out.printf("Result %f%s is %f%s\n", userInputCF, inputUnitCF, systemOutputCF, outputUnitCF);
                    break;

                case "FC":
                    double userInputFC = getTemp("Fahrenheit");
                    double systemOutputFC = convertF2C(userInputFC);
                    String inputUnitFC = "°F";
                    String outputUnitFC ="°C";
                    System.out.printf("Result %f%s is %f%s\n", userInputFC, inputUnitFC, systemOutputFC, outputUnitFC);
                    break;

                case "FK":
                    double userInputFK = getTemp("Fahrenheit");
                    double systemOutputFK = convertF2K(userInputFK);
                    String inputUnitFK = "°F";
                    String outputUnitFK ="K";
                    System.out.printf("Result %f%s is %f%s\n", userInputFK, inputUnitFK, systemOutputFK, outputUnitFK);
                    break;

                case "CK":
                    double userInputCK = getTemp("Celsius");
                    double systemOutputCK = convertC2K(userInputCK);
                    String inputUnitCK = "°C";
                    String outputUnitCK ="K";
                    System.out.printf("Result %f%s is %f%s\n", userInputCK, inputUnitCK, systemOutputCK, outputUnitCK);
                    break;

                case "KF":
                    double userInputKF = getTemp("Kelvin");
                    double systemOutputKF = convertK2F(userInputKF);
                    String inputUnitKF = "K";
                    String outputUnitKF ="°F";
                    System.out.printf("Result %f%s is %f%s\n", userInputKF, inputUnitKF, systemOutputKF, outputUnitKF);
                    break;

                case "KC":
                    double userInputKC = getTemp("Kelvin");
                    double systemOutputKC = convertK2C(userInputKC);
                    String inputUnitKC = "K";
                    String outputUnitKC ="°C";
                    System.out.printf("Result %f%s is %f%s\n", userInputKC, inputUnitKC, systemOutputKC, outputUnitKC);
                    break;

            }
                        }

            }


        }