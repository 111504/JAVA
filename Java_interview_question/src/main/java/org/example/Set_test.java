package org.example;


import java.util.*;
public class Set_test {
    void printSetTest(){
        //創建
        Set<String> hashSet=new HashSet<String>();
        Set<String> hashSet2=new HashSet<String>();
        //添加
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");

        hashSet2.add("ter");
        hashSet2.add("wee");
        hashSet2.add("jrk");
        //添加複數
        hashSet.addAll(hashSet2);
       

        //去除
        hashSet.remove("one");
       
       
        //查詢
        hashSet.contains("two");
        hashSet.containsAll(hashSet2);

        //遍歷
        Iterator<String> iterator=hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //清空
        hashSet2.clear();
        //尺寸
        hashSet2.size();
        //轉成array
        Object[] array1=hashSet.toArray();

        for(int i=0;i<array1.length;i++){
            System.out.println("array="+array1[i]);
        }
        

    }
}
