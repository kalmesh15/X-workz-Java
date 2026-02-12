class Laptop {

    static boolean isPowered;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
    static boolean onOrOff() {

        if (isPowered == false) {
            isPowered = true;
            System.out.println("The Laptop is starting...");
        } else {
            isPowered = false;
            System.out.println("The Laptop is shutting down...");
        }
        return isPowered;
    }
	static void increaseVolume(){
		if(isPowered){
			if(currentVolume < maxVolume){
				currentVolume++;
				System.out.println("the current volume is "+currentVolume);
			}else{
				System.out.println("The mix volume is reached .....");
			}
			
		}else{
			System.out.println("Turn on the  Laptop...");
		}
	
	}
	static void decreaseVolume(){
		if(isPowered){
			if( currentVolume > minVolume ){
				currentVolume--;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The min volume is reached .....");
			}
			
		}
		else{
			System.out.println("Turn on the Laptop...");
		}
	}
}
