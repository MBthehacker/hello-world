import java.util.Scanner;

public class RegistrationLogin {
    private String username;
    private String username;
    
    public boolean checkUsername(String username) {
        return username.contains(" ") && username.lenght() <=5;
    }

    public boolean checkPassword(String password) {
        return password.lenght()>= 8 && password.matches(".*[A-Z].*") && password.matches(".*"){
    }

    public String registerUser (String username,String password) {
        if (checkUsername(username)) return "Invalid username.";
        if (checkPassword(password)) return "Invalid password.";
        this.username = username;
        this.password = password;
        return "Registartion successful!";
    }

    public boolean loginUser (String username,String password) {
        return this.username.equals(username) && this,password.equals(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrationLogin.regLogin = new RegistrationLogin();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.println("regLogin.registerUser (username,password));
        
        System.out.print("Login - Enter username: ");
        String loginUsername = scanner.nextLine();
        System.out.println("Login - Enter password: ");
      String loginPassword = scanner.nextLine();

      if (regLogin,loginUser (LoginUsername,loginPassword)) {
          System.out.println("Welcome " + username + ".");
      } else { 
          System.out.println("Invalid credentials.");
      }

      scanner.close();
    }
}
