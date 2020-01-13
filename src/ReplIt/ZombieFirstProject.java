//package ReplIt;
//
//import java.util.*;
//
//class ZombieFirstProject {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] inhabitants = new int[8];
//        for(int i=0; i<inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }
//
//        //TODO. Write you code below this line.
//        int sum = 0;
//        int count = 0;
//
//
//        System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));
//        do {
//            sum = 0;
//            for (int i = 0; i < inhabitants.length; i++) {
//
//
//                if (inhabitants[0] == 0) {
//                    inhabitants[1] = inhabitants[1] / 2;
//                }
//                if (inhabitants[7] == 0) {
//                    inhabitants[6] = inhabitants[6] / 2;
//                }
//                if (inhabitants[3]==0) {
//                    inhabitants[i + 1] = inhabitants[i + 1] / 2;
//                    inhabitants[i - 1] = inhabitants[i - 1] / 2;
//
//                }
//                sum += inhabitants[i];
//
//                System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));
//            }
//        }
//        while (sum != 0) ;
//
//        System.out.println("---- EXTINCT ----");
//
//    }
//}