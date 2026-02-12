class FanExecutor {

    public static void main(String[] args) {

        boolean ref = Fan.onOrOff();
        System.out.println("The Fan is turned " + ref);
		Fan.increaseVolume();
		Fan.increaseVolume();
		Fan.increaseVolume();
		Fan.increaseVolume();
		Fan.increaseVolume();
		ref = Fan.onOrOff();
		Fan.increaseVolume();
		 ref = Fan.onOrOff();
		Fan.increaseVolume();
		Fan.increaseVolume();
		Fan.increaseVolume();
		Fan.increaseVolume();
		Fan.decreaseVolume();
		ref = Fan.onOrOff();
		Fan.decreaseVolume();
		ref = Fan.onOrOff();
		Fan.decreaseVolume();
		Fan.decreaseVolume();
		Fan.decreaseVolume();
		Fan.decreaseVolume();
		Fan.decreaseVolume();
		Fan.decreaseVolume();
		Fan.decreaseVolume();
		Fan.decreaseVolume();
    }
}
