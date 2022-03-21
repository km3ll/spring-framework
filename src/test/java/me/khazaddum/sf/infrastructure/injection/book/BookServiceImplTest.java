package me.khazaddum.sf.infrastructure.injection.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceImplTest {

	@Test
	public void givenNewBook_thenSavedSuccess() {

		BookRepository bookRepository = new BookRepository();
		IBookService bookService = new BookServiceViaConstructorImpl(bookRepository);

		Book newBook = new Book("1100", "The Hobbit");

		assertNotNull(bookService.save(newBook));

	}

}