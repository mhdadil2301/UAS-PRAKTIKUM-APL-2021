# UAS-PRAKTIKUM-APL-2021

Nama : Muhammad Adil | NIM : 1908107010086 | Kelas : A

JUDUL : AIRCRAFT MAINTENANCE

*Nb : Judul saya ambil berdasarkan nama panggilan saya 'Adil' yang huruf depannya adalah A.

A. Deskripsi Singkat :

Aircraft Maintenance atau Perawatan Pesawat. Pada kasus ini Engineer(teknisi) akan mendapatkan notifikasi dari staf hangar bahwa akan ada tugas setiap kali ada pesawat yang masuk ke dalam Hangar untuk melakukan perawatan rutin tiap bulannya. Jenis perawatan/perbaikan pesawat terdiri atas banyak komponen pada setiap bagian pesawat dan biasanya selalu ditambah perawatan cabin penumpang dan ruang cockpit. 


B. Design Pattern
   
   Design Pattern yang saya ambil adalah Observer Pattern dan Decorator Pattern.
   1. Observer Pattern :
      
      -Observable (Subject) adalah Hangar/tempat perawatan pesawat
      
      -Observer (Subscriber) adalah Engineer (Teknisi)

   2. Decorator Pattern :
      
      -Object dari Decoratornya adalah Maintenance rutin bulanan pesawat yang ditambahi dengan perawatan Cabin Passenger 
       dan Ruang Cocpit.


C. Class Program

   > Observer Pattern :
   
     -Observer.java
     -Observable.java
     -Engineer.java
     -Hangar.java

   > Decorator Pattern :
   >
     -AircraftCheck.java
     -AircraftCheckDecorator.java
     -Type.java
     -Cabin.java
     -Cockpit.java

   > Main class :
   
     -Main.java


D. RUN
1. Clone Repository
  $ git clone https://github.com/mhdadil2301/UAS-PRAKTIKUM-APL-2021.git

2. Compile The Code
Go to the directory where the file is stored in cmd/terminal and run the following command:
     $ javac Main.java

3. Run the program!
    $ java Main 
