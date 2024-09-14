import java.util.ArrayList;

public class WaterStore {

    public static int Storewater(ArrayList<Integer>heigth){
        int maxWater=0;
        for(int i=0;i<heigth.size();i++){
            for(int j=i+1;j<heigth.size();j++){
                int ht=Math.min(heigth.get(i),heigth.get(j));
                int wth=j-i;
                int CurrWater=ht*wth;
                maxWater=Math.max(maxWater,CurrWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer>heigth=new ArrayList<>();
        heigth.add(1);
        heigth.add(9);
        heigth.add(6);
        heigth.add(2);
        heigth.add(5);
        heigth.add(4);
        heigth.add(8);
        heigth.add(3);
        heigth.add(7);

        System.out.println(heigth);
        System.out.println(Storewater(heigth));
    }
}
