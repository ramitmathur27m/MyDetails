package code.java.everyDay.coding;

public class NonDuplicateNumber {

    public static void main (String args[]){
        int listOfNumbers[]= {1,2,3,4,5,4,3,2,1};
        NonDuplicateNumber nDN= new NonDuplicateNumber();
        System.out.println("Non Duplicate Number from the Array is:--->  "+ nDN.nonDuplicateNum(listOfNumbers));
    }

    public int nonDuplicateNum(int arrList[]) {
        for (int i=0; i< arrList.length; i++) {
            int ele;
            for (ele = 0; ele <arrList.length; ele++) {
                if (i!=ele && arrList[i] == arrList[ele]) {
                    break;
                }
            }
            if(ele==arrList.length)
                return arrList[i];
        }
        return 0;
    }
}
