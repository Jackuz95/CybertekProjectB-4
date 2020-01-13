//package ReplIt;
//
//import java.util.ArrayList;
//
//public class ProjectDiscount3 {
//    public String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};
//    public String[] buyThreeDiscount(String[] order, boolean isMember) {
//        //TODO
//
//        ArrayList<String> newItems = new ArrayList<>();
//        int lengOrder = order.length;
//        for(int i=0; i<order.length; i++){
//            newItems.add(order[i]);
//        }
//        if(lengOrder==3 && isMember){
//            for(int i =0; i<order.length; i++){
//                for(int j=0; j<SPECIAL_ITEMS.length; j++){
//                    if(order[i].equals(SPECIAL_ITEMS[j])){
//                        newItems.add(order[i]);
//                        newItems.add(order[i]); break;
//                    }
//                }
//            }
//        }else{
//            if(lengOrder==3 && !isMember) {
//                for (int i = 0; i < order.length; i++) {
//                    for (int j = 0; j < SPECIAL_ITEMS.length; j++) {
//                        if (order[i].equals(SPECIAL_ITEMS[j])) {
//                            newItems.add(order[i]);
//                            break;
//
//                        }
//                        return null;
//                    }
//                }
//