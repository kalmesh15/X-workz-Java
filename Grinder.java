class Grinder{

	static boolean isConnected;
	
	static boolean onOrOff(){
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Grider is turned on....");
		}
		else {
			isConnected = false;
			System.out.println("The Grider is turned off.... ");
		}
		return isConnected;
	}
}