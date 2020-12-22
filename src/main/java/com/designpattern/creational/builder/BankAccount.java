package com.designpattern.creational.builder;

public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private String address;

    //Note: Private scope of constructor as it is created only by builder
    private BankAccount(BankAccountBuilder builder){
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private String address;

        public BankAccountBuilder(String name, String accountNumber){
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }
        public BankAccountBuilder withAddress(String address) {
            this.address = address;
            return this;
        }
        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
}
