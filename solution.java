class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        // Your code here
        int count;
        for(int i=0;i<=txt.length()-pat.length();i++){
            count = 0;
            for(int j=0;j<pat.length();j++){
                if((txt.charAt(i+j) == pat.charAt(j))){
                    count++;
                }
            }
            if(count == pat.length()){
                return i;
            }
        }
        return -1;
    }
}