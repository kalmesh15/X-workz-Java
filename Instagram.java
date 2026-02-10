class Instagram {
    public static void main(String[] args) {
        createAccount("kalmesh_01", "kalmesh@gmail.com", "Insta@123");
    }

    public static void createAccount(String username, String email, String password) {
        System.out.println("Instagram Account Created for " + username);
        System.out.println("User email is " + email);
        System.out.println("User password is " + password);
    }
}
