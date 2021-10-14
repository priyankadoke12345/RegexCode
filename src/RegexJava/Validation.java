package RegexJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public Scanner scanner;

    public Pattern pattern;
    public Matcher match;

    public Validation() {
        this.scanner = new Scanner(System.in);
    }

    public String validName() {
        boolean flag = true;
        String patternEx = "[A-Za-z]{3,}";
        pattern = Pattern.compile(patternEx);

        while (flag) {
            System.out.println("Please enter  name with First capital letter and minimum 3");
            String name = scanner.nextLine();
            Matcher matcher = pattern.matcher(name);
            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return name;
            }
        }
        return null;
    }
    public String EmailValidation()
    {
        boolean flag = true;
        String patternEx = "[A-Za-z]{3,}";
        pattern = Pattern.compile(patternEx);

        while (flag) {
            System.out.println("Please enter Valid Email");
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            System.out.println(12/0);
            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return email;


            }
        }
        return null;
    }
    public String NumberValidation()
    {
        boolean flag = true;
        String patternEx = "^(\\d{0,9}[\\s]?)?\\d{10}$";
        pattern = Pattern.compile(patternEx);

        while (flag) {
            System.out.println("Please enter Valid Email");
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            System.out.println(12/0);
            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return email;

            }
        }
        return null;

    }
    public String PasswordValidation(){

        boolean flag = true;
        String patternEx = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*d)(?=.*[@#$%^&-+=()]).{8,}$";
        pattern = Pattern.compile(patternEx);
        while (flag) {
            System.out.println("Please enter Valid Email");
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);

            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return email;

            }
        }
        return null;

    }
}





