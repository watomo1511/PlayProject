package models.task;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.accessUser.AccessUser;
import models.task.vo.CreateDate;
import models.task.vo.DeadlineDate;
import models.task.vo.TaskContent;
import models.task.vo.TaskName;

import org.joda.time.DateTime;

import play.db.jpa.Model;

@Getter
@Accessors(fluent = true)
@Entity(name = "task")
public class Task extends Model {

	@ManyToOne
	@JoinColumn(name = "userId")
	private AccessUser accessUser;

	@Embedded
	private TaskName taskName;

	@Embedded
	private TaskContent taskContent;

	@Embedded
	private CreateDate createDate;

	@Embedded
	private DeadlineDate deadlineDate;

	/* コンストラクタ* */
	public Task(AccessUser accessUser, TaskName taskName,
			TaskContent taskContent, DeadlineDate deadlineDate) {
		this.accessUser = accessUser;
		this.taskName = taskName;
		this.taskContent = taskContent;
		this.createDate = new CreateDate(new DateTime());
		this.deadlineDate = deadlineDate;
	}
}
