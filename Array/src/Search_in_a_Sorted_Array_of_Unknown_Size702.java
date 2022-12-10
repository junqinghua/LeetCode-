public class Search_in_a_Sorted_Array_of_Unknown_Size702 {
    /**
     *  创新题，以交互为模式，不是直接给一个数组而是有一个arrayreader的ap,只可以调用.get方法获取下标元素
     *  本质还是二分法
     */

    public int search(ArrayReader reader, int target) {
        int left=0;
        int right =1;
        while(reader.get(right)<target){
            right+=1;
        }
        while(left<=right){
            int mid =(right+left)/2;
            if(reader.get(mid)==target){
                return mid;
            }
            else if(reader.get(mid)<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
}
