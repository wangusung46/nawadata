package nawadata;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NawadataTest2 {

    private Scanner keyboard;
    private int input, kapBus, JumlahBus, inputAsc;
    private int[] family;

    public static void main(String[] args) {
        NawadataTest2 nawadata = new NawadataTest2();
        nawadata.setKeyboard(new Scanner(System.in));
        nawadata.setInput(nawadata.getKeyboard().nextInt());
        nawadata.setFamily(new int[nawadata.getInput()]);
        nawadata.setKapBus(4);
        nawadata.inputFamily();
        nawadata.asc();
        nawadata.four();
        nawadata.display();
    }

    public int getInputAsc() {
        return inputAsc;
    }

    public void setInputAsc(int inputAsc) {
        this.inputAsc = inputAsc;
    }

    public void inputFamily() {
        for (int i = 0; i < getInput(); i++) {
            System.out.print("Input the number of members in the family ");
            family[i] = getKeyboard().nextInt();
            if (family[i] > getKapBus()) {
                i--;
                System.out.println("Input must be equal with count of family");
            }
        }
    }

    public void asc() {
        for (int i = 0; i < getInput(); i++) {
            for (int j = i + 1; j < getInput(); j++) {
                if (family[i] < family[j]) {
                    {
                        setInputAsc(family[i]);
                        family[i] = family[j];
                        family[j] = getInputAsc();
                    }
                }
            }
        }
    }

    public void four() {
        int l = 0;
        int sum = IntStream.of(family).sum();
        for (int i = 0; i < getFamily().length; i++) {
            if (family[i] == getKapBus()) {
                setJumlahBus(++l);
//                System.out.println("Masuk 1");
                family = removeTheElement(family, i);
            }
        }
        for (int i = 0; i < getFamily().length; i++) {
            if (sum == input) {
                setJumlahBus(++l);
                break;
            }
            for (int j = i + 1; j < getFamily().length; j++) {
                if ((family[i] + family[j]) <= input) {
                    setJumlahBus(++l);
//                    System.out.println("Masuk 2");
                    family = removeTheElement(family, j);
                    family = removeTheElement(family, i);
                    i = 0;
                    j = 0;
                } else {
                    setJumlahBus(l + family.length);
                }
            }

        }
//        System.out.println("Tes " + getJumlahBus());
    }

    public int[] removeTheElement(int[] arr, int index) {
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, anotherArray, 0, index);
        System.arraycopy(arr, index + 1,
                anotherArray, index,
                arr.length - index - 1);
        return anotherArray;
    }

    public void display() {
        System.out.println(getJumlahBus());
    }

    public Scanner getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        System.out.print("Input the number of families : ");
        this.keyboard = keyboard;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {

        this.input = input;
    }

    public int[] getFamily() {
        return family;
    }

    public void setFamily(int[] family) {
        this.family = family;
    }

    public int getKapBus() {
        return kapBus;
    }

    public void setKapBus(int kapBus) {
        this.kapBus = kapBus;
    }

    public int getJumlahBus() {
        return JumlahBus;
    }

    public void setJumlahBus(int JumlahBus) {
        this.JumlahBus = JumlahBus;
    }

}
