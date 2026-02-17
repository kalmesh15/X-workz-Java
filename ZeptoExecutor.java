class ZeptoExecutor {
	public static void main (String [] args ){
		String foodName = "Egg Puff";
		double price = Zepto.search(foodName);
		System.out.println("The food "+foodName +" price is "+price); 
	
	}
}