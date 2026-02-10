class Netflix {
    public static void main(String[] args) {
        createAccount("kalmesh@gmail.com", "Net@123", "Premium");
    }

    public static void createAccount(String email, String password, String plan) {
        System.out.println("Netflix Account Created");
        System.out.println("User email is " + email);
        System.out.println("User password is " + password);
        System.out.println("Selected plan is " + plan);
    }
}
