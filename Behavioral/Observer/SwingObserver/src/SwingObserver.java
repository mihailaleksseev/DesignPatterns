import javax.swing.*;
import java.awt.*;

/**
 * Простое приложение swing, создаем панель и размещаем на ней кнопку.
 * Назначаем объекты слушателями (наблюдателями).
 * При изменении состояния субъекта вызывается метод actionPerformed вместо метода update
 */

public class SwingObserver {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserver example = new SwingObserver();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!")
        );
        button.addActionListener(event ->
                System.out.println("Come on, do it!")
        );

        // Установка свойств фрейма
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
