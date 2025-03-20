import java.util.ArrayList;

public class Airline {
  private  String airlineName;
  private  String classname ;
  private  String flightPrices ;
  private String departure;
  private String destination;
  private  String direction;
  private  ArrayList<Passenger> passengerVIP= new ArrayList<>();
  private  ArrayList<Passenger> passenger = new ArrayList<>();
  private int VIPSize;
  private int NormalSize;

  ArrayList <Booking> bookings = new ArrayList();


  public Airline(String airlineName, String flightPrices, String departure, String destination, String direction,int SizeOfVipPassenger,int SizeOfPassenger) {
    this.airlineName = airlineName;
    this.flightPrices = flightPrices;
    this.departure = departure;
    this.destination = destination;
    this.direction = direction;
    NormalSize = SizeOfPassenger;
    VIPSize = SizeOfVipPassenger;

  }

// create constructor for Airline Class

  // create get for Airline name
  public String getAirlineName() {
    return airlineName;
  }
  // create get for Passenger
  public Passenger getPassenger(int index) {
    return passenger.get(index);
  }
  public Passenger getVIPPassenger(int index) {
    return passengerVIP.get(index);
  }
public void AddVip(Passenger pass){
  if(passengerVIP.size() < VIPSize){
    passengerVIP.add(pass);
  }
}

  public void AddPassenger(Passenger pass){
    if(passenger.size() < NormalSize){
      passenger.add(pass);
    }
  }


  public void AddBooking(Booking booking){
    bookings.add(booking);

  }
  public ArrayList<Booking> getBooking(){

    return bookings;

  }

  public void setAirlineName(String airlineName) {
    this.airlineName = airlineName;
  }

  public String getDeparture() {
    return departure;
  }

  public void setDeparture(String departure) {
    this.departure = departure;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }







  public ArrayList<Booking> getBookings() {
    return bookings;
  }

  public void setBookings(ArrayList<Booking> bookings) {
    this.bookings = bookings;
  }

  @Override
  public String toString() {
    return "Airline{" +
            "airlineName='" + airlineName + '\'' +
            ", passenger=" + passenger +
            '}';
  }



  public String getClassname() {
    return classname;
  }

  public void setClassname(String classname) {
    this.classname = classname;
  }

  public String getFlightPrices() {
    return flightPrices;
  }

  public void setFlightPrices(String flightPrices) {
    this.flightPrices = flightPrices;
  }

  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }
}
