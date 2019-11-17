package org.biacode.jsportsdb;

import org.biacode.jsportsdb.search.impl.SearchTeamClientImpl;

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:21 PM
 */
public class JavaDemoApp {
    public static void main(String[] args) {
        final SearchTeamClientImpl searchTeamClient = new SearchTeamClientImpl();
        System.out.println(searchTeamClient.byShortCode("Ars").asMap());
    }
}
