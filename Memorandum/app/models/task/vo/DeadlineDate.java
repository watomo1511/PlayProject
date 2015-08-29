package models.task.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.experimental.Accessors;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Embeddable
@Getter
@Accessors(fluent = true)
public class DeadlineDate {

	@Column(name = "deadLineDate", nullable = false)
	@Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
	private DateTime value;

	public DeadlineDate(DateTime value) {
		this.value = value;
	}
}
