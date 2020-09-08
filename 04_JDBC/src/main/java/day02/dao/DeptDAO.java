package day02.dao;

import day02.entity.Dept;
import day02.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO extends BaseDAO<Dept> {

    private static final String FIND_ALL = "select deptno, dname, loc from dept";

    private static final String FIND_BY_LOCATION = "select deptno, dname, loc from dept where loc=?";

    private static final String SAVE = "insert into dept(deptno,dname,loc) values(?,?,?)";

    private static final String UPDATE = "update dept set dname=?, loc=? where deptno=?";

    private static final String FIND_BY_ID = "select deptno, dname, loc from dept where deptno=?";

    /**
     * 返回所有的部门信息
     */
    public List<Dept> findAllTow() throws Exception {
        Connection con = null;

        List<Dept> deptList;
        try {
            con = DBUtils.getConnection();
            PreparedStatement stmt = con.prepareStatement(FIND_ALL);
            ResultSet rs = stmt.executeQuery();
            deptList = new ArrayList<Dept>();
            while (rs.next()) {
                Dept dept = new Dept();
                dept.setNo(rs.getInt("deptno"));
                dept.setName(rs.getString("dname"));
                dept.setLocation(rs.getString("loc"));
                deptList.add(dept);
            }
            return deptList;

        } catch (Exception e) {
            e.printStackTrace();
            // ....
            throw e;
        } finally {
            if (con != null)
                con.close();
        }
    }

    /**
     * 返回指定地址的所有部门信息
     */
    public List<Dept> findByLocationTow(String location) throws Exception {
        Connection con = null;

        List<Dept> deptList;
        try {
            con = DBUtils.getConnection();
            PreparedStatement stmt = con.prepareStatement(FIND_BY_LOCATION);
            stmt.setString(1, location);
            ResultSet rs = stmt.executeQuery();
            deptList = new ArrayList<Dept>();

            while (rs.next()) {
                Dept dept = new Dept();
                dept.setNo(rs.getInt("deptno"));
                dept.setName(rs.getString("dname"));
                dept.setLocation(rs.getString("loc"));

                deptList.add(dept);
            }
            return deptList;

        } catch (Exception e) {
            e.printStackTrace();
            // ....
            throw e;
        } finally {
            if (con != null)
                con.close();
        }
    }

    /**
     * 返回所有的部门信息
     */
    public List<Dept> findAll() throws Exception {
        return query(FIND_ALL, null);
    }

    /**
     * 返回指定地址的所有部门信息
     *
     */
    public List<Dept> findByLocation(String location) throws Exception {
        return query(FIND_BY_LOCATION, new Object[] { location });
    }

    /**
     * 插入部门信息
     *
     * @param dept
     */
    public void save(Dept dept) throws Exception {
        update(SAVE, new Object[] { dept.getNo(), dept.getName(),
                dept.getLocation() });
    }

    /**
     *
     * @param dept
     */
    public void update(Dept dept) throws Exception {
        update(UPDATE, new Object[] { dept.getName(), dept.getLocation(),
                dept.getNo() });
    }

    /**
     *
     * @return
     */
    public Dept findById(int deptNo) throws Exception {
        List<Dept> list = query(FIND_BY_ID, new Object[] { deptNo });
        if (list.size() != 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Dept toEntity(ResultSet rs) throws Exception {
        // 创建一个实体对象
        Dept dept = new Dept();
        // 从结果集中取出数据,set实体对象
        dept.setNo(rs.getInt("deptno"));
        dept.setName(rs.getString("dname"));
        dept.setLocation(rs.getString("loc"));

        return dept;
    }
}
