class AirConditionerExecutor {

    public static void main(String[] args) {

        boolean ref = AirConditioner.onOrOff();
        System.out.println("The AC is turned " + ref);
		AirConditioner.increaseVolume();
		AirConditioner.increaseVolume();
		AirConditioner.increaseVolume();
		AirConditioner.increaseVolume();
		AirConditioner.increaseVolume();
		ref = AirConditioner.onOrOff();
		AirConditioner.increaseVolume();
		 ref = AirConditioner.onOrOff();
		AirConditioner.increaseVolume();
		AirConditioner.increaseVolume();
		AirConditioner.increaseVolume();
		AirConditioner.increaseVolume();
		AirConditioner.decreaseVolume();
		ref = AirConditioner.onOrOff();
		AirConditioner.decreaseVolume();
		ref = AirConditioner.onOrOff();
		AirConditioner.decreaseVolume();
		AirConditioner.decreaseVolume();
		AirConditioner.decreaseVolume();
		AirConditioner.decreaseVolume();
		AirConditioner.decreaseVolume();
		AirConditioner.decreaseVolume();
		AirConditioner.decreaseVolume();
		AirConditioner.decreaseVolume();
    }
}
