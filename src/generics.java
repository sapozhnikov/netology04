public class generics {
    public static void main(String[] args) {
        MagicBox<String> boxWithStrings = new MagicBox<>(5);
        boxWithStrings.add("one");
        boxWithStrings.add("two");
        boxWithStrings.add("three");
        boxWithStrings.add("four");
        boxWithStrings.add("five");
        System.out.println(boxWithStrings.pick());

        MagicBox<Integer> boxWithInts = new MagicBox<>(7);
        boxWithInts.add(1);
        boxWithInts.add(2);
        boxWithInts.add(3);
        boxWithInts.add(4);
        boxWithInts.add(5);
        boxWithInts.add(6);
        boxWithInts.add(7);
        System.out.println(boxWithInts.pick());
    }
}
