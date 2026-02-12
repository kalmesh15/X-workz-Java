class RefrigeratorExecutor {

    public static void main(String[] args) {

        boolean ref = Refrigerator.onOrOff();
        System.out.println("The Refrigerator is " + ref);
		
		Refrigerator.increaseVolume();
		Refrigerator.increaseVolume();
		Refrigerator.increaseVolume();
		Refrigerator.increaseVolume();
		Refrigerator.increaseVolume();
		ref = Refrigerator.onOrOff();
		Refrigerator.increaseVolume();
		 ref = Refrigerator.onOrOff();
		Refrigerator.increaseVolume();
		Refrigerator.increaseVolume();
		Refrigerator.increaseVolume();
		Refrigerator.increaseVolume();
		Refrigerator.decreaseVolume();
		ref = Refrigerator.onOrOff();
		Refrigerator.decreaseVolume();
		ref = Refrigerator.onOrOff();
		Refrigerator.decreaseVolume();
		Refrigerator.decreaseVolume();
		Refrigerator.decreaseVolume();
		Refrigerator.decreaseVolume();
		Refrigerator.decreaseVolume();
		Refrigerator.decreaseVolume();
		Refrigerator.decreaseVolume();
		Refrigerator.decreaseVolume();
    }
}
