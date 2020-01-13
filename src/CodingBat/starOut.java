//package CodingBat;
//
//public class starOut {
//    public String starOut(String str) {
//        if(str.startsWith("*")){
//            str= str.substring(2);
//        }
//        if(str.endsWith("*")){
//            str=str.substring(0,str.length()-2);
//        }
//        for(int i = 0; i<str.length()-1; i++){
//            int count =0;
//            String rest = "";
//            if(str.charAt(i) == '*'){
//                for(int j= i+1; j<str.length(); j++){
//                    if(str.charAt(j) != '*'){
//                        break;
//                    } else{
//                        count++;
//                    }
//                }
//                rest = str.substring(i-1, count+2);
//                str = str.replace(rest, "");
//                i=0;
//            }
//        }
//        return str;
//    }
//
//}
