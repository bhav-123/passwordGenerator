
    import java.util.Random;
    import java.util.Scanner;
    
    public class Password{
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
    
            System.out.print("Enter the desired password length: ");
            int passwordLength = sc.nextInt();
            sc.nextLine(); // Consume the newline character
    
            System.out.print("Enter the character set (e.g., 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#'): ");
            String characterSet = sc.nextLine();
    
            String password = generatePassword(passwordLength, characterSet);
            System.out.println("Generated Password: " + password);
        }
    
        public static String generatePassword(int length, String characterSet) {
            Random rand = new Random();
            StringBuilder password = new StringBuilder();
    
            for (int i = 0; i < length; i++) {
                int randomIndex = rand.nextInt(characterSet.length());
                password.append(characterSet.charAt(randomIndex));
            }
    
            return password.toString();
        }
    }
        

