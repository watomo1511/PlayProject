package models.memo.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
// @Value
// @Accessors(fluent = true)
public class MemoContent {

	@Column(name = "memoContent", nullable = false, length = 255)
	// @Getter
	private String value;

	public MemoContent(String value) {
		this.value = value;
	}
}
