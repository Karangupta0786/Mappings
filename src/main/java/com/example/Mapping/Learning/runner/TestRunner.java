//package com.example.Mapping.Learning.runner;
//
//import com.example.Mapping.Learning.entity.Book;
//import com.example.Mapping.Learning.entity.Student;
//import com.example.Mapping.Learning.repository.BookRepository;
//import com.example.Mapping.Learning.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Set;
//
//@Component
//public class TestRunner implements CommandLineRunner {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        // create objects.
//        Book book = new Book(1,"Java Book");
//        Book book1 = new Book(2,"Data Structure");
//
//        Book book2 = new Book(3,"Kotlin Book");
//        Book book3 = new Book(4,"Compose Book");
//        Book book4 = new Book(5,"OOPS Book");
//
//        Set<Book> l1 = Set.of(book,book1);
//        Set<Book> l2 = Set.of(book2,book3);
//        Set<Book> l3 = Set.of(book4,book);
////        Set<Book> l4 = Set.of(book2,book3,book4);
////        Set<Book> l5 = Set.of(book,book1,book2,book3,book4);
//
//        // save those objects.
//        bookRepository.save(book);
//        bookRepository.save(book1);
//        bookRepository.save(book2);
//        bookRepository.save(book3);
//        bookRepository.save(book4);
//
//        // create students.
//        Student student = new Student(1,"Karan Gupta",l1);
//        Student student1 = new Student(2,"Arjun Gupta",l2);
//        Student student2 = new Student(3,"Anjali Gupta",l3);
////        Student student3 = new Student(4,"Lumophile Agarwal",l4);
////        Student student4 = new Student(5,"Santosh Agarwal",l5);
//
//        studentRepository.save(student);
//        studentRepository.save(student1);
//        studentRepository.save(student2);
////        studentRepository.save(student3);
////        studentRepository.save(student4);
//
//    }
//}
