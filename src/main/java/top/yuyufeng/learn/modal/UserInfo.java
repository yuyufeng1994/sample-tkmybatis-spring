package top.yuyufeng.learn.modal;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "user_email")
    private String userEmail;

    public UserInfo(Long userId, String userName, Date createTime, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.createTime = createTime;
        this.userEmail = userEmail;
    }

    public UserInfo() {
        super();
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", createTime=" + createTime +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}