package com.pinan.demo.leetcode;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.nio.cs.ext.MacThai;

import java.util.HashMap;

/**
 * @author LT
 * @version 1.0
 * @description com.pinan.demo.leetcode
 * @date 2020/6/27
 */
public class TestLocal {
    public int[] twoSum(int[] nums, int target) throws Exception {
        int[] ints = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!hashMap.containsKey(target-nums[i])){
                hashMap.put(nums[i], i);
            }
            ints[0] = hashMap.get(target-nums[i]);
            ints[1] = i;
            return ints;
        }
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext.getBean("");
        throw new IllegalArgumentException("No two sum solution");


    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < n; end++){
            if (map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end)),start);
            }
            max = Math.max(max, end -start + 1);
            map.put(s.charAt(end),end);

        }
        return max;
    }
}
