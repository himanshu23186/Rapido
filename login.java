public class login {
    public static void main(String[] args) {
        String user = "admin";
        String pass = "1234567";
        String enteredUser = "admin";
        String enteredPass = "1234567";

        boolean userMatch = user.equals(enteredUser);
        boolean passMatch = pass.equals(enteredPass);

        if (userMatch && passMatch) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        System.out.println("User match: " + userMatch);
        System.out.println("Password match: " + passMatch);
    }
}
