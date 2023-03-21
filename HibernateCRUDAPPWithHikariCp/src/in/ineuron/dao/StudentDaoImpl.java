package in.ineuron.dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;


public class StudentDaoImpl implements IStudentDao {
    
	Session session = null;
	Transaction transaction = null;	
	boolean flag = false;		
	String status = null;
	Student student = null;
	
	@Override
	public String save(Student student) {
		try {
			
			session = HibernateUtil.getSession();
			if (session != null) {
				transaction = session.beginTransaction();
			}
			if (transaction != null) {
				session.save(student);
				flag= true;
			}	
			
		} catch (HibernateException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (flag) {
				transaction.commit();
				status = "success";
			} else {
				transaction.rollback();
				status = "failure";
			}
		}
		
		return status;
	}

	@Override
	public Student findById(Integer sid) {
		session = HibernateUtil.getSession();
		student = session.get(Student.class, sid);
		return student;
	}

	@Override
	public String updateById(Student student) {
		try {
			
				session = HibernateUtil.getSession();
				if (session != null) {
					transaction = session.beginTransaction();
				}
				if (transaction != null) {
					session.saveOrUpdate(student);
					flag= true;
				}	
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (flag) {
				transaction.commit();
				status = "success";
			} else {
				transaction.rollback();
				status = "failure";
			}
		}
		
		return status;
	}

	@Override
	public String deleteById(Integer sid) {
		
			try {
			
				session = HibernateUtil.getSession();
				if (session != null) {
					transaction = session.beginTransaction();
				}
				if (transaction != null) {
					student = session.get(Student.class, sid);
					 if (student != null) {
						session.delete(student);
						flag= true;
					}	
				}	
			
		} catch (HibernateException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (flag) {
				transaction.commit();
				status = "success";
			} else {
				transaction.rollback();
				status = "failure";
			}
		}
		
		return status;
	}

}
