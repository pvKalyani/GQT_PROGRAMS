package demo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizSwing extends JFrame implements ActionListener {

    // -------- LOGIN --------
    String playerName;

    // -------- UI --------
    JLabel lblQuestion, lblScore, lblLifeline;
    JRadioButton opt1, opt2, opt3, opt4;
    JButton btnSubmit, btnAudience, btnFifty;
    ButtonGroup bg;

    // -------- GAME DATA --------
    int qno = 0;
    int score = 0;
    boolean audienceUsed = false;
    boolean fiftyUsed = false;

    String questions[] = {
            "What is the size of an int data type in Java?",
            "Which symbol is used to end a statement in Java?",
            "Keyword to create object?",
            "Which of the following is a 1-D array declaration?",
            "What is the default value of an instance variable in Java?",
            "Which of the following is not a Java data type?",
            "Java does not support which inheritance?",
            "Keyword for exception handling?",
            "Which is an output statement?",
            "Keyword for inheritance?"
    };

    String options[][] = {
            {"8 bits", "16 bits", "32 bits", "64 bits"},
            {";", ",", "/", "#"},
            {"class", "object", "new", "create"},
            {"int a;", "int a[][];", "int[] a;", "array int a;"},
            {"garbage value", "zero", "null", "depends on data type"},
            {"int", "float", "boolean", "real"},
            {"single", "multiple", "multilevel", "hierarchical"},
            {"try", "throw", "catch", "finally"},
            {"System.in", "System.read", "System.out.println", "Scanner"},
            {"implement", "inherit", "extends", "super"}
    };

    int answers[] = {2, 0, 2, 2, 1, 3, 1, 0, 2, 2};

    String audiencePoll[][] = {
            {"10%", "20%", "70%", "30%"},
            {"95%", "45%", "25%", "5%"},
            {"5%", "15%", "80%", "10%"},
            {"25%", "10%", "95%", "30%"},
            {"10%", "90%", "20%", "30%"},
            {"15%", "10%", "65%", "90%"},
            {"15%", "5%", "90%", "10%"},
            {"70%", "10%", "10%", "10%"},
            {"80%", "5%", "95%", "10%"},
            {"10%", "10%", "90%", "5%"}
    };

    int fiftyFifty[][] = {
            {2, 3}, {0, 1}, {1, 2}, {0, 2}, {1, 3},
            {0, 3}, {1, 2}, {0, 1}, {0, 2}, {2, 3}
    };

    // -------- CONSTRUCTOR --------
    public QuizSwing(String name) {

        this.playerName = name;

        setTitle("Quiz Game - Player: " + playerName);
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        lblQuestion = new JLabel();
        lblQuestion.setFont(new Font("Arial", Font.BOLD, 16));

        lblScore = new JLabel("Score: 0");
        lblScore.setFont(new Font("Arial", Font.BOLD, 14));

        lblLifeline = new JLabel(" ");
        lblLifeline.setForeground(Color.BLUE);

        opt1 = new JRadioButton();
        opt2 = new JRadioButton();
        opt3 = new JRadioButton();
        opt4 = new JRadioButton();

        bg = new ButtonGroup();
        bg.add(opt1);
        bg.add(opt2);
        bg.add(opt3);
        bg.add(opt4);

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        optionsPanel.add(opt1);
        optionsPanel.add(opt2);
        optionsPanel.add(opt3);
        optionsPanel.add(opt4);

        btnSubmit = new JButton("Submit");
        btnAudience = new JButton("Audience Poll");
        btnFifty = new JButton("50-50");

        btnSubmit.addActionListener(this);
        btnAudience.addActionListener(this);
        btnFifty.addActionListener(this);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(btnAudience);
        bottomPanel.add(btnFifty);
        bottomPanel.add(btnSubmit);

        add(lblQuestion, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);
        add(lblLifeline, BorderLayout.WEST);
        add(lblScore, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);

        loadQuestion();
        setVisible(true);
    }

    // -------- LOAD QUESTION --------
    void loadQuestion() {

        lblQuestion.setText("Q" + (qno + 1) + ": " + questions[qno]);
        opt1.setText(options[qno][0]);
        opt2.setText(options[qno][1]);
        opt3.setText(options[qno][2]);
        opt4.setText(options[qno][3]);

        opt1.setEnabled(true);
        opt2.setEnabled(true);
        opt3.setEnabled(true);
        opt4.setEnabled(true);

        bg.clearSelection();
        lblLifeline.setText(" ");
    }

    // -------- ACTION EVENTS --------
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAudience) {
            if (!audienceUsed) {
                lblLifeline.setText("Audience Poll → "
                        + audiencePoll[qno][0] + "  "
                        + audiencePoll[qno][1] + "  "
                        + audiencePoll[qno][2] + "  "
                        + audiencePoll[qno][3]);
                audienceUsed = true;
            } else {
                JOptionPane.showMessageDialog(this, "Audience Poll already used!");
            }
        }

        if (e.getSource() == btnFifty) {
            if (!fiftyUsed) {
                int a = fiftyFifty[qno][0];
                int b = fiftyFifty[qno][1];

                if (a != 0 && b != 0) opt1.setEnabled(false);
                if (a != 1 && b != 1) opt2.setEnabled(false);
                if (a != 2 && b != 2) opt3.setEnabled(false);
                if (a != 3 && b != 3) opt4.setEnabled(false);

                fiftyUsed = true;
            } else {
                JOptionPane.showMessageDialog(this, "50-50 already used!");
            }
        }

        if (e.getSource() == btnSubmit) {

            int selected = -1;
            if (opt1.isSelected()) selected = 0;
            if (opt2.isSelected()) selected = 1;
            if (opt3.isSelected()) selected = 2;
            if (opt4.isSelected()) selected = 3;

            if (selected == -1) {
                JOptionPane.showMessageDialog(this, "Please select an option!");
                return;
            }

            if (selected != answers[qno]) {
                JOptionPane.showMessageDialog(this,
                        "Wrong Answer!\nGame Over\nPlayer: " + playerName +
                                "\nScore: " + score);
                System.exit(0);
            }

            score += (qno + 1) * 100;
            lblScore.setText("Score: " + score);
            qno++;

            if (qno == questions.length) {
                JOptionPane.showMessageDialog(this,
                        "CONGRATULATIONS " + playerName +
                                "\nQuiz Completed\nFinal Score: " + score);
                System.exit(0);
            }

            loadQuestion();
        }
    }

    // -------- MAIN (LOGIN) --------
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(
                null,
                "Enter Your Name",
                "Quiz Login",
                JOptionPane.QUESTION_MESSAGE
        );

        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name is mandatory!");
            System.exit(0);
        }

        new QuizSwing(name);
    }
}
