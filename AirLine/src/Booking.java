public class Booking {

    private int  booking_id;

    private String  booking_type;

    private String  booking_date;

    private  String booking_time;

    private String destination;

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_type() {
        return booking_type;
    }

    public void setBooking_type(String booking_type) {
        this.booking_type = booking_type;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(String booking_time) {
        this.booking_time = booking_time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Booking(int booking_id, String booking_date, String booking_time, String destination) {
        this.booking_id = booking_id;
        this.booking_date = booking_date;
        this.booking_time = booking_time;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", booking_type='" + booking_type + '\'' +
                ", booking_date=" + booking_date +
                ", booking_time=" + booking_time +
                '}';
    }
}
