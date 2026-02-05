class PassportUserRegistration{
	public static void main(String [] args){
		
		
		System.out.println("USER REGISTRATION :");
		System.out.println("The DCDR location is "+dcdrLocation);
		System.out.println("Email Id is "+email);
		System.out.println("Email is same for login "+emailloginsame);
		System.out.println("The user name is "+givenName);
		System.out.println("Password is "+password);
		System.out.println("Registration Authentication Method is "+registrationAuthMethod);
		System.out.println("The user Id is "+userId); 
		
	}
	static  int dcdrLocation=5;
	static	String email ="kalmeshdyamannavar@gmail.com";
	static	boolean emailloginsame =true;
	static	String givenName="Kalmesh Mallappa Dyamannavar";
	static	String password ="KalmeshKd@123";
	static	String registrationAuthMethod ="PASSWORD";
	static  String userId ="kalmeshdyamannavar@gmail";
		
	
}
//local variables :local variables must be initialised inside the same method where the variables declares.
//Global variables :  non-static variables cannot be referenced from a static methods
