package com.polarion.alm.ws.client.test;

import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.polarion.alm.ws.client.WebServiceFactory;
import com.polarion.alm.ws.client.session.SessionWebService;
import com.polarion.alm.ws.client.tracker.TrackerWebService;
import com.polarion.alm.ws.client.types.tracker.WorkItem;

public class WorkItemsQueryTest {

	String polarionUrl = "https://polarion-devel.engineering.redhat.com/polarion/ws/services/";
	WebServiceFactory factory;
	SessionWebService sessionService;
	TrackerWebService trackerService;
	String SQLQuery = "SELECT "
			   +"  TESTCASE.C_PK "
			   +"  FROM "
			   + " WORKITEM TESTCASE "
			   + " inner join PROJECT "
			   + " on PROJECT.C_URI = TESTCASE.FK_URI_PROJECT "
			   + " WHERE "
			   + " PROJECT.C_ID = 'VIRTTP' "
			   + " AND TESTCASE.C_TYPE = 'testcase'"
			   + " AND TESTCASE.C_CREATED > '2016-04-27 00:00:00'"
			   + " AND TESTCASE.C_CREATED < '2016-05-28 00:00:00'";

	String query = "project.id:VIRTTP AND type:testcase";
	String[] fields = new String[] { "id", "type", "status", "assignee", "title", "updated", "project", "created" };

	@Before
	public void setup() throws Exception {
		factory = new WebServiceFactory(polarionUrl);
		sessionService = factory.getSessionService();
		sessionService.logIn("{username}", "{password}");
	}

	@Test
	public void test() throws Exception {
		trackerService = factory.getTrackerService();
		//WorkItem[] workitems = trackerService.queryWorkItemsLimited(SQLQuery, "updated", fields, 10);
		WorkItem[] workitems = trackerService.queryWorkItemsBySQL(SQLQuery, fields);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(workitems.length);
		for (WorkItem workitem : workitems) {
			System.out.println(workitem.getType().getId() + "|" + workitem.getId() + "|" + workitem.getTitle() + "|"
					+ sdf.format(workitem.getCreated().getTime()));
		}
	}

	@After
	public void teardown() throws Exception {
		System.out.println("endsesion.");
		sessionService.endSession();
	}

}
