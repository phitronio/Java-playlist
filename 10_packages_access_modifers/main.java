import java.util.Scanner;
import FileLogic.Tree.PathTree;

// import package_name.sub_package_name.ClassName;


import FileLogic.FileHandler;
import EditorLogic.Editor;


// import package_name.ClassName;

public class main {
    public static void main(String[] args) {
      // Creating objects from different custom packages.
      // Because these classes are in other packages, the classes must be `public`.
      FileHandler fileHandler = new FileHandler();
      PathTree pathTree = new PathTree();
      Editor editor = new Editor();
      System.out.println("Lazy NotePad");

      // Public methods are accessible from any package.
      fileHandler.loadFile();
      editor.write();
      editor.highlight();
      editor.save();
      fileHandler.saveFile();
      pathTree.displayPath();

      // The following are intentionally not called from here:
      // editor.edit();      // protected: not accessible from non-subclass in another package
      // editor.aiAssist();  // private: accessible only inside Editor class
    }
}