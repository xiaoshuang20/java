package 挑战赛;

import java.util.*;

/*
    仓库新进了几批物资，只知道每批物资的数量和单价，请编写程序，按照每种物资的总价值，由高到低次序输出
    输入说明：第1行 一个整数N，表明物资的批次数量
    第2 -- N+1行，每批物资的类别、数量及单价，中间用空格隔开，其中类别用A-Z加以区分。
    输出说明：按物资价值降序输出排序结果，每行输出一种物资。
    输入样例：5
        A 5 10.00
        B 3 2.00
        A 5 8.00
        B 3 2.50
        C 10 3.50
    输出样例：A 90.00
            C 35.00
            B 13.50
 */
public class demo_05_HashMap {

    public static void main(String[] args) {
        String goods;
        int num;
        float price;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<String, Float> map = new HashMap<>();

        // 利用 HashMap 存放数据
        for (int i = 0; i < N; i++) {
            goods = scanner.next();
            num = scanner.nextInt();
            price = scanner.nextFloat();
            if(map.containsKey(goods)) {
                float re =  map.remove(goods);
                map.put(goods, re + (num * price));
            } else {
                map.put(goods, num * price);
            }
        }

        String[] result = sort(map);
        for(String r : result) {
            System.out.println(r + " " + map.get(r));
        }
    }

    // 存在 bug: 当有物资价值相同时出错
    public static String[] sort(Map<String, Float> map) {
        // 创建字符串数组
        String[] str = new String[map.size()];

        // 原 map里的键值对反过来
        Set<String> set = map.keySet();
        HashMap<Float, String> result = new HashMap<>();
        for (String s : set) {
            result.put(map.get(s), s);
        }

        // 将新 map里的 key(即价值)存入数组
        int k = 0;
        Set<Float> keySet = result.keySet();
        Float[] array = new Float[result.size()];
        for(Float f : keySet){
            array[k++] = f;
        }

        // 数组从大到小排序
        float temp = 0;
        for (int i = 0; i < result.size() - 1; i++) {
            for(int j = i + 1; j < result.size(); j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // 根据数组顺序将 value(即物资类别)存入字符串数组
        for (int i = 0; i < array.length; i++) {
            str[i] = result.get(array[i]);
        }
        return str;
    }
}
