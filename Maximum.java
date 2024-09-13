import java.util.ArrayList;
public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(16);
        list.add(100);
        System.out.println(list);

        int max=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
        System.out.println(max);
    }
}
