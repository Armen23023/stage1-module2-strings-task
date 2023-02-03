package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

public class StringSplitter {

    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        String s="";
        ArrayList<String> arrayList = new ArrayList<>(delimiters);
        for (int i = 0; i < arrayList.size(); i++) {
            s = s + arrayList.get(i);
        }
        List list = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(source,s);
        while (stringTokenizer.hasMoreTokens()){
            list.add(stringTokenizer.nextToken());
        }
        return list;
    }
}
