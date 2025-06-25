public class Numbersum {
    void sum(int... nums){
        int sum=0;
        for (int num : nums)
            sum += num; 
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}