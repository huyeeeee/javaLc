package org.leetcode.items._201_300;

/**
 * @Author: hujiangping
 * @Date: 2023/6/15 23:51
 * @Description: _273_整数转换英文表示
 * @Version 1.0.0
 */
public class _273_整数转换英文表示 {
    public String numberToWords(int num) {
        StringBuilder sb = new StringBuilder();
        int tmp = 0;
        if (num == 0) return "Zero";
        return getString(num).trim();
    }

    public String getString(int num){
        if (num >= 1000000000){
            int tmp = num / 1000000000;
            int rest = num % 1000000000;
            return String.format("%s Billion %s",getString(tmp),getString(rest)).trim();
        } else if (num >= 1000000){
            int tmp = num / 1000000;
            int rest = num % 1000000;
            return String.format("%s Million %s",getString(tmp),getString(rest)).trim();
        }else if (num >= 1000){
            int tmp = num / 1000;
            int rest = num % 1000;
            return String.format("%s Thousand %s",getString(tmp),getString(rest)).trim();
        }else if (num >= 100){
            int tmp = num / 100;
            int rest = num % 100;
            return String.format("%s Hundred %s",getString(tmp),getString(rest)).trim();
        }else if (num >= 20){
            int tmp = num / 10;
            int rest = num % 10;
            String s1 = "";
            if (tmp == 9){
                s1 = "Ninety";
            }else if (tmp == 8){
                s1 = "Eighty";
            }else if (tmp == 7){
                s1 = "Seventy";
            }else if (tmp == 6){
                s1 = "Sixty";
            }else if (tmp == 5){
                s1 = "Fifty";
            }else if (tmp == 4){
                s1 = "Forty";
            }else if (tmp == 3){
                s1 = "Thirty";
            }else if (tmp == 2){
                s1 = "Twenty";
            }
            return String.format("%s %s",s1,getString(rest)).trim();
        }else if (num >= 10){
            String s = "";
            if (num == 19){
                s = "Nineteen";
            }else if (num == 18){
                s = "Eighteen";
            }else if (num == 17){
                s = "Seventeen";
            }else if (num == 16){
                s = "Sixteen";
            }else if (num == 15){
                s = "Fifteen";
            }else if (num == 14){
                s = "Fourteen";
            }else if (num == 13){
                s = "Thirteen";
            }else if (num == 12){
                s = "Twelve";
            }else if (num == 11){
                s = "Eleven";
            }else if (num == 10){
                s = "Ten";
            }
            return s;
        }else {

            String s2 = "";
            if (num == 9){
                s2 = "Nine";
            }else if (num == 8){
                s2 = "Eight";
            }else if (num == 7){
                s2 = "Seven";
            }else if (num == 6){
                s2 = "Six";
            }else if (num == 5){
                s2 = "Five";
            }else if (num == 4){
                s2 = "Four";
            }else if (num == 3){
                s2 = "Three";
            }else if (num == 2){
                s2 = "Two";
            }else if (num == 1){
                s2 = "One";
            }
            return s2;
        }
    }
}
