class MicrowaveExecutor {

    public static void main(String[] args) {

        boolean ref = Microwave.onOrOff();
        System.out.println("The Microwave is " + ref);
		
		Microwave.increaseVolume();
		Microwave.increaseVolume();
		Microwave.increaseVolume();
		Microwave.increaseVolume();
		Microwave.increaseVolume();
		ref = Microwave.onOrOff();
		Microwave.increaseVolume();
		 ref = Microwave.onOrOff();
		Microwave.increaseVolume();
		Microwave.increaseVolume();
		Microwave.increaseVolume();
		Microwave.increaseVolume();
		Microwave.decreaseVolume();
		ref = Microwave.onOrOff();
		Microwave.decreaseVolume();
		ref = Microwave.onOrOff();
		Microwave.decreaseVolume();
		Microwave.decreaseVolume();
		Microwave.decreaseVolume();
		Microwave.decreaseVolume();
		Microwave.decreaseVolume();
		Microwave.decreaseVolume();
		Microwave.decreaseVolume();
		Microwave.decreaseVolume();
    }
}
