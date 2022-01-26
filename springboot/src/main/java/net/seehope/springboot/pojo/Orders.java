package net.seehope.springboot.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`orders`")
public class Orders implements Serializable {
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 下单用户id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 订单号
     */
    @Column(name = "`number`")
    private String number;

    /**
     * 创建订单时间
     */
    @Column(name = "`createtime`")
    private Date createtime;

    /**
     * 备注
     */
    @Column(name = "`note`")
    private String note;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取下单用户id
     *
     * @return user_id - 下单用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置下单用户id
     *
     * @param userId 下单用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取订单号
     *
     * @return number - 订单号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置订单号
     *
     * @param number 订单号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取创建订单时间
     *
     * @return createtime - 创建订单时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建订单时间
     *
     * @param createtime 创建订单时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }
}