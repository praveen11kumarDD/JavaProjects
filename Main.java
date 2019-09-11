public class Main{
    public static void main(String args[]){
        Dog g = new Dog();
        g.setName("Tommy");
        System.out.println(g.getName());
        g.bark1();
        String a = g.bark();
        System.out.println(a);

    }
}