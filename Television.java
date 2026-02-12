class Television {

    static boolean isOn;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
    static boolean onOrOff() {

        if (isOn == false) {
            isOn = true;
            System.out.println("The Television is turned on...");
        } else {
            isOn = false;
            System.out.println("The Television is turned off...");
        }
        return isOn;
    }
	static void increaseVolume(){
		if(isOn){
			if(currentVolume < maxVolume){
				currentVolume++;
				System.out.println("the current volume is "+currentVolume);
			}else{
				System.out.println("The mix volume is reached .....");
			}
			
		}else{
			System.out.println("Turn on the  TV...");
		}
	
	}
	static void decreaseVolume(){
		if(isOn){
			if( currentVolume > minVolume ){
				currentVolume--;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The min volume is reached .....");
			}
			
		}
		else{
			System.out.println("Turn on the TV...");
		}
	}
}
