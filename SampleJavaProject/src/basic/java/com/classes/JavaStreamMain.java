package basic.java.com.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        jsm.getFilterStream();
        jsm.getMapResult();

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

    public void getFilterStream(){
        System.out.println("inside getFilterStream");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        filtered.stream().forEach(s-> System.out.println(s));
    }

    public void getMapResult(){
        System.out.println("inside getMapResult");
        //List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,8);
       // List<Integer> squaresList =numbersList.stream().map(i -> i*2).distinct().collect(Collectors.toList());
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> mappedList = strings.stream().map(s-> s+"LLL").distinct().collect(Collectors.toList());
        mappedList.stream().forEach(j -> System.out.println(j));

    }


}
