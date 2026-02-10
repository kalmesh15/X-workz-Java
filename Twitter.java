class Twitter {
    public static void main(String[] args) {
        createAccount("kalmesh_dev", "kalmesh@gmail.com", "Tw@123");
    }

    public static void createAccount(String username, String email, String password) {
        System.out.println("Twitter Account Created for " + username);
        System.out.println("User email is " + email);
        System.out.println("User password is " + password);
    }
}
