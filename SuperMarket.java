class SuperMarket {

    public static void main(String[] args) {

        String[] groceries = {"Rice","Wheat","Sugar","Salt","Oil","Dal","Tea","Coffee","Spices","Flour","Jaggery","Rava","Poha","Oats","Cornflour","Vermicelli","Chilli Powder","Turmeric","Pepper","Mustard","Cumin","Ghee","Honey","Pickle","Sauce"};
        String[] fruits = {"Apple","Banana","Orange","Mango","Grapes","Pineapple","Papaya","Guava","Watermelon","Muskmelon","Pomegranate","Kiwi","Pear","Plum","Peach","Cherry","Strawberry","Blueberry","Raspberry","Lemon","Lime","Avocado","Fig","Date","Custard Apple"};
        String[] vegetables = {"Potato","Tomato","Onion","Carrot","Beans","Cabbage","Cauliflower","Brinjal","Ladyfinger","Spinach","Radish","Beetroot","Pumpkin","Bottle Gourd","Bitter Gourd","Ridge Gourd","Cucumber","Capsicum","Green Chilli","Garlic","Ginger","Peas","Sweet Corn","Drumstick","Turnip"};
        String[] beverages = {"Water","Soda","Juice","Cola","Lemonade","Milk","Buttermilk", "Cold Coffee","Green Tea","Black Tea","Energy Drink","Milkshake","Smoothie","Iced Tea","Mango Drink","Orange Drink","Apple Juice","Grape Juice","Coconut Water","Flavoured Milk","Protein Shake","Mocktail","Herbal Tea","Kombucha","Electrolyte Drink" };
        String[] snacks = {"Chips","Biscuits","Cookies","Namkeen","Mixture","Popcorn","Chocolates","Candies","Wafers","Peanuts","Cashews","Almonds","Pistachios","Raisins","Murukku","Samosa","Kachori","Bread Toast","Khari","Cupcake","Brownie","Donut","Cake","Energy Bar","Protein Bar"};
        String[] dairy = {"Milk","Curd","Butter","Cheese","Paneer","Cream","Yogurt","Flavoured Milk","Ghee","Condensed Milk","Ice Cream","Milk Powder","Whey","Sour Cream","Custard","Cheese Slice","Mozzarella","Cheddar","Feta","Ricotta","Milkshake","Buttermilk","Lassi","Frozen Yogurt","Greek Yogurt"};
        String[] bakery = {"Bread","Brown Bread","Buns","Pav","Croissant","Muffin","Cake","Pastry","Toast","Rusk","Bagel","Donut","Cupcake","Brownie","Pizza Base","Burger Bun","Garlic Bread","Pita Bread","Naan","Kulcha","Cookies","Biscuits","Rolls","Fruit Cake","Plum Cake"};
        String[] meat = {"Chicken","Mutton","Fish","Prawns","Crab","Lobster","Eggs","Chicken Breast","Chicken Wings","Chicken Leg","Minced Meat","Sausage","Salami","Ham","Bacon","Turkey","Duck","Goat Meat","Fish Fillet","Tuna","Salmon","Sardine","Pomfret","Rohu","Catla"};
        String[] frozenFoods = {"Frozen Peas","Frozen Corn","Frozen Paratha","Frozen Pizza","Frozen Burger","Frozen Nuggets","Frozen Fries","Frozen Fish","Frozen Chicken","Frozen Momos","Frozen Spring Roll","Frozen Idli","Frozen Dosa","Frozen Samosa","Frozen Paneer","Frozen Veg Mix","Frozen Fruit","Frozen Meat","Frozen Dessert","Frozen Ice Cream","Frozen Kulfi","Frozen Popsicle","Frozen Cutlet","Frozen Kebab","Frozen Waffle"};
        String[] personalCare = {"Soap","Shampoo","Conditioner","Toothpaste","Toothbrush","Face Wash","Face Cream","Body Lotion","Deodorant","Perfume","Hair Oil","Hair Gel","Face Mask","Face Scrub","Hand Wash","Sanitizer","Shaving Cream","Razor","After Shave","Talcum Powder","Lip Balm","Sunscreen","Makeup Kit","Hair Serum","Body Spray"};
        String[] cleaning = {"Detergent","Soap Bar","Floor Cleaner","Dish Wash","Toilet Cleaner","Glass Cleaner","Room Freshener","Phenyl","Bleach","Disinfectant","Scrubber","Sponge","Broom","Mop","Dustpan","Liquid Soap","Stain Remover","Fabric Softener","Hand Gloves","Trash Bag","Paper Towels","Wet Wipes","Dry Wipes","Cleaning Brush","Air Freshener"};
        String[] stationery = {"Pen","Pencil","Eraser","Sharpener","Notebook","Diary","Marker","Highlighter","Stapler","Staples","File","Folder","Paper Clips","Glue","Tape","Scale","Compass","Sketch Pen","Crayons","Color Pencils","Whiteboard Marker","Sticky Notes","Calculator","Clipboard","Ink Refill"};
        String[] electronics = {"Mobile","Laptop","Tablet","Charger","Power Bank","Headphones","Earphones","Bluetooth Speaker","Smart Watch","TV","Remote","Keyboard","Mouse","Monitor","Printer","Scanner","Webcam","Router","Modem","Hard Disk","Pendrive","Memory Card","UPS","Extension Board","Smart Bulb"};
        String[] kitchen = {"Plate","Bowl","Spoon","Fork","Knife","Pressure Cooker","Pan","Kadai","Tawa","Mixer","Grinder","Blender","Gas Stove","Induction","Toaster","Microwave","Oven","Rice Cooker","Electric Kettle","Lunch Box","Water Bottle","Thermos","Cutting Board","Peeler","Strain"};
        String[] baby = {"Diapers","Baby Soap","Baby Shampoo","Baby Oil","Baby Powder","Baby Lotion","Feeding Bottle","Baby Food","Baby Wipes","Baby Cream","Baby Toothbrush","Baby Toothpaste","Baby Napkin","Baby Blanket","Baby Pillow","Baby Towel","Baby Clothes","Baby Shoes","Baby Bib","Baby Carrier","Baby Walker","Baby Cradle","Baby Swing","Baby Chair","Baby Monitor"};
        String[] pet = {"Dog Food","Cat Food","Pet Shampoo","Pet Soap","Pet Collar","Pet Leash","Pet Toy","Pet Bed","Pet Bowl","Pet Treats","Pet Brush","Pet Comb","Pet Nail Cutter","Pet Vitamins","Pet Medicine","Pet Litter","Pet Cage","Pet Carrier","Pet Clothes","Pet Training Pad","Pet Food Container","Pet Harness","Pet Muzzle","Pet Mat","Pet Blanket"};
        String[] cosmetics = {"Lipstick","Foundation","Concealer","Compact","Blush","Mascara","Eyeliner","Eyeshadow","Lip Gloss","Lip Liner","Nail Polish","Makeup Remover","Primer","Highlighter","Bronzer","BB Cream","CC Cream","Makeup Brush","Makeup Sponge","Face Powder","Setting Spray","Kajal","Eyebrow Pencil","False Lashes","Makeup Kit"};
        String[] clothing = {"Shirt","T-Shirt","Jeans","Trousers","Shorts","Kurta","Saree","Salwar","Leggings","Skirt","Dress","Jacket","Sweater","Hoodie","Coat","Blazer","Nightwear","Innerwear","Socks","Scarf","Cap","Hat","Belt","Tie","Raincoat"};
        String[] footwear = {"Shoes","Sandals","Slippers","Sneakers","Boots","Heels","Flats","Loafers","Moccasins","Flip Flops","Running Shoes","Formal Shoes","Casual Shoes","Sports Shoes","School Shoes","Office Shoes","Leather Shoes","Canvas Shoes","Slip-ons","Crocs","Barefoot Shoes","Ankle Boots","High Boots","Rain Shoes","Clogs"};
        String[] books = {"Novel","Textbook","Comic","Magazine","Newspaper","Biography","Autobiography","Reference Book","Story Book","Poetry Book","Self-help Book","Cookbook","Travel Book","Science Book","Math Book","History Book","Geography Book","Dictionary","Thesaurus","Exam Guide","Workbook","Coloring Book","Activity Book","Notebook","Journal"};
		
		
		System.out.println("Groceries are ");
		for(String grocery:groceries){
			
			System.out.println(grocery);
		}
		System.out.println("................................................................................");
		System.out.println("Fruits are ");
		for(String fruit:fruits){
			
			System.out.println(fruit);
		}
		System.out.println("................................................................................");
		System.out.println("Vegetables are ");
		for(String vegetable:vegetables){
			
			System.out.println(vegetable);
		}
		System.out.println("................................................................................");
		System.out.println("Snacks are ");
		for(String snackss:snacks){
			
			System.out.println(snackss);
		}
		System.out.println("................................................................................");
		System.out.println("Dairy Items are ");
		for(String dairyItem:dairy){
			
			System.out.println(dairyItem);
		}
		System.out.println("Bakery items  are ");
		for(String bakeryItem:bakery){
			
			System.out.println(bakeryItem);
		}
		System.out.println("................................................................................");
		System.out.println("Meat types  are ");
		for(String meatType:meat){
			
			System.out.println(meatType);
		}
		System.out.println("................................................................................");
		System.out.println("Frozen foods are ");
		for(String food:frozenFoods){
			
			System.out.println(food);
		}
		System.out.println("................................................................................");
		System.out.println("personal Care items are ");
		for(String personalCareItem:personalCare){
			
			System.out.println(personalCareItem);
		}
		System.out.println("................................................................................");
		System.out.println("Cleanings are ");
		for(String cleaner:cleaning){
			
			System.out.println(cleaner);
		}
		System.out.println("Stationary items  are ");
		for(String stationeryItem:stationery){
			
			System.out.println(stationeryItem);
		}
		System.out.println("................................................................................");
		System.out.println("electronics items are ");
		for(String electronicItem:electronics){
			
			System.out.println(electronicItem);
		}
		System.out.println("................................................................................");
		System.out.println("kitchenitems are ");
		for(String kitchenItem:kitchen){
			
			System.out.println(kitchenItem);
		}
		System.out.println("................................................................................");
		System.out.println("Baby cares are ");
		for(String babyCare:baby){
			
			System.out.println(babyCare);
		}
		System.out.println("................................................................................");
		System.out.println("pet items are ");
		for(String petItem:pet){
			
			System.out.println(petItem);
		}
		System.out.println("Cosmetics are ");
		for(String cosmetic:cosmetics){
			
			System.out.println(cosmetic);
		}
		System.out.println("................................................................................");
		System.out.println("Clothing  are ");
		for(String dress:clothing){
			
			System.out.println(dress);
		}
		System.out.println("................................................................................");
		System.out.println("Footwres  are ");
		for(String footWear:footwear){
			
			System.out.println(footWear);
		}
		System.out.println("................................................................................");
		System.out.println("books are ");
		for(String book:books){
			
			System.out.println(book);
		}
		
	}
}
