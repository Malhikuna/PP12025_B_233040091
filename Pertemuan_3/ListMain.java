package Pertemuan_3;

public class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        /*list.addTail(1);
        list.addTail(4);
        list.addTail(5);
        list.addTail(7);*/

        list.addHead(7);
        list.addHead(5);
        list.addHead(4);
        list.addHead(1);

        System.out.println("Element: ");
        list.displayElement();
    }
}


