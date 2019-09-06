public class Square extends Figure {
    private double side;
    private Colors color;
    public Square(double a, Colors clr){
        side = a;
        color = clr;
    }

    @Override
    public String name() {
        return "Квадрат";
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public String color() {
        return color.rusColor();
    }

    public double diagon(){
        double d= side *Math.sqrt(2);
        d=Math.round(d*100);
        return d/100;
    }

    public void allInfo(){
        System.out.println(this.name()+", площадь: "+this.area()+" кв. ед., диагональ: "+this.diagon()+" ед., цвет: "+this.color());
    }
}
