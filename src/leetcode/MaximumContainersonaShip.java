package leetcode;

public class MaximumContainersonaShip {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n*n,maxWeight/w);
    }
}
