package suncaper;
import java.util.function.*;

public class Demo3 {
    public static void main(String[] args) {
        //hh(()->{return Math.random();});
        hh(()->Math.random());
//        hh1((String t)->{
//            System.out.println(t);
//        });
        hh1(t-> System.out.println(t));
        //hh2((String t)->{return t.length();});
        hh2(t->t.length());

        hh3(t->t.length() > 10);
    }
    //Supplier 调用方法能得到一个数据
    public static void hh (Supplier<Double> supplier) {
        Double V = supplier.get();
    }

    //Consumer 调用方法能得到一个数据
    public static void hh1 (Consumer<String> consumer) {
        consumer.accept("hello");
    }

    //Function 调用方法需要得到一个数据并会返回一个数据
    public static void hh2 (Function<String, Integer> funtion) {
        Integer integer = funtion.apply("hello");
    }


    //Predicate 调用方法需要得到一个数据并会返回一个Boolean
    public static void hh3 (Predicate<String> predicate) {
        boolean b = predicate.test("hello");
    }
}
