package models.memo.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
// @Value
// @Accessors(fluent = true)
public class MemoName {

	@Column(name = "memoName", nullable = false, length = 10)
	// @Getter
	private String value;

	public MemoName(String value) {
		this.value = value;
	}
}
