package models.memo.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Embeddable
// @Value
// @Accessors(fluent = true)
public class CreateDate {

	@Column(name = "createDate", nullable = false)
	@Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
	// @Getter
	public DateTime value;

	public CreateDate(DateTime value) {
		this.value = value;
	}

}
