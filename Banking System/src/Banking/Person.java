package Banking;

import java.util.Random;

public class Person {
    protected String name;
    protected String cpf;
    protected String phone;
    protected String email;
    protected String address;

    public Person(String name, String cpf, String phone, String email, String address) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
