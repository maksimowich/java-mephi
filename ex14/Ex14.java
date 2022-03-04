package ru.mephi.java.ex14;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputRow;
        ArrayList<ArrayList<Integer>> inputNumbers = new ArrayList<ArrayList<Integer>>();
        while (true) {
            inputRow = scanner.nextLine().replaceAll("( )+", " ");
            if (!checkInputString(inputRow)) return;
            if ("".equals(inputRow)) break;
            String[] rowInStringArray = inputRow.split(" ");
            ArrayList<Integer> rowInIntegerArray = new ArrayList<>();
            for (String element : rowInStringArray) {
                Integer i = Integer.parseInt(element);
                rowInIntegerArray.add(i);
            }
            inputNumbers.add(rowInIntegerArray);
        }
        System.out.println(isMagicSquare(inputNumbers));
    }


    public static boolean isSquare(ArrayList<ArrayList<Integer>> numbers) {
        if (numbers.size() < 1) return false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).size() != numbers.size()) return false;
        }
        return true;
    }

    public static Integer getSumOfRow(Integer n, ArrayList<ArrayList<Integer>> inputNumbers) {
        ArrayList<Integer> row = inputNumbers.get(n);
        Integer sum = 0;
        for (int i = 0; i < row.size(); i++) sum += row.get(i);
        return sum;
    }

    public static boolean isMagicSquare(ArrayList<ArrayList<Integer>> inputNumbers) {
        if (!isSquare(inputNumbers)) return false;
        Integer sumOfFirstRow = getSumOfRow(0, inputNumbers);
        for (int i = 0; i < inputNumbers.size(); i++) {
            if (sumOfFirstRow != getSumOfRow(i, inputNumbers) || sumOfFirstRow != getSumOfColumn(i, inputNumbers)) {
                return false;
            }
        }
        if (sumOfFirstRow != getSumOfDiag1(inputNumbers) || sumOfFirstRow != getSumOfDiag2(inputNumbers)) {
            return false;
        }
        return true;
    }

    public static Integer getSumOfColumn(Integer n, ArrayList<ArrayList<Integer>> inputNumbers) {
        Integer sum = 0;
        for (ArrayList<Integer> row : inputNumbers) {
            sum += row.get(n);
        }
        return sum;
    }


    public static Integer getSumOfDiag1(ArrayList<ArrayList<Integer>> inputNumbers) {
        Integer sum = 0;
        for (int i = 0; i < inputNumbers.size(); i++) {
            sum += inputNumbers.get(i).get(i);
        }
        return sum;
    }


    public static Integer getSumOfDiag2(ArrayList<ArrayList<Integer>> inputNumbers) {
        Integer sum = 0;
        for (int i = inputNumbers.size() - 1, j = 0; i >= 0; i--, j++) {
            sum += inputNumbers.get(j).get(i);
        }
        return sum;
    }


    public static boolean checkInputString(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (!(c + 0 >= '0' + 0 && c + 0 <= '9' + 0 || c == ' ')) return false;
        }
        return true;
    }

}
