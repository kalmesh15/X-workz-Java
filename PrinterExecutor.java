class PrinterExecutor {

    public static void main(String[] args) {

        boolean ref = Printer.onOrOff();
        System.out.println("The Printer is " + ref);
		
		Printer.increaseVolume();
		Printer.increaseVolume();
		Printer.increaseVolume();
		Printer.increaseVolume();
		Printer.increaseVolume();
		ref = Printer.onOrOff();
		Printer.increaseVolume();
		 ref = Printer.onOrOff();
		Printer.increaseVolume();
		Printer.increaseVolume();
		Printer.increaseVolume();
		Printer.increaseVolume();
		Printer.decreaseVolume();
		ref = Printer.onOrOff();
		Printer.decreaseVolume();
		ref = Printer.onOrOff();
		Printer.decreaseVolume();
		Printer.decreaseVolume();
		Printer.decreaseVolume();
		Printer.decreaseVolume();
		Printer.decreaseVolume();
		Printer.decreaseVolume();
		Printer.decreaseVolume();
		Printer.decreaseVolume();
    }
}
