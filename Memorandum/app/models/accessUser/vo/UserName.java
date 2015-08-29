package models.accessUser.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.experimental.Accessors;

@Embeddable
@Getter
@Accessors(fluent = true)
public class UserName {

	@Column(name = "userName")
	private String value;

	public UserName(String value) {
		this.value = value;
	}

}
