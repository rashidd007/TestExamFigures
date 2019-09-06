public class Trapezoid extends Figure {
    private double a,b,c,d,h;
    private Colors color;
    public Trapezoid(double s1, double s2, double s3, double s4, Colors clr){
        a =s1;
        b =s2;
        c =s3;
        d =s4;
        color=clr;
    }


    @Override
    public String name() {
        return "Трапеция";
    }

    @Override
    public double area() {
        double s;
        s= (((a+b)/2)*this.height())*100;
        s=Math.round(s);
        return s/100;
    }

    @Override
    public String color() {
        return color.rusColor();
    }

    public double height(){
        h=Math.sqrt(c*c - (Math.pow((((b-a)*(b-a)+c*c-d*d)/(2*(b-a))), 2)))*100;
        h=Math.round(h);
        return h/100;
    }

    public void allInfo(){
        System.out.println(this.name()+", стороны: "+a+" "+b+" "+c+" "+d+", площадь: "+this.area()+" кв. ед., высота: "+this.height()+" ед., цвет: "+this.color());
    }
}
