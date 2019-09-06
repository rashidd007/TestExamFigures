public class Triangle extends Figure {
    private double a, b,c,p,cr;
    private Colors color;
    public Triangle(double s1, double s2,double s3, Colors clr){
        a=s1;
        b=s2;
        c=s3;
        p=(a+b+c)/2;
        color = clr;
    }

    @Override
    public String name() {
        return "Треугольник";
    }

    @Override
    public double area() {
        double s;
        s= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        s=Math.round(s*100);
        return s/100;
    }

    @Override
    public String color() {
        return color.rusColor();
    }

    public double cornerAB(){
        cr=(a*a+b*b-c*c)/(2*a*b);
        cr=Math.acos(cr);
       return Math.round(cr * (180 / Math.PI));

    }

    public void allInfo(){
      System.out.println(this.name()+", стороны: "+a+" "+b+" "+c+", площадь: "+this.area()+" кв. ед., угол AB "+this.cornerAB()+" гр., цвет: "+this.color());
    }
}
