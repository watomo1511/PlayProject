package models.chatBoard;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.accessUser.AccessUser;
import models.chatBoard.vo.ChatContent;
import models.chatBoard.vo.CreateDate;

import org.joda.time.DateTime;

import play.db.jpa.Model;

@Getter
@Accessors(fluent = true)
@Entity(name = "chatBoard")
public class ChatBoard extends Model {

	@ManyToOne
	@JoinColumn(name = "userId")
	public AccessUser accessUser;

	@Embedded
	public ChatContent chatContent;

	@Embedded
	public CreateDate createDate;

	/* コンストラクタ* */
	public ChatBoard(AccessUser accessUser, ChatContent chatContent) {
		this.accessUser = accessUser;
		this.chatContent = chatContent;
		this.createDate = new CreateDate(new DateTime());
	}
}
