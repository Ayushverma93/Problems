//-------------lexicographically smaleest string--------------
class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Set<String> seen = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        String smallest = s;
        queue.offer(s);
        seen.add(s);

        while(!queue.isEmpty()){
            String cur = queue.poll();
            if(cur.compareTo(smallest) <0){
                smallest = cur;
            }
