class Flipkart {
    public static void main(String[] args) {
        createAccount("Kalmesh", 7019134567L, "Flip@123");
    }

    public static void createAccount(String name, long mobile, String password) {
        System.out.println("Flipkart Account Created for " + name);
        System.out.println("User mobile number is " + mobile);
        System.out.println("User password is " + password);
    }
}
