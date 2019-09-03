package basic.java.com.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    ArrayList<String> list = new ArrayList<>();
    public StreamMain() {
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");
    }
    public static void main(String args[]){
        System.out.println("Inside Java Stream Main!!!");
        StreamMain sm= new StreamMain();
        sm.calculateStreamReduce();
        sm.calStreamCollect(sm.list);
        sm.calStreamArray();
    }

    /**
     * For using Java Stream Reduce() method to see the usages!!
     */
    public void calculateStreamReduce(){
        List<Integer> integers = Arrays.asList(1, 1, 1, 2, 3);
        System.out.println("Stream-->>   "+integers.stream().reduce(23, (a,b) -> a+b));
    }

    public void calStreamCollect(ArrayList<String> list){
        System.out.println("calStreamCollect-->  "+list.stream().map(ele -> ele.toUpperCase()).collect(Collectors.toList()));
    }

    public void calStreamArray(){
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        System.out.println("arr--->  "+arr.toString());
        streamOfArrayFull.forEach(ele -> System.out.println("using forEach-->  "+ele));
        //System.out.println("streamOfArrayFull--> "+streamOfArrayFull.collect(Collectors.toList()));
        System.out.println("streamOfArrayPart--> "+streamOfArrayPart.collect(Collectors.toList()));
    }
}
