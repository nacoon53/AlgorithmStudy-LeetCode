class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            String str = "";
            if(i%3==0) str += "Fizz";
            if(i%5==0) str += "Buzz";
            if(str.equals("")) str = String.valueOf(i);
            
            result.add(str);
        }
        
        return result;
    }
}