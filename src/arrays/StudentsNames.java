package arrays;

public class StudentsNames {
    public static void main(String[] args) {
        String [] names = {"James" , "John", "Adam", "Elizie", "Benzema", "Jamie"};
        int count=0;
        for (int i =0; i<names.length ; i++) {
            String LastChar = names[i];
            //count ++;
            System.out.println(LastChar);
            System.out.println();
        } //System.out.println(StudentsNames.toString(names));
    }
}
