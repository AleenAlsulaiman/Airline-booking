import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {

        File file = new File("input.txt");

        if(!file.exists()){
            System.out.println("Sorry, Please Make Sure To Add The Input File");
            return;
        }

        ArrayList <Airline> Flights = new ArrayList();




        Scanner input = new Scanner(file);
        for (; input.hasNext();) {
            String from = input.next();
            String to = input.next();
            String prince = input.next();
            String Round = input.next();
            input.nextInt();
            int VIP = input.nextInt();
            int Economey = input.nextInt();
            Flights.add(new Airline("SaudiArabia",prince,from,to,Round,VIP,Economey));
        }



        String destination="";
        String direction="";
        String airplaneClass="";
        String flightPrices="";
        String clientFirstName="";
        String clientLastName="";
        int numberOfTickets =0;
        // create scanner to read input from user :
        Scanner scanner = new Scanner(System.in);
        // print welcome string :
        System.out.println("----------------------------->"+AppString.welcomeString+"<-----------------------------");
        // read info from user :
        System.out.print("--------------> Choose the destination:  ");
        //read destination:
        destination=scanner.nextLine();
        // read info from user :
        System.out.print("--------------> Choose the one way or round trip:  ");
        //read destination:
        direction=scanner.nextLine();
        //Read class :
        System.out.print("--------------> Choose the Class:  ");
        airplaneClass=scanner.nextLine();

        Airline tempAirline = LookForFlight(Flights,destination,direction);

        //read client’s name
        System.out.print("---------->client First name :  ");
        // read first name;
        clientFirstName= scanner.nextLine();

        System.out.print("---------->client Last name :  ");
        // read last name;
        clientLastName= scanner.nextLine();

        System.out.print("---------->number of tickets:  ");
        // read  number of tickets;
        numberOfTickets= scanner.nextInt();

        //generate the “tickets” :
        Passenger passenger =new Passenger(clientFirstName,clientLastName,numberOfTickets);




        if(tempAirline != null) {
            if (airplaneClass.equalsIgnoreCase("VIP")) {
                tempAirline.AddVip(passenger);

            } else {

                tempAirline.AddPassenger(passenger);
            }


            //array to get number of seat ,Date , Time  for each Ticket:
            int[] listOfNumbersOfSeats = new int[100];
            String[] listOfDate = new String[100];
            String[] listOfTime = new String[100];


            //get number of the seates for each ticket:
            for (int i = 0; i < numberOfTickets; i++) {
                int number = i + 1;
                System.out.print("Number of  seat for Ticket number " + number + " :");
                int tmpSeat = scanner.nextInt();
                //Read Date
                System.out.print("Date for Ticket number " + number + " :");
                String tmpDate = scanner.next();
                //Read Time
                System.out.print("Time for Ticket number " + number + " :");
                String tmpTime = scanner.next();


                //append data to lists
                listOfNumbersOfSeats[i] = tmpSeat;
                listOfDate[i] = tmpDate;
                listOfTime[i] = tmpTime;
            }

            Booking[] listOFTickets = new Booking[100];
            for (int j = 0; j < listOfNumbersOfSeats.length; j++) {

                listOFTickets[j] = new Booking(listOfNumbersOfSeats[j], listOfDate[j], listOfTime[j], destination);
            }
            //print  the Ticket :

            System.out.println("---------------------------->" + tempAirline.getAirlineName() + "<------------------------------------------------");
            System.out.println("Client  Full name : " + clientFirstName + " " + clientLastName);
            System.out.println("Client  Direction : " + tempAirline.getDirection());

            System.out.println("AirPlan Price : " + tempAirline.getFlightPrices());
            System.out.println("================================");
            for (int i = 0; i < tempAirline.getBooking().size(); i++) {

                System.out.print("Destination: ");
                System.out.println(tempAirline.getDestination());

                System.out.print("Date: ");
                System.out.println(tempAirline.getBooking().get(i).getBooking_date());

                System.out.print("Time: ");
                System.out.println(tempAirline.getBooking().get(i).getBooking_time());

                System.out.print("Seat Number: ");
                System.out.println(tempAirline.getBooking().get(i).getBooking_time());


                System.out.println("================================");
                if (i + 1 == numberOfTickets) {
                    return;
                }

            }


        }


    }

    private static Airline LookForFlight(ArrayList<Airline> flights, String destination, String direction) {
        for (Airline airline: flights) {
            if(airline.getDestination().equalsIgnoreCase(destination)){
                return airline;

            }
        }
  return null;







    }
}