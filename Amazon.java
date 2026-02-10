class Amazon {
    public static void main(String[] args) {
        createAccount("Kalmesh", "kalmesh@gmail.com", "Ama@123", 7019134567L);
    }

    public static void createAccount(String name, String email, String password, long mobile) {
        System.out.println("Amazon Account Created for " + name);
		System.out.println("User email is  " + email);
		System.out.println("User password is " + password);
		System.out.println("User mobile number is " + mobile);
		
    }
}
