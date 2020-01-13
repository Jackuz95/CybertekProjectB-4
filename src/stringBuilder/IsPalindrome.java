//package stringBuilder;
//import utilities.Mycollection;
//import java.util.ArrayList;
//import java.util.Random;
//public class IsPalindrome {
//    public static void main(String[] args) {
////        System.out.println(Palindome("Civic"));
////        System.out.println(deleteWord("I want to concat"));
////        System.out.println(deleteWord("java is fun", "java"));
//        ArrayList<String> arr = Mycollection.randomArrayList
//                System.out.println(insertWord());
//    }
//
//    public static boolean Palindome(String word) {
//        StringBuilder sb = new StringBuilder(word);
//        sb.reverse();
//        if (word.equalsIgnoreCase(sb.toString())) {
//            return true;
//        } else {
//            return false;
//
//        }
//
//    }
//
//    public static String deleteWord(String str) {
//        StringBuilder sb = new StringBuilder(str);
//        if (str.contains("con")) {
//            int delete = str.indexOf("con");
//            sb.delete(delete, delete + 3);
//            return sb.toString();
//        } else {
//            return str;
//        }
//    }
//
//    public static String deleteWord(String mainStr, String str) {
//        StringBuilder sb = new StringBuilder(mainStr);
//        if (mainStr.contains(str)) {
//            int index = mainStr.indexOf(str);
//            int length = str.length();
//            sb.delete(index, index + length);
//            return sb.toString();
//        } else {
//            return mainStr;
//        }
//    }
//
//    public static ArrayList<String> insertWord(ArrayList<String> arr) {
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i).length() % 2 == 0) {
//                int middle = arr.get(i).length() / 2;
//                StringBuilder sb = new StringBuilder(arr.get(i));
//                sb.insert(middle, "Hello");
//                arr.set(i, sb.toString());
//            }
//
//        }
//        return arr;
//    }
//
//    public static ArrayList<String> insertWord(ArrayList<String> arr, String target) {
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i).length() % 2 == 0) {
//                int middle = arr.get(i).length() / 2;
//                StringBuilder sb = new StringBuilder(arr.get(i));
//                sb.insert(middle, target);
//                arr.set(i, sb.toString());
//            }
//
//        }
//        return arr;
//    }
//
//    public static ArrayList<String> randomArrayList(int elements) {
//
//        ArrayList<String> words = new ArrayList<>();
//        Random random = new Random();
//
//        for (int i = 0; i < elements; i++) {
//            int size = random.nextInt(10) + 1;
//            String temp = "";
//            for (int j = 0; j < size; j++) {
//                int characters = random.nextInt(23) + 65;
//                temp += (char) characters;
//            }
//
//            words.add(temp.toLowerCase());
//
//        }
//
//        return words;
//
//    }
//}
