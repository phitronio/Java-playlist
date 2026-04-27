# 11. Packages and Access Modifiers [1]

This module demonstrates how Java packages organize code and how access modifiers control visibility of classes and methods.

## 1) Defining and Using Packages

### Why packages?
- Group related classes together
- Avoid name conflicts between classes
- Make large codebases easier to maintain

### How packages are defined
In Java, the `package` statement must be the first line in a class file:

- `Editor.java` -> `package EditorLogic;`
- `FileHandler.java` -> `package FileLogic;`
- `PathTree.java` -> `package FileLogic.Tree;` (sub-package)

### How packages are used
From `main.java`, classes are imported using:

- `import EditorLogic.Editor;`
- `import FileLogic.FileHandler;`
- `import FileLogic.Tree.PathTree;`

Then objects are created and methods are called normally.

---

## 2) Access Modifiers

Access modifiers define where a class/member can be accessed.

### `public`
- Visible from any package
- Used when you want broad access
- Example in this module:
  - `public class Editor`
  - `public void write()`
  - `public void save()`

### `private`
- Visible only inside the same class
- Best for internal helper logic
- Example:
  - `private void aiAssist()`
  - Called from inside `Editor.highlight()`
  - Cannot be called directly from `main`

### `protected`
- Visible inside the same package
- Also visible in subclasses even if those subclasses are in other packages
- Example:
  - `protected void edit()`
  - Not called from `main` because `main` is in another package and is not a subclass

### default (no modifier)
- Visible only inside the same package
- If a class is default, it cannot be imported from another package
- This is why `Editor` must be `public` to use it from `main.java`

---

## 3) Practical: Custom Packages + Class Access Levels

### Package structure used here
- `EditorLogic/Editor.java`
- `FileLogic/FileHandler.java`
- `FileLogic/Tree/PathTree.java`
- `main.java` (uses imports from the above packages)

### Practical outcomes
- Custom package classes are used successfully from `main`
- `public` methods are accessible from outside their package
- `private` methods stay hidden and are used only internally
- `protected` methods show restricted visibility behavior

This gives a real mini-project style demonstration of package organization and access control in Java.
