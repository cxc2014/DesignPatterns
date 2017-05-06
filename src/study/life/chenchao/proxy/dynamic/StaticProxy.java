package study.life.chenchao.proxy.dynamic;

/**
 * Created by chenchao on 2017/5/6.
 */
public class StaticProxy implements MartRequest {

    public static MartRequest sMartRequest;

    public static MartRequest instance() {
        if (sMartRequest == null) {
            sMartRequest = new StaticProxy();
        }

        return sMartRequest;
    }

    MartRequest request;
    GithubRequest request2;

    public StaticProxy() {
        request = new RealMartRequest();
        request2 = new GithubRequest();
    }

    private static void callStaticProxy() {
        System.out.println("------- static  -------");
        MartRequest request = new StaticProxy();
        request.getUserInfo();
    }

    @Override
    public String getUserInfo() {
        return !request.getUserInfo().isEmpty() ? request.getUserInfo() : request2.getUserInfo();
    }

    @Override
    public String getPhone() {
        return !request.getPhone().isEmpty() ? request.getPhone() : request2.getPhone();
    }
}
