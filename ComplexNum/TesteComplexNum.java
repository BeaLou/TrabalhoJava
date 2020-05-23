package ComplexNum;

public class TesteComplexNum {
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(3.6, 5);
        ComplexNum c2 = new ComplexNum(1.3, 9.1);
        ComplexNum temp = ComplexNum.sum(c1,c2);
        System.out.printf( "Subtraction is: " + Math.pow(temp.real, 2)+ " - "+
        Math.pow(temp.img, 2)+"i");
        }
        
}