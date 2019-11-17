# jsportsdb
JVM based TheSportsDB Http API client

Java example
```java
public class JavaDemoApp {
    public static void main(String[] args) {
        final SearchTeamClientImpl searchTeamClient = new SearchTeamClientImpl();
        System.out.println(searchTeamClient.byShortCode("Ars").asMap());
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