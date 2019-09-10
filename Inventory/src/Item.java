
public abstract class Item {
	/**
	 * attributes
	 */
	public String item_id;
	public String name;
	public String supplier;
	public int contact;
	public double price;
	public int quantity;
	static int totalItems = 0 ;
	
	
	
	//default constructor
	public Item() {
		super();
	}



/**
 * 6 overloaded constructor
 * @param item_id of item
 * @param name of item
 * @param supplier's name  
 * @param contact of supplier
 * @param price of item
 * @param quantity of item
 */
	public Item(String item_id, String name, String supplier, int contact, double price, int quantity) {
		super();
		this.item_id = item_id;
		this.name = name;
		this.supplier = supplier;
		this.contact = contact;
		this.price = price;
		this.quantity = quantity;
	}



/**
 * 
 * @return item_id
 */
	public String getItem_id() {
		return item_id;
	}



/**
 * 
 * @return name of item
 */
	public String getName() {
		return name;
	}



/**
 * 
 * @return supplier's name
 */
	public String getSupplier() {
		return supplier;
	}



/**
 * 
 * @return contact of supplier
 */
	public int getContact() {
		return contact;
	}



/**
 * 
 * @return price of item
 */
	public double getPrice() {
		return price;
	}



/**
 * 
 * @return quantity of item
 */
	public int getQuantity() {
		return quantity;
	}



/**
 * 
 * @param item_id to set
 */
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}



/**
 * 
 * @param name to set
 */
	public void setName(String name) {
		this.name = name;
	}



/**
 * 
 * @param supplier to set
 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}



/**
 * 
 * @param contact to set
 */
	public void setContact(int contact) {
		this.contact = contact;
	}



/**
 * 
 * @param price to set
 */
	public void setPrice(double price) {
		this.price = price;
	}



/**
 * 
 * @param quantity to set
 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public static void totalitem() {
		System.out.println(totalItems);
		}
		public static int totalitems() {
			return totalItems;
		}
	
	/**
	 * declaring abstract methods
	 */
	public abstract String toString();
	public abstract String typeOfItem();
	

	
}
