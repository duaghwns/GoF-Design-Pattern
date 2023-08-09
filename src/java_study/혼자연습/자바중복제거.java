package java_study.혼자연습;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 자바중복제거 {
    public static void main(String[] args) {
        final String removeMsg = "중복된거 제거";
        final String findMsg = "중복된 항목 찾기";
        String[] arr = {"a", "b", "a", "c", "d", "e", "e"};

        System.out.println("======used Collectors.toSet()======");
        System.out.println(removeMsg);
        useCollectorsToSet(arr);

        System.out.println(findMsg);
        useCollectorsToSetFindDuplicates(arr);

        System.out.println("======used stream.distinct======");
        System.out.println(removeMsg);
        useStreamDistinct(arr);

        System.out.println(findMsg);
        useStreamDistinctFindDuplicates(arr);


        System.out.println("====== used Collectors.toMap() ======");
        System.out.println(removeMsg);
        useCollectorsToMap(arr);
    }

    /* Collectors.toSet() 사용하기 */
    private static void useCollectorsToSet(String[] arr) {
        Set<String> set = new HashSet<>();

        Arrays.stream(arr).filter(n -> set.add(n))
                .collect(Collectors.toSet())
                .forEach(item -> System.out.println(item));

        System.out.println(arr.toString());
    }

    private static void useCollectorsToSetFindDuplicates(String[] arr) {
        Set<String> set = new HashSet<>();

        Arrays.stream(arr).filter(str -> !set.add(str))
                .collect(Collectors.toSet())
                .forEach(item -> System.out.println(item));
    }

    private static void useStreamDistinct(String[] arr) {
        List<String> list = Arrays.asList(arr)
                                        .stream()
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println(list);
    }

    private static void useStreamDistinctFindDuplicates(String[] arr) {
        // 종복된 항목을 찾기 위해서는 비교를 해야하기 때문에 새로운 객체로 복사
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        List<String> distinctList = list.stream()
                                        .distinct()
                                        .collect(Collectors.toList());

        for (String el : distinctList) {
            list.remove(el);
        }

        System.out.println(list);

    }


    private static void useCollectorsToMap(String[] arr) {
        Stream<String> stream = Stream.of(arr);

        Map<String, Integer> map = stream.collect(
                Collectors.toMap(Function.identity(),
                        value -> 1, Integer::sum));

        System.out.println(map);
    }

}
