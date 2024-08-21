package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.*;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
         
        System.out.println("Example of list------------------------------------------------");

        //初始化 記得要設定大小
        ArrayList<Integer> score=new ArrayList(5);
        ArrayList<Integer> score2=new ArrayList(3);
        //添加元素
        score.add(89);
        score.add(99);
        score.add(79);
        score.add(81);
        score.add(46);
        
        score2.add(100);
        score2.add(100);
        score2.add(100);
        
        //添加整段元素
        score.addAll(2,score2);
        
        for(Integer obj: score){
           System.out.println("Number = "+obj);
       }
        
        //刪除特定元素
        score.remove(2);
        score.remove(Integer.valueOf(100));
        
        
        for(Integer obj: score){
           System.out.println("After remove item = "+obj);
       }
        
        //修改特定位置 不能超出陣列範圍
        score.set(4,145);
        //印出特定位置的元素
        System.out.println("Get number = "+score.get(2));
         
        
         
         //回傳元素出現的第一個位置
         
          System.out.println("First IndexOf = "+score.indexOf(99));
          //回應元素出現的最後一個位置
          System.out.println("Last IndexOf = "+score.lastIndexOf(79));
          
         //檢查list是否含有某個元素
       System.out.println(score.contains(79));
       System.out.println(score.containsAll(score2));
          
          //相等
        System.out.println(score.equals(score2));
         //哈希瑪
        System.out.println(score.hashCode());
        
          //長度
           System.out.println("Size of list = "+score.size());
       //遍歷元素
       for(Integer obj: score){
           System.out.println("Number = "+obj);
       }
       
       System.out.println("Example of Map------------------------------------------------");
       
       
       Map<String,Integer>map=new HashMap<>();
       Map<String,Integer>map2=new HashMap<>();
       
       map.put("apple",1);
       map.put("banana",2);
       map.put("apple",3);//已有的會替換
       
       map2.put("cherry",3);
       map2.put("date",4);
       map2.put("banana",5);
       
       map.putAll(map2);
       
       System.out.println("The set is: " + map.entrySet()); 
       
       //只在key值尚未存在才插入
       map.putIfAbsent("banana",2);
       
       //獲取指定鍵的值
       Integer value=map.get("apple");
       System.out.println("value of apple="+value);
       //獲取指定鍵的值 如果鍵不存在 返回設定值
       System.out.println("Integer defaultValue="+map.getOrDefault("apple",999));
       //檢查map是否包含指定的key
        System.out.println("是否包含key"+map.containsKey("apple"));
        //檢查map是否包含指定的value
        System.out.println("是否包含value"+map.containsValue(3));
        //替換指定key的value
        map.replace("apple",2);
        //在指定的key的值等於特定值時，將其值替換為新值
        map.replace("apple",2,10);
        //移除指定key
        map.remove("cherry");
        //當指定的key等於value時，移除該key
        map.remove("date",4);
        
         // 該map value的集合
        System.out.println("Values: " + map.values());
        
        // 該map value的集合
        System.out.println("Key set: " + map.keySet());
        
     
       // 該map所有的集合
        System.out.println("The set is: " + map.entrySet()); 
       //map hashcode
       System.out.println("The hasCode=: " + map.hashCode()); 
       
       
       System.out.println("Example of Set------------------------------------------------");
       //創建
       Set<String> set=new HashSet<>();
       Set<String> set2=new HashSet<>();
       Set<String> set3=new HashSet<>();
       //添加
       set.add("Amy");
       set.add("banana");
       set.add("bob");
       set.add("ymi");
       set.add("egg");
       set.add("vagetable");
       set.add("Amy");//不重複
       
       set2.add("egg");
       set2.add("vagetable");
      

       set3.add("Amy");
       set3.add("banana");
       set3.add("bob");
       set3.add("ymi");
       set3.add("egg");
       set3.add("vagetable");

       //兩set合併
       set.addAll(set2);

       //依序訪問
       Iterator<String> iterator=set.iterator();

       while(iterator.hasNext()){
            System.out.println(iterator.next());
       }

       //移除元素
       set.remove("Amy");
       //移除元素出現在另一指定集合中
       set.removeAll(set2);
       //保留集合與另一集合中重合的元素
       set.retainAll(set3);
       //移除元素
       set3.clear();
       //返回集合的長度
       set.size();
       //集合輸出成陣列
       Object array=set.toArray();
       //查看是否含有特定元素
       set.contains("Amy");
       //查看是否含有特定元素集合
       set.containsAll(set2);
       //哈希瑪
       set.hashCode();
    
    System.out.println("Example of Queue------------------------------------------------");

    Queue<String> queue=new LinkedList<>();
    queue.add("mail1");
    queue.add("mail2");
    queue.add("mail3");
    queue.add("mail4");
    queue.add("mail5");
    //元素插入queue
    queue.offer("mail6");
    //返回queue的頭部元素 如果為空則拋出異常
    queue.element();
    //返回queue的頭部元素 如果為空則為null
    queue.peek();
    //移除queue的頭部元素 空則拋出異常
    queue.remove();
    //移除queue的頭部元素 空則為null
    queue.poll();
    





    }
}