class AirConditioner {

    static boolean isCooling;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
    static boolean onOrOff() {

        if (isCooling == false) {
            isCooling = true;
            System.out.println("The AC is turned on...");
        } else {
            isCooling = false;
            System.out.println("The AC is turned off...");
        }
        return isCooling;
		
	
	}
	static void increaseVolume(){
		if(isCooling){
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
		if(isCooling == true){
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