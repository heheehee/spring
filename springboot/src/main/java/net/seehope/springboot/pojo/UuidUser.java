package net.seehope.springboot.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`uuid_user`")
public class UuidUser implements Serializable {
    @Id
    @Column(name = "`id`")
    private String id;

    @Column(name = "`mark`")
    private String mark;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
}