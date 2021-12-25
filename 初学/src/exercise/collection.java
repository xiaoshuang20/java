package exercise;

import java.util.ArrayList;
import java.util.Collections;

public class collection {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);

        System.out.println(nums); // 输出：[2, -5, 3, 0]
        System.out.println(Collections.max(nums)); // 输出最大元素，将输出 3
        System.out.println(Collections.min(nums)); // 输出最小元素，将输出-5
        Collections.replaceAll(nums, 0, 1);// 将 nums中的 0 使用 1 来代替
        System.out.println(nums); // 输出：[2, -5, 3, 1]

        // 判断-5在List集合中出现的次数，返回1
        System.out.println(Collections.frequency(nums, -5));
        Collections.sort(nums); // 对 nums集合排序
        System.out.println(nums); // 输出：[-5, 1, 2, 3]

        // 只有排序后的List集合才可用二分法查询
        System.out.println(Collections.binarySearch(nums, 2));
    }
}
