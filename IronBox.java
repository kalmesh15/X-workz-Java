class IronBox {

    static boolean isHeating;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
    static boolean onOrOff() {

        if (isHeating == false) {
            isHeating = true;
            System.out.println("The Iron Box is heating...");
        } else {
            isHeating = false;
            System.out.println("The Iron Box is turned off...");
        }
        return isHeating;
    }
	static void increaseVolume(){
		if(isHeating){
			if(currentVolume < maxVolume){
				currentVolume++;
				System.out.println("the current volume is "+currentVolume);
			}else{
				System.out.println("The mix volume is reached .....");
			}
			
		}else{
			System.out.println("Turn on the  Iron box switch...");
		}
	
	}
	static void decreaseVolume(){
		if(isHeating){
			if( currentVolume > minVolume ){
				currentVolume--;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The min volume is reached .....");
			}
			
		}
		else{
			System.out.println("Turn on the Iron box switch...");
		}
	}
}
