public class ColorsSet {

    public enum Colors{
        RED("Красный"),
        ORANGE("Оранжевый"),
        YELLOW("Желтый"),
        GREEN("Зеленый"),
        BLUE("Голубой"),
        VIOLET("Фиолетовый"),
        BLACK("Черный"),
        WHITE("Белый");

        private  String rusColors;
         Colors(String cl){
            rusColors = cl;
        }
       public String rusColor() {
            return this.rusColors;
        }
    }
}
