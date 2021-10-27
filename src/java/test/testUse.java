package test;

public class testUse implements testInterface {
    @Override
    public void changeName(String name) {
        System.out.println("changeName"+name);

    }

    @Override
    public String printName(String name) {
        System.out.println(name);
        return name;

    }
}
