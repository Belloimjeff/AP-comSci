package pkg;

//part 1
public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie() {
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String name, double rate, int numrate, int money) {
        movieName = name;
        rating = rate;
        numRatings = numrate;
        revenue = money;
    }
    
    public String getMovieName(){
        return this.movieName;
    }
    
    public int getRevenue() {
        return this.revenue;
    }
    
    public double addRating(double a) {
        numRatings = numRatings + 1;
        rating = ((rating * (numRatings - 1))+a)/numRatings;
        return rating;
    }
    
    public boolean compareRatings( Movie x) {
        
       return rating > x.rating;
    }
    
    public void movieToString() {
        // System.out.println("-----------------------");
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println(" ");
    }
    
    public int revenueToString() {
        System.out.print(revenue);
        return revenue;
    }

}
