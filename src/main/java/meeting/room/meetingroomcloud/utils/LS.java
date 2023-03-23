package meeting.room.meetingroomcloud.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LS {
    public static void main(String[] args) throws Exception{
        while (true){
            System.out.println(ID.nextID());
            Thread.sleep(1000);
        }
    }

    public static String listToSting(List<String> list){
        return StringUtils.join(list,",");
    }

    public static List<String> stringToList(String str){
        return Arrays.asList(str.split(","));
    }
}
