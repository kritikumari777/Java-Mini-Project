package day2;

public class TestBook {

    public static void main(String[] args) {
        Books obj = new Books("j001","Java for Beginner","sapient");
        System.out.println(obj);

        Books obj1 = new Books("j002","Java for Beginner","sapient");
        System.out.println(obj1);
        System.out.println(obj.equals(obj1));

    }
}

