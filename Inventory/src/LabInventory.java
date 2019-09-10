import java.util.Scanner;

/**
 * 
 */

/**
 * @author Laptopashok
 *
 */
public class LabInventory {

	/**
	 * 
	 */
	public LabInventory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * declaring variables
		 */
	    String item_id;
	    String name;
	    String supplier;
	    int contact;
	    double price;
	    int quantity;
	    String actuator_capacity;
	    String sensor_specification;
	    int voltage_input;
		
		boolean w = true;
		
	/**
	 * assigning password
	 */
	String PASSWORD = ("DitProg123");	
	Scanner keys = new Scanner(System.in);
	
	
	/**
	 * displaying welcome message
	 */
	System.out.println("********************************");
	System.out.println("           WELCOME              ");
	System.out.println("  To The Lab Inventory Program  ");
	System.out.println("********************************");
		
	
		/**
		 * user input array size
		 */
		System.out.println("Please enter the maximum number of item that can be stored");
		int array_len = keys.nextInt();
	
		
	/**
	 * creating array with user input size
	 */
	String itemDatabase [] = new String [array_len];
	
	
	int ans = 0;
	while (w == true) {
		int time = 0 ;
		for(time = 0; time>=0;time++) {
		System.out.println("What do you want to do ? ");
		System.out.println(" 	  1. Enter a new Item to the inventory <<password required>>	    ");
		System.out.println(" 	  2. Change information of an existing Item <<password required>> ");
		System.out.println("  	  3. Display all the Items with the specified category          ");
		System.out.println("      4. Display all Items to be re-ordered                         ");
		System.out.println(" 	  5. Number of Items currently in store                         ");
		System.out.println("	  6. Quit");
		
		System.out.print("Please enter your choice? ");
	    int x = keys.nextInt();
	    if (x == 1 || x == 2 || x == 3 || x == 4 || x== 5 || x== 6) {
	    	ans = x; }
	    	break;
	    	//else {
	    		//System.out.println("Option does not exist.");
	    		//System.out.println("Please try again!");
	    		
	    	//}
	}
	
	
	if (ans == 1) {
		
		int count = 0 ;
		
	    for (count = 0 ;count <= 3 ;count += 1) {
			System.out.print("Enter Password : ");
			String key = keys.next();
			int i = 0 ;
		if (key.equalsIgnoreCase(PASSWORD)){
			System.out.println("Acess Granted!");
			System.out.println("How many item you would like to add?");
			int n = keys.nextInt();
			int item_len = itemDatabase.length;
			if (n > item_len) {
				int a = (array_len - i );
				System.out.println("You can only add " + a + " items.");
				System.exit(0);
				}
			else;{	
				
				int t= Item.totalitems();
				for (i=(t) ; i < n ; i ++)
				{ 	
				System.out.println("Please fill out the required information for the new item");
				System.out.println("In which category does the " +(i+1)+ " item belong.1 Actuators or 2 Sensors");
				int x = keys.nextInt();
				if (x == 1) {
					System.out.println("Enter Item ID");
					item_id = keys.next();
					
					System.out.println("Enter the name of the actuator");
					name = keys.next();
					
					System.out.println("Enter the supplier name");
					supplier = keys.next();
					
					System.out.println("Enter the contact of the supplier");
					contact = keys.nextInt();
					
					System.out.println("Enter the price of the actuator");
					price = keys.nextDouble();
					
					System.out.println("Enter the quantity of the actuator ");
					quantity = keys.nextInt();
					
					System.out.println("Enter the capacity of the actuator ");
					actuator_capacity = keys.next();
					
					System.out.println("Enter the voltage input of the actuator ");
					voltage_input = keys.nextInt();
					
					
					Actuators [] actuatorArray = new Actuators[i];
					itemDatabase[i]= keys.next(); 
					actuatorArray[i].setActuator_capacity(actuator_capacity);
					actuatorArray[i].setVoltage_input(voltage_input);					
					actuatorArray[i].setItem_id(item_id);
					actuatorArray[i].setName(name);
					actuatorArray[i].setSupplier(supplier);
					actuatorArray[i].setContact(contact);
					actuatorArray[i].setPrice(price);
					actuatorArray[i].setQuantity(quantity);
					
					array_len--;
					
					
					
							}
				
				else if (x == 2) {
					
					System.out.println("Enter Sensor ID");
					item_id = keys.next();
					
					System.out.println("Enter the name of the sensor");
					name = keys.next();
					
					System.out.println("Enter the supplier name");
					supplier = keys.next();
					
					System.out.println("Enter the contact of the supplier");
					contact = keys.nextInt();
					
					System.out.println("Enter the price of the sensor");
					price = keys.nextDouble();
					
					System.out.println("Enter the quantity of the sensor ");
					quantity = keys.nextInt();
					
					System.out.println("Enter the specification of the sensor ");
					sensor_specification = keys.next();
					
					System.out.println("Enter the voltage input of the sensor ");
					voltage_input = keys.nextInt();
					
					
					Sensors [] sensorArray = new Sensors[i];
					itemDatabase[i]= keys.next(); 
					sensorArray[i].setSpecification(sensor_specification);
					sensorArray[i].setVoltage_input(voltage_input);					
					sensorArray[i].setItem_id(item_id);
					sensorArray[i].setName(name);
					sensorArray[i].setSupplier(supplier);
					sensorArray[i].setContact(contact);
					sensorArray[i].setPrice(price);
					sensorArray[i].setQuantity(quantity);
					
					array_len--;
				
					
				}
				
				}
	
												}
	    											}
		else if (!key.equalsIgnoreCase(PASSWORD)) {
			
			System.out.println("Incorrect password. You have " +(3 - (count)) + " chance left."); 
			if (count == 2) {
	    	continue;
	       }
			else if (time == 3) {
				System.out.println("Program detected suspicious activity and terminating!");
				break;					
		    }
		  }
	
	    
	    

	}
	
	
	}
	
	else if (ans == 2) {
int count = 0 ;
		
	    for (count = 0 ;count <= 3 ;count += 1) {
			System.out.print("Enter Password : ");
			String key = keys.next();
			int i = 0 ;
		if (key.equalsIgnoreCase(PASSWORD)){
			System.out.println("Acess Granted!");
			
			
			
		}
	    }
	}
	
	}
	
	}
}
