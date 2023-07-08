package org.sto;

/***
 * 剑指 Offer II 002. 二进制加法
 * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class Solution {
    // 本题难度不大，但是需要注意不能使用 Integer.parseInt() 方法，因为输入的字符串可能很长，超过了 Integer.MAX_VALUE，所以必须使用字符串的方式进行计算
    public String addBinary(String a, String b) {
        if (a == null || b == null) {
            return null;
        }

        if (b.replace("0", "").replace("1", "").length() != 0) {
            throw new IllegalArgumentException("b is not binary");
        }

        if (a.replace("0", "").replace("1", "").length() != 0) {
            throw new IllegalArgumentException("a is not binary");
        }

        if ("0".equals(a) && "0".equals(b)) {
            return "0";
        }

        int maxLength = Math.max(a.length(), b.length());

        String result = "";
        boolean needCarry = false;
        for (int i = 0; i < maxLength; i++) {
            if (i > a.length() - 1) {
                if (needCarry) {
                    if (b.charAt(b.length() - 1 - i) == '1') {
                        needCarry = true;
                        result = "0" + result;
                    } else {
                        needCarry = false;
                        result = "1" + result;
                    }
                } else {
                    result = b.charAt(b.length() - 1 - i) + result;
                }
                continue;
            } else if (i > b.length() - 1) {
                if (needCarry) {
                    if(a.charAt(a.length() - 1 - i) == '1') {
                        needCarry = true;
                        result = "0" + result;
                    } else {
                        needCarry = false;
                        result = "1" + result;
                    }
                } else {
                    result = a.charAt(a.length() - 1 - i) + result;
                }
                continue;
            }

            if (a.charAt(a.length() - 1 - i) == '1' && b.charAt(b.length() - 1 - i) == '1') {
                if (needCarry) {
                    result = "1" + result;
                } else {
                    result = "0" + result;
                }
                needCarry = true;
            } else if (a.charAt(a.length() - 1 - i) == '0' && b.charAt(b.length() - 1 - i) == '0') {
                if (needCarry) {
                    result = "1" + result;
                    needCarry = false;
                } else {
                    result = "0" + result;
                }
            } else {
                if (needCarry) {
                    result = "0" + result;
                } else {
                    result = "1" + result;
                }
            }
        }

        if (needCarry) {
            result = "1" + result;
        }

        return result;
    }
}
