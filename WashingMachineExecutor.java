class WashingMachineExecutor {

    public static void main(String[] args) {

        boolean ref = WashingMachine.onOrOff();
        System.out.println("The Washing Machine is " + ref);
		
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		ref = WashingMachine.onOrOff();
		WashingMachine.increaseVolume();
		 ref = WashingMachine.onOrOff();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.increaseVolume();
		WashingMachine.decreaseVolume();
		ref = WashingMachine.onOrOff();
		WashingMachine.decreaseVolume();
		ref = WashingMachine.onOrOff();
		WashingMachine.decreaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.decreaseVolume();
		WashingMachine.decreaseVolume();
    }
}
