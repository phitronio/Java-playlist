# Java GUI Tutorial (Swing) - NotepadApp

This folder demonstrates a beginner-friendly Java GUI app using **Swing**.
The app includes:
- A main window (`JFrame`)
- A text editor area (`JTextArea`)
- Scroll support (`JScrollPane`)
- A menu bar with menu items (`JMenuBar`, `JMenu`, `JMenuItem`)
- Buttons and labels (`JButton`, `JLabel`)
- Event handling (`ActionListener`)
- Basic layout management (`BorderLayout`)

## Files In This Folder

- `NotepadApp.java`: Main GUI source code
- `layout.png`: Layout-related note/image
- `border.png`: BorderLayout-related note/image
- `readme.md`: This tutorial

## English Tutorial

### 1) `JFrame` - Main Window
- `JFrame` is the top-level window for Swing apps.
- In this project, `frame` is the application window with title `"Notepad App"`.
- `setSize(width, height)` defines the window dimensions.

### 2) `JPanel` + `BorderLayout`
- `JPanel` acts as a container that holds other components.
- `BorderLayout` divides the panel into 5 regions:
  - `NORTH`, `SOUTH`, `EAST`, `WEST`, `CENTER`
- This project uses:
  - `NORTH`: welcome label
  - `CENTER`: text area inside scroll pane
  - `SOUTH`: clear button

### 3) `JTextArea` + `JScrollPane`
- `JTextArea` is a multi-line editable text field.
- `JScrollPane` wraps the text area to provide scrollbars when needed.
- This is essential for note/editor type apps.

### 4) Menu System (`JMenuBar`, `JMenu`, `JMenuItem`)
- `JMenuBar` is attached to `JFrame`.
- Menus in this app:
  - File
  - Edit
  - Help
- File menu items:
  - New
  - Open
  - Save
  - Exit
- In this version, `Open` and `Save` are intentionally kept as **self-practice tasks** for learners/readers.

### 5) Event Handling (`ActionListener`)
- Swing is event-driven.
- A component action (button click/menu click) triggers listener code.
- In this project:
  - **Clear button** sets text area to empty string.
  - **Exit menu item** shows confirmation dialog then exits on `YES`.

### 6) Dialogs (`JOptionPane`)
- `JOptionPane.showConfirmDialog(...)` is used for simple popup confirmations.
- It returns the selected option (`YES`, `NO`, etc.).

### 7) Program Flow
1. Constructor creates all components.
2. `initMenuBar()` initializes menu objects and listeners.
3. `createGUI()` adds components to layout and frame.
4. `main()` creates app object and builds UI.

## Important Learning Notes

- Keep UI building code organized in methods (`initMenuBar`, `createGUI`).
- Prefer meaningful names for components (`clearButton`, `welcomeLabel`).
- Event handlers should do one clear job.
- For larger apps, split UI + logic into separate classes.

---

# বাংলা টিউটোরিয়াল (Bangla Version)

এই ফোল্ডারে Java Swing দিয়ে একটি বেসিক **Notepad-type GUI app** বানানো হয়েছে।
এখানে শেখানো হয়েছে:
- `JFrame` দিয়ে window তৈরি
- `JPanel` + `BorderLayout` দিয়ে layout সাজানো
- `JTextArea` দিয়ে text editing area
- `JScrollPane` দিয়ে scroll support
- `JMenuBar`/`JMenu`/`JMenuItem` দিয়ে menu system
- `ActionListener` দিয়ে button/menu click handle
- `JOptionPane` দিয়ে popup confirmation

## ফাইলগুলোর কাজ

- `NotepadApp.java`: মূল GUI কোড
- `layout.png`: layout এর ধারণা
- `border.png`: BorderLayout এর ধারণা
- `readme.md`: এই টিউটোরিয়াল

## মূল বিষয়গুলো

### 1) `JFrame`
- Swing app-এর main window।
- এই প্রোজেক্টে title: `"Notepad App"`।
- `setSize()` দিয়ে window size নির্ধারণ করা হয়েছে।

### 2) `JPanel` এবং `BorderLayout`
- `JPanel` হলো container, এর ভিতরে component বসে।
- `BorderLayout` 5টি region দেয়: `NORTH`, `SOUTH`, `EAST`, `WEST`, `CENTER`।
- এখানে:
  - `NORTH` এ welcome label
  - `CENTER` এ text area + scroll
  - `SOUTH` এ clear button

### 3) `JTextArea` এবং `JScrollPane`
- `JTextArea` হলো multi-line text input/editor।
- `JScrollPane` text area-কে scrollable করে।
- Notepad-type app-এর জন্য খুব দরকারি।

### 4) Menu System
- `JMenuBar` frame-এ বসানো হয়।
- এই app-এ menu: File, Edit, Help
- File menu item: New, Open, Save, Exit
- এই ভার্সনে `Open` এবং `Save` ইচ্ছাকৃতভাবে **self-do practice task** হিসেবে রাখা হয়েছে, যাতে পাঠকরা নিজে implement করতে পারে।

### 5) Event Handling (`ActionListener`)
- GUI app event-driven; click হলে listener code run করে।
- এই app-এ:
  - Clear button চাপলে text area খালি হয়।
  - Exit চাপলে confirmation dialog আসে; Yes হলে app বন্ধ হয়।

### 6) `JOptionPane`
- ছোট popup message/confirmation এর জন্য ব্যবহার হয়।
- `showConfirmDialog` ইউজারের পছন্দ return করে।

### 7) কোডের flow
1. Constructor-এ component তৈরি
2. `initMenuBar()`-এ menu setup + event setup
3. `createGUI()`-তে layout-এ component add
4. `main()` থেকে app run

## শেখার পরের ধাপ

- New/Open/Save menu-তে real file operation যুক্ত করা
- Font size, color, theme option যোগ করা
- Keyboard shortcut (`Ctrl+S`, `Ctrl+O`) যোগ করা
- Swing এর পর JavaFX শেখা
