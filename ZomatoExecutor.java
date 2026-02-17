class ZomatoExecutor {
	public static void main(String [] args){
		String foodName = "Burger";
		double price = Zomato.search(foodName);
		System.out.println("The food "+foodName +" price is "+price); 
	}

}