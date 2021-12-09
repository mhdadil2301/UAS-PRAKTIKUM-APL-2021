class Main {
    public static void main (String[] args) {
        //membuat objek baru dari class Hangar
        Observable staf = new Hangar();

        //membuat 4 objek sebagai observer yang menerima tugas maintenance dari Hangar
        Observer teknisiPertama = new Engineer("Teknisi 1 : Andri\n");
        Observer teknisiKedua = new Engineer("Teknisi 2 : Mahdi\n");
        Observer teknisiKetiga = new Engineer("Teknisi 3 : Zaid\n");
        Observer teknisiKeempat = new Engineer("Teknisi 4 : Zafran\n");

        staf.addObserver(teknisiPertama);
        staf.addObserver(teknisiKedua);
        staf.addObserver(teknisiKetiga);
        staf.addObserver(teknisiKeempat);

        //memanggil notifikasi yang disebarkan Hangar
        staf.notifikasi("Citilink aircraft is already in the Hangar to ");
       
    }
}