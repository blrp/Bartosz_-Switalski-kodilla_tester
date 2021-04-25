package com.kodilla.bank.homework;

public class CashMachine {


        private int[] transactions;
        private int size;


        public int[] getTransactions() {
            return transactions;
        }

        public int getSize() {
            return size;
        }

        public CashMachine() {
            this.transactions = new int[0];
            this.size = 0;
        }


        public int getBalance() {
            int sum = 0;
            for (int i = 0; i < transactions.length; i++) {
                sum = sum + transactions[i];
            }
            return sum;
        }



        public void addTransaction(int amount) {
            if ((getBalance() + amount) >= 0) {
                this.size++;
                int[] newTab = new int[this.size];
                System.arraycopy(transactions, 0, newTab, 0, transactions.length);
                newTab[this.size - 1] = amount;
                this.transactions = newTab;
            } else {
                System.out.println("You are unable to withdraw money from ATM now. No sufficient funds in the ATM at the moment.");
            }
        }



        public int getNumberOfWithdrawals() {
            int count = 0;
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] < 0) {
                    count++;
                }
            }
            return count;
        }



        public int getNumberOfDeposits() {
            int count = 0;
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] > 0) ;
                count++;
            }
            return count;
        }



        public double getAverageValueOfWithdrawals() {
            if (transactions.length == 0 || getNumberOfWithdrawals() == 0) {
                return 0;
            }
            double sum = 0;
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] < 0) {
                    sum += transactions[i];
                }
            }
            return sum / getNumberOfWithdrawals();
        }



        public double getAverageValueOfDeposits() {
            if (transactions.length == 0 || getNumberOfDeposits() == 0) {
                return 0;
            }
            double sum = 0;
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] > 0) {
                    sum += transactions[i];
                }
            }
            return sum / getNumberOfDeposits();
        }
    }
