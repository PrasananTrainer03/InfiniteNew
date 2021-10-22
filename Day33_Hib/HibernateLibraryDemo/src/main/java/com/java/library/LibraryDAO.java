package com.java.library;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LibraryDAO {

	static SessionFactory sf;
	static Session session;
	static Query query;
	static {
		sf = SessionHelper.getFactory();
		session = sf.openSession();
	}
	
	public List<TransBook> showIssuedBooks(String user) {
		query = session.createQuery("from TransBook where userName='" + user + "'");

		List<TransBook> lst = query.list();
		if (lst.isEmpty()) {
			return null;
		} else {
			return lst;
		}
	}
	
	public List<Books> searchBooks(String searchtype, String searchvalue) {

		if (searchtype.equals("id"))
			query = session.createQuery("from Books where id=" + Integer.parseInt(searchvalue));
		else if (searchtype.equalsIgnoreCase("dept"))
			query = session.createQuery("from Books where dept='" + searchvalue + "'");

		else if (searchtype.equalsIgnoreCase("bookname"))
			query = session.createQuery("from Books where name='" + searchvalue + "'");

		else if (searchtype.equalsIgnoreCase("authorname"))
			query = session.createQuery("from Books where author='" + searchvalue + "'");
		else
			query = session.createQuery("from Books where name!='" + searchvalue + "' or 1=1");

		List<Books> lst = query.list();

		if (lst.isEmpty())
			return null;
		else
			return lst;

	}

	public String issuedOrNot(String user, int bid) {

		query = session.createQuery("from TransBook where userName='" + user + "' and bookId=" + bid);
		List<TransBook> lst = query.list();

		if (!lst.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
	public void issueBook(TransBook tb) {
		
		Transaction t = session.beginTransaction();
		session.save(tb);
		t.commit();

		t=session.beginTransaction();
		query = session.createQuery("from Books where id=" + tb.getBookId());
		List<Books> lst = query.list();

		// Transaction t1 = s.beginTransaction();
//		t.begin();
		Books b1 = new Books();
		if (lst.size() > 0) {
			for (Books b2 : lst) {
				b1 = b2;
				// b2.setTotalbooks(b2.getTotalbooks() - 1);

			}
			b1.setTotalbooks(b1.getTotalbooks() - 1);
		}

		session.save(b1);
		t.commit();
		
	}
	public int loginCheck(LibUsers lib) {

		query = session.createQuery(
				"from LibUsers where username='" 
						+ lib.getUsername() + "' and password='" 
						+ lib.getPassword() + "'");
		List<LibUsers> lst = query.list();

		if (lst.isEmpty())
			return 0;
		else
			return 1;

	}

}
