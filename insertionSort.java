package data_structure_practice_question;

import org.w3c.dom.ls.LSOutput;

public class insertionSort {
    public static void main(String[]args){

        int arr[]={4,12,11,20};

        int n = arr.length;

        for(int i = 1 ; i<n ; i++){
            int key = arr[i];
            int j = i-1;
            for(;j>=0;j--){
                if(arr[j]<key){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=key;
        }

        System.out.println("DESC INSERTION SORT ON PROVIDED ARRAY : ");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
