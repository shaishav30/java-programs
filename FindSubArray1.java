
public class FindSubArray1 {

    public static void main(String[] args) {
        int arr[] = {10,3,5,8,6,12,20,11,31};
        int sum = 31;

        //findSubArray(arr,sum);
        findSubArrayBestSolution(arr,sum);

        
        System.out.println("done");
    }

    private static void findSubArrayBestSolution(int arr[], int sum){
        int i=0;
        int j=0;
        int tmpSum = arr[0];
       

        while(i < arr.length && j < arr.length){
            if(tmpSum == sum){
                System.err.println("output - "+i+", "+j);
                //break;
                if(i == arr.length-1)
                    break;

                i++;
                j=i;
                tmpSum=arr[i];
           } else if(tmpSum < sum){
                
                    j++;
                    tmpSum += arr[j];
                
            } else if(tmpSum > sum) {
                
                    tmpSum -= arr[i];
                    i++;
                
            } else if(i == arr.length && j == arr.length)
                break;

        }

    }

    private static void findSubArray(int arr[], int sum){
        int i=0;
        int j=1;
        
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
    }
}