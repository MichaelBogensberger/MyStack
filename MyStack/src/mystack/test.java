/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

public class test {

    // BRANCH REL 2.0
	// NEUER KOMMENTAR

    public static void main(String[] args) {
        MyStack testStack = new MyStack(3);

        //Füge 3 hinzu
        testStack.push(2);
        testStack.push(2);
        testStack.push(7);
        testStack.push(2);
        testStack.push(2);
        testStack.push(7);
        testStack.push(2);
        testStack.push(2);
        testStack.push(7);
        testStack.push(2);
        testStack.push(2);
        testStack.push(7);
        
        // Lösche zwei weg und danach ausgeben
        testStack.pop();
        testStack.pop();
        testStack.peek();

    }

}
