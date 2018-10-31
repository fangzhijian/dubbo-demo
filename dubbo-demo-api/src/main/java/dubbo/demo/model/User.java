package dubbo.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 2018/10/31 16:29
 * 走路呼呼带风
 */
@Data
public class User implements Serializable{

    private Integer id;
    private String name;
    private Date createTime;
}
