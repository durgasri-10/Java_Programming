class animal {
     int leg=4;
    public static void print() {
        System.out.println("eating");
    }
     void sound() {
        System.out.println("barking");

    }

}
class cat extends animal{
 public static void print() {
        System.out.println("singing");
        int leg=9;
    }
}
class inheritance {
    public static void main(String[] args) {
        cat c=new cat();
        c.print();
        c.sound();

    }
}
