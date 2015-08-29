package models.memoType.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.experimental.Accessors;

@Embeddable
@Getter
@Accessors(fluent = true)
public class MemoCategory1 {

	@Column(name = "memoCategory1", length = 50)
	private String value;

	public MemoCategory1(String value) {
		this.value = value;
	}
}
