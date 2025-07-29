package org.sto;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.max;

class Solution {

    // 判断是否有相同的字母
    public boolean countBitSimple(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(String.valueOf(s1.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public int maxProduct(String[] words) {
        int max = 0;

        if (words.length < 2) {
            return max;
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (i == j) {
                    continue;
                }

                if (countBitSimple(words[i], words[j])) {
                    continue;
                }

                if (max < words[i].length() * words[j].length()) {
                    max = words[i].length() * words[j].length();
                }
            }
        }

        return max;
    }
}
