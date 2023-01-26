package Assigment_7Jun;

public class Bus {
	    int ticketNo;
	    float ticketPrice;
	    float totalAmount;
	    Person p;
	   // float calculateTotal;
		public int getTicketNo() {
			return ticketNo;
		}
		public void setTicketNo(int ticketNo) {
			this.ticketNo = ticketNo;
		}
		public float getTicketPrice() {
			return ticketPrice;
		}
		public void setTicketPrice(float ticketPrice) {
			this.ticketPrice = ticketPrice;
		}
		public float getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(float totalAmount) {
			this.totalAmount = totalAmount;
		}
		public Person getP() {
			return p;
		}
		public void setPerson(Person p) {
			this.p = p;
		}
	   float getTotalAmount1() {
		   return  ticketPrice;
		   
	   }
}
