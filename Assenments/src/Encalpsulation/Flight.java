package Encaplsulation;

public class Flight {
    private int noOfPassengers;
    private String type;
    private String flightName;
    private int availableSeats;
    private String source;
    private String destination;

 
    public Flight() {
        super();
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }


    public void setAvailableSeats(int seats) {
        this.availableSeats = seats;
    }

   
    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

	@Override
	public String toString() {
		return "Flight [noOfPassengers=" + noOfPassengers + ", type=" + type + ", flightName=" + flightName
				+ ", availableSeats=" + availableSeats + ", source=" + source + ", destination=" + destination + "]";
	}
}

