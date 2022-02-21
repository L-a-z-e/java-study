package exam03.week2;

public class ArrayTest {

    public static void main(String[] args){

        int[] arr1;
        int arr2[];
        int arr3[] = {10,20,30};

        String[] str1,  str2;
        String str3[], str4;

        arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        arr2 = new int[10];

        for(int i=0; i<arr2.length ; i++){

            arr2[i] = 10*(i+1);

        }

        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        int[] e1 = {1,2,3,4};
        int[] e2 = new int[e1.length];
        System.arraycopy(e1, 0, e2, 0 , e1.length);
        System.out.println(e1[1]);

        int[] d1 = {1,2,3,4};
        int[] d2 = d1.clone();
        System.out.println(d2[3]);

        int[][] arr4 = {
            {1,2,3},{1,2,3},{1,2,3}
        };

        int[][][] arr5;
        

    }
    
}
