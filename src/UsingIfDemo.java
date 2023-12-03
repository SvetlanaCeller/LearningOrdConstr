//Управляющие инструкции - условный оператор,
//Оператор выбора и операторы цикла
//Синтксич конструкции, кот позвол создавать в программе точки ветвления, много кратно выполнять опред блоки
// команд
//УСЛОВНЫЙ ОПЕРАТОР-позвол выполнять разные блоки команд в завис от ист или ложн условия (значения логич типа)

import javax.swing.*;

class UsingIfDemo {
    public static void main(String[] args) {
        String input, txt, title;
        int number;
        ImageIcon img;
        input = JOptionPane.showInputDialog(null, "Enter the natural number:",
                "Checking the number", JOptionPane.QUESTION_MESSAGE);


        if (input == null) {
            JOptionPane.showMessageDialog(null, "You didn't enter the number",
                    "Input mistake", JOptionPane.ERROR_MESSAGE);
            //Завершение выполнения программы
            System.exit(0);
        }


        //Преобразование текста в число
        number = Integer.parseInt(input);
        if (number % 2 == 0) {
            //Создание проекта пиктограммы
            img = new ImageIcon("c:\\Users\\Профи\\Downloads\\progect_png.png");
            txt = "Number " + number + "is even!";
            title = "The even number";
        }
        else {
            img = new ImageIcon("d:books/pictures/odd.png");
            txt = "Number " + number + " is odd!";
            title = "The even number";
        }
        JOptionPane.showMessageDialog(null, txt, title, JOptionPane.QUESTION_MESSAGE, img);
    }
}