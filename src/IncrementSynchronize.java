/**
 * Created by Pavel on 02.08.2017
 */

/*
Given the following class;
      public class IncrementSynchronize {
            private int value = 0;
            //getNextValue()
      }
Write three different method options for getNextValue() that will return 'value++', each method needs to be synchronized in a different way.

 */

public class IncrementSynchronize {

    private int value = 0;

    public static void main(String[] args) {

        IncrementSynchronize i = new IncrementSynchronize();
        System.out.println(i.getNextValueFirst(i.value));
        System.out.println(i.getNextValueSecond(i.value));
        System.out.println(i.getNextValueThird(i.value));
    }

    private int getNextValueFirst(int value) {
        return ++value;
    }

    private int getNextValueSecond(int value) {
        return value += 1;
    }

    private int getNextValueThird(int value) {
        return value + 1;
    }

}
