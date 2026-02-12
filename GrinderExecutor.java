class GrinderExecutor{

	public static void main(String [] g){
	
		boolean ref = Grinder.onOrOff();
		System.out.println("The Grinder is turned  "+ref);
		
		Grinder.increaseVolume();
		Grinder.increaseVolume();
		Grinder.increaseVolume();
		Grinder.increaseVolume();
		Grinder.increaseVolume();
		ref = Grinder.onOrOff();
		Grinder.increaseVolume();
		 ref = Grinder.onOrOff();
		Grinder.increaseVolume();
		Grinder.increaseVolume();
		Grinder.increaseVolume();
		Grinder.increaseVolume();
		Grinder.decreaseVolume();
		ref = Grinder.onOrOff();
		Grinder.decreaseVolume();
		ref = Grinder.onOrOff();
		Grinder.decreaseVolume();
		Grinder.decreaseVolume();
		Grinder.decreaseVolume();
		Grinder.decreaseVolume();
		Grinder.decreaseVolume();
		Grinder.decreaseVolume();
		Grinder.decreaseVolume();
		Grinder.decreaseVolume();
	}
}	