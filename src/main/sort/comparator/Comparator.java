package main.sort.comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author mafh
 * @create 2017-07-24 12:42
 * Created With Intellij IDEA
 */
public class Comparator {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List testList = new ArrayList();
        Map testMap = new HashMap<>();
        testMap.put("time","2017-07-21 15:05:13");
        testMap.put("num","3");
        testList.add(testMap);
        testMap = new HashMap<>();
        testMap.put("time","2017-07-21 15:02:12");
        testMap.put("num","2");
        testList.add(testMap);
        testMap = new HashMap<>();
        testMap.put("time","2017-02-21 18:02:12");
        testMap.put("num","1");
        testList.add(testMap);
        testMap = new HashMap<>();
        testMap.put("time","2017-07-25 11:02:12");
        testMap.put("num","4");
        testList.add(testMap);
        Map map = new HashMap();
        map.put("testList",testList);
        List newList = (List)map.get("testList");
        Collections.sort(newList, new java.util.Comparator<Map>() {
            @Override
            public int compare(Map o1, Map o2) {
                String time1 = o1.get("time")+"";
                String time2 = o2.get("time")+"";
                try {
                    Date date1 = sdf.parse(time1);
                    Date date2 = sdf.parse(time2);
                    return date1.compareTo(date2);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
        System.out.println("现在的："+map);
/*        Collections.sort(testList, new java.util.Comparator<Map>() {
            @Override
            public int compare(Map o1, Map o2) {
                String num1 = o1.get("num")+"";
                String num2 = o2.get("num")+"";
                return num1.compareTo(num2);
            }
        });
        System.out.println("最后的："+testList);*/
    }
}
