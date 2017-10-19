package com.giridhari.preachingassistant.rest.model.yatra;

import com.giridhari.preachingassistant.model.YatraType;
import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class YatraDetailRequestEntity extends RequestEntity {
	private Long id;
	private String yatraName;
	private String yatraAddress;
	private YatraType yatraType;
	private Long yatraAdmin;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getYatraName() {
		return yatraName;
	}
	public void setYatraName(String yatraName) {
		this.yatraName = yatraName;
	}
	public String getYatraAddress() {
		return yatraAddress;
	}
	public void setYatraAddress(String yatraAddress) {
		this.yatraAddress = yatraAddress;
	}
	public YatraType getYatraType() {
		return yatraType;
	}
	public void setYatraType(YatraType yatraType) {
		this.yatraType = yatraType;
	}
	public Long getYatraAdmin() {
		return yatraAdmin;
	}
	public void setYatraAdmin(Long yatraAdmin) {
		this.yatraAdmin = yatraAdmin;
	}
}
