import com.sun.source.tree.NewArrayTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums2 = new ArrayList<>(List.of(30, 1, 5, 7, 4, 2, 20, 10, 4, 8, 12, 6, 18, 60));
        task1(nums);
        task2(nums2);

        List<String> stringList = new ArrayList<>(List.of("hello", "wfds", "hello", "mr", "hello", "mr", "mrs", "day", "day", "monday"));
        task3(stringList);
        task4(stringList);
    }

    public static void task1(List<Integer> nums){
        System.out.println("Демонстрация задачи 1");
        for (Integer num : nums) {
            if (isOddNum(num))
                System.out.println(num);

        }
    }
    private static boolean isOddNum(Integer num){
        return num % 2 != 0;
    }

    public static void task2(List<Integer> nums){
        System.out.println("Демонстрация задачи 2");

        Set<Integer> numSet = new TreeSet<>(nums);
        System.out.println(numSet);
        //Collections.sort(nums);

        for (Integer num : numSet)
            if (!isOddNum(num))
                System.out.println(num);
    }

    public static void task3(List<String> stringList){
        System.out.println("Демонстрация задачи 3");
        System.out.println(new HashSet<String>(stringList));
    }

    public static void task4(List<String> stringList){
        System.out.println("Демонстрация задачи 4");

        Map<String, Integer> keyvalueMap = new HashMap<>();
        for (String str : stringList) {
            if (keyvalueMap.get(str)== null)
                keyvalueMap.put(str, 1);
            else
                keyvalueMap.put(str, keyvalueMap.get(str) + 1);

        }
        for (String key : keyvalueMap.keySet())
            System.out.println("Строка:" + key + " встречается " + keyvalueMap.get(key));

        System.out.println("Демонстрация задачи 4 через итератор");
        Iterator<Map.Entry<String, Integer>> entries = keyvalueMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Строка:" + entry.getKey() + " встречается " + entry.getValue());
        }

    }
}