package home_work_11_map_sorting;

import java.util.HashMap;
import java.util.Map;

public class Check_for_hw11 {
    public static void main(String[] args) {
        Map<Integer, String> mySuperMap = new HashMap<>();
        mySuperMap.put(2, "2");
        mySuperMap.put(4, "4");
        mySuperMap.put(5, "5");
        mySuperMap.put(1, "1");
        mySuperMap.put(3, "3");
        mySuperMap.put(7, "7");
        mySuperMap.put(6, "6");
        HomeWork11.printMap(mySuperMap);
    }
}