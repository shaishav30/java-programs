package Sorting;
public class SelectionSort{
    public static void main(String[] args) {
        int a[] = {4,-2,0, 5,-1, 9,3,8};

        int minVal;
        int minIndex;

        for(int i = 0;i<a.length;i++){
            minVal = a[i];
            minIndex = i;
            for(int j=i;j<a.length;j++){
                if(a[j] < minVal){
                    minVal = a[j];
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex]= a[i];
            a[i] = temp;
        }
        

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
    }
}