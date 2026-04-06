public class Q6 {
    public int calculateSquare(int number){
        return number * number;
    }
    public static void main(String[] args){
        int number = 5;
        Q6 method = new Q6();
        System.out.println(method.calculateSquare(number));
    }
}
