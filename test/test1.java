public class test1 {

    int [] res = new int[n-k+1];
    List<Integer> ls = new ArrayList<>();
    PriorityQueue<Integer> queue = new PriorityQueue<>((p1, p2) -> map.get(p1) - map.get(p2));
    arr=Arrays.copyOfRange(arr,0,k-1);
    for(int i=k;i<=n;i++){

        for(int num : arr){
            if (queue.size() == k){
                int cur = queue.peek();
                if(cur<num){
                    queue.poll();
                    queue.add(num);
                }
            }else{
                queue.add(num);
            }
        }
        ls.add(queue.poll());
    }
}
