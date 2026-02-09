import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Learn ArrayList");
        tasks.add("Feed cat");
        tasks.add("Buy some products");
        tasks.remove(1);
        tasks.set(0 , "Skilfully own ArrayList");
        printAllTasks(tasks);

    }

    public static void printAllTasks(ArrayList<String> list){
        for (int i = 0 ; i < list.size(); i++){
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
