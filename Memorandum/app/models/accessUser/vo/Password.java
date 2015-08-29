package models.accessUser.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.experimental.Accessors;

@Embeddable
@Getter
@Accessors(fluent = true)
public class Password {

	@Column(name = "password")
	// @Getter
	private String value;

	public Password(String value) {
		this.value = value;
	}

}
