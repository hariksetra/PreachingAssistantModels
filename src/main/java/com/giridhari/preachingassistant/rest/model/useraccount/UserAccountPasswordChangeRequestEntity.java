package com.giridhari.preachingassistant.rest.model.useraccount;

import com.giridhari.preachingassistant.rest.model.RequestEntity;

public class UserAccountPasswordChangeRequestEntity extends RequestEntity {
	String oldPassword;
	String newPassword;

	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
