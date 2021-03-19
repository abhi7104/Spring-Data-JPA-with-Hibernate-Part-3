package com.example.AssignmentJPA;

import com.example.AssignmentJPA.Repo.*;
import com.example.AssignmentJPA.entity.Address;
import com.example.AssignmentJPA.entity.Author;
import com.example.AssignmentJPA.entity.Book;
import com.example.AssignmentJPA.entity.Subject;
import com.example.AssignmentJPA.entity.Uni.AddressUni;
import com.example.AssignmentJPA.entity.Uni.AuthoreUni;
import com.example.AssignmentJPA.entity.Uni.BookUni;
import com.example.AssignmentJPA.entity.manytomany.AuthorMany;
import com.example.AssignmentJPA.entity.manytomany.BookMany;
import com.example.AssignmentJPA.entity.onetoone.AuthorOne;
import com.example.AssignmentJPA.entity.onetoone.BookOne;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class AssignmentJpaApplicationTests {
	@Autowired
	AuthorRepo authorRepo;
	@Autowired
	ManyToManyRepo manyToManyRepo;
	@Autowired
	OneToOneRepo oneToOneRepo;
	@Autowired
	Unimapping unimapping;
	@Autowired
	UniBookmapping uniBookmapping;
	@Test
	void contextLoads() {
	}
	@Test
	void testCreated()
	{
		Author author= new Author();
		Address address= new Address();
		Subject sub1= new Subject();
		Subject sub2= new Subject();
		Book book1 =new Book();
		Book book2= new Book();

		author.setName("abhishek");
		address.setState("delhi");
		address.setLocation("delhi");
		address.setStreetNumber("132/2");
		author.setAddress(address);
		sub1.setName("Maths");
		sub1.setDescription("mathematics");
		sub1.setAuthor(author);
		sub2.setName("C#");
		sub2.setDescription(".net");
		sub2.setAuthor(author);
		book1.setName("Classic");
		book1.setAuthor(author);
		book2.setName("Ultimate");
		book2.setAuthor(author);

		List<Subject> subjects= new ArrayList<>();
		subjects.add(sub1);
		subjects.add(sub2);
		author.setSubjects(subjects);
		List<Book> books =new ArrayList<>();
		books.add(book1);
		books.add(book2);
		author.setBooks(books);

		authorRepo.save(author);
	}
	@Test
	void testManyToMany()
	{
		AuthorMany authorMany=new AuthorMany();
		authorMany.setName("Abhishek");
		List<BookMany> bookManyList= new ArrayList<>();
		BookMany bookMany=new BookMany();
		bookMany.setName("GMS");
		bookManyList.add(bookMany);
		authorMany.setBooks(bookManyList);
		manyToManyRepo.save(authorMany);
	}

	@Test
	void testOneToOneMapping()
	{
		BookOne bookOne= new BookOne();
		bookOne.setName("JAMES NOVEL");

		AuthorOne authorOne=new AuthorOne();
		authorOne.setName("Aboi");
		bookOne.setAuthorOne(authorOne);
		oneToOneRepo.save(bookOne);
	}
	@Test
	void testUniMapping(){
		AuthoreUni authoreUni = new AuthoreUni();
		authoreUni.setName("Uniabhi");
		AddressUni address = new AddressUni();
		address.setStreetNumber("1212/213");
		address.setLocation("delhi");
		address.setState("delhi");
		authoreUni.setAddress(address);

		BookUni bookUni= new BookUni();
		bookUni.setName("uni book");
		bookUni.setAuthor(authoreUni);
		unimapping.save(authoreUni);
		uniBookmapping.save(bookUni);
	}
}
