import static org.hamcrest.CoreMatchers.is;
import models.accessUser.AccessUser;
import models.accessUser.vo.Password;
import models.accessUser.vo.UserName;
import models.accessUser.vo.UserType;
import models.chatBoard.ChatBoard;
import models.chatBoard.vo.ChatContent;
import models.memo.Memo;
import models.memo.vo.MemoContent;
import models.memo.vo.MemoName;
import models.memoType.MemoType;
import models.memoType.vo.MemoCategory1;
import models.task.Task;
import models.task.vo.DeadlineDate;
import models.task.vo.TaskContent;
import models.task.vo.TaskName;

import org.joda.time.DateTime;
import org.junit.Test;

import play.mvc.Before;
import play.test.Fixtures;
import play.test.UnitTest;

public class ScenarioTest extends UnitTest {

	@Before
	public void setup() {
		Fixtures.deleteDatabase();
	}

	@Test
	public void testExec() {

		long userCount = AccessUser.count();
		UserName userName1 = new UserName("aaa");
		UserName userName2 = new UserName("bbb");
		UserName userName3 = new UserName("ccc");

		Password password1 = new Password("AAA");
		Password password2 = new Password("BBB");
		Password password3 = new Password("CCC");

		AccessUser user1 = new AccessUser(userName1, password1,
				UserType.開発.getIntValue()).save();
		AccessUser user2 = new AccessUser(userName2, password2,
				UserType.開発.getIntValue()).save();
		AccessUser user3 = new AccessUser(userName3, password3,
				UserType.運用.getIntValue()).save();

		assertThat(AccessUser.count(), is(userCount + 3));

		ChatContent chatContent1 = new ChatContent("aa");
		new ChatBoard(user1, chatContent1).save();

		MemoName memoName1 = new MemoName("MemoName");
		MemoContent memoContent1 = new MemoContent("MemoContent");
		MemoCategory1 memoCategory1 = new MemoCategory1("CSS");
		MemoCategory1 memoCategory2 = new MemoCategory1("Java");
		MemoType memoType1 = new MemoType(memoCategory1);
		MemoType memoType2 = new MemoType(memoCategory2);
		memoType1.save();
		memoType2.save();
		new Memo(memoType1, user1, memoName1, memoContent1).save();
		new Memo(memoType2, user1, memoName1, memoContent1).save();

		TaskName taskName1 = new TaskName("TaskName");
		TaskContent taskContent = new TaskContent("TaskContent");
		DeadlineDate deadlineDate1 = new DeadlineDate(new DateTime());
		new Task(user1, taskName1, taskContent, deadlineDate1).save();
		new Task(user3, taskName1, taskContent, deadlineDate1).save();
	}

}
