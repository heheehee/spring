package net.seehope.spring.ioc.mocktomcat;

public class MockServlet1 extends MockHttpServlet{
    @Override
    public void init() {
        System.out.println(" init MockServlet1");
    }

    @Override
    public void doService() {
        System.out.println(" doService MockServlet1");
    }

    @Override
    public void destory() {
        System.out.println(" destory MockServlet1");
    }
}
