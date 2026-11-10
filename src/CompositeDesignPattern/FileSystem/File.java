package CompositeDesignPattern.FileSystem;

public class File implements FileSystemComponent{
    String name;
    long size;
    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public void show(){
        System.out.println(name);
    }
    @Override
    public long getSize() {
        return this.size;
    }
}
