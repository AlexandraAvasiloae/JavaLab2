# Lab 2


## Compulsory (1p)

```
(done)1.Create an object-oriented model of the problem. You should have (at least) the following classes: Source, Destination, Problem.
(done)2.The sources and the destinations have names. The sources will also have the property type. The available types will be implemented as an enum . For example:
                public enum SourceType {
                        WAREHOUSE, FACTORY;
                }
(done)3.Assume S1 is a factory and S2, S3 are warehouses.
(done)4.Each class should have appropriate constructors, getters and setters.
(done)5.The toString method form the Object class must be properly overridden for all the classes.
(done)6.Create and print on the screen the instance of the problem described in the example.

OUTPUT

"C:\Program Files\Java\jdk1.8.0_281\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar=56348:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_281\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\rt.jar;C:\Users\Alexandra\IdeaProjects\lab2\target\classes" compulsory.Main
compulsory.Source{name='S1', type=FACTORY, supply=10}
compulsory.Source{name='S2', type=WAREHOUSE, supply=35}
compulsory.Source{name='S3', type=WAREHOUSE, supply=25}
compulsory.Destination{name='D1', demand=20}
compulsory.Destination{name='D2', demand=25}
compulsory.Destination{name='D3', demand=25}
compulsory.Problem{sources=[compulsory.Source{name='S1', type=FACTORY, supply=10}, compulsory.Source{name='S2', type=WAREHOUSE, supply=35}, compulsory.Source{name='S3', type=WAREHOUSE, supply=25}], destinations=[compulsory.Destination{name='D1', demand=20}, compulsory.Destination{name='D2', demand=25}, compulsory.Destination{name='D3', demand=25}], cost=[[I@1b6d3586, [I@4554617c, [I@74a14482]}
2 3 1 10
5 4 8 35
5 6 8 25
20 25 25 
Costul minim al problemei este 315

Process finished with exit code 0

```
