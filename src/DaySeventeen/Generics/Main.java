package DaySeventeen.Generics;

public class Main {
    public static void main(String[] args){
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        Box<Milk> boxOfMilk = new Box<Milk>();
        Box<Oranges> boxOfOranges = new Box<Oranges>();

        boxOfMilk.add(milk);
        boxOfOranges.add(oranges);

        boxOfMilk.remove().drink();
        boxOfOranges.remove().juggle();
    }
}
