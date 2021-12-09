import java.util.ArrayList;
//mengimplementasi class observable
public class Hangar implements Observable { 
    private ArrayList<Observer> engineers = new ArrayList<>();  
    
    //Overide semua method yang ada pada class observable
    @Override
    public void addObserver(Observer observer) {
        engineers.add(observer);
    }

     @Override
    public void removeObserver(Observer observer) {
        engineers.remove(observer);
    }

    @Override
    public void notifikasi(String s) {
        for (Observer engineer : engineers) {
            engineer.update(s);
        }
    }
}

/* 
Class ini merupakan subject dari Observer.
*/
