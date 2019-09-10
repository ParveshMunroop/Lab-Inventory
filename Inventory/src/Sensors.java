
public class Sensors extends Item {
	
		/**
		 * attributes
		 */
		private String specification;
		private int voltage_input;
		
		
		
		/**
		 * default constructor
		 */
		public Sensors() {
			super();
		}



		/**
		 * 2 overloaded constructor
		 * @param specification of  sensor
		 * @param voltage_input of sensor
		 */
		public Sensors(String specification, int voltage_input) {
			super();
			this.specification = specification;
			this.voltage_input = voltage_input;
		}



		/**
		 * 
		 * @return the specification of the sensor
		 */
		public String getSpecification() {
			return specification;
		}



		/**
		 * 
		 * @return the input voltage of the sensor
		 */
		public int getVoltage_input() {
			return voltage_input;
		}



		/**
		 * 
		 * @param specification to set
		 */
		public void setSpecification(String specification) {
			this.specification = specification;
		}



		/**
		 * 
		 * @param voltage_input to set
		 */
		public void setVoltage_input(int voltage_input) {
			this.voltage_input = voltage_input;
		}
		
		/**
		 * implementing typeOfItem
		 */
		public String typeOfItem() {
			return ("the type of string");
		}
		/**
		 * implementing toString
		 */
		public String toString() {
			return ("");
		}
		
		
		
		
	

}
