package com.epam;

class WrongDataInputException extends Exception {
    WrongDataInputException(String s) {
        System.err.println(s);
    }
}