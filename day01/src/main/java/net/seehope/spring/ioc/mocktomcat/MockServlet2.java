package net.seehope.spring.ioc.mocktomcat;

public class MockServlet2 extends MockHttpServlet{
    @Override
    public void init() {
        System.out.println(" init MockServlet2");
    }

    @Override
    public void doService() {
        System.out.println(" doService MockServlet2");
    }

    @Override
    public void destory() {
        System.out.println(" destory MockServlet2");
    }
}
