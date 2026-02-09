import java.util.ArrayList;

public class Filtration {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Buy some apples");
        tasks.add("Remove apps");
        tasks.add("Read book");


        System.out.println(tasks.size());
        findTasksByWord(tasks , "some");
    }

    public static void findTasksByWord(ArrayList<String> list , String searchWord){
        for (int i = 0; i < list.size() ; i++){
            if (list.get(i).contains(searchWord)) System.out.println("Found: " + list.get(i));
        }
    }
}