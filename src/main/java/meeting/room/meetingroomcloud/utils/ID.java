package meeting.room.meetingroomcloud.utils;

public class ID {
    public static final IdWorker worker = new IdWorker(1,1,1);

    public static long nextID(){
        return worker.nextId();
    }

}
