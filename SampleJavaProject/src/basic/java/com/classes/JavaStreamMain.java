package basic.java.com.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaStreamMain {

    public static void main(String args[]){
        List<String> myList= new ArrayList<String>();
        myList.add("One");
        myList.add("OneAndOnly");
        myList.add("Derek");
        myList.add("Change");
        myList.add("factory");
        myList.add("justBefore");
        myList.add("Italy");
        myList.add("Italy");
        myList.add("Thursday");
        JavaStreamMain jsm = new JavaStreamMain();
        System.out.println("Printing List--> ");
        jsm.printList(myList);
        myList.stream().forEach(ele->jsm.printList(ele));

    }

    public void printList(String ele){
        System.out.println("Element--> "+ele);

    }

    public void printList(List<String> listOfElement){
        for(String strListEle:listOfElement)
        System.out.println("strListEle--> "+strListEle);

    }

    public List<Record> getRecordPopulate(){
        Record rec = new Record();
        //Department
        rec.setEmail("abc@gmail.com");
        rec.setfName("Albert");
        rec.setlName("Martin");
return null;
    }
}
