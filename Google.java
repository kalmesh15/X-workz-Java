class Google {
    public static void main(String[] args) {
        createAccount("kalmesh@gmail.com", "Google@123", "India");
    }

    public static void createAccount(String email, String password, String country) {
        System.out.println("Google Account Created");
        System.out.println("User email is " + email);
        System.out.println("User password is " + password);
        System.out.println("User country is " + country);
    }
}
