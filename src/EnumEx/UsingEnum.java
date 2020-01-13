package EnumEx;

public class UsingEnum {
    public static void main(String[] args) {
       LetterGrade grade= LetterGrade.C;
       switch ( grade) {
        case A:
            System.out.println("You got an A");
            break;
           case B:
               System.out.println("Not bad");
               break;
           case C:
               System.out.println("You could do better");
               break;
           case D:
               System.out.println("Not so bad");
               break;
           case F:
               System.out.println("You failed");
               break;
       }
    }
}
