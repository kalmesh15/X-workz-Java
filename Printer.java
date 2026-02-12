class Printer {

    static boolean isPrinting;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume;
    static boolean onOrOff() {

        if (isPrinting == false) {
            isPrinting = true;
            System.out.println("The Printer is ready...");
        } else {
            isPrinting = false;
            System.out.println("The Printer is turned off...");
        }
        return isPrinting;
    }
	static void increaseVolume(){
		if(isPrinting){
			if(currentVolume < maxVolume){
				currentVolume++;
				System.out.println("the current volume is "+currentVolume);
			}else{
				System.out.println("The mix volume is reached .....");
			}
			
		}else{
			System.out.println("Turn on the Printer ...");
		}
	
	}
	static void decreaseVolume(){
		if(isPrinting){
			if( currentVolume > minVolume ){
				currentVolume--;
				System.out.println("the current volume is "+currentVolume);
			}
			else{
				System.out.println("The min volume is reached .....");
			}
			
		}
		else{
			System.out.println("Turn on the Printer...");
		}
	}
}
