package ReplIt.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllArraylist {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        removeAll(wordList,"hi");
    }

    public static void removeAll(ArrayList<String> wordList, String targetWord) {
       int indexOfWord = wordList.indexOf(targetWord);
       for(String eachword: wordList){
           //for(int i=0; i<wordList.size(); i++){
               if(eachword.equals(targetWord)){
                  removeAll(wordList,targetWord);
           }
       }
        System.out.println(wordList);
    }
}