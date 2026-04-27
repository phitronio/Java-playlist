package EditorLogic;

// Public class so it can be imported and used from other packages (e.g., main class).
public class Editor {
    // public -> accessible from anywhere the class is visible
    public void write() {
        System.out.println("Writing...");
    }

    // protected -> accessible in same package + subclasses in other packages
    protected void edit() {
        System.out.println("Editing...");
    }

    // private -> accessible only inside this class
    private void aiAssist() {
        System.out.println("AI Assist...");
    }

    public void save() {
        System.out.println("Saving...");
    }

    public void highlight() {
        // Private method can be used internally by other methods of the same class.
        aiAssist();
        System.out.println("Highlighting...");
    }
}