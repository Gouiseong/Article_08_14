public class Main {
    public static void main(String[] args) {
        boolean[] arr1 = new boolean[3];
        arr1[0] = true;
        arr1[1] = true;
        arr1[2] = false;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);


        double[] arr2 = {3.14,5.55,10.0};
//        arr2[0] = 3.14;
//        arr2[1] = 5.55;
//        arr2[2] = 10.0;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        int[] arr3 = new int[10];
        for(int i = 0;i<=9;i++){
            arr3[i] +=arr3[i+1];

            System.out.println(arr3[i]);
        };



    }
}