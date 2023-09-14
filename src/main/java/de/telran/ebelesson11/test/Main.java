package de.telran.ebelesson11.test;

public class Main {

    public static void main(String[] args) {

        ClassC classC = new ClassC();
        ClassB classB = new ClassB(classC);
        ClassA classA = new ClassA(classB);
        classC.setClassA(classA);

        ClassD classD = new ClassD(classB);
        classD.setClassC(classC);

        classA.test();
    }
}
