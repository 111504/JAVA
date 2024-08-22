package org.example;
import java.util.*;
public class Map_test {
    public void printTest(){
        //創建
        Map<Integer,String>map1=new HashMap<>();
        Map<Integer,String>map2=new HashMap<>();

        //添加
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");

        map2.put(1,"amy");
        map2.put(2,"bob");
        map2.put(3,"joo");
        //添加整段
        map1.putAll(map2);
        //添加 在key值尚未存在才插入
        map1.putIfAbsent(4,"four");
        
        
        //獲取指定key的值
        map1.get(2);
        //獲取指定key如果沒有則返回預設值
        map1.getOrDefault(2,"custom");

        //檢查使否有指定的key
        map1.containsKey(2);
        //檢查是否有指定的value
        map1.containsValue("two");


        //替換特定key的value
        map1.replace(2,"customTwo");
        //如果key等於特定value則替換
        map1.replace(2,"customTwo","Two");
        

        //移除
        map1.remove(3);
        //如果key等於指定的value，則移除
        map1.remove(2,"two");

        //值得集合
        map1.values();
        //key的集合
        map1.keySet();

        //整個
        map1.entrySet();
        
        //hashcode
        map1.hashCode();

        //檢查map是否存在指定的key 有的話則用給定的函數
        map1.computeIfPresent(2, (key,value)->value+"123");
        //檢查key值是否存在，如果沒有，則用提供函數的函數計算出value指定給key
        map1.computeIfAbsent(99, key->"rrrr");
         //合併1的值 將新值加上舊值
        map1.merge(1,"new",(oldValue,newValue)->oldValue+newValue);
        //每個元素進行指定行為
        map1.forEach((key,value)->System.out.println(key+"="+value));
    }
}
