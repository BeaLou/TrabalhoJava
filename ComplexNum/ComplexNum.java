package ComplexNum;

public class ComplexNum {
    double real, img;
    ComplexNum(double real, double imagem) {
    this.real = real;
    this.img = imagem;
    }
    public static ComplexNum sum(ComplexNum cn1, ComplexNum cn2) {
     
    ComplexNum temp = new ComplexNum (0,0);
    temp.real = cn1.real + cn2.real;
    temp.img = cn1.img + cn2.img;
    return temp;
    }
}
    