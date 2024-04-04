class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz =  new ArrayList();
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0){
                if (i % 5 == 0){
                    fizzBuzz.add("FizzBuzz");
                    continue;
                }
                fizzBuzz.add("Fizz");
                continue;
            }
            if (i % 5 == 0){
                fizzBuzz.add("Buzz");
                continue;
            }
            fizzBuzz.add(String.valueOf(i));
        }
        return fizzBuzz;
    }
}