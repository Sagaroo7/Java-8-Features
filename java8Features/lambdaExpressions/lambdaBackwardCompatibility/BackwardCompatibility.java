// b.addActionListener(new ActionListener(){
//  public void actionPerformed(ActionEvent e){
//      System.out.println("Hello World!");
//  }
// });

//Instead of creating anonymous inner class, we can create a lambda expression like this:

package java8Features.lambdaExpressions.lambdaBackwardCompatibility;

import java.awt.*;

public class BackwardCompatibility {

    public static void main(String[] args) {

        Frame frame = new Frame("Action Listener Java 8");

        Button button = new Button("Click Here");
        button.setBounds(650, 700, 150, 50);

//      When click a button, message will be printed in a console
        button.addActionListener(event -> System.out.println("Hello World!"));
        frame.add(button);

        frame.setSize(1450, 900);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

//  Note:
//  1. less code with lambda expression.
//  2. Backward compatibility: You can use the lambda expression with your old code.
//    Lambdas are backward compatible so you can use them in existing API when you migrate your project to java 8.
