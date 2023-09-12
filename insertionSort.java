package data_structure_practice_question;

//with debug

public class insertionSort {
    public static void main(String[]args){

        int arr[]={4,12,11,20};

        int n = arr.length;

        for(int i = 1 ; i<n ; i++){
            int key = arr[i];
            int j = i-1;
            System.out.println("J after i start [enter in j loop] = "+j);
            for(;j>=0;j--){
                if(arr[j]<key){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            for (int u = 0; u <n ; u++) {
                System.out.print(arr[u]+"\t");
            }
            System.out.println("\n");
            System.out.println("J before = "+j+" [exited j loop]");
            arr[j+1]=key;

            System.out.println("J after = "+j);
            for (int t = 0; t <n ; t++) {
                System.out.print(arr[t]+"\t");
            }
            System.out.println();
        }

        System.out.println("DESC INSERTION SORT ON PROVIDED ARRAY : ");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
