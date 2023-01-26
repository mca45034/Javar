package Assigment_29DEC_StaticKeyword;

public class ClassTicket {
	private int ticketid;
	private int price,x;
	private static int availableTickets;
public void setTicketid(int ticketid) {
	this.ticketid=ticketid;
}
public int getTicketid() {
	return ticketid;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public  void setAvailableTickets(int availableTickets) {

	this.availableTickets=availableTickets;
}
public int getAvailableTickets() {
	return availableTickets;
}
int calculateTicket(int nooftickets) {
	
	 int ticket1 = getAvailableTickets();
	if(nooftickets > ticket1) 
		return-1;
		 ticket1 = ticket1 - nooftickets;
		setAvailableTickets( ticket1 );
		return price*nooftickets;
	
	
	
	
}
 
}



