package code.hometasks;

public class DemoPerson {

    private int r = 12;
    protected int j = 30;


    static class First {

        private int k0;
        public int k1;
        protected int k2;

        First() {
        }

        ;

        int g() {
            Second second = new Second(10);
            //System.out.println(second.s0);
            return second.s0;
        }

        ;
    }


    static class Second {

        public int s0;
        private int s1;
        protected int s2;

        Second() {
        }

        ;

        Second(int h) {
            s0 = h;
            First first = new First();
        }

        ;
    }


    public static void main(String[] args) {
        First first;
        first = new First();
        first.g();
        Second second = new Second();

       // Phone k = new Phone();
       // k.pf();
      //  Auxiliary n = new Auxiliary();
        //n.df();


        /*Person person = new Person("AndLeb", 21);
        Person person1 = new Person();
        person.move();
        person.talk();
        person1.move();
        person1.talk();
        System.out.println("///////////////////////////");

        Reader reader = new Reader();
        reader.setFio("Petrov");
        reader.takeBook("aaaa", "bbbb", "cccc");


        reader.takeBook(new Book("AAA"), new Book("BBB"));

        reader.takeBook(new Book("vo"));
        Book book = new Book("womv");

        reader.takeBook(book);*/


        //}


    }
}
