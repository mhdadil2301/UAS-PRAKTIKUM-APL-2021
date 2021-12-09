public class Type implements AircraftCheck{
    @Override //Overide 1 method dari class AircraftCheck
    public String decorate() {
        return "Maintenance Monthly "; //Mengembalikan string saat decorate() dipanggil
    }
}
 //class Type ini mengimplementasi class AircraftCheck
