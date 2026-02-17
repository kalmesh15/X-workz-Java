class SwiggyExecutor {
	public static void main (String [] args ){
		String foodName = "Lassi";
		double price = Swiggy.search(foodName);
		System.out.println("The food "+foodName +" price is "+price); 
	
	}
}