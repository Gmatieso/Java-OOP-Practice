package DaySeventeen.Generics;

public class Main {
    public static void main(String[] args){
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        Box<Milk> boxOfMilk = new Box<Milk>();
        Box<Oranges> boxOfOranges = new Box<Oranges>();

        debugAdd(milk,boxOfMilk);
        debugAdd(oranges,boxOfOranges);

        boxOfMilk.remove().drink();
        boxOfOranges.remove().juggle();
    }

    static <T> void debugAdd(T item, Box<T> box){
            System.out.println("Type:" + item.getClass().getSimpleName());
            box.add(item);
    }
}
