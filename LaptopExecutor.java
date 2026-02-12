class LaptopExecutor {

    public static void main(String[] args) {

        boolean ref = Laptop.onOrOff();
        System.out.println("The Laptop is " + ref);
		
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		ref = Laptop.onOrOff();
		Laptop.increaseVolume();
		 ref = Laptop.onOrOff();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.increaseVolume();
		Laptop.decreaseVolume();
		ref = Laptop.onOrOff();
		Laptop.decreaseVolume();
		ref = Laptop.onOrOff();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
    }
}
