import java.util.Scanner;

public class CheckPassword {
    public static boolean check(String password) {
        if(password.length() < 12)
            return false;

        int nrDigits = 0;
        for(int i = 0; i < password.length(); ++i) {
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                ++nrDigits;
            }
        }
        if(nrDigits < 3)
            return  false;
        for(int i = 0; i < password.length(); ++i) {
            if(    !(password.charAt(i) >= '0' && password.charAt(i) <= '9' ||
                    password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' ||
                    password.charAt(i) >= 'a' && password.charAt(i) <= 'z')) {

                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        boolean running = true;
        String password = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti parola");
        while(running) {
            password = scanner.nextLine();
            if(check(password)){
                running = false;
            }
            else{
                System.out.println("Parola invalida, incercati din nou");
            }

        }
    }
}
