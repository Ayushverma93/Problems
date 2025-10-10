//----------------------------Check if the Sentence is Pangram----------------------------//

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;