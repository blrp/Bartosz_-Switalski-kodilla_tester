package com.kodilla.stream;



public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n -> n)                          // [2]
                .average()                                 // [3]
                .getAsDouble();                            // [4]
        System.out.println(avg);                      // [5]
    }
}
