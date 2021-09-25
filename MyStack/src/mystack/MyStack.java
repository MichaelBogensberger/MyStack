package mystack;

public class MyStack {

    Integer[] turm = new Integer[50];
    Integer counter = 0;

    public MyStack(int size) {
        turm = new Integer[size];
    } 
    
    
    public void ifFull() {
        if (counter >= turm.length) {
            System.out.println("Fehler!!! \nStack ist voll.");
            System.exit(0);
        }
    }

    public void ifEmpty() {
        if (counter == 0) {
            System.out.println("Fehler!!! \nStack ist leer.");
            System.exit(0);
        }
    }

    public void push(Integer block) {
        ifFull();
        turm[counter] = block;
        counter++;
    }
    
    public void peek() {
        ifEmpty();
        int erg = turm[counter - 1];
        System.out.println(erg);
    }

    public void pop() {
        ifEmpty();
        turm[counter - 1] = null;
        counter--;
    }



}
