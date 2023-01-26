package Assigment_28Dec1;

public class MovieTicketCalculation {
	String movieName;
	String movieCategory;
	int ticketCost;
	public void setMovieName(String movieName) {
		this.movieName=movieName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieCategory(String movieCategory) {
		this.movieCategory=movieCategory;
	}
	public String getMovieCategory() {
		return movieCategory;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost=ticketCost;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	int calculationTicketCost1(String circle) {
		if(circle.equals("Gold")&& movieCategory.equals("2D")) {
			return 300;
		}
		else if(circle.equals("Gold") && movieCategory.equals("3D")) {
			return 500;
		}
		else if(circle.equals("Selver")&& movieCategory.equals("2D")) {
			return 250;
		}
		else if(circle.equals("Selver")&& movieCategory.equals("3D")) {
			return 450;
		}
		else 
			return 0;
		
	}

}
