class TelevisionExecutor {

    public static void main(String[] args) {

        boolean ref = Television.onOrOff();
        System.out.println("The Television is turned " + ref);
		
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		ref = Television.onOrOff();
		Television.increaseVolume();
		 ref = Television.onOrOff();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.decreaseVolume();
		ref = Television.onOrOff();
		Television.decreaseVolume();
		ref = Television.onOrOff();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
    }
}
