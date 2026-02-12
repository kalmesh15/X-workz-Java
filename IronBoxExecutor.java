class IronBoxExecutor {

    public static void main(String[] args) {

        boolean ref = IronBox.onOrOff();
        System.out.println("The Iron Box is " + ref);
		
		IronBox.increaseVolume();
		IronBox.increaseVolume();
		IronBox.increaseVolume();
		IronBox.increaseVolume();
		IronBox.increaseVolume();
		ref = IronBox.onOrOff();
		IronBox.increaseVolume();
		 ref = IronBox.onOrOff();
		IronBox.increaseVolume();
		IronBox.increaseVolume();
		IronBox.increaseVolume();
		IronBox.increaseVolume();
		IronBox.decreaseVolume();
		ref = IronBox.onOrOff();
		IronBox.decreaseVolume();
		ref = IronBox.onOrOff();
		IronBox.decreaseVolume();
		IronBox.decreaseVolume();
		IronBox.decreaseVolume();
		IronBox.decreaseVolume();
		IronBox.decreaseVolume();
		IronBox.decreaseVolume();
		IronBox.decreaseVolume();
		IronBox.decreaseVolume();
    }
}
