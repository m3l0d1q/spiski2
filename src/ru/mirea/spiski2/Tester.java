package ru.mirea.spiski2;

public class Tester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert("qwe");
        list.insert("q");
        list.insert("qwerty");
        list.insert("qw");
        list.insert("qwert");

        list.display();
    }
}