class Facebook {
    public static void main(String[] args) {
        createAccount("Kalmesh Dyamannavar", "kalmesh@gmail.com", "Fb@123", "Male");
    }

    public static void createAccount(String name, String email, String password, String gender) {
        System.out.println("Facebook Account Created for " + name);
        System.out.println("User email is " + email);
        System.out.println("User password is " + password);
        System.out.println("User gender is " + gender);
    }
}
