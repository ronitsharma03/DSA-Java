public class countSteps {
    public static void main(String[] args) {
        System.out.println(stepsCount(14));
    }
    static int stepsCount(int n){
        return helper(n, 0);
    }
    static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
            return helper(num/2, count+1);
        }
        return helper(num-1, count + 1);
    }
}
