class Grinder{

	static boolean isConnected;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
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
	static void increaseVolume(){
		if(isConnected){
			if(currentVolume < maxVolume){
				currentVolume++;
				System.out.println("the current volume is "+currentVolume);
			}else{
				System.out.println("The mix volume is reached .....");
			}
			
		}else{
			System.out.println("Turn on the  Grinder...");
		}
	
	}
	static void decreaseVolume(){
		if(isConnected){
			if( currentVolume > minVolume ){
				currentVolume--;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The min volume is reached .....");
			}
			
		}
		else{
			System.out.println("Turn on the Grinder...");
		}
	}
}