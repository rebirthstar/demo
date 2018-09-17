import javax.sound.midi.Soundbank;
import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.IntBinaryOperator;

/**
 * @author LT
 * @version 1.0
 * @description PACKAGE_NAME
 * @date 2018/9/13
 */
public class TestDemo {
    public static void main(String[] args) {

        new Thread( () -> System.out.println("In Java8!") ).start();


    }
    public int tect(){


        return 1;
    }
}
class ticket{
    int num = 100;
    public synchronized void decTicket(){
        System.out.println(Thread.currentThread().getName() +":"+  num);
        num --;

    }
}


