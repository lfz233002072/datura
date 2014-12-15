package datura.basic.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 
 * @author     : TCH(tcl_6688@163.com)
 * @group      : tgb8
 * @Date       : 2013-12-17 下午2:15:58
 * @Version    : 1.0.0
 * @param <Element>
 */
public class PageOfRecords<Element> implements Serializable {

	/**
	 * @Fields serialVersionUID	:TODO
	 */
	private static final long serialVersionUID = 1L;
	public final static String ORDER_DIRECTION_ASC = "ASC"; 
	public final static String ORDER_DIRECTION_DESC = "DESC";
	
	/**
	 * 默认每页记录数
	 */
	public static final int DEFAULT_PAGE_SIZE = 20;
	
	/**
	 * 結果集
	 */
	private List<Element> records;
	
	/**
	 * 查询记录数
	 */
	private Long totalRecords;
	
	
	/**
	 * 当前页码
	 */
	protected int pageIndex = 1;
	
	/**
	 * 每页显示多少条
	 */
	protected int pageSize = DEFAULT_PAGE_SIZE;
	
	// 默认按照id倒序排列
	private String orderField = "";
	private String orderDirection = "";
	
	
	public List<Element> getRecords() {
		return records;
	}

	public void setRecords(List<Element> list) {
		this.records = list;
	}

	public Long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}




	public int getPageIndex() {
		return pageIndex;
	}




	public void setPageIndex(int pageNum) {
		this.pageIndex = pageNum;
	}




	public int getPageSize() {
		return pageSize;
	}




	public void setPageSize(int numPerPage) {
		this.pageSize = numPerPage;
	}




	public String getOrderField() {
		return orderField;
	}




	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}




	public String getOrderDirection() {
		return orderDirection;
	}




	public void setOrderDirection(String orderDirection) {
		this.orderDirection = orderDirection;
	}
	
	
	@Override
	public String toString() {
		return pageIndex + pageSize +orderField+orderDirection;
	}
}

