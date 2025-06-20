package suncaper;

import java.util.*;
//git测试
public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> pokes = new HashMap<Integer,String>();
        int start = 0;
        String[] types = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < number.length; j++) {
                pokes.put(start++, types[i] + number[j]);
            }
        }
        pokes.put(52, "大王🃏");
        pokes.put(53, "小王🃏");
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> one = new ArrayList<Integer>();
        List<Integer> two = new ArrayList<Integer>();
        List<Integer> three = new ArrayList<Integer>();
        List<Integer> last = new ArrayList<Integer>();
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            if (i < 17) {
                one.add(list.get(i));
            }
            else if (i < 34) {
                two.add(list.get(i));
            }
            else if (i < 51) {
                three.add(list.get(i));
            }
            else {
                last.add(list.get(i));
            }
        }
        List<String> onepoke = new ArrayList<>();
        List<String> twopoke = new ArrayList<>();
        List<String> threepoke = new ArrayList<>();
        List<String> lastpoke = new ArrayList<>();

        for (int i : one) {
            onepoke.add(pokes.get(i));
        }
        for (int i : two) {
            twopoke.add(pokes.get(i));
        }
        for (int i : three) {
            threepoke.add(pokes.get(i));
        }
        for (int i : last) {
            lastpoke.add(pokes.get(i));
        }
//change test
        //闹麻了
        System.out.println(onepoke);
        System.out.println(twopoke);
        System.out.println(threepoke);
        System.out.println(lastpoke);
    }
}
