package models.chatBoard.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.experimental.Accessors;

@Embeddable
@Getter
@Accessors(fluent = true)
public class ChatContent {

	@Column(name = "chatContent", nullable = false, length = 255)
	private String value;

	public ChatContent(String value) {
		this.value = value;
	}
}
