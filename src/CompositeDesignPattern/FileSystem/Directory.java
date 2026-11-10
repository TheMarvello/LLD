package CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    String name;
    List<FileSystemComponent> children;

    public Directory(String name, List<FileSystemComponent> children) {
        this.name = name;
        this.children = children;
    }

    public void add(FileSystemComponent fileSystemComponent) {
        children.add(fileSystemComponent);
    }

    public void remove(FileSystemComponent fileSystemComponent) {
        children.remove(fileSystemComponent);
    }

    public void show() {
        System.out.println(name);
        for(FileSystemComponent f: children) {
            f.show();
        }
    }

    public long getSize() {
        long size = 0;
        for(FileSystemComponent f: children) {
            size += f.getSize();
        }
        return size;
    }
}
