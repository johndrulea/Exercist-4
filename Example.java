public class Example{

    public static void main(String args[]){

        Student s1 = new Student("Efren",30,7);
        Student s2 = new Student("Jake",20,7);
        Student s3 = new Student("Old Man River",50,7);
        Animal a2 = new Animal("Sharky", "Shark");
        Animal a3 = new Animal("Whaley", "Whale");
        Animal a4 = new Animal("Stingy", "Sting Ray");


        //s1.studentDisplay();
        //System.out.println(u1.name);
        //System.out.println(a1.name);

        a3.attack(s1);
        a2.attack(s2);
        a4.attack(s3);
    }



}