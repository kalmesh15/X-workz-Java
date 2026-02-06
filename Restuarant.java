class Restuarant{
	public static void main (String [] args){
		String name="Udapi hotel";
		String owner="Kalmesh";
		String address="Mudhol";
		String branches []={"mudhol","majestic","hassan"};
		String managers [] ={"sagar","rahul","Pratik"};
		String menu[]={"Dosa","Idli","Puri","Pulao"};
		
		System.out .println("The Restuarant name is "+name);
		System.out.println("Owner of the Restuarant is "+owner);
		System.out.println("Address of the Restuarant is "+address);
		
		System.out.println("The branches of Restuarant are ");
		for(String branch:branches){
			System.out.println(branch);
		}
		System.out.println("The managers of Restuarant are ");
		for(String manager:managers){
			System.out.println(manager);
		}
		System.out.println("Items available in Restuarant are ");
		for(String foodItem:menu){
			System.out.println(foodItem);
		}
	}
}