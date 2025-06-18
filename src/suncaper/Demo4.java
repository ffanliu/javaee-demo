package suncaper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        List<String> zhang = new ArrayList<>();
        for (String str : list) {
            if (str.startsWith("张")) {
                zhang.add(str);
            }
        }
        List<String> two = new ArrayList<>();
        for (String str : zhang) {
            if (str.length() == 2) {
                two.add(str);
            }
        }
        for (String str : two) {
            System.out.println(str);
        }
        List<String> strings = list.stream().filter(str->str.startsWith("张"))
                .filter(str->str.length() == 2)
                .collect(Collectors.toList());
        strings.forEach(System.out::println);
    }
}
