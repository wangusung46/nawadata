package nawadata;

import java.util.Scanner;

public class NawadataTest1 {

    private Scanner keyboard;
    private String input, vocal, conso, newInput;
    private int len;

    public static void main(String[] args) {
        NawadataTest1 nawadata = new NawadataTest1();
        nawadata.setKeyboard(new Scanner(System.in));
        nawadata.setInput(nawadata.getKeyboard().nextLine());
        nawadata.setLen(nawadata.getInput().length());
        nawadata.lowerCase();
        nawadata.arrange();
        nawadata.shifts();
        nawadata.trim();
        nawadata.display();
    }

    public NawadataTest1() {

    }

    //Sorter asc
    private void arrange() {
        char a[] = new char[getLen()];
        for (int i = 0; i < getLen(); i++) {
            a[i] = getInput().charAt(i);
        }
        for (int i = 0; i < getLen(); i++) {
            for (int j = 0; j < getLen() - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        String s = new String();
        for (int i = 0; i < getLen(); i++) {
            s += a[i];
        }
        setNewInput(s);
    }

    //Separate Vowwel and Consonant
    private void shifts() {
        String v = new String();
        String c = new String();
        for (int i = 0; i < len; i++) {
            char ch = newInput.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' ->
                    v += ch;
                default ->
                    c += ch;
            }
        }
        conso = c;
        vocal = v;
    }
    
    //Remove Sapace
    private void trim() {
        setConso(getConso().trim());
        setVocal(getVocal().trim());
    }
    
    //To Lower Case
    private void lowerCase() {
        setInput(getInput().toLowerCase());
    }

    //Output
    private void display() {
        System.out.println("Consonant : " + getConso());
        System.out.println("Vowel     : " + getVocal());
    }

    public Scanner getKeyboard() {
        System.out.print("Input Kalimat : ");
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public String getVocal() {
        return vocal;
    }

    public void setVocal(String vocal) {
        this.vocal = vocal;
    }

    public String getConso() {
        return conso;
    }

    public void setConso(String conso) {
        this.conso = conso;
    }

    public String getNewInput() {
        return newInput;
    }

    public void setNewInput(String newInput) {
        this.newInput = newInput;
    }

}
