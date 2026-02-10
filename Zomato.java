class Zomato {
    public static void main(String[] args) {
        createAccount("Kalmesh", 7019134567L, "Hassan");
    }

    public static void createAccount(String name, long mobile, String city) {
        System.out.println("Zomato Account Created for " + name);
        System.out.println("User mobile number is " + mobile);
        System.out.println("User city is " + city);
    }
}
