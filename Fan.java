class Fan {

    static boolean isRunning;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
    static boolean onOrOff() {

        if (isRunning == false) {
            isRunning = true;
            System.out.println("The Fan is turned on...");
        } else {
            isRunning = false;
            System.out.println("The Fan is turned off...");
        }
        return isRunning;
    }
	static void increaseVolume(){
		if(isRunning){
			if(currentVolume < maxVolume){
				currentVolume++;
				System.out.println("the current volume is "+currentVolume);
			}else{
				System.out.println("The mix volume is reached .....");
			}
			
		}else{
			System.out.println("Turn on the  AC...");
		}
	
	}
	static void decreaseVolume(){
		if(isRunning){
			if( currentVolume > minVolume ){
				currentVolume--;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The min volume is reached .....");
			}
			
		}
		else{
			System.out.println("Turn on the Air Conditioner...");
		}
	}
}
