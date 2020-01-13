package Methods;

public class ToString {
    public static void main(String[] args) {
        int [] num1 ={10, 9, 5, 4, 3, 7, 4};
       result(num1);
    }
    public static void result (int [] arr) {

        //output: [10,9,5,4,3,7,4]
        String result = "[";

        for(int num : arr) {
            result += num + ", ";
        }

        result = result.substring(0,result.length()-2) + "]";
        System.out.println(result);

    }
    }

