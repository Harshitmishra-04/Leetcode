class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totalTime = 0;
        int currentFloor = 0;

        for(int target : requests){
            totalTime += Math.abs(target - currentFloor);
            currentFloor = target;
        }
        return totalTime;
    }
}