package com.entity.vo;

import com.entity.WuzikucunEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物资库存
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wuzikucun")
public class WuzikucunVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 物资
     */

    @TableField(value = "wuzi_id")
    private Integer wuziId;


    /**
     * 物资库存
     */

    @TableField(value = "wuzikucun_kucun_number")
    private Integer wuzikucunKucunNumber;


    /**
     * 存放位置
     */

    @TableField(value = "wuzikucun_address")
    private String wuzikucunAddress;


    /**
     * 物资状态
     */

    @TableField(value = "wuzikucun_types")
    private Integer wuzikucunTypes;


    /**
     * 保质期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "baozhi_time")
    private Date baozhiTime;


    /**
     * 逻辑删除
     */

    @TableField(value = "wuzikucun_delete")
    private Integer wuzikucunDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物资
	 */
    public Integer getWuziId() {
        return wuziId;
    }


    /**
	 * 获取：物资
	 */

    public void setWuziId(Integer wuziId) {
        this.wuziId = wuziId;
    }
    /**
	 * 设置：物资库存
	 */
    public Integer getWuzikucunKucunNumber() {
        return wuzikucunKucunNumber;
    }


    /**
	 * 获取：物资库存
	 */

    public void setWuzikucunKucunNumber(Integer wuzikucunKucunNumber) {
        this.wuzikucunKucunNumber = wuzikucunKucunNumber;
    }
    /**
	 * 设置：存放位置
	 */
    public String getWuzikucunAddress() {
        return wuzikucunAddress;
    }


    /**
	 * 获取：存放位置
	 */

    public void setWuzikucunAddress(String wuzikucunAddress) {
        this.wuzikucunAddress = wuzikucunAddress;
    }
    /**
	 * 设置：物资状态
	 */
    public Integer getWuzikucunTypes() {
        return wuzikucunTypes;
    }


    /**
	 * 获取：物资状态
	 */

    public void setWuzikucunTypes(Integer wuzikucunTypes) {
        this.wuzikucunTypes = wuzikucunTypes;
    }
    /**
	 * 设置：保质期
	 */
    public Date getBaozhiTime() {
        return baozhiTime;
    }


    /**
	 * 获取：保质期
	 */

    public void setBaozhiTime(Date baozhiTime) {
        this.baozhiTime = baozhiTime;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getWuzikucunDelete() {
        return wuzikucunDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setWuzikucunDelete(Integer wuzikucunDelete) {
        this.wuzikucunDelete = wuzikucunDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
