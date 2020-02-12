package test.proxyTest;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
    @Override
    public void lala(String name) {
        System.out.println("----lala!----"+name);
    }

}
