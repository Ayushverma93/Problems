//--------find x-sum of all k-long subarrayII---------
import java.util.*;
import java.util.function.Consumer;

class Solution {

    static class Node implements Comparable<Node> {
        int val;
        int freq;
        Node(int v, int f) { val = v; freq = f; }

        // Order: higher freq first. If equal freq, higher val first.
        @Override
        public int compareTo(Node o) {
            if (this.freq != o.freq) return Integer.compare(o.freq, this.freq);
            return Integer.compare(o.val, this.val);
        }