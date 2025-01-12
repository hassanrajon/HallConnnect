/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hallconnect;
import java.util.Stack;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */

public class CentralController {
    private Stack<JFrame>frameStack;
    public CentralController(){
    frameStack = new Stack<>();
    }
    //    adding fram to the stack
    public void addFrame(JFrame frame) {
        if (frame != null) {
            frameStack.push(frame);
        } else {
            throw new IllegalArgumentException("Frame cannot be null.");
        }
    }
    // Remove and return the top JFrame from the stack
    public JFrame prevFrame() {
        if (!frameStack.isEmpty()) {
            return frameStack.pop();
        } else {
            throw new IllegalStateException("No frames to remove. Stack is empty.");
        }
    }
    
        
}
