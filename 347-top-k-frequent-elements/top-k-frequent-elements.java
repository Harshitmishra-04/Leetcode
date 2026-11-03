class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> uniqueNums = new ArrayList<>(map.keySet());
        
        uniqueNums.sort((a, b) -> map.get(b) - map.get(a));
        
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = uniqueNums.get(i);
        }
        
        return arr;
    }
}

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer, Integer> frequencyMap = new HashMap<>();
//         for (int num : nums) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }

//         PriorityQueue<Integer> minHeap = new PriorityQueue<>(
//             (a, b) -> frequencyMap.get(a) - frequencyMap.get(b)
//         );
        
//         for (int num : frequencyMap.keySet()) {
//             minHeap.add(num);
//             if (minHeap.size() > k) {
//                 minHeap.poll(); 
//             }
//         }
        
//         int[] result = new int[k];
//         for (int i = k - 1; i >= 0; i--) {
//             result[i] = minHeap.poll();
//         }
        
//         return result;
//     }
// }