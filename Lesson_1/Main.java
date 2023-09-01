package Lesson_1;

import java.util.Random;
import java.util.Arrays;

// public class Main {
    
//     public static void main(String[] args) {

//         int i;
//         long l;

//         float f;
//         double d;

//         boolean b;

//         byte bt;
//         short sh;

//         char ch = 896;

//         int[] ints = new int[10];
//         String s = new String("Hello World!");



//         System.out.println(add(1, 2));
//     }

//     static int add(int x, int y){
//         return x+y;
//     }

// }


// public class Main {
    
//     public static void main(String[] args) {

//         System.out.println("Hello World!");
//     }

// }


// public class Main {
    
//     public static void main(String[] args) {

//         Random random = new Random();
//         int count = 0;
//         int r = random.nextInt(2000);
//         System.out.println(r);
//         while (r > 1){
//             r = r / 2;
//             count++;
//         }
//         System.out.println(count);
//         System.out.println(random.nextBoolean());
//     }

// }


// public class Main {
    
//     public static void main(String[] args) {

//         Random random = new Random();
//         int count = 0;
//         int r = random.nextInt(2000);
//         System.out.println(r);
//         while (r > 1){
//             r = r / 2;
//             count++;
//         }
//         System.out.println(count);
//         System.out.println(random.nextBoolean());
//         // Short.MAX_VALUE;
//         int sizeArray = 0;
//         for (int i = 0; i < Short.MAX_VALUE; i++) {
//             if (i % count == 0) sizeArray++;
//         }
//         int [] array = new int [sizeArray];
//         int ind = 0;
//         for (int i = 0; i < Short.MAX_VALUE; i++) {
//             if (i % count == 0) array[ind++] = i;
//         }
//         System.out.println(Arrays.toString(array));
//     }

// }


// public class Main {
    
//     public static void main(String[] args) {

//         Random random = new Random();
//         int count = 0;
//         int ranNum = random.nextInt(20);
//         System.out.println(ranNum);
//         System.out.println(Integer.toBinaryString(ranNum).length());
//         while (ranNum > 1){
//             ranNum = ranNum / 2;
//             count++;
//         }
//         System.out.println(count);
//         System.out.println(random.nextBoolean());
//         // Short.MAX_VALUE;
//         int sizeArray = 0;
//         for (int i = 0; i < Short.MAX_VALUE; i++) {
//             if (i % count == 0) sizeArray++;
//         }
//         int[] array = new int[sizeArray];
//         int ind = 0;
//         for (int i = 0; i < Short.MAX_VALUE; i++) {
//             if (i % count == 0) array[ind++] = i;
//         }
//         System.out.println(Arrays.toString(array));
//     }

// }


// public class Main {
    
//     public static void main(String[] args) {

//         Random random = new Random();
//         int count = 0;
//         int ranNum = random.nextInt(2000);
//         System.out.println(ranNum);
//         System.out.println(Integer.toBinaryString(ranNum).length());
//         while (ranNum > 1){
//             ranNum = ranNum / 2;
//             count++;
//         }
//         System.out.println(count);
//         System.out.println(random.nextBoolean());
//         // Short.MAX_VALUE;
//         int sizeArray2 = 0;
//         for (int j = Short.MIN_VALUE; j < 0; j++) {
//             if (j % count != 0) sizeArray2++;
//         }
//         int[] array2 = new int[sizeArray2];
//         int ind2 = 0;
//         for (int j = Short.MIN_VALUE; j < 0; j++) {
//             if (j % count != 0) array2[ind2++] = j;
//         }
//         System.out.println(Arrays.toString(array2));
//     }

// }


public class Main {
    
    public static void main(String[] args) {

        Random random = new Random();
        int count = 0;
        int ranNum = random.nextInt(2000);
        System.out.println(ranNum);
        System.out.println(Integer.toBinaryString(ranNum).length());
        while (ranNum > 1){
            ranNum = ranNum / 2;
            count++;
        }
        System.out.println(count);
        System.out.println(random.nextBoolean());
        // Short.MAX_VALUE;
        int sizeArray2 = 0;
        for (int j = Short.MIN_VALUE; j < 0; j++) {
            if (j % count != 0) sizeArray2++;
        }
        int[] array2 = new int[sizeArray2];
        int ind2 = 0;
        for (int j = Short.MIN_VALUE; j < 0; j++) {
            if (j % count != 0) array2[ind2++] = j;
        }
        System.out.println(Arrays.toString(array2));

        int sum = 0;
        for (int i = 0; i < count; i++, sum += i);
        System.out.println(sum);
    }

}
        