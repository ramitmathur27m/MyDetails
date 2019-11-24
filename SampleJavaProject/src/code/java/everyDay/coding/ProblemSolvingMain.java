package code.java.everyDay.coding;

import java.util.*;

public class ProblemSolvingMain {

    public static void main(String args[]){
        ProblemSolvingMain pSM= new ProblemSolvingMain();
        System.out.println("Inside main of LinkedListSampleEx:-->");
       //Calling 3rd largest number from the list or Array
        System.out.println("3rd largest is-->"+pSM.findThirdLargest());

        //End
    }

    public int findThirdLargest(){
        System.out.println("Executing Nth Largest from the List/Array:-->");
    int thirdLargest=4;
    List<Integer> al = new ArrayList<Integer>();
        Integer arr[] = new Integer[] { 1, 23, 12, 9,
                30, 2, 50 };
    //[3, 5, 2, 4, 6, 8], k = 3
        al.add(3);
        al.add(5);
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(8);

        Arrays.stream(arr).forEach(element-> System.out.print(element+" "));
        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder());
        thirdLargest= arr[thirdLargest-1];

        return thirdLargest;
    }
}
