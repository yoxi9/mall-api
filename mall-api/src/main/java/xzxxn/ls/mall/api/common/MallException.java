package xzxxn.ls.mall.api.common;

public class MallException extends RuntimeException {
    public MallException() {
    }

    public MallException(String message) {
        super(message);
    }

    /**
     * 抛出异常
     *
     * @param message 消息
     */
    public static void fail(String message) {
        throw new MallException(message);
    }
}
