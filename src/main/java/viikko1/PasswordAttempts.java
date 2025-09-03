package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        
        int x = 0;
        for(String s : tries) {
            if (x < 3 && s == "java123") 
                return "Tervetuloa!";
                ++x;
            }

        return "Liian monta virheellistä yritystä.";  
    }
}
