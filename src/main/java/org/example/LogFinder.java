package org.example;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class LogFinder {
    public static void main(String[] args) {
//        String path = "/Users/hujiangping/Desktop";
        String path = "/home/admin/logs";
        String suffix = ".log";
        String keyWord = "Login";

        ArrayList<Map.Entry<String, Integer>> logByKeyWord = findLogByKeyWord(path, suffix, keyWord);
        for (Map.Entry<String, Integer> stringIntegerEntry : logByKeyWord) {
            System.out.println(stringIntegerEntry.getValue() + " " + stringIntegerEntry.getKey());
        }
    }


    public static ArrayList<Map.Entry<String, Integer>> findLogByKeyWord(String path,String suffix,String keyWord){
        Map<String, Integer> logCountMap = new HashMap<>();

        ArrayList<Map.Entry<String, Integer>> result = new ArrayList<>();
        File directory = new File(path);
        //查询出当前文件夹下的所有以.log结尾的文件
        File[] files = directory.listFiles();
        if (files == null || files.length == 0){
            System.out.println("查询没有符合条件的文件");
            return result;
        }
        List<File> collect = Arrays.stream(files).filter(file -> file.getName().endsWith(suffix)).collect(Collectors.toList());

        if (!collect.isEmpty()) {
            for (File logFile : collect) {
                try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        // grep 出所有包含Login的文件名和次数
                        if (line.contains(keyWord)) {
                            // hashMap去做去重
                            logCountMap.put(line, logCountMap.getOrDefault(line, 0) + 1);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        result = new ArrayList<>(logCountMap.entrySet());

        //  通过comparator去做数字的降序排序,相等的做字母排序
        result.sort((o1, o2) -> {
            if (o1.getValue().equals(o2.getValue())) {
                return o2.getKey().compareTo(o1.getKey());
            }
            return o2.getValue() - o1.getValue();
        });

        return result;
    }
}
