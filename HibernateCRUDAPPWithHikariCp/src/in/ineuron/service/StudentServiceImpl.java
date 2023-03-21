package in.ineuron.service;

import in.ineuron.dao.IStudentDao;
import in.ineuron.factory.StudentDaoFactory;
import in.ineuron.model.Student;

public class StudentServiceImpl implements IStudentService {
    IStudentDao studentDao;
	@Override
	public String save(Student student) {
		// TODO Auto-generated method stub
		studentDao=StudentDaoFactory.getStudentDao();
		
		
		return studentDao.save(student);
	}

	@Override
	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.findById(sid);
	}

	@Override
	public String updateById(Student student) {
		// TODO Auto-generated method stub
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.updateById(student);
	}

	@Override
	public String deleteById(Integer sid) {
		// TODO Auto-generated method stub
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.deleteById(sid);
	}

}
