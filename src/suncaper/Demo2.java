package suncaper;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("上课");
        System.out.println("上课");
        System.out.println("上课");
        System.out.println("上课");

        new Thread(new BuyWaterThread()).start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("买水");
            }
        }).start();
        new Thread(()->{
            System.out.println("买水");
        }).start();
        //本质，接口的实例对象
        //前提：只有函数式接口才能用lambda
        //函数式接口：只有一个抽象方法
        //语法：() -> {}
        //()唯一的抽象方法的参数列表
        //->语法
        //{}对唯一抽象方法的重写
        System.out.println("上课");
        System.out.println("上课");
        System.out.println("上课");
        System.out.println("上课");
        Person[] array = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20)
        };
        Arrays.sort(array, (Person o1, Person o2) -> {return o1.getAge() - o2.getAge();});
        Arrays.sort(array, (o1, o2)->-(o1.getAge() - o2.getAge()));
        System.out.println(Arrays.toString(array));
    }
}
