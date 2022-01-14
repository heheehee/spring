package net.seehope.spring.ioc.mocktomcat;

import java.util.List;
import java.util.Map;

public class MockServlet3 extends MockHttpServlet{
    private String username;
    private int age;
    private List<Integer> ids;
    private MockHttpServlet mockHttpServlet;
    private Map<String,MockHttpServlet> map;
    @Override
    public void init() {
        System.out.println(" init MockServlet3");
    }

    @Override
    public void doService() {
        System.out.println(" doService MockServlet3");
    }

    @Override
    public void destory() {
        System.out.println(" destory MockServlet3");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public MockHttpServlet getMockHttpServlet() {
        return mockHttpServlet;
    }

    public void setMockHttpServlet(MockHttpServlet mockHttpServlet) {
        this.mockHttpServlet = mockHttpServlet;
    }

    public Map<String, MockHttpServlet> getMap() {
        return map;
    }

    public void setMap(Map<String, MockHttpServlet> map) {
        this.map = map;
    }
}
