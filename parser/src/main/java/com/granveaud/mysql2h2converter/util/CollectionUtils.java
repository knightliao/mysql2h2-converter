package com.granveaud.mysql2h2converter.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static String joinList(List<?> list, String joiner) {
        return list.stream().map(Object::toString).collect(Collectors.joining(joiner));
    }

    public static <T> List<? extends T> concat(List<? extends T> l1, List<? extends T> l2) {
        List<T> list = new ArrayList<>();
        list.addAll(l1);
        list.addAll(l2);
        return list;
    }

}
