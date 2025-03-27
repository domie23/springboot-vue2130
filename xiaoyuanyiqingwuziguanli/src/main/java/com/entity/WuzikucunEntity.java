package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 物资库存
 *
 * @author 
 * @email
 */
@TableName("wuzikucun")
public class WuzikucunEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WuzikucunEntity() {

	}

	public WuzikucunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 物资
     */
    @ColumnInfo(comment="物资",type="int(200)")
    @TableField(value = "wuzi_id")

    private Integer wuziId;


    /**
     * 物资库存
     */
    @ColumnInfo(comment="物资库存",type="int(11)")
    @TableField(value = "wuzikucun_kucun_number")

    private Integer wuzikucunKucunNumber;


    /**
     * 存放位置
     */
    @ColumnInfo(comment="存放位置",type="varchar(200)")
    @TableField(value = "wuzikucun_address")

    private String wuzikucunAddress;


    /**
     * 物资状态
     */
    @ColumnInfo(comment="物资状态",type="int(11)")
    @TableField(value = "wuzikucun_types")

    private Integer wuzikucunTypes;


    /**
     * 保质期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="保质期",type="date")
    @TableField(value = "baozhi_time")

    private Date baozhiTime;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "wuzikucun_delete")

    private Integer wuzikucunDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：物资
	 */
    public Integer getWuziId() {
        return wuziId;
    }
    /**
	 * 设置：物资
	 */

    public void setWuziId(Integer wuziId) {
        this.wuziId = wuziId;
    }
    /**
	 * 获取：物资库存
	 */
    public Integer getWuzikucunKucunNumber() {
        return wuzikucunKucunNumber;
    }
    /**
	 * 设置：物资库存
	 */

    public void setWuzikucunKucunNumber(Integer wuzikucunKucunNumber) {
        this.wuzikucunKucunNumber = wuzikucunKucunNumber;
    }
    /**
	 * 获取：存放位置
	 */
    public String getWuzikucunAddress() {
        return wuzikucunAddress;
    }
    /**
	 * 设置：存放位置
	 */

    public void setWuzikucunAddress(String wuzikucunAddress) {
        this.wuzikucunAddress = wuzikucunAddress;
    }
    /**
	 * 获取：物资状态
	 */
    public Integer getWuzikucunTypes() {
        return wuzikucunTypes;
    }
    /**
	 * 设置：物资状态
	 */

    public void setWuzikucunTypes(Integer wuzikucunTypes) {
        this.wuzikucunTypes = wuzikucunTypes;
    }
    /**
	 * 获取：保质期
	 */
    public Date getBaozhiTime() {
        return baozhiTime;
    }
    /**
	 * 设置：保质期
	 */

    public void setBaozhiTime(Date baozhiTime) {
        this.baozhiTime = baozhiTime;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getWuzikucunDelete() {
        return wuzikucunDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setWuzikucunDelete(Integer wuzikucunDelete) {
        this.wuzikucunDelete = wuzikucunDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Wuzikucun{" +
            ", id=" + id +
            ", wuziId=" + wuziId +
            ", wuzikucunKucunNumber=" + wuzikucunKucunNumber +
            ", wuzikucunAddress=" + wuzikucunAddress +
            ", wuzikucunTypes=" + wuzikucunTypes +
            ", baozhiTime=" + DateUtil.convertString(baozhiTime,"yyyy-MM-dd") +
            ", wuzikucunDelete=" + wuzikucunDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
