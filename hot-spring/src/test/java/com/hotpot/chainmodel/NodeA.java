package com.hotpot.chainmodel;

/**
 * @author qinzhu
 * @since 2020/1/10
 */
public class NodeA implements Node {

    @Override
    public Object process(NodeChain chain) {
        Object result;
        before();
        result = chain.process();
        after();
        return result;
    }

    @Override
    public Object before() {
        System.out.println("NodeA代理：before");
        return null;
    }

    @Override
    public Object after() {
        System.out.println("NodeA代理：after");
        return null;
    }
}
