public class Top_K_Frequent_Element347 {
    public int[] topKFrequent(int[] nums, int k) {
        //map用来统计每个int出现的次数
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //优先队列（小顶堆）
        PriorityQueue<Integer> queue = new PriorityQueue<>((p1, p2) -> map.get(p1) - map.get(p2));

        /**当队列内元素超出需要的元素个数后，比较堆顶元素的出现次数，
         如果堆顶出现次数小于当前元素的次数，则弹出当前堆顶元素并将当前元素添加进堆
         */
        for (Integer key : map.keySet()) {
            if (queue.size() == k) {
                int count = map.get(queue.peek());
                if (count < map.get(key)) {
                    queue.poll();
                    queue.add(key);
                }
            } else {
                queue.add(key);
            }
        }
        //最后将队列内的元素添加至数组中
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }
        return res;


    }
}

