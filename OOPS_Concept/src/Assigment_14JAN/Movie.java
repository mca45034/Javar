package Assigment_14JAN;

public class Movie {
	int Movieid;
	String Moviename;
	double Rating;
	public Movie(int movieid, String moviename, int rating) {
		this.Movieid = movieid;
		this.Moviename = moviename;
		this.Rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [Movieid=" + Movieid + ", Moviename=" + Moviename + ", Rating=" + Rating + "]";
	}
	

}
