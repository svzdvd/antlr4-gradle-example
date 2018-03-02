### Antlr4 + Gradle 4.6 Sample Project

#### Generate Antlr sources

`gradle compileJava`

#### Test with Grun

```
$ cd build/classes/java/main
$ grun net.davidesavazzi.mylanguage.Chat chat -tokens -gui
john SAYS: hello
CTRL-D
```

#### Publish Jar

`gradle publishToMavenLocal`

