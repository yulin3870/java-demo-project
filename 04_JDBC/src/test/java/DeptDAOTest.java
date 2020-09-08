import day02.dao.DeptDAO;
import day02.entity.Dept;
import org.junit.Test;
import java.util.List;

public class DeptDAOTest {

    /**
     * 用于测试DeptDAO的 findAll方法
     *
     * @throws Exception
     */

    @Test
    public void testFindAll() throws Exception {
        DeptDAO deptDAO = new DeptDAO();
        List<Dept> deptList = deptDAO.findAll();

        for (Dept dept : deptList) {
            System.out.println(dept.getNo() + "," + dept.getName() + ","
                    + dept.getLocation());
        }
    }

    /**
     * 用于测试DeptDAO的 findByLocation方法
     *
     * @throws Exception
     */
    @Test
    public void testFindByLocation() throws Exception {
        DeptDAO deptDAO = new DeptDAO();
        List<Dept> deptList = deptDAO.findByLocation("北京");

        for (Dept dept : deptList) {
            System.out.println(dept.getNo() + "," + dept.getName() + ","
                    + dept.getLocation());
        }
    }

    @Test
    public void testSave() throws Exception {
        DeptDAO deptDAO = new DeptDAO();
        Dept dept = new Dept();
        dept.setNo(90);
        dept.setName("R&D");
        dept.setLocation("北京");

        deptDAO.save(dept);
    }

    @Test
    public void testFindByIdAndUpdate() throws Exception {
        DeptDAO deptDAO = new DeptDAO();
        Dept dept = deptDAO.findById(40);
        System.out.println(dept.getNo() + "," + dept.getName() + ","
                + dept.getLocation());
        dept.setLocation("Beijing");
        deptDAO.update(dept);
    }
}
