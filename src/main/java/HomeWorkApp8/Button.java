package HomeWorkApp8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {

    private int index;
    private Logic logic = new Logic();
    private Frame Frame;

    public Button(int index, int x, int y, Logic logic, Frame Frame) {
        this.index = index;
        this.logic = logic;
        this.Frame = Frame;

        this.setBounds(x * 100, y * 100, 100, 100);
        this.addActionListener(new MyKeyAdapter());
    }

    public void action(String text) {
        JOptionPane.showMessageDialog(null, text);
        logic.startPosition();
        Frame.update();
    }

    public boolean result(String symbol) {
        if (symbol == "X") {
            action("Поздравляем! Вы выйграли!");
            return true;
        }
        if (symbol == "O") {
            action("Вы проиграли!");
            return true;
        }
        if (symbol == "deadlock") {
            action("Ничья!");
            return true;
        }
        return false;
    }

    private class MyKeyAdapter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

                logic.positionUser(index);
                Frame.update();
                if(result(logic.result())) {
                    return;
            }

                logic.positionPC();
                Frame.update();
                if(result(logic.result())) {
                    return;

            }
         }
        }
    }

