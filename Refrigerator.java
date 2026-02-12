class Refrigerator {

    static boolean isActive;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
    static boolean onOrOff() {

        if (isActive == false) {
            isActive = true;
            System.out.println("The Refrigerator is cooling...");
        } else {
            isActive = false;
            System.out.println("The Refrigerator is turned off...");
        }
        return isActive;
    }
	static void increaseVolume(){
		if(isActive){
			if(currentVolume < maxVolume){
				currentVolume++;
				System.out.println("the current volume is "+currentVolume);
			}else{
				System.out.println("The mix volume is reached .....");
			}
			
		}else{
			System.out.println("Turn on the  Refrigerator...");
		}
	
	}
	static void decreaseVolume(){
		if(isActive){
			if( currentVolume > minVolume ){
				currentVolume--;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The min volume is reached .....");
			}
			
		}
		else{
			System.out.println("Turn on the Refrigerator...");
		}
	}
}
