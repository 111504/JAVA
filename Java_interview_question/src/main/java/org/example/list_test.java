package org.example;

import java.util.ArrayList;

public class list_test {
    public void printTest(){
         //初始化兩個ArrayList  記得要設定大小
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        //為list添加元素
       list1.add(10);
       list1.add(12);
       list2.add(15);
       list2.add(24);
       list2.add(99);

       //添加list_2到list_1
       list1.addAll(1,list2);
       //刪除特定元素
       list1.remove(2); 
        //修改特定位置元素 不能超出陣列範圍
       list1.set(1,123);
        //印出特定位置的元素
       list1.get(1);  
        //回傳元素出現的第一個位置
        list1.indexOf(123);
        //回應元素出現的最後一個位置
        list1.lastIndexOf(123);  
        //檢查list是否含有某個元素
        list1.contains(123);
          
          //list是否相等
         list1.equals(list2);
         //產生list哈希瑪
         list1.hashCode();
          //長度
         list1.size();
       //遍歷元素
         for(Integer obj: list1){
            System.out.println(obj);
         }
         
         for(int i=0;i<list1.size();i++){
           System.out.println(list1.get(i));
         }
    }
}
