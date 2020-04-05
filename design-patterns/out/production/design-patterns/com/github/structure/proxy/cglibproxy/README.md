注意jar包版本，冲突则报错
```text
"C:\Program Files\Java\jdk1.8.0_171\bin\java.exe" -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:10052,suspend=y,server=n -javaagent:C:\Users\AkaneMurakawa\.IntelliJIdea2018.3\system\captureAgent\debugger-agent.jar -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_171\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_171\jre\lib\rt.jar;D:\project\design-patterns-from-scratch\design-patterns\out\production\design-patterns;D:\project\design-patterns-from-scratch\design-patterns\lib\asm-3.3.1.jar;D:\project\design-patterns-from-scratch\design-patterns\lib\cglib-3.2.5.jar;D:\project\design-patterns-from-scratch\design-patterns\lib\asm-tree-3.3.1.jar;D:\project\design-patterns-from-scratch\design-patterns\lib\asm-commons-3.3.1.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2018.3.4\lib\idea_rt.jar" com.github.structure.proxy.cglibproxy.Client
Connected to the target VM, address: '127.0.0.1:10052', transport: 'socket'
Exception in thread "main" java.lang.ExceptionInInitializerError
	at com.github.structure.proxy.cglibproxy.ProxyFactory.getProxyInstance(ProxyFactory.java:27)
	at com.github.structure.proxy.cglibproxy.Client.main(Client.java:7)
Caused by: java.lang.IllegalStateException: Unable to load cache item
	at net.sf.cglib.core.internal.LoadingCache.createEntry(LoadingCache.java:79)
	at net.sf.cglib.core.internal.LoadingCache.get(LoadingCache.java:34)
	at net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData.get(AbstractClassGenerator.java:116)
	at net.sf.cglib.core.AbstractClassGenerator.create(AbstractClassGenerator.java:291)
	at net.sf.cglib.core.KeyFactory$Generator.create(KeyFactory.java:221)
	at net.sf.cglib.core.KeyFactory.create(KeyFactory.java:174)
	at net.sf.cglib.core.KeyFactory.create(KeyFactory.java:153)
	at net.sf.cglib.proxy.Enhancer.<clinit>(Enhancer.java:73)
	... 2 more
Caused by: java.lang.IncompatibleClassChangeError: class net.sf.cglib.core.DebuggingClassWriter has interface org.objectweb.asm.ClassVisitor as super class
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClass(ClassLoader.java:763)
	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
	at java.net.URLClassLoader.defineClass(URLClassLoader.java:467)
	at java.net.URLClassLoader.access$100(URLClassLoader.java:73)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:368)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:362)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:361)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at net.sf.cglib.core.DefaultGeneratorStrategy.getClassVisitor(DefaultGeneratorStrategy.java:30)
	at net.sf.cglib.core.DefaultGeneratorStrategy.generate(DefaultGeneratorStrategy.java:24)
	at net.sf.cglib.core.AbstractClassGenerator.generate(AbstractClassGenerator.java:329)
	at net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData$3.apply(AbstractClassGenerator.java:93)
	at net.sf.cglib.core.AbstractClassGenerator$ClassLoaderData$3.apply(AbstractClassGenerator.java:91)
	at net.sf.cglib.core.internal.LoadingCache$2.call(LoadingCache.java:54)
	at java.util.concurrent.FutureTask.run$$$capture(FutureTask.java:266)
	at java.util.concurrent.FutureTask.run(FutureTask.java)
	at net.sf.cglib.core.internal.LoadingCache.createEntry(LoadingCache.java:61)
	... 9 more
Disconnected from the target VM, address: '127.0.0.1:10052', transport: 'socket'

Process finished with exit code 1

```