import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class NotepadApp {
    // Initial window size for the application frame.
    int width = 480;
    int height = 620;

    // Core UI components.
    JFrame frame;
    JPanel mainPanel;
    JTextArea textArea;
    JScrollPane scrollPane;
    
    // Menu components.
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem newFile, openFile, saveFile, exitApp;
    
    // Extra UI widgets.
    JButton clearButton;
    JLabel welcomeLabel;

    public NotepadApp() {
        // Create the top-level application window.
        frame = new JFrame("Notepad App");
        frame.setSize(
            width, height
        );

        // Main container uses BorderLayout:
        // NORTH -> welcome label
        // CENTER -> text area with scroll
        // SOUTH -> clear button
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        textArea = new JTextArea();

        // Wrap text area with a scroll pane so content stays usable
        // even when text grows beyond visible area.
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Build menu structure and actions.
        this.initMenuBar();

        clearButton = new JButton("Clear");
        clearButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Clears all text from the editor area.
                    textArea.setText("");
                    System.out.println("Text area cleared!");
                }
            }
        );


        welcomeLabel = new JLabel("Welcome to Notepad App!", SwingConstants.CENTER);

        // Close operation for clicking the window X button.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make frame visible after base components are initialized.
        frame.setVisible(true);
    }


    public void initMenuBar() {
        // Create menu bar and top-level menus.
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        // Create file menu items.
        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        exitApp = new JMenuItem("Exit");

        // Add action for exiting application with confirmation.
        exitApp.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int confirm = JOptionPane.showConfirmDialog(
                        frame,
                        "Are you sure you want to exit?",
                        "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (confirm == JOptionPane.YES_OPTION) {
                        System.out.println("Exiting the application...");
                        // Terminates Java process.
                        System.exit(0);
                    }
                }
            }
        );
    }

    public void addMenuItems() {
        // Add items to File menu.
        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(exitApp);

        // Add all top-level menus to menu bar.
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Attach menu bar to frame.
        frame.setJMenuBar(menuBar);
    }


    public void createGUI() {
        // Place components into BorderLayout regions.
        mainPanel.add(clearButton, BorderLayout.SOUTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(welcomeLabel, BorderLayout.NORTH);
        frame.add(mainPanel);
        // Populate and connect menu UI.
        this.addMenuItems();
    }


    public static void main(String[] args) {
        // Application entry point.
        NotepadApp notepadApp = new NotepadApp();
        notepadApp.createGUI();
    }
}