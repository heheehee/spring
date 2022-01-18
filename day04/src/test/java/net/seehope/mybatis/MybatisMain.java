package net.seehope.mybatis;

import net.seehope.mybatis.mapper.OrderMapper;
import net.seehope.mybatis.mapper.UserMapper;
import net.seehope.mybatis.pojo.Order;
import net.seehope.mybatis.pojo.OrderDetails;
import net.seehope.mybatis.pojo.UUIDUser;
import net.seehope.mybatis.pojo.User;
import net.seehope.mybatis.pojo.vo.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;

import java.io.IOException;
import java.util.*;

public class MybatisMain {
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    private static UserMapper userMapper;

    @BeforeClass
    public static void beforeClass() throws IOException {
         sqlSessionFactory= new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
    }
    @Before
    public  void before(){
       sqlSession=sqlSessionFactory.openSession();
       userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @Test
    public  void getAllUser(){
        List<User> getAllUser = sqlSession.selectList("getAllUser");
       for (User user : getAllUser) {
          System.out.println(user);
       }
    }
    @Test
    public  void getUserById(){
        User getUserById=sqlSession.selectOne("getUserById",10);
        System.out.println(getUserById);
    }
    @Test
    public  void getUserLikeName(){
        List<User> objects=sqlSession.selectList("getUserLikeName","mt");
       for(User user:objects){
            System.out.println(user);
        }
    }
//    @Test
//    public void insertUser(){
//        Assert.assertEquals(1, userMapper.insertUser(new User(1, "mt12312", new Date(),
//                'm', "12312", "fdsa", "dasfs")));
//    }

    @Test
    public void testQueryUserByHashMap() {
        Map<String, String> params = new HashMap<>();
        params.put("username", "mt");
        params.put("address", "10");
        userMapper.queryUserByHashMap(params);
    }

//    @Test
//    public void testQueryUserByUserQueryVo() {
//        UserQueryVo vo = new UserQueryVo();
//        vo.setUser(new User(1, null, null,
//                null, "12312", null, null));
//        List<Integer> ids = new ArrayList<>();
//        ids.add(1);
//        ids.add(10);
//        ids.add(2);
//        ids.add(3);
//        ids.add(4);
//        ids.add(24);
//        vo.setIds(ids);
//        userMapper.queryUserByVo(vo);
//    }
    @Test
    public  void deleteQuaryUserByUserQueryVo(){
        UserQueryVo vo = new UserQueryVo();
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(10);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(24);
        vo.setIds(ids);
        userMapper.deleteUserByVo(vo);
    }
//    @Test
//    public void updateQuaryUserByUserQueryVo(){
//        UserQueryVo vo = new UserQueryVo();
//        vo.setUser(new User(3, "hehee", null,
//                null, "sdhsidhis", "12345667", null));
//        userMapper.updateUserByVo(vo);
//    }
    @Test
    public void QueryAllUserAndOrders(){
        List<User> list=userMapper.QueryAllUserAndOrders();
        for(User user:list){
            System.out.println(user);
        }

    }
    @Test
    public void testQueryAllUserAndOrdersAndOrderDetails() {
        List<User> users = userMapper.QueryAllUserAndOrdersAndOrdersDetails();
        for (User user : users) {
            List<Order> ordersList = user.getOrderList();
            for (Order orders : ordersList) {
                List<OrderDetails> orderDetailsList = orders.getOrderDetailsList();
                for (OrderDetails orderDetails : orderDetailsList) {
                    System.out.println(orderDetails);
                }
            }
        }
    }
    @Test
    public void testQueryAllUserAndOrdersAndOrdersDetailsAndItems() {
        List<User> users = userMapper.QueryAllUserAndOrdersAndOrdersDetailsAndItems();
        for (User user : users) {
            List<Order> ordersList = user.getOrderList();
            for (Order orders : ordersList) {
                List<OrderDetails> orderDetailsList = orders.getOrderDetailsList();
                for (OrderDetails orderDetails : orderDetailsList) {
                    System.out.println(orderDetails.getItems());
                }
            }
        }
    }
    @Test
    public void testQuerAllUserLazyLoad(){
        List<User> users=userMapper.queryAllUserLazyLoad();
        for(User user:users){
            System.out.println(user);
        }
    }
    @Test
    public void testGetUserByUserId(){
        User GetUserByUserId=userMapper.getUserById(10);
        System.out.println(GetUserByUserId);
        sqlSession.commit();
        sqlSession.close();
        sqlSession=sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        User GetUserByUserId2=userMapper.getUserById(10);
        System.out.println(GetUserByUserId2);


    }

    @After
    public  void after(){
        sqlSession.commit();
        sqlSession.close();
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }


//    public static void main(String[] args) throws IOException {
//        SqlSessionFactory sqlSessionFactory=
//                new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
//        //SqlSessionFactory是MyBatis的关键对象,它是个单个数据库映射关系经过编译后的内存镜像.
//        // SqlSessionFactory对象的实例可以通过SqlSessionFactoryBuilder对象类获得,
//        // 而SqlSessionFactoryBuilder则可以从XML配置文件或一个预先定制的Configuration的实例构建出SqlSessionFactory的实例.
//        // 每一个MyBatis的应用程序都以一个SqlSessionFactory对象的实例为核心.同时SqlSessionFactory也是线程安全的,
//        // SqlSessionFactory一旦被创建,应该在应用执行期间都存在.在应用运行期间不要重复创建多次,建议使用单例模式.
//        // SqlSessionFactory是创建SqlSession的工厂.
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//        //通过配置文件mybatis-config.xml,创建SqlSessionFactory对象,然后产生SqlSession,执行SQL语句.
////        List<User> getAllUser = sqlSession.selectList("getAllUser");
//////        for (User user : getAllUser) {
//////            System.out.println(user);
//////        }
////        User getUserById=sqlSession.selectOne("getUserById",10);
////        System.out.println(getUserById);
//        List<User> objects=sqlSession.selectList("getUserLikeName","mt");
////        for(User user:objects){
////            System.out.println(user);
////        }
//        int insertUser=sqlSession.insert("insertUser",objects.get(0));
//        System.out.println(insertUser);
//        UUIDUser uuidUser=new UUIDUser("80","hehee");
//        sqlSession.insert("insertUUIDUser",uuidUser);
//        sqlSession.update("updateUUIDUser","ec92bd4e-b2eb-11eb-8c30-00ff187a295d");
//        sqlSession.delete("delUUIDUser","f5a04fb6-f5b9-11eb-b362-00ff187a295d");
//
//        sqlSession.commit();
//        sqlSession.close();

//    }
}
