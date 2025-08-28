import java.util.ArrayList;
import java.util.List;

public class App {

    private List<String> oldFollowers;
    private int oldSize;
    private List<String> lostFollowers;
    private int newSize;
    
    private void readFile(String filename){
        StdIn.setFile(filename);
    }

    public List convertFollowers(String filename){

        readFile(filename);

        oldFollowers = new ArrayList<>();
        while(!StdIn.isEmpty()){
            String follower = StdIn.readString();
            oldFollowers.add(follower);
        }
        oldSize = oldFollowers.size();
        return oldFollowers;
    }

    private List search(List<String> newList){
        //searching the new list and comparing to the old list
        lostFollowers = new ArrayList<>();   // initialize

        for (String follower : oldFollowers) {
            if (!newList.contains(follower)) {   // check if the old follower is missing
                lostFollowers.add(follower);
            }
        }
        oldFollowers = newList;
        newSize = newList.size();
        return lostFollowers;
    }
}
