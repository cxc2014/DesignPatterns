package study.life.chenchao.proxy.dynamic;

/**
 * Created by chenchao on 2017/5/6.
 */
public class GithubRequest implements MartRequest {

    @Override
    public String getUserInfo() {
        return "";
    }

    @Override
    public String getPhone() {
        return "888888";
    }
}
