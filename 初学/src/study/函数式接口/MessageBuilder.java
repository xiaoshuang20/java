package study.函数式接口;

// @FunctionalInterface：类似于 @Override，判断是不是函数式接口
@FunctionalInterface
public interface MessageBuilder {
    // 定义一个拼接消息的抽象方法,返回被拼接的消息
    public abstract String builderMessage();
}
