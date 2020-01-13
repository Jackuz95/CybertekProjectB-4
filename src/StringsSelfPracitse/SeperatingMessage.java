package StringsSelfPracitse;

public class SeperatingMessage {
    public static void main(String[] args) {
        String Given_Sender = "<James Bond>.From Number: [202-123-3456]";
        String Given_message = "{I love programming and problem solving}";
        int find_sender = Given_Sender.indexOf("<");
        int find_senderLast = Given_Sender.indexOf(">");
       String Sender = Given_Sender.substring(find_sender +1, find_senderLast);
     int find_start_number = Given_Sender.indexOf("[");
        int find_end_number = Given_Sender.indexOf("]");
        String Number = Given_Sender.substring(find_start_number +1, find_end_number);
        int message_first = Given_message.indexOf("{");
        int message_last = Given_message.indexOf("}");
        String message = Given_message.substring(message_first+1, message_last);
       System.out.println("Sender: " + Sender);
       System.out.println("Number: " + Number);
        System.out.println("Message: " + message);

  }
}
