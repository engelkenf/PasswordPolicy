public class PasswordPolicy {
    public static void main(String[] args){

        String testPassWord = "Test123!";

        System.out.println("Das gewählte Passwort lautet: " + testPassWord);
        System.out.println("Ist das Password lang genug? " + checkPasswordLength(testPassWord));
        System.out.println("Enthält das Password Ziffern? " + checkPasswordContainsDigits(testPassWord));
        System.out.println("Sind Großbuchstaben enthalten? " + checkPasswordContainsCapitalLetters(testPassWord));


    }

    public static boolean checkPasswordLength(String password){
        if (password.length()<6) return false;
        else return true;
    }

    public static boolean checkPasswordContainsDigits(String password){
        return password.matches(".*[0-9].*");
    }

    public static boolean checkPasswordContainsCapitalLetters(String password){
        return password.matches(".*[A-Z].*");
    }
}
