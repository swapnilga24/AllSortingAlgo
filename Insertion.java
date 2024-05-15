/*
Insertion Sort :
Arr = [17,25,31,10,2];

Inplace : as no extra space needed.
Stable sort : as when we have 2A and 2B, our 2A will always will be first and we will insert 2B next to him on right side.
time : O(n2)
Space : O(1)

When to use : Stream data or partial sorted array, need to insert new element in sorted array.

arr[] = {17,25,31,13,2}
      j=i-1,i=1

i will alwsy start with 1 as arr[0] is already sorted.
and j will be i-1 till j become zero and till then we overide the arr[j] elment to arr[j+1] as we already store current element in temp
which will be swap at last of the loop whihc can be j=0 (termination condiiton) or excat position of the element.

we need break beacause otherwise it will go till j become 0 and then as per arr[j+1] always update the j+1 postion which is wroing so, once the codnition become false we sould break the loop so, that we get accurate value of j.
*/



public class Insertion{

  public static void main(String args[]){
        int arr[] = new int[]{17,25,31,13,2};

        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){ 
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=temp;
        }

        System.out.println("print Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"->");
        }
        
  }

}
