public class Calculator {

    public void multiplyNo(){
        System.out.println("No args found!");
    }

    public void multiplyNo(int a){
        System.out.println(a*a);
    }

    public int multiplyNo(int a, int b){
        return a*b;
    }

    public float multiplyNo(float a, float b){
        return a*b;
    }

    public void multiplyNo(int a, int b, int c){
        System.out.println(a*b*c);
    }

    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        System.out.println(obj1.multiplyNo(4,4));
        System.out.println(obj1.multiplyNo(4.2f, 5.2f));
        obj1.multiplyNo(10,20,5);
    }

}
