public class Engineer implements Observer {  //mengimplementasi dari class Observer
    private String teknisi;

    public Engineer (String teknisi){
        this.teknisi=teknisi;
    }

    //Overide Method Update agar notifikasi dapat diterima teknisi Hangar
    @Override
    public void update(String s) {
        AircraftCheck type = new Cockpit(new Cabin(new Type())); //Implementasi Decorator Pattern       
        System.out.println(" Attention to " + this.teknisi+ " from Staf of Hangar KNO : "+s+ "" +type.decorate());
    }

}