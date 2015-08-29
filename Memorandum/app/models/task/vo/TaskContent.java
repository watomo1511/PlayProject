package models.task.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.experimental.Accessors;

@Embeddable
@Getter
@Accessors(fluent = true)
public class TaskContent {

	@Column(name = "taskContent", nullable = false, length = 1000)
	private String value;

	public TaskContent(String value) {
		this.value = value;
	}
}
