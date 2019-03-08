package HibernateApplication.dao.implementation;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernateApplication.dao.EmployeeDao;
import HibernateApplication.datasource.DataSource;
import HibernateApplication.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static String preParedStatement = "INSERT INTO EMPLOYEE(ID,NAME) VALUE(?,?) ";

	public void insert(Employee e) throws ClassNotFoundException, SQLException {

			
		Session session = DataSource.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(e);
		transaction.commit();
		session.close(); 
		
	}

	public void update(Employee e) throws ClassNotFoundException, SQLException {
		Session session = DataSource.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(e);
		transaction.commit();
		session.close();
	}

	public Employee findByEmployeeId(Integer id) {
		Session session = DataSource.getSessionFactory().openSession();

		TypedQuery<Employee> query = session.createQuery("From Employee Where id=:id",Employee.class);
		query.setParameter("id", id);
		Employee employee = query.getSingleResult();
		return employee;
		
	}

	public void delete(Integer id) {
		Session session = DataSource.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Employee e = session.load(Employee.class, id);
		session.delete(e);
		transaction.commit();
		session.close();
		
	}

	public List<Employee> findAll() {
		Session session = DataSource.getSessionFactory().openSession();

		List<Employee> query = session.createQuery("From Employee",Employee.class).getResultList();
		session.close();
		return query;
	}

}
