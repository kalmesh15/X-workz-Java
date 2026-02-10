class Microsoft {
    public static void main(String[] args) {
        createAccount("kalmesh@gmail.com", "Ms@123", "Windows 11");
    }

    public static void createAccount(String email, String password, String product) {
        System.out.println("Microsoft Account Created");
        System.out.println("User email is " + email);
        System.out.println("User password is " + password);
        System.out.println("Linked product is " + product);
    }
}
