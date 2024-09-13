import java.util.ArrayList;


public class Swap {

    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
            int tem=list.get(idx1);
            list.set(idx1,list.get(idx2));
            list.set(idx2,tem);
    
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        System.out.println(list);
       

        int idx1=2,idx2=1;
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
