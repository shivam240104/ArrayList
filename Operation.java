import java.util.ArrayList;

public class Operation{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // Add Operation in ArrayList
        list.add(1);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(10);
        System.out.println(list);

        // Get Operation in ArrayList
        int ele= list.get(3);
        System.out.println(ele);

        // Remove Operation in ArrayList

        list.remove(4);
        System.out.println(list);

        //Set Operation in ArrayList (add new element)
        list.set(2,90);
        System.out.println(list);

        //Contains Operation in ArrayList
         
        System.out.println(list.contains(10));
    }
}