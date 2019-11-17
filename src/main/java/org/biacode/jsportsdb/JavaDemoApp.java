package org.biacode.jsportsdb;

import org.biacode.jsportsdb.list.ListSportsClient;
import org.biacode.jsportsdb.list.impl.ListSportsClientImpl;
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
        final ResultResponse searchTeamResult = searchTeamClient.byShortCode("Ars");
        System.out.println(searchTeamResult.asMap());
        System.out.println(searchTeamResult.asString());

        final ListSportsClient listSportsClient = new ListSportsClientImpl();
        final ResultResponse listSportsResult = listSportsClient.all();
        System.out.println(listSportsResult.asMap());
        System.out.println(listSportsResult.asString());
    }
}
