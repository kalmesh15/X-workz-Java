class Speaker {

    static boolean isPlaying;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
    static boolean onOrOff() {

        if (isPlaying == false) {
            isPlaying = true;
            System.out.println("The Speaker is playing...");
        } else {
            isPlaying = false;
            System.out.println("The Speaker is stopped...");
        }
        return isPlaying;
    }
	public static void increaseVolume(){
		if (isPlaying == true){
			if (currentVolume < maxVolume){
				
				currentVolume++;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The max volume is reached .....");
			}	
		}
		else{
			System.out.println("First on the speaker");
		}
	}
	static void decreaseVolume(){
		
		if(isPlaying == true){
			if( currentVolume > minVolume ){
				currentVolume--;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The min volume is reached .....");
			}
			
		}
		else{
			System.out.println("Turn on the speaker...");
		}
	}
}
