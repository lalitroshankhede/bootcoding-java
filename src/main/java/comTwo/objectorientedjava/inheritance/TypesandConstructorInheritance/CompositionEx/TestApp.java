package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.CompositionEx;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {

        // TODO Create Book Object and Assign its Data Members print them.
        Book book = new Book();
        book.setTitle("Java");
        List<Author> al = new ArrayList<>();
         final Author aut = new Author();
        aut.setAge(26);
        aut.setName("Ashish");
        al.add(aut);
        book.setAuthors(al);
        Publication p = new Publication();
        p.setSince(2022);
        p.setAddress("Nagpur");
        p.setCompany("xyz");
        book.setPublisher(p);

        System.out.println("Book Title "+book.getTitle());
        for (Author auth: al) {
            System.out.println(auth.getName()+" "+auth.getAge());
        }

        System.out.println("Publication Company" +p.getCompany()+" Since Date "+p.getSince()+" Address "+p.getAddress());
    }
}
