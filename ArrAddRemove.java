import java.util.ArrayList;

public class ArrAddRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        System.out.println("After adding: " + list);

        list.remove("Green");
        System.out.println("After removing Green: " + list);

        list.remove(0);
        System.out.println("After removing first element: " + list);
    }
}