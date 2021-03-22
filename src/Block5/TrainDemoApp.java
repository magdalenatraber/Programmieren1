package Block5;

public class TrainDemoApp {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(5);

        linkedList.add((37));


        linkedList.add((19));
        linkedList.add((7));
        linkedList.add((25));
        linkedList.add((8));
        linkedList.add((6));
        linkedList.printAllNodes();
        System.out.println();
        System.out.println("linkedList.containsValue(37) = " + linkedList.containsValue(37));
        System.out.println("linkedList.containsValue(58) = " + linkedList.containsValue(58));
        System.out.println("linkedList.getAt(4).value = " + linkedList.getAt(4).value);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(4);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(1);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(5);
        linkedList.printAllNodes();
        linkedList.add(85);
        System.out.println();
        linkedList.printAllNodes();
        linkedList.addElement(2,78);
        System.out.println();
        linkedList.printAllNodes();
        linkedList.addElement(1, 69);
        System.out.println();
        linkedList.printAllNodes();
        linkedList.addElement(8, 13);
        System.out.println();
        linkedList.printAllNodes();
        linkedList.changeValue(5,7);
        System.out.println();
        linkedList.printAllNodes();

    }

}
