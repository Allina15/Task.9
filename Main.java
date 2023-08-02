public class Main {
    public static void main(String[] args) {
        String [] subjects = {"Java","English","Softskill"};
       MyClass myClass = new MyClass("Alina Akhunova",21,subjects,"Plov");
       MyClass myClass1 = new MyClass("Farida Begimbay",20,subjects,"Boso lagman");
        System.out.println(myClass);
        System.out.println(myClass1);
    }
}