public class Passenger {
    private String firstName;
    private String lastName;
    private int idNumber;

    public Passenger(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void editPassenger(String fullName){

        String temp [] = fullName.trim().split(" ");
        firstName = temp[0];
        lastName = temp[1];


    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }




}
