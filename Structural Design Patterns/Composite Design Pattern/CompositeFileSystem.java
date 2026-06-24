// Component (Common Interface)
//    |
//    |-------------------
//    |                  |
// Leaf               Composite
// (File)            (Folder)
//                      |
//                children (List<Component>)

import java.util.ArrayList;
import java.util.List;

interface FileSystem {
    void showDetails();
}

class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("File: " + name);
    }
}

class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(FileSystem child) {
        children.add(child);
    }

    public void removeChild(FileSystem child) {
        children.remove(child);
    }

    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystem child : children) {
            child.showDetails();
        }
    }
}

public class CompositeFileSystem {
    
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        Folder subFolder = new Folder("SubFolder");
        File file3 = new File("File3.txt");

        root.addChild(file1);
        root.addChild(file2);
        root.addChild(subFolder);
        subFolder.addChild(file3);

        root.showDetails();
    }
}
