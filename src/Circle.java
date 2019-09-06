public class Circle extends Figure {
    private Colors color;
    private double r;
    public Circle(double rad, Colors clr ){
        color = clr;
        r = rad;
    }

    @Override
    public String name() {
        return "Круг";
    }

    @Override
    public double area() {
        double s=Math.PI*r*r;
        s=Math.round(s*100);
        return s/100;
    }

    @Override
    public String color() {
        return color.rusColor();
    }

    public double diametr(){
        return 2*r;
    }

    public void allInfo(){
        System.out.println(this.name()+", площадь: "+this.area()+" кв. ед., диаметр: "+this.diametr()+" ед., цвет:"+this.color());
    }
}

