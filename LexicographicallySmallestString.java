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
            char[] arr = cur.toCharArray();
            for(int i = 1; i<arr.length; i +=2){
                int newDigit = (arr[i] - '0' +a) % 10;
                arr[i] = (char) (newDigit + '0');
            }

            String added = new String(arr);
