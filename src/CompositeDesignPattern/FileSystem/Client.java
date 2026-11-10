package CompositeDesignPattern.FileSystem;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Directory root = new Directory("root", new ArrayList<>());
        File f1 = new File("f1.txt", 100);
        Directory docs = new Directory("docs", new ArrayList<>());
        root.add(docs);
        docs.add(f1);
        docs.add(f1);
        root.add(f1);

//        f1.show();
        root.show();

        System.out.println(root.getSize());
    }
}
