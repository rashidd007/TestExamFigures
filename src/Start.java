import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Start extends ColorsSet {

    public static void main(String arg[]){
        final Random rand = new Random();
        List <Figure> figures = new ArrayList<Figure>();
        for(int i=0; i<rand.nextInt(30);i++){
        int n=rand.nextInt(4);
        switch(n) {
            case 0: figures.add( new Square(rand.nextInt(50)+1, Colors.values()[rand.nextInt(Colors.values().length)]));
            case 1: figures.add( new Circle(rand.nextInt(50)+1, Colors.values()[rand.nextInt(Colors.values().length)]));
            case 2: {
                int a,b,c;
                while (true ){
                    a =rand.nextInt(50)+1;
                    b =rand.nextInt(50)+1;
                    c =rand.nextInt(50)+1;
                    if((a+b>c) &(a+c>b)&(b+c>a)) break;
                }
                figures.add( new Triangle(a, b, c, Colors.values()[rand.nextInt(Colors.values().length)]));
            }
            case 3:{
                int a,b,c,d;
                    a =rand.nextInt(50)+1;
                    b =rand.nextInt(50)+1;
                    if (a>b)
                    c =rand.nextInt(a-b)+b;
                    else c =rand.nextInt(b-a)+a;
                    if(a==c)c=c-1;
                    d =a+b-c;
                figures.add(new Trapezoid(a,b,c,d, Colors.values()[rand.nextInt(Colors.values().length)] ));
            }
        }
        }
        for(Figure e: figures){
            e.allInfo();
        }

    }
}
