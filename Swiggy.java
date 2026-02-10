class Swiggy {
    public static void main(String[] args) {
        createAccount("Kalmesh", "kalmesh@gmail.com", 7019134567L);
    }

    public static void createAccount(String name, String email, long mobile) {
        System.out.println("Swiggy Account Created for " + name);
        System.out.println("User email is " + email);
        System.out.println("User mobile number is " + mobile);
    }
}
