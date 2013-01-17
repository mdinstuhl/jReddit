import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import com.omrlnr.jreddit.domain.*;

public class SubmissionTest extends junit.framework.TestCase {
	@Test
	public void test() {
		LinkedList<Submission> frontpage = null;
		Submission first = null;

		System.out.println("Starting SubmissionTest now...");

		try {
			User user = new User("test_subject_666", "beef");
			user.connect();

			frontpage = Submissions.getSubmissions("all", Submissions.Popularity.HOT,Submissions.Page.FRONTPAGE, user);
			first = frontpage.get(0);

		        assertNotSame("The submission's ID/full name can't be empty, how will reddit identify the submission?",
				first.fullName, "");
         		assertNotNull("The submission's ID/full name can't be null, how will reddit identify the submission?",
				first.fullName);

		} catch (Exception exception) {
			System.out.println("Exception occured in SubmissionTest - " + exception.getMessage());
			exception.printStackTrace();
		}


	}
}
