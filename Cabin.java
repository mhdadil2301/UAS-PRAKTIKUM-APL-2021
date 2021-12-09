public class Cabin extends AircraftCheckDecorator {
    public Cabin(AircraftCheck aircraftCheck) {
        super(aircraftCheck); //Method super merepresentasikan objek class induk yaitu AircraftCheck
    }

    public String decorate() {
        return super.decorate() + this.decorateWithCabin(); //Method this merepresentasikan objek dari class Cabin sendiri
    }

    public String decorateWithCabin(){
        return "With Cabin Passenger "; //Mengembalikan string Cabin Passenger
    }
}

//Class ini adalah decorator pertama dari object decorator AircraftCheck
