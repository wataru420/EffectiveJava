package part8.term46;

import java.util.Iterator;

public class IterableSample implements Iterable<Character>, Iterator<Character> {
    private String text = "";
 
    public IterableSample(String text) {
        this.text = text;
    }
 
    public Iterator<Character> iterator() {
        return this;
    }
 
    private int curr = 0;
 
    public boolean hasNext() {
        if (text.length() > curr) {
            return true;
        }
        return false;
    }
 
    public Character next() {
        return text.charAt(curr++);
    }
 
    public void remove() {
        // 何もしない
    }
}
