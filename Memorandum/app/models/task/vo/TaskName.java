package models.task.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.experimental.Accessors;

@Embeddable
@Getter
@Accessors(fluent = true)
public class TaskName {

	@Column(name = "taskName", nullable = false, length = 10)
	// @Getter
	private String value;

	public TaskName(String value) {
		this.value = value;
	}
}
