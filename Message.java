public class Message{
    /**
     Construct a message object
     @param messageText the message text
     */
    public Message(String messageText){
        text = messageText;
    }
    /**
     * get the message text
     * @return message text
     */
    public String getText(){
        return text;
    }
    private String text;
}
