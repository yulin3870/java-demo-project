
import day02.dao.EmpDAO;
import day02.entity.Emp;
import org.junit.Test;

import java.util.List;

public class EmpDAOTest {

    @Test
    public void findAll() throws Exception {
        EmpDAO emp = new EmpDAO();
        List<Emp> empList = emp.findAll();

        for(Emp e : empList){
            System.out.println(e.getNo() + "," + e.getName() + "," + e.getHireDate()
                    + "," + e.getSalary() + "," + e.getManagerNo() + "," + e.getJob());
        }
    }

    @Test
    public void findByJob() throws Exception {
        EmpDAO emp = new EmpDAO();
        List<Emp> empList = emp.findByJob("调度");

        for(Emp e : empList){
            System.out.println(e.getNo() + "," + e.getName() + "," + e.getHireDate()
                    + "," + e.getSalary() + "," + e.getManagerNo() + "," + e.getJob());
        }
    }
}
