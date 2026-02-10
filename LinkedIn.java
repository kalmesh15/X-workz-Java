class LinkedIn {
    public static void main(String[] args) {
        createAccount("Kalmesh Dyamannavar", "kalmesh@gmail.com", "Java Developer");
    }

    public static void createAccount(String name, String email, String profession) {
        System.out.println("LinkedIn Account Created for " + name);
        System.out.println("User email is " + email);
        System.out.println("User profession is " + profession);
    }
}
