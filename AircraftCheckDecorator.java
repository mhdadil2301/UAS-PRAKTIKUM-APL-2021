public abstract class AircraftCheckDecorator implements AircraftCheck{
    private AircraftCheck aircraftCheck;

    public AircraftCheckDecorator(AircraftCheck aircraftCheck) {
        this.aircraftCheck = aircraftCheck;
    }
    
    @Override //Overide method
    public String decorate(){
        return aircraftCheck.decorate();
    }
}

//Class ini adalah implement dari class AircraftCheck untuk mengoveride Method decoratenya