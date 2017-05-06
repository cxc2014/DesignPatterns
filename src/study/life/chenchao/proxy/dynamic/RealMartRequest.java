package study.life.chenchao.proxy.dynamic;

/**
 * Created by chenchao on 2017/5/6.
 */
public class RealMartRequest implements MartRequest {

    @Override
    public String getUserInfo() {
        String name = "Hello";
        System.out.println(name);
        return name;
    }

    @Override
    public String getPhone() {
        String phone = "";
        System.out.println(phone);
        return phone;
    }
}
