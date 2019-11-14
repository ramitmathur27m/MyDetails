package code.java.everyDay.coding;

public class TwoSumExcerise {
    private int number;

    public static void main(String args[]){
        int listOfNumbers[]= {1,2,3,4,5,6,7,8,9};
                TwoSumExcerise tSE= new TwoSumExcerise();
        System.out.println(" Result--->   "+tSE.returnStatus(listOfNumbers, 12));
    }

    /*
            You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that add up to k.
        Example:
        Given [4, 7, 1 , -3, 2] and k = 5,
        return true since 4 + 1 = 5.*/
    public boolean returnStatus(int arrList[] , int number){
        this.number = number;
        boolean result=false;
        for(int ele:arrList){
            for(int i=1; i<arrList.length;i++){
                if((ele + arrList[i])==number){
                    System.out.println("1st Number: "+ele+"  2nd Number: "+arrList[i]);
                    return true;
                }
            }
        }
        return result;
    }
}
