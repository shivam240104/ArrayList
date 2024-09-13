import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<>();
         list.add(1);
         list.add(17);
         list.add(18);
         list.add(19);
         list.add(10);
         System.out.println(list);
         for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i)+ " ");
         }
    }
}
