package ru.netology.sqr;

public class SQRService {
    public int calcResult(int border_min, int border_max) {
        int root;
        int total=0;
        for (int i = 10; i < 100; i++) {
            root = i * i;
            if (root >= border_min & root <= border_max) {
                total++;
            }
        }
        return total;

    }
}
