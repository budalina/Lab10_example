package lab_inherit;

public class Manager extends Employee {
    public Manager(String name){
        super(name);
    }

    @Override
    public boolean validate() {
        boolean flag = true;
        // код вычисляющий состояние объекта
        return flag;

    }
}
