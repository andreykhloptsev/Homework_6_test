package ru.geekbrains.level_3.hw_6;


public class ArrayAfterFourApp {

    public static void main(String[] args) {
        int[] array2 = new int[]{1,2,4,2};
        int[] array = new int[]{1,2,3,4,5,1,3,2,4,5,2,1};
        int[] array3 = new int[]{1,2,2};
        int[] arr= arrayAfterFour(array2);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println(isArrayWithFourOne(array));
    }

    public static int[] arrayAfterFour(int[] arr){
        int fourPosition=0;
        for (int i = (arr.length-1); i >=0 ; i--) {
            if (arr[i]==4)
            {
                fourPosition=i;
                break;
            }
            if (i==0)
                throw new RuntimeException("no 4 in array");
        }
        int[] array = new int[arr.length-fourPosition-1];
        for (int i = 0; i < array.length; i++) {
            array[i]=arr[fourPosition+i+1];
        }
        return array;
    }


    public static boolean isArrayWithFourOne(int[] arr){
        boolean isOne= false;
        boolean isFour = false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==1) isOne=true;
            if (arr[i]==4) isFour=true;
        }
        return isOne&isFour;
    }


}
