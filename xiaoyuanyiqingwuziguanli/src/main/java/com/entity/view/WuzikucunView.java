package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.WuzikucunEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 物资库存
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("wuzikucun")
public class WuzikucunView extends WuzikucunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 物资状态的值
	*/
	@ColumnInfo(comment="物资状态的字典表值",type="varchar(200)")
	private String wuzikucunValue;

	//级联表 物资
							/**
		* 物资名称
		*/

		@ColumnInfo(comment="物资名称",type="varchar(200)")
		private String wuziName;
		/**
		* 物资编号
		*/

		@ColumnInfo(comment="物资编号",type="varchar(200)")
		private String wuziUuidNumber;
		/**
		* 物资照片
		*/

		@ColumnInfo(comment="物资照片",type="varchar(200)")
		private String wuziPhoto;
		/**
		* 物资型号
		*/

		@ColumnInfo(comment="物资型号",type="varchar(200)")
		private String wuziXinghao;
		/**
		* 物资规格
		*/

		@ColumnInfo(comment="物资规格",type="varchar(200)")
		private String wuziGuige;
		/**
		* 物资生产厂家
		*/

		@ColumnInfo(comment="物资生产厂家",type="varchar(200)")
		private String wuziChangjia;
		/**
		* 物资类型
		*/
		@ColumnInfo(comment="物资类型",type="int(11)")
		private Integer wuziTypes;
			/**
			* 物资类型的值
			*/
			@ColumnInfo(comment="物资类型的字典表值",type="varchar(200)")
			private String wuziValue;
		/**
		* 物资库存
		*/

		@ColumnInfo(comment="物资库存",type="int(11)")
		private Integer wuziKucunNumber;
		/**
		* 价格
		*/
		@ColumnInfo(comment="价格",type="decimal(10,2)")
		private Double wuziNewMoney;
		/**
		* 物资介绍
		*/

		@ColumnInfo(comment="物资介绍",type="longtext")
		private String wuziContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer wuziDelete;



	public WuzikucunView() {

	}

	public WuzikucunView(WuzikucunEntity wuzikucunEntity) {
		try {
			BeanUtils.copyProperties(this, wuzikucunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 物资状态的值
	*/
	public String getWuzikucunValue() {
		return wuzikucunValue;
	}
	/**
	* 设置： 物资状态的值
	*/
	public void setWuzikucunValue(String wuzikucunValue) {
		this.wuzikucunValue = wuzikucunValue;
	}


	//级联表的get和set 物资

		/**
		* 获取： 物资名称
		*/
		public String getWuziName() {
			return wuziName;
		}
		/**
		* 设置： 物资名称
		*/
		public void setWuziName(String wuziName) {
			this.wuziName = wuziName;
		}

		/**
		* 获取： 物资编号
		*/
		public String getWuziUuidNumber() {
			return wuziUuidNumber;
		}
		/**
		* 设置： 物资编号
		*/
		public void setWuziUuidNumber(String wuziUuidNumber) {
			this.wuziUuidNumber = wuziUuidNumber;
		}

		/**
		* 获取： 物资照片
		*/
		public String getWuziPhoto() {
			return wuziPhoto;
		}
		/**
		* 设置： 物资照片
		*/
		public void setWuziPhoto(String wuziPhoto) {
			this.wuziPhoto = wuziPhoto;
		}

		/**
		* 获取： 物资型号
		*/
		public String getWuziXinghao() {
			return wuziXinghao;
		}
		/**
		* 设置： 物资型号
		*/
		public void setWuziXinghao(String wuziXinghao) {
			this.wuziXinghao = wuziXinghao;
		}

		/**
		* 获取： 物资规格
		*/
		public String getWuziGuige() {
			return wuziGuige;
		}
		/**
		* 设置： 物资规格
		*/
		public void setWuziGuige(String wuziGuige) {
			this.wuziGuige = wuziGuige;
		}

		/**
		* 获取： 物资生产厂家
		*/
		public String getWuziChangjia() {
			return wuziChangjia;
		}
		/**
		* 设置： 物资生产厂家
		*/
		public void setWuziChangjia(String wuziChangjia) {
			this.wuziChangjia = wuziChangjia;
		}
		/**
		* 获取： 物资类型
		*/
		public Integer getWuziTypes() {
			return wuziTypes;
		}
		/**
		* 设置： 物资类型
		*/
		public void setWuziTypes(Integer wuziTypes) {
			this.wuziTypes = wuziTypes;
		}


			/**
			* 获取： 物资类型的值
			*/
			public String getWuziValue() {
				return wuziValue;
			}
			/**
			* 设置： 物资类型的值
			*/
			public void setWuziValue(String wuziValue) {
				this.wuziValue = wuziValue;
			}

		/**
		* 获取： 物资库存
		*/
		public Integer getWuziKucunNumber() {
			return wuziKucunNumber;
		}
		/**
		* 设置： 物资库存
		*/
		public void setWuziKucunNumber(Integer wuziKucunNumber) {
			this.wuziKucunNumber = wuziKucunNumber;
		}

		/**
		* 获取： 价格
		*/
		public Double getWuziNewMoney() {
			return wuziNewMoney;
		}
		/**
		* 设置： 价格
		*/
		public void setWuziNewMoney(Double wuziNewMoney) {
			this.wuziNewMoney = wuziNewMoney;
		}

		/**
		* 获取： 物资介绍
		*/
		public String getWuziContent() {
			return wuziContent;
		}
		/**
		* 设置： 物资介绍
		*/
		public void setWuziContent(String wuziContent) {
			this.wuziContent = wuziContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getWuziDelete() {
			return wuziDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setWuziDelete(Integer wuziDelete) {
			this.wuziDelete = wuziDelete;
		}


	@Override
	public String toString() {
		return "WuzikucunView{" +
			", wuzikucunValue=" + wuzikucunValue +
			", wuziName=" + wuziName +
			", wuziUuidNumber=" + wuziUuidNumber +
			", wuziPhoto=" + wuziPhoto +
			", wuziXinghao=" + wuziXinghao +
			", wuziGuige=" + wuziGuige +
			", wuziChangjia=" + wuziChangjia +
			", wuziKucunNumber=" + wuziKucunNumber +
			", wuziNewMoney=" + wuziNewMoney +
			", wuziContent=" + wuziContent +
			", wuziDelete=" + wuziDelete +
			"} " + super.toString();
	}
}
