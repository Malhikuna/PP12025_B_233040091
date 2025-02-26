package Pertemuan_4;

public class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(4);
        list.addTail(5);
        list.addMid(5, 2);
        list.addMid(5, 2);
        list.addMid(4, 2);
        list.addMid(1, 2);
        list.addMid(1, 2);
        list.addMid(1, 2);
        list.addMid(2, 2);
        list.addHead(3);

        System.out.print("Element: ");
        list.displayElement();
    }
}