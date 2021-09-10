public class PasswordPolicy {
    public static void main(String[] args){

        String testPassWord = "Hallo";

        System.out.println("Das gewählte Passwort lautet: " + testPassWord);
        System.out.println("Ist das Password lang genug? " + checkPasswordLength(testPassWord));
        System.out.println("Enthält das Password Ziffern? " + checkPasswordContainsDigits(testPassWord));


    }

    public static boolean checkPasswordLength(String password){
        if (password.length()<6) return false;
        else return true;
    }

    public static boolean checkPasswordContainsDigits(String password){
        return password.matches(".*[0-9].*");
    }
}
