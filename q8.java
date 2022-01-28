import java.util.*;
public class q8{
    public static void main(String[] arg){
        Map<String,Integer> map=new HashMap<>();
        map.put("B1",100);
        map.put("B2",200);
        map.put("B3",300);
        map.put("B4",400);
        map.put("B5",500);
        System.out.println("Initial map content:");
        map.forEach((k, v) -> System.out.println((k + ":" + v)));

        System.out.println("After Removing the third key and value pair from map:");
        map.remove("B3");
        map.forEach((k, v) -> System.out.println((k + ":" + v)));
        System.out.println("After updating the B4:");
        map.replace("B4",800);
        map.forEach((k, v) -> System.out.println((k + ":" + v)));

    }
}