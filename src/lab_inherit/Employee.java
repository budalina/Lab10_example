package lab_inherit;

public abstract class Employee extends Person {
    private String taxpayerIdentificationNumber;
    private String employeeNumber;
    private int salary;

    public Employee(String name){
        super();
    }

    @Override
    public String getName() {
        return "My name is " + super.getName();
    }

    public abstract boolean validate();
}
