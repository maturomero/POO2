import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InterfazGrafica extends JFrame {

    private JLabel questionLabel;
    private JButton[] answerButtons;
    private JLabel highScoreLabel;
    private JLabel difficultyLabel;
    private JLabel currentScoreLabel;

    private List<Question> questionsList = new ArrayList<>();
    private int currentQuestionIndex = 0;
    private int currentScore = 0;
    private int highScore = 1500; // Puntuación máxima inicial o puedes cargarla de un archivo

    public InterfazGrafica() {
        // Pedir la ruta del archivo de preguntas

        private void loadQuestionsFromFile(String fileName) {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("Archivo no encontrado en la ruta: " + fileName);
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(";");
                    if (parts.length == 7) { // Asegurarse de que la línea tiene 7 partes (incluyendo el índice)
                        String questionText = parts[0];
                        String[] answers = {parts[1], parts[2], parts[3], parts[4], parts[5]};

                        // Validación del índice de la respuesta correcta
                        int correctAnswerIndex = Integer.parseInt(parts[6]) - 1;
                        if (correctAnswerIndex < 0 || correctAnswerIndex >= answers.length) {
                            System.out.println("Índice de respuesta correcto fuera de límites para la pregunta: " + questionText);
                            continue;
                        }

                        String correctAnswer = answers[correctAnswerIndex];
                        questionsList.add(new Question(questionText, answers, correctAnswer));
                    } else {
                        System.out.println("Formato incorrecto en la línea: " + line);
                    }
                }
                System.out.println("Preguntas cargadas con éxito.");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el índice de respuesta correcta en un número.");
                e.printStackTrace();
            }
        }
        // Configuración de la ventana
        setTitle("Juego de Preguntas");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel Norte (Pregunta)
        questionLabel = new JLabel();
        add(questionLabel, BorderLayout.NORTH);

        // Panel Este (Puntuación máxima alcanzada)
        highScoreLabel = new JLabel("Puntuación Máxima: " + highScore);
        add(highScoreLabel, BorderLayout.EAST);

        // Panel Centro (Respuestas)
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2)); // 2 filas, 2 columnas para las 4 opciones

        // Crear botones de respuesta
        answerButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JButton();
            answerButtons[i].addActionListener(new AnswerButtonListener());
            centerPanel.add(answerButtons[i]);
        }
        add(centerPanel, BorderLayout.CENTER);

        // Panel Oeste (Dificultad seleccionada)
        difficultyLabel = new JLabel("Dificultad: Fácil");
        add(difficultyLabel, BorderLayout.WEST);

        // Panel Sur (Puntuación actual)
        currentScoreLabel = new JLabel("Puntuación Actual: " + currentScore);
        add(currentScoreLabel, BorderLayout.SOUTH);

        // Mostrar la primera pregunta si hay preguntas en la lista
        if (!questionsList.isEmpty()) {
            updateQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron preguntas en el archivo.");
            System.exit(0);
        }

        // Hacer la ventana visible
        setVisible(true);
    }

    // Método para leer las preguntas desde un archivo
    private void loadQuestionsFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 6) { // Asegurarse de que la línea tiene el formato correcto
                    String questionText = parts[0];
                    String[] answers = {parts[1], parts[2], parts[3], parts[4]};
                    String correctAnswer = parts[5];
                    questionsList.add(new Question(questionText, answers, correctAnswer));
                }
            }
            if (questionsList.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron preguntas en el archivo.");
                System.exit(0);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Clase interna para manejar los clicks en las respuestas
    private class AnswerButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            String selectedAnswer = clickedButton.getText();
            String correctAnswer = questionsList.get(currentQuestionIndex).getCorrectAnswer();

            if (selectedAnswer.equals(correctAnswer)) {
                currentScore += 100;
                JOptionPane.showMessageDialog(null, "¡Correcto!");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrecto. La respuesta correcta es: " + correctAnswer);
            }

            // Actualizar puntuación
            currentScoreLabel.setText("Puntuación Actual: " + currentScore);
            if (currentScore > highScore) {
                highScore = currentScore;
                highScoreLabel.setText("Puntuación Máxima: " + highScore);
            }

            // Pasar a la siguiente pregunta
            currentQuestionIndex = (currentQuestionIndex + 1) % questionsList.size();
            updateQuestion();
        }
    }

    // Actualiza la pregunta y las respuestas en la interfaz
    private void updateQuestion() {
        Question currentQuestion = questionsList.get(currentQuestionIndex);
        questionLabel.setText(currentQuestion.getQuestion());
        for (int i = 0; i < 4; i++) {
            answerButtons[i].setText(currentQuestion.getAnswers()[i]);
        }
    }

    public static void main(String[] args) {
        new InterfazGrafica().setVisible(true);
    }

    // Clase interna para representar una pregunta
    static class Question {
        private String question;
        private String[] answers;
        private String correctAnswer;

        public Question(String question, String[] answers, String correctAnswer) {
            this.question = question;
            this.answers = answers;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public String[] getAnswers() {
            return answers;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }
    }
}