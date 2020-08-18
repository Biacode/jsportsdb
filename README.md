# jsportsdb
JVM based TheSportsDB HTTP API client https://www.thesportsdb.com/api.php

Java example
```java
public class JavaDemoApp {
    public static void main(String[] args) {
        final SearchTeamClient searchTeamClient = new SearchTeamClientImpl();
        final ResultResponse searchTeamResult = searchTeamClient.byShortCode("Ars");
        System.out.println(searchTeamResult.asMap());
        System.out.println(searchTeamResult.asString());

        final ListSportsClient listSportsClient = new ListSportsClientImpl();
        final ResultResponse listSportsResult = listSportsClient.all();
        System.out.println(listSportsResult.asMap());
        System.out.println(listSportsResult.asString());
    }
}
```

Kotlin example
```kotlin
object KotlinDemoApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val searchTeamResult = SearchTeamClientImpl().byShortCode("Arsenal")
        println(searchTeamResult.asString())
        println(searchTeamResult.asMap())

        val listSportsResult = ListSportsClientImpl().all()
        println(listSportsResult.asString())
        println(listSportsResult.asMap())
    }
}
```
