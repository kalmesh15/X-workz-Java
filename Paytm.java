class Paytm {
    public static void main(String[] args) {
        createAccount("Kalmesh", 7019134567L, 5000.50);
    }

    public static void createAccount(String name, long mobile, double balance) {
        System.out.println("Paytm Account Created for " + name);
        System.out.println("User mobile number is " + mobile);
        System.out.println("Account balance is " + balance);
    }
}
