public class Cockpit extends AircraftCheckDecorator {
    public Cockpit(AircraftCheck aircraftCheck) {
        super(aircraftCheck); //Method super merepresentasikan objek class induk yaitu AircraftCheck
    }

    public String decorate() {
        return super.decorate() + this.decorateWithCocpit(); //Method this merepresentasikan objek dari class Cockpit sendiri
    }

    public String decorateWithCocpit(){
        return "and Cockpit Check\n"; //mengembalikan string and Cockpit check
    }
}

//Class ini adalah decorator kedua dari object decorator AircraftCheck
