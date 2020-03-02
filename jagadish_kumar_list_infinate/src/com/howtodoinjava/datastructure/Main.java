package com.howtodoinjava.datastructure;
 
public class Main extends DataList
{
    public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<>();
 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("Added Elements In List:   ");
        System.out.println(list);
         
        //Remove elements from index
        list.remove(1);
        System.out.print("After Removing Elements From List based on Index 1 :   ");
        System.out.println(list);
         
        //Get element with index
        System.out.print("Getting The Elements With Their Index 0:    ");
        System.out.println( list.get(0) );
        System.out.print("Getting The Elements With Their Index 2:    ");
        System.out.println( list.get(2) );
 
        //List Size
        System.out.print("Size Of The List:  ");
        System.out.println(list.size());
    }
}