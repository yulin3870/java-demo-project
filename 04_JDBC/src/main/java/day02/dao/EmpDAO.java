package day02.dao;

import java.sql.ResultSet;
import java.util.List;

import day02.entity.Emp;

public class EmpDAO extends BaseDAO<Emp> {
	private static final String FIND_ALL = "select empno,ename,hiredate,job,sal,mgr from emp";

	private static final String FIND_BY_JOB = "select empno,ename,hiredate,job,sal,mgr from emp where job=?";

	public List<Emp> findAll() throws Exception {
		return query(FIND_ALL, null);
	}

	public List<Emp> findByJob(String job) throws Exception {
		return query(FIND_BY_JOB, new Object[] { job });
	}

	@Override
	public Emp toEntity(ResultSet rs) throws Exception {
		Emp emp = new Emp();
		emp.setNo(rs.getInt("empno"));
		emp.setName(rs.getString("ename"));
		emp.setHireDate(rs.getDate("hiredate"));
		emp.setJob(rs.getString("job"));
		emp.setSalary(rs.getBigDecimal("sal"));
		emp.setManagerNo(rs.getInt("mgr"));
		return emp;
	}
}
