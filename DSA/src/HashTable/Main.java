package HashTable;

public class Main {
    public static void main(String[] args) {
HashTable myHashTable = new HashTable();
myHashTable.set("nails", 1000);
        myHashTable.set("nuts", 500);
        myHashTable.set("bolts", 400);

        myHashTable.set("tiles", 678);

        myHashTable.set("screws", 843);

        System.out.println(myHashTable.get("screws"));
        System.out.println(myHashTable.get("yo"));



//        myHashTable.printAll();
    }
}
