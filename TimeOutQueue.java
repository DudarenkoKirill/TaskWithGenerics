import java.sql.Time;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class TimeOutQueue <T>{
    private Deque<T> listofValues=new ArrayDeque<>();
    private Deque<Long> timeofDeath=new ArrayDeque<>();
    public void offer(T t,long millis){
        listofValues.offer(t);
        timeofDeath.offer(System.currentTimeMillis()+millis);
    }
    public T poll(){
        if(listofValues.size()!=0){
            if(System.currentTimeMillis()<timeofDeath.poll())
                return listofValues.poll();
            else {
                listofValues.remove();
                return null;
           }
        }
        else
            return null;
    }
}
