package code.java.everyDay.coding;

import java.util.LinkedList;

public class LinkedListSampleEx {
    LinkedList<String> ll =  new LinkedList<String>();

    public LinkedListSampleEx(LinkedList<String> ll) {
        ll.add("One");
        ll.add("Two");
        ll.add("Three");
        ll.addLast("Ten");
        ll.add(3,"Four");
        this.ll = ll;
    }

    public static void main(String args[]){
        System.out.println("Inside main of LinkedListSampleEx:-->");
        LinkedList<String> llNew =  new LinkedList<String>();
        LinkedListSampleEx llSampleEx = new LinkedListSampleEx(llNew);
        llSampleEx.ll.stream().forEach(element-> System.out.print(element+' '));
    }
}
