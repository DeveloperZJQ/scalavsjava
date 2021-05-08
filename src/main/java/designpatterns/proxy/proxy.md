# 代理模式分为静态代理模式和动态代理模式

- 静态代理模式  
  定义：由程序员创建代理类或特定工具自动生成源代码再对其编译，在程序运行前代理类的 .class 文件就已经存在了。  
- 动态代理模式  
  定义：在程序运行时，运用反射机制动态创建而成  
  特点：1.代理对象不需要实现接口；2.代理对象的生成是利用JDK的API动态的在内存中构建代理对象；3.能在代码运行时动态地改变某个对象的代理，并且能为代理对象动态增加方法、增加行为。
  