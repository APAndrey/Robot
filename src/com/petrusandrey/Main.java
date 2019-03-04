package com.petrusandrey;

public class Main {

    public static void main(String[] args) {
        String move = "UDLR";
        boolean result = checkRobot(move);
        System.out.println(result);
    }

    private static boolean checkRobot (String move) {
        int y = 0;
        int x = 0;
        for (int i = 0; i < move.length(); i++) {
            char ch = move.charAt(i);
            switch (ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x++;
                    break;
                case 'R':
                    x--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
