
public class FindSubArray1 {

    public static void main(String[] args) {
        int arr[] = {10,3,5,8,6,12,20,11,31};

        int i=0;
        int j=1;
        int sum = 31;
        int tmpSum;

        while(i<arr.length){
            tmpSum = arr[i];
            if(tmpSum == sum){
                System.err.println("output - "+i+", "+i);
                break;
            }
            j=i+1;
            while(j<arr.length){
                tmpSum = tmpSum +arr[j];
                if(tmpSum == sum){
                    System.err.println("output - "+i+", "+j);
                    j++;
                }
                else{
                    j++;
                }
                
            }
            i++;
        }
        System.out.println("done");
    }
}