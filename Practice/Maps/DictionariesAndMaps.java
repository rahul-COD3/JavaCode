package Practice.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> mob = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            mob.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (!mob.containsKey(s)) {
                System.out.println("Not found");
            }else{
                System.out.println(s+"="+mob.get(s));
            }
        }
        in.close();
    }
}
