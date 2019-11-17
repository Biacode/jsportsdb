package org.biacode.jsportsdb;

import org.biacode.jsportsdb.model.ResultResponse;
import org.biacode.jsportsdb.search.impl.SearchTeamClientImpl;

/**
 * Created by Arthur Asatryan.
 * Date: 11/17/19
 * Time: 3:21 PM
 */
public class JavaDemoApp {
    public static void main(String[] args) {
        final SearchTeamClientImpl searchTeamClient = new SearchTeamClientImpl();
        final ResultResponse resultResponse = searchTeamClient.byShortCode("Ars");
        System.out.println(resultResponse.asMap());
        System.out.println(resultResponse.asString());
    }
}
