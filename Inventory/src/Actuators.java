
public class Actuators extends Item {

	
	/**
	 * attribute
	 */
	private String actuator_capacity ;
	private int voltage_input ;
	

	
		/** 2 overloaded constructors
		 * 
		 * @param actuator_capacity of actuator
		 * @param voltage_input of actuator
		 */
	public Actuators(String actuator_capacity, int voltage_input) {
		super();
		this.actuator_capacity = actuator_capacity;
		this.voltage_input = voltage_input;
	}




/**
 * 
 * @return the capacity of the actuator
 */
	public String getActuator_capacity() {
			return actuator_capacity;
		}




/**
 * 
 * @return the input voltage of the actuator
 */
		public int getVoltage_input() {
			return voltage_input;
		}




		/**
		 * 
		 * @param actuator_capacity to set
		 */
		public void setActuator_capacity(String actuator_capacity) {
			this.actuator_capacity = actuator_capacity;
		}




		/**
		 * 
		 * @param voltage_input to set
		 */
		public void setVoltage_input(int voltage_input) {
			this.voltage_input = voltage_input;
		}




		/**
		 * implementing typeOfItem Method
		 */
	public String typeOfItem() {
		return ("the type of string");
	}
	/**
	 * implementing toString Method
	 */
	public String toString() {
		return ("");
	}
	
	
}
