package test;


public class test {
    public static void main(String[] args) {
        String name = "canwaiting";
        testUse obj = new testUse();
        String input = obj.printName(name);
        System.out.println(input);
        obj.changeName(name);
        System.out.println("-----------------");
        String input1 = new Use().printName(name);
        new Use().changeName(name);

    }
}
