# jsportsdb
JVM based TheSportsDB HTTP API client https://www.thesportsdb.com/api.php

Java example
```java
public class JavaDemoApp {
    public static void main(String[] args) {
        final SearchTeamClientImpl searchTeamClient = new SearchTeamClientImpl();
        final ResultResponse resultResponse = searchTeamClient.byShortCode("Ars");
        System.out.println(resultResponse.asMap());
        System.out.println(resultResponse.asString());
    }
}
```

Kotlin example
```kotlin
object KotlinDemoApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val resultResponse = SearchTeamClientImpl().byShortCode("Arsenal")
        println(resultResponse.asString())
        println(resultResponse.asMap())
    }
}
```
