import java.util.ArrayList;

public class MessageQueue {
    /**
     * Constructs an empty message queue
     */
    public MessageQueue(){
        queue = new ArrayList<Message>();
    }
    /**
     * Remove message at head
     * @return message that has been removed from queue 
     */
    public Message remove(){
        return queue.remove(0);

    }
    /**
     * Append message at tail
     * @param newMessage the message to be appended
     */
    public void add(Message newMessage){
        queue.add(newMessage);
    }
    /**
     * Get message at head
     * @return message that is at the head of the queue or nullif the queue is empty
     */
    public Message peek(){
        if(queue.size()==0) return null;
        else return queue.get(0);
    }
    private ArrayList<Message> queue;
    public int size() {
        return 0;
    }
}

